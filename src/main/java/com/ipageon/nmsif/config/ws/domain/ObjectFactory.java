package com.ipageon.nmsif.config.ws.domain;

import javax.xml.bind.annotation.XmlRegistry;


@XmlRegistry
public class ObjectFactory {
    public ObjectFactory() {
    }
    public AlarmEventRequest createAlarmEvent() {
        return new AlarmEventRequest();
    }
    public StatusEventRequest createStatusEvent() {
        return new StatusEventRequest();
    }
}
