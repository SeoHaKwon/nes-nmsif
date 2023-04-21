package com.ipageon.nmsif.config.ws.domain;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"in0"})
@XmlRootElement(name = "alarmEvent", namespace = "urn:as.service.server.equip.adaptor.bcn.kt.com")
public class AlarmEventRequest {
    @XmlElement(required = true, nillable = true)
    protected com.kt.bcn.adaptor.equip.server.service.as.AlarmEvent in0;

    public com.kt.bcn.adaptor.equip.server.service.as.AlarmEvent getIn0() {
        return this.in0;
    }

    public void setIn0(com.kt.bcn.adaptor.equip.server.service.as.AlarmEvent value) {
        this.in0 = value;
    }

    public String toWsMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append("<urn:alarmEvent xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" soapenv:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:urn=\"urn:as.service.server.equip.adaptor.bcn.kt.com\"  xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"> xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"")
                .append("<in0 xsi:type=\"ent:AlarmEvent\" xmlns:ent=\"http://entity.server.equip.adaptor.bcn.kt.com\">")
                .append("<additionalText xsi:type=\"soapenc:string\" xmlns:soapenc=\"http://schemas.xmlsoap.org/soap/encoding/\">").append(in0.getAdditionalText().getValue()).append("</additionalText>")
                .append("<alarmCode xsi:type=\"xsd:int\">").append(in0.getAlarmCode()).append("</alarmCode>")
                .append("<alarmTime xsi:type=\"soapenc:string\" xmlns:soapenc=\"http://schemas.xmlsoap.org/soap/encoding/\">").append(in0.getAlarmTime().getValue()).append("</alarmTime>")
                .append("<alarmType xsi:type=\"xsd:int\">").append(in0.getAlarmType()).append("</alarmType>")
                .append("<location xsi:type=\"soapenc:string\" xmlns:soapenc=\"http://schemas.xmlsoap.org/soap/encoding/\">").append(in0.getLocation().getValue()).append("</location>")
                .append("<probableCause xsi:type=\"soapenc:string\" xmlns:soapenc=\"http://schemas.xmlsoap.org/soap/encoding/\">").append(in0.getProbableCause().getValue()).append("</probableCause>")
                .append("<serverId xsi:type=\"soapenc:string\" xmlns:soapenc=\"http://schemas.xmlsoap.org/soap/encoding/\">").append(in0.getServerId().getValue()).append("</serverId>")
                .append("<serviceIp xsi:type=\"soapenc:string\" xmlns:soapenc=\"http://schemas.xmlsoap.org/soap/encoding/\">").append(in0.getServiceIp().getValue()).append("</serviceIp>")
                .append("<severity xsi:type=\"soapenc:string\" xmlns:soapenc=\"http://schemas.xmlsoap.org/soap/encoding/\">").append(in0.getSeverity().getValue()).append("</severity>")
                .append("<systemId xsi:type=\"soapenc:string\" xmlns:soapenc=\"http://schemas.xmlsoap.org/soap/encoding/\">").append(in0.getSystemId().getValue()).append("</systemId>")
                .append("</in0>")
                .append("</urn:alarmEvent>");
        return sb.toString();
    }
}
