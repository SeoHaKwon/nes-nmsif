package com.ipageon.nmsif.config.ws;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.soap.SoapVersion;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;

import com.ipageon.nmsif.service.WebServiceClientService;

@Configuration
public class WebServiceClientConfig {
    @Value("${ws.url}")
    private String webServiceUrl;
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.kt.bcn.adaptor.equip.server.service.as");
        return marshaller;
    }
    @Bean
    public WebServiceClientService webServiceClientService() {
        WebServiceClientService service = new WebServiceClientService();
        service.setDefaultUri(webServiceUrl);
        service.setMarshaller(marshaller());
        service.setUnmarshaller(marshaller());
        service.setMessageFactory(soapMessageFactory());
        return service;
    }
    @Bean
    public SaajSoapMessageFactory soapMessageFactory() {
        SaajSoapMessageFactory factory = new SaajSoapMessageFactory();
        factory.setSoapVersion(SoapVersion.SOAP_11);
        return factory;
    }
}
