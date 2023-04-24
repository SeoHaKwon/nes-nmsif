package com.ipageon.nmsif.dataFnc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.samsung.nms.agent.dataType.FilterInfo;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetEmsId", propOrder = {
})
public class GetAlarmHistory {

    @XmlElement(required = true, nillable = true)
    protected Integer emsId;
    protected FilterInfo filterInfo;
    protected Integer sswId;
    protected String startTime;
    protected String endTime;
    
	public Integer getEmsId() {
		return emsId;
	}
	public void setEmsId(Integer emsId) {
		this.emsId = emsId;
	}
	public FilterInfo getFilterInfo() {
		return filterInfo;
	}
	public void setFilterInfo(FilterInfo filterInfo) {
		this.filterInfo = filterInfo;
	}
	public Integer getSswId() {
		return sswId;
	}
	public void setSswId(Integer sswId) {
		this.sswId = sswId;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
}
