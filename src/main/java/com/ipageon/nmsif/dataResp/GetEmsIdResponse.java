package com.ipageon.nmsif.dataResp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.samsung.nms.agent.dataType.ResultInfo;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "EmsIdInfo"
})
@XmlRootElement(name = "sub:getEmsIdResponse")
public class GetEmsIdResponse {
	
    @XmlElement(name = "getEmsIdReturn", required = true, type = ResultInfo.class)
    protected ResultInfo emsIdInfo;

	public ResultInfo getEmsIdInfo() {
		return emsIdInfo;
	}

	public void setEmsIdInfo(ResultInfo emsIdInfo) {
		this.emsIdInfo = emsIdInfo;
	}
        
}
