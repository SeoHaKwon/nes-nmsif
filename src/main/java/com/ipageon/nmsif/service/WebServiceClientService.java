package com.ipageon.nmsif.service;

import com.ipageon.nmsif.config.ws.domain.AlarmEventRequest;
import com.ipageon.nmsif.config.ws.domain.ObjectFactory;
import com.ipageon.nmsif.config.ws.domain.StatusEventRequest;
import com.kt.bcn.adaptor.equip.server.service.as.AlarmEvent;
import com.kt.bcn.adaptor.equip.server.service.as.StatusEvent;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.xml.transform.StringResult;
import org.springframework.xml.transform.StringSource;

import javax.xml.transform.Source;

@Slf4j
public class WebServiceClientService extends WebServiceGatewaySupport {
    private ObjectFactory objectFactory = new ObjectFactory();
    @Value("${ws.url}")
    private String url;

    public void sendAlarmEvent(AlarmEvent alarmEvent) {
        AlarmEventRequest request = objectFactory.createAlarmEvent();
        request.setIn0(alarmEvent);
        StringResult result = new StringResult();
        Source req = new StringSource(request.toWsMessage());
        getWebServiceTemplate().sendSourceAndReceiveToResult(req, result);
    }

    public void sendStatusEvent(StatusEvent statusEvent) {
        StatusEventRequest request = objectFactory.createStatusEvent();
        request.setIn0(statusEvent);
        StringResult result = new StringResult();
        Source req = new StringSource(request.toWsMessage());
        getWebServiceTemplate().sendSourceAndReceiveToResult(req, result);
    }
}
