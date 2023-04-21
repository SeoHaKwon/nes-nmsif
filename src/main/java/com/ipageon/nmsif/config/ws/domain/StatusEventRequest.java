package com.ipageon.nmsif.config.ws.domain;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"in0"})
@XmlRootElement(name = "statusEvent", namespace = "urn:as.service.server.equip.adaptor.bcn.kt.com")
public class StatusEventRequest {
    @XmlElement(required = true, nillable = true)
    protected com.kt.bcn.adaptor.equip.server.service.as.StatusEvent in0;

    public com.kt.bcn.adaptor.equip.server.service.as.StatusEvent getIn0() {
        return this.in0;
    }

    public void setIn0(com.kt.bcn.adaptor.equip.server.service.as.StatusEvent value) {
        this.in0 = value;
    }

    public String toWsMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append("<urn:statusEvent xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" soapenv:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:urn=\"urn:as.service.server.equip.adaptor.bcn.kt.com\"  xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"> xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"")
        		.append("<in0 xsi:type=\"ent:StatusEvent\" xmlns:ent=\"http://entity.server.equip.adaptor.bcn.kt.com\">")
        		.append("<additionalText xsi:type=\"soapenc:string\" xmlns:soapenc=\"http://schemas.xmlsoap.org/soap/encoding/\">").append(in0.getAdditionalText().getValue()).append("</additionalText>")
        		.append("<location xsi:type=\"soapenc:string\" xmlns:soapenc=\"http://schemas.xmlsoap.org/soap/encoding/\">").append(in0.getLocation().getValue()).append("</location>")
        		.append("<probableCause xsi:type=\"soapenc:string\" xmlns:soapenc=\"http://schemas.xmlsoap.org/soap/encoding/\">").append(in0.getProbableCause().getValue()).append("</probableCause>")
        		.append("<serverId xsi:type=\"soapenc:string\" xmlns:soapenc=\"http://schemas.xmlsoap.org/soap/encoding/\">").append(in0.getServerId().getValue()).append("</serverId>")
        		.append("<serviceIp xsi:type=\"soapenc:string\" xmlns:soapenc=\"http://schemas.xmlsoap.org/soap/encoding/\">").append(in0.getServiceIp().getValue()).append("</serviceIp>")
        		.append("<stsCode xsi:type=\"soapenc:string\" xmlns:soapenc=\"http://schemas.xmlsoap.org/soap/encoding/\">").append(in0.getStsCode().getValue()).append("</stsCode>")
        		.append("<stsTime xsi:type=\"soapenc:string\" xmlns:soapenc=\"http://schemas.xmlsoap.org/soap/encoding/\">").append(in0.getStsTime().getValue()).append("</stsTime>")
        		.append("<systemId xsi:type=\"soapenc:string\" xmlns:soapenc=\"http://schemas.xmlsoap.org/soap/encoding/\">").append(in0.getSystemId().getValue()).append("</systemId>")
        		.append("</in0>")
        		.append("</urn:statusEvent>");
        return sb.toString();
    }
}
