package com.ipageon.nmsif;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.ipageon.nmsif.ConfigService.ConfigServiceSoapBindingImpl;
import com.ipageon.nmsif.dataFnc.*;
import com.ipageon.nmsif.dataResp.*;
import com.ipageon.nmsif.service.EmsService;
import com.samsung.nms.agent.dataType.ResultInfo;

import lombok.RequiredArgsConstructor;


@Endpoint
@RequiredArgsConstructor
public class WebServiceEndpoint {
	
	@Autowired
	private final EmsService SERVICE;
	
	@Autowired
	private final ConfigServiceSoapBindingImpl serve;
	
	private static final String NAMESPACE_URI = "ConfigService";
	
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAlarmHistory")
	public @ResponsePayload GetAlarmHistoryResponse getAlarmHistory(@RequestPayload GetAlarmHistory payload) throws Exception {
		ResultInfo rinf = SERVICE.getAlarmHistory(payload);
		GetAlarmHistoryResponse res = new GetAlarmHistoryResponse();
		res.setResultInfo(rinf);
		return res;
	}
}
