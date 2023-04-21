//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.04.14 시간 12:15:28 PM KST 
//


package com.kt.bcn.adaptor.equip.server.service.as;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>StatusEvent complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="StatusEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="additionalText" type="{http://schemas.xmlsoap.org/soap/encoding/}string"/&gt;
 *         &lt;element name="location" type="{http://schemas.xmlsoap.org/soap/encoding/}string"/&gt;
 *         &lt;element name="probableCause" type="{http://schemas.xmlsoap.org/soap/encoding/}string"/&gt;
 *         &lt;element name="serverId" type="{http://schemas.xmlsoap.org/soap/encoding/}string"/&gt;
 *         &lt;element name="serviceIp" type="{http://schemas.xmlsoap.org/soap/encoding/}string"/&gt;
 *         &lt;element name="stsCode" type="{http://schemas.xmlsoap.org/soap/encoding/}string"/&gt;
 *         &lt;element name="stsTime" type="{http://schemas.xmlsoap.org/soap/encoding/}string"/&gt;
 *         &lt;element name="systemId" type="{http://schemas.xmlsoap.org/soap/encoding/}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusEvent", namespace = "http://entity.server.equip.adaptor.bcn.kt.com", propOrder = {
    "additionalText",
    "location",
    "probableCause",
    "serverId",
    "serviceIp",
    "stsCode",
    "stsTime",
    "systemId"
})
public class StatusEvent {

    @XmlElement(required = true, nillable = true)
    protected String additionalText;
    @XmlElement(required = true, nillable = true)
    protected String location;
    @XmlElement(required = true, nillable = true)
    protected String probableCause;
    @XmlElement(required = true, nillable = true)
    protected String serverId;
    @XmlElement(required = true, nillable = true)
    protected String serviceIp;
    @XmlElement(required = true)
    protected String stsCode;
    @XmlElement(required = true, nillable = true)
    protected String stsTime;
    @XmlElement(required = true, nillable = true)
    protected String systemId;

    /**
     * additionalText 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalText() {
        return additionalText;
    }

    /**
     * additionalText 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalText(String value) {
        this.additionalText = value;
    }

    /**
     * location 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * location 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * probableCause 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProbableCause() {
        return probableCause;
    }

    /**
     * probableCause 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProbableCause(String value) {
        this.probableCause = value;
    }

    /**
     * serverId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * serverId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerId(String value) {
        this.serverId = value;
    }

    /**
     * serviceIp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceIp() {
        return serviceIp;
    }

    /**
     * serviceIp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceIp(String value) {
        this.serviceIp = value;
    }

    /**
     * stsCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStsCode() {
        return stsCode;
    }

    /**
     * stsCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStsCode(String value) {
        this.stsCode = value;
    }

    /**
     * stsTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStsTime() {
        return stsTime;
    }

    /**
     * stsTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStsTime(String value) {
        this.stsTime = value;
    }

    /**
     * systemId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemId() {
        return systemId;
    }

    /**
     * systemId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemId(String value) {
        this.systemId = value;
    }

}
