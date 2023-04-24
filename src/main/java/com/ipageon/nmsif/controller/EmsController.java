//package com.ipageon.nmsif.controller;
//
//import com.ipageon.nmsif.data.AlarmVO;
//import com.ipageon.nmsif.service.EmsService;
//
//import lombok.RequiredArgsConstructor;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api/v1")
//@RequiredArgsConstructor
//public class EmsController {
//	
//	@Autowired
//    private final EmsService EMSService;
//	
//	
//    @GetMapping("/alarmEvent")
//    public void alarmEvent() {
//    	try {
//			EMSService.alarmEvent(new String());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//    }
//    
//    @GetMapping("/statusEvent")
//    public void statusEvent() {
//    	try {
//			EMSService.statusEvent(new String());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//    }
//    
//    @GetMapping("/test")
//    public AlarmVO test() {
//    	AlarmVO avo;
//		try {
//			avo = EMSService.getAlarm();
//	    	return avo;
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return null;
//    }
//}
