package com.ipageon.nmsif.dataResp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.samsung.nms.agent.dataType.ResultInfo;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ResultInfo"
})
@XmlRootElement(name = "SSW_History")
public class GetAlarmHistoryResponse {
	
    @XmlElement(name = "getAlarmHistory", required = true, type = ResultInfo.class)
    protected ResultInfo ResultInfo;

	public ResultInfo getResultInfo() {
		return ResultInfo;
	}

	public void setResultInfo(ResultInfo resultInfo) {
		ResultInfo = resultInfo;
	}
    
}
