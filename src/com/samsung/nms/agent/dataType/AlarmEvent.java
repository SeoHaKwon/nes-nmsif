/**
 * AlarmEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class AlarmEvent  implements java.io.Serializable {
    private int emsId;

    private java.lang.String col;

    private java.lang.String alarmCode;

    private java.lang.String alarmType;

    private java.lang.String location;

    private java.lang.String probableCause;

    private java.lang.String severity;

    private java.lang.String time;

    private java.lang.String additionalText;

    public AlarmEvent() {
    }

    public AlarmEvent(
           int emsId,
           java.lang.String col,
           java.lang.String alarmCode,
           java.lang.String alarmType,
           java.lang.String location,
           java.lang.String probableCause,
           java.lang.String severity,
           java.lang.String time,
           java.lang.String additionalText) {
           this.emsId = emsId;
           this.col = col;
           this.alarmCode = alarmCode;
           this.alarmType = alarmType;
           this.location = location;
           this.probableCause = probableCause;
           this.severity = severity;
           this.time = time;
           this.additionalText = additionalText;
    }


    /**
     * Gets the emsId value for this AlarmEvent.
     * 
     * @return emsId
     */
    public int getEmsId() {
        return emsId;
    }


    /**
     * Sets the emsId value for this AlarmEvent.
     * 
     * @param emsId
     */
    public void setEmsId(int emsId) {
        this.emsId = emsId;
    }


    /**
     * Gets the col value for this AlarmEvent.
     * 
     * @return col
     */
    public java.lang.String getCol() {
        return col;
    }


    /**
     * Sets the col value for this AlarmEvent.
     * 
     * @param col
     */
    public void setCol(java.lang.String col) {
        this.col = col;
    }


    /**
     * Gets the alarmCode value for this AlarmEvent.
     * 
     * @return alarmCode
     */
    public java.lang.String getAlarmCode() {
        return alarmCode;
    }


    /**
     * Sets the alarmCode value for this AlarmEvent.
     * 
     * @param alarmCode
     */
    public void setAlarmCode(java.lang.String alarmCode) {
        this.alarmCode = alarmCode;
    }


    /**
     * Gets the alarmType value for this AlarmEvent.
     * 
     * @return alarmType
     */
    public java.lang.String getAlarmType() {
        return alarmType;
    }


    /**
     * Sets the alarmType value for this AlarmEvent.
     * 
     * @param alarmType
     */
    public void setAlarmType(java.lang.String alarmType) {
        this.alarmType = alarmType;
    }


    /**
     * Gets the location value for this AlarmEvent.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this AlarmEvent.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the probableCause value for this AlarmEvent.
     * 
     * @return probableCause
     */
    public java.lang.String getProbableCause() {
        return probableCause;
    }


    /**
     * Sets the probableCause value for this AlarmEvent.
     * 
     * @param probableCause
     */
    public void setProbableCause(java.lang.String probableCause) {
        this.probableCause = probableCause;
    }


    /**
     * Gets the severity value for this AlarmEvent.
     * 
     * @return severity
     */
    public java.lang.String getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this AlarmEvent.
     * 
     * @param severity
     */
    public void setSeverity(java.lang.String severity) {
        this.severity = severity;
    }


    /**
     * Gets the time value for this AlarmEvent.
     * 
     * @return time
     */
    public java.lang.String getTime() {
        return time;
    }


    /**
     * Sets the time value for this AlarmEvent.
     * 
     * @param time
     */
    public void setTime(java.lang.String time) {
        this.time = time;
    }


    /**
     * Gets the additionalText value for this AlarmEvent.
     * 
     * @return additionalText
     */
    public java.lang.String getAdditionalText() {
        return additionalText;
    }


    /**
     * Sets the additionalText value for this AlarmEvent.
     * 
     * @param additionalText
     */
    public void setAdditionalText(java.lang.String additionalText) {
        this.additionalText = additionalText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlarmEvent)) return false;
        AlarmEvent other = (AlarmEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.emsId == other.getEmsId() &&
            ((this.col==null && other.getCol()==null) || 
             (this.col!=null &&
              this.col.equals(other.getCol()))) &&
            ((this.alarmCode==null && other.getAlarmCode()==null) || 
             (this.alarmCode!=null &&
              this.alarmCode.equals(other.getAlarmCode()))) &&
            ((this.alarmType==null && other.getAlarmType()==null) || 
             (this.alarmType!=null &&
              this.alarmType.equals(other.getAlarmType()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.probableCause==null && other.getProbableCause()==null) || 
             (this.probableCause!=null &&
              this.probableCause.equals(other.getProbableCause()))) &&
            ((this.severity==null && other.getSeverity()==null) || 
             (this.severity!=null &&
              this.severity.equals(other.getSeverity()))) &&
            ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime()))) &&
            ((this.additionalText==null && other.getAdditionalText()==null) || 
             (this.additionalText!=null &&
              this.additionalText.equals(other.getAdditionalText())));
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
        _hashCode += getEmsId();
        if (getCol() != null) {
            _hashCode += getCol().hashCode();
        }
        if (getAlarmCode() != null) {
            _hashCode += getAlarmCode().hashCode();
        }
        if (getAlarmType() != null) {
            _hashCode += getAlarmType().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getProbableCause() != null) {
            _hashCode += getProbableCause().hashCode();
        }
        if (getSeverity() != null) {
            _hashCode += getSeverity().hashCode();
        }
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        if (getAdditionalText() != null) {
            _hashCode += getAdditionalText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlarmEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "AlarmEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emsId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emsId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("col");
        elemField.setXmlName(new javax.xml.namespace.QName("", "col"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alarmCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alarmCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alarmType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alarmType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("probableCause");
        elemField.setXmlName(new javax.xml.namespace.QName("", "probableCause"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "severity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "additionalText"));
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
