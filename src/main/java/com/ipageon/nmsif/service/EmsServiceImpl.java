package com.ipageon.nmsif.service;

import com.kt.bcn.adaptor.equip.server.service.as.AlarmEvent;
import com.kt.bcn.adaptor.equip.server.service.as.ObjectFactory;
import com.kt.bcn.adaptor.equip.server.service.as.StatusEvent;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ipageon.nmsif.util.SoapUtil;

import lombok.RequiredArgsConstructor;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmsServiceImpl implements EmsService {
    private final WebServiceClientService webServiceClientService;
    private ObjectFactory objectFactory = new ObjectFactory();
    private final SoapUtil soapUtil;
    ObjectMapper mapper = new ObjectMapper();
    
    @Override
    public void alarmEvent(String payload) throws Exception {
    	JSONObject obj = (JSONObject) new JSONParser().parse(payload);
        AlarmEvent alarmEvent = objectFactory.createAlarmEvent();
        alarmEvent.setServerId(soapUtil.setXmlString(obj.get("serverId").toString()));
        alarmEvent.setSystemId(soapUtil.setXmlString(obj.get("systemId").toString()));
        alarmEvent.setAlarmCode(soapUtil.setXmlInteger(obj.get("alarmCode").toString()));
        alarmEvent.setAlarmType(soapUtil.setXmlInteger(obj.get("alarmType").toString()));
        alarmEvent.setLocation(soapUtil.setXmlString(obj.get("location").toString()));
        alarmEvent.setProbableCause(soapUtil.setXmlString(obj.get("probableCause").toString()));
        alarmEvent.setSeverity(soapUtil.setXmlString(obj.get("severity").toString()));
        alarmEvent.setAlarmTime(soapUtil.setXmlString(obj.get("alarmTime").toString()));
        alarmEvent.setAdditionalText(soapUtil.setXmlString(obj.get("additionalText").toString()));
        alarmEvent.setServiceIp(soapUtil.setXmlString(obj.get("serviceIp").toString()));

        webServiceClientService.sendAlarmEvent(alarmEvent);
    }
    
	@Override
	public void statusEvent(String payload) throws Exception {
		JSONObject obj = (JSONObject) new JSONParser().parse(payload);
		StatusEvent sevt = objectFactory.createStatusEvent();
		sevt.setAdditionalText(soapUtil.setXmlString(obj.get("additionalText").toString()));
		sevt.setLocation(soapUtil.setXmlString(obj.get("location").toString()));
		sevt.setProbableCause(soapUtil.setXmlString(obj.get("probableCause").toString()));
		sevt.setServerId(soapUtil.setXmlString(obj.get("serverId").toString()));
		sevt.setServiceIp(soapUtil.setXmlString(obj.get("serviceIp").toString()));
		sevt.setStsCode(soapUtil.setXmlString(obj.get("stsCode").toString()));
		sevt.setStsTime(soapUtil.setXmlString(obj.get("stsTime").toString()));
		sevt.setSystemId(soapUtil.setXmlString(obj.get("systemId").toString()));
		
		webServiceClientService.sendStatusEvent(sevt);
	}
}
