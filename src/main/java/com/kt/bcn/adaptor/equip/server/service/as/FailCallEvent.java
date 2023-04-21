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
 * <p>FailCallEvent complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="FailCallEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="asId" type="{http://schemas.xmlsoap.org/soap/encoding/}string"/&gt;
 *         &lt;element name="fileLocation" type="{http://schemas.xmlsoap.org/soap/encoding/}string"/&gt;
 *         &lt;element name="fileSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="password" type="{http://schemas.xmlsoap.org/soap/encoding/}string"/&gt;
 *         &lt;element name="serviceIp" type="{http://schemas.xmlsoap.org/soap/encoding/}string"/&gt;
 *         &lt;element name="systemId" type="{http://schemas.xmlsoap.org/soap/encoding/}string"/&gt;
 *         &lt;element name="time" type="{http://schemas.xmlsoap.org/soap/encoding/}string"/&gt;
 *         &lt;element name="userId" type="{http://schemas.xmlsoap.org/soap/encoding/}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FailCallEvent", namespace = "http://entity.server.equip.adaptor.bcn.kt.com", propOrder = {
    "asId",
    "fileLocation",
    "fileSize",
    "password",
    "serviceIp",
    "systemId",
    "time",
    "userId"
})
public class FailCallEvent {

    @XmlElement(required = true, nillable = true)
    protected String asId;
    @XmlElement(required = true, nillable = true)
    protected String fileLocation;
    protected int fileSize;
    @XmlElement(required = true, nillable = true)
    protected String password;
    @XmlElement(required = true, nillable = true)
    protected String serviceIp;
    @XmlElement(required = true, nillable = true)
    protected String systemId;
    @XmlElement(required = true, nillable = true)
    protected String time;
    @XmlElement(required = true, nillable = true)
    protected String userId;

    /**
     * asId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsId() {
        return asId;
    }

    /**
     * asId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsId(String value) {
        this.asId = value;
    }

    /**
     * fileLocation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileLocation() {
        return fileLocation;
    }

    /**
     * fileLocation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileLocation(String value) {
        this.fileLocation = value;
    }

    /**
     * fileSize 속성의 값을 가져옵니다.
     * 
     */
    public int getFileSize() {
        return fileSize;
    }

    /**
     * fileSize 속성의 값을 설정합니다.
     * 
     */
    public void setFileSize(int value) {
        this.fileSize = value;
    }

    /**
     * password 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * password 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
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

    /**
     * time 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * time 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * userId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * userId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

}
