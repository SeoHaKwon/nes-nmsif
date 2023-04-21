package com.ipageon.nmsif.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ipageon.nmsif.service.EmsService;

@Component
public class EmsGatePortal {
	
	@Autowired
    private EmsService EMSService;
	
	
	public void runData(String topic, Object payload) throws Exception {
		switch(topic.split("-")[1]) {
			case "alarm": 
				EMSService.alarmEvent(payload.toString());
				// alarmEvent Service
				break;
			case "status":
				// statusEvent Service
				EMSService.statusEvent(payload.toString());
				break;
			case "traffic":
				// trafficEvent Service
//				System.out.println("traffic Topic");
//				EMSService.trafficEvent();
				break;
			case "failCall":
				// failCallEvent Service
//				System.out.println("failCall Topic");
//				EMSService.failCallEvent();
				break;
			default:
				// default
				break;
		}
	}
	
}
