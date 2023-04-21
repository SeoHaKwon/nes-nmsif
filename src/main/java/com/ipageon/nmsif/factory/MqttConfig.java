package com.ipageon.nmsif.factory;

import org.eclipse.paho.client.mqttv3.MqttAsyncClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.core.MessageProducer;
import org.springframework.integration.mqtt.core.DefaultMqttPahoClientFactory;
import org.springframework.integration.mqtt.support.DefaultPahoMessageConverter;
import org.springframework.integration.mqtt.support.MqttHeaders;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.handler.annotation.Header;

import com.ipageon.nmsif.controller.EmsGatePortal;

import org.springframework.integration.mqtt.outbound.*;
import org.springframework.integration.mqtt.inbound.*;

@Configuration
public class MqttConfig {
	
	@Autowired
	private EmsGatePortal gate;
	
    private static final String MQTT_USERNAME = "";
    private static final String MQTT_PASSWORD = "";
    private static final String BROKER_URL = "tcp://172.16.76.21:1883";
    private static final String MQTT_CLIENT_ID = MqttAsyncClient.generateClientId();
    private static final String[] TOPIC_FILTER = {"/nems/nms-alarm", "/nems/nms-status", "/nems/nms-traffic", "/nems/nms-failCall"};

    private MqttConnectOptions connectOptions() {
        MqttConnectOptions options = new MqttConnectOptions();
        options.setCleanSession(true);
        options.setUserName(MQTT_USERNAME);
        options.setPassword(MQTT_PASSWORD.toCharArray());
        return options;
    }

    @Bean
    public DefaultMqttPahoClientFactory defaultMqttPahoClientFactory() {
        DefaultMqttPahoClientFactory clientFactory = new DefaultMqttPahoClientFactory();
        clientFactory.setConnectionOptions(connectOptions());
        return clientFactory;
    }
    
    @Bean
    public MessageChannel mqttInputChannel() {
        return new DirectChannel();
    }
    
    @Bean
    public MessageProducer inboundChannel() {
        MqttPahoMessageDrivenChannelAdapter adapter =
                new MqttPahoMessageDrivenChannelAdapter(BROKER_URL, MQTT_CLIENT_ID, TOPIC_FILTER);
        adapter.setCompletionTimeout(5000);
        adapter.setConverter(new DefaultPahoMessageConverter());
        adapter.setQos(1);
        adapter.setOutputChannel(mqttInputChannel());
        return adapter;
    }
    
    @Bean
    @ServiceActivator(inputChannel = "mqttInputChannel")
    public MessageHandler inboundMessageHandler() {
        return message -> {
            try {
                String topic = (String) message.getHeaders().get(MqttHeaders.RECEIVED_TOPIC);
				gate.runData(topic, message.getPayload());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        };
    }
    
    @Bean
    public MessageChannel mqttOutboundChannel() {
        return new DirectChannel();
    }
    
    @Bean
    @ServiceActivator(inputChannel = "mqttOutboundChannel")
    public MessageHandler mqttOutbound(DefaultMqttPahoClientFactory clientFactory) {
        MqttPahoMessageHandler messageHandler =
                new MqttPahoMessageHandler(MQTT_CLIENT_ID, clientFactory);
        messageHandler.setAsync(true);
        messageHandler.setDefaultQos(1);
        return messageHandler;
    }
    
    @MessagingGateway(defaultRequestChannel = "mqttOutboundChannel")
    public interface OutboundGateway {
        void sendToMqtt(String payload, @Header(MqttHeaders.TOPIC) String topic);
    }
}
