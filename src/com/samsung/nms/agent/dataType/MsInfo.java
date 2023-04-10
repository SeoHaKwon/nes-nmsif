/**
 * MsInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class MsInfo  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String ip;

    private java.lang.String maker;

    private java.lang.String anm;

    private java.lang.String tone;

    private java.lang.String conference;

    private java.lang.String tts;

    private java.lang.String adt;

    private java.lang.String sts;

    private java.lang.String hostName;

    private java.lang.String port;

    private java.lang.String admSts;

    private java.lang.String aud;

    public MsInfo() {
    }

    public MsInfo(
           java.lang.String name,
           java.lang.String ip,
           java.lang.String maker,
           java.lang.String anm,
           java.lang.String tone,
           java.lang.String conference,
           java.lang.String tts,
           java.lang.String adt,
           java.lang.String sts,
           java.lang.String hostName,
           java.lang.String port,
           java.lang.String admSts,
           java.lang.String aud) {
           this.name = name;
           this.ip = ip;
           this.maker = maker;
           this.anm = anm;
           this.tone = tone;
           this.conference = conference;
           this.tts = tts;
           this.adt = adt;
           this.sts = sts;
           this.hostName = hostName;
           this.port = port;
           this.admSts = admSts;
           this.aud = aud;
    }


    /**
     * Gets the name value for this MsInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this MsInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the ip value for this MsInfo.
     * 
     * @return ip
     */
    public java.lang.String getIp() {
        return ip;
    }


    /**
     * Sets the ip value for this MsInfo.
     * 
     * @param ip
     */
    public void setIp(java.lang.String ip) {
        this.ip = ip;
    }


    /**
     * Gets the maker value for this MsInfo.
     * 
     * @return maker
     */
    public java.lang.String getMaker() {
        return maker;
    }


    /**
     * Sets the maker value for this MsInfo.
     * 
     * @param maker
     */
    public void setMaker(java.lang.String maker) {
        this.maker = maker;
    }


    /**
     * Gets the anm value for this MsInfo.
     * 
     * @return anm
     */
    public java.lang.String getAnm() {
        return anm;
    }


    /**
     * Sets the anm value for this MsInfo.
     * 
     * @param anm
     */
    public void setAnm(java.lang.String anm) {
        this.anm = anm;
    }


    /**
     * Gets the tone value for this MsInfo.
     * 
     * @return tone
     */
    public java.lang.String getTone() {
        return tone;
    }


    /**
     * Sets the tone value for this MsInfo.
     * 
     * @param tone
     */
    public void setTone(java.lang.String tone) {
        this.tone = tone;
    }


    /**
     * Gets the conference value for this MsInfo.
     * 
     * @return conference
     */
    public java.lang.String getConference() {
        return conference;
    }


    /**
     * Sets the conference value for this MsInfo.
     * 
     * @param conference
     */
    public void setConference(java.lang.String conference) {
        this.conference = conference;
    }


    /**
     * Gets the tts value for this MsInfo.
     * 
     * @return tts
     */
    public java.lang.String getTts() {
        return tts;
    }


    /**
     * Sets the tts value for this MsInfo.
     * 
     * @param tts
     */
    public void setTts(java.lang.String tts) {
        this.tts = tts;
    }


    /**
     * Gets the adt value for this MsInfo.
     * 
     * @return adt
     */
    public java.lang.String getAdt() {
        return adt;
    }


    /**
     * Sets the adt value for this MsInfo.
     * 
     * @param adt
     */
    public void setAdt(java.lang.String adt) {
        this.adt = adt;
    }


    /**
     * Gets the sts value for this MsInfo.
     * 
     * @return sts
     */
    public java.lang.String getSts() {
        return sts;
    }


    /**
     * Sets the sts value for this MsInfo.
     * 
     * @param sts
     */
    public void setSts(java.lang.String sts) {
        this.sts = sts;
    }


    /**
     * Gets the hostName value for this MsInfo.
     * 
     * @return hostName
     */
    public java.lang.String getHostName() {
        return hostName;
    }


    /**
     * Sets the hostName value for this MsInfo.
     * 
     * @param hostName
     */
    public void setHostName(java.lang.String hostName) {
        this.hostName = hostName;
    }


    /**
     * Gets the port value for this MsInfo.
     * 
     * @return port
     */
    public java.lang.String getPort() {
        return port;
    }


    /**
     * Sets the port value for this MsInfo.
     * 
     * @param port
     */
    public void setPort(java.lang.String port) {
        this.port = port;
    }


    /**
     * Gets the admSts value for this MsInfo.
     * 
     * @return admSts
     */
    public java.lang.String getAdmSts() {
        return admSts;
    }


    /**
     * Sets the admSts value for this MsInfo.
     * 
     * @param admSts
     */
    public void setAdmSts(java.lang.String admSts) {
        this.admSts = admSts;
    }


    /**
     * Gets the aud value for this MsInfo.
     * 
     * @return aud
     */
    public java.lang.String getAud() {
        return aud;
    }


    /**
     * Sets the aud value for this MsInfo.
     * 
     * @param aud
     */
    public void setAud(java.lang.String aud) {
        this.aud = aud;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MsInfo)) return false;
        MsInfo other = (MsInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.ip==null && other.getIp()==null) || 
             (this.ip!=null &&
              this.ip.equals(other.getIp()))) &&
            ((this.maker==null && other.getMaker()==null) || 
             (this.maker!=null &&
              this.maker.equals(other.getMaker()))) &&
            ((this.anm==null && other.getAnm()==null) || 
             (this.anm!=null &&
              this.anm.equals(other.getAnm()))) &&
            ((this.tone==null && other.getTone()==null) || 
             (this.tone!=null &&
              this.tone.equals(other.getTone()))) &&
            ((this.conference==null && other.getConference()==null) || 
             (this.conference!=null &&
              this.conference.equals(other.getConference()))) &&
            ((this.tts==null && other.getTts()==null) || 
             (this.tts!=null &&
              this.tts.equals(other.getTts()))) &&
            ((this.adt==null && other.getAdt()==null) || 
             (this.adt!=null &&
              this.adt.equals(other.getAdt()))) &&
            ((this.sts==null && other.getSts()==null) || 
             (this.sts!=null &&
              this.sts.equals(other.getSts()))) &&
            ((this.hostName==null && other.getHostName()==null) || 
             (this.hostName!=null &&
              this.hostName.equals(other.getHostName()))) &&
            ((this.port==null && other.getPort()==null) || 
             (this.port!=null &&
              this.port.equals(other.getPort()))) &&
            ((this.admSts==null && other.getAdmSts()==null) || 
             (this.admSts!=null &&
              this.admSts.equals(other.getAdmSts()))) &&
            ((this.aud==null && other.getAud()==null) || 
             (this.aud!=null &&
              this.aud.equals(other.getAud())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getIp() != null) {
            _hashCode += getIp().hashCode();
        }
        if (getMaker() != null) {
            _hashCode += getMaker().hashCode();
        }
        if (getAnm() != null) {
            _hashCode += getAnm().hashCode();
        }
        if (getTone() != null) {
            _hashCode += getTone().hashCode();
        }
        if (getConference() != null) {
            _hashCode += getConference().hashCode();
        }
        if (getTts() != null) {
            _hashCode += getTts().hashCode();
        }
        if (getAdt() != null) {
            _hashCode += getAdt().hashCode();
        }
        if (getSts() != null) {
            _hashCode += getSts().hashCode();
        }
        if (getHostName() != null) {
            _hashCode += getHostName().hashCode();
        }
        if (getPort() != null) {
            _hashCode += getPort().hashCode();
        }
        if (getAdmSts() != null) {
            _hashCode += getAdmSts().hashCode();
        }
        if (getAud() != null) {
            _hashCode += getAud().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MsInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "MsInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maker");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maker"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "conference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hostName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("", "port"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("admSts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "admSts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aud");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aud"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
