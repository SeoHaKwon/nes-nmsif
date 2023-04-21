package com.ipageon.nmsif.controller;

import com.ipageon.nmsif.service.EmsService;
import com.kt.bcn.adaptor.equip.server.service.as.StatusEvent;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class EmsController {
    private final EmsService EMSService;
    @GetMapping("/alarmEvent")
    public void alarmEvent() {
    	try {
			EMSService.alarmEvent(new String());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    @GetMapping("/statusEvent")
    public void statusEvent() {
    	try {
			EMSService.statusEvent(new String());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
