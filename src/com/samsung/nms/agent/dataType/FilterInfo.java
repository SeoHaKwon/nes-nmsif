/**
 * FilterInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class FilterInfo  implements java.io.Serializable {
    private java.lang.Integer emsId;

    private java.lang.String alarmTypeMask;

    private java.lang.String endTime;

    private java.lang.String[] neIdList;

    private java.lang.String severityMask;

    private java.lang.String startTime;

    private java.lang.String location;

    public FilterInfo() {
    }

    public FilterInfo(
           java.lang.Integer emsId,
           java.lang.String alarmTypeMask,
           java.lang.String endTime,
           java.lang.String[] neIdList,
           java.lang.String severityMask,
           java.lang.String startTime,
           java.lang.String location) {
           this.emsId = emsId;
           this.alarmTypeMask = alarmTypeMask;
           this.endTime = endTime;
           this.neIdList = neIdList;
           this.severityMask = severityMask;
           this.startTime = startTime;
           this.location = location;
    }


    /**
     * Gets the emsId value for this FilterInfo.
     * 
     * @return emsId
     */
    public java.lang.Integer getEmsId() {
        return emsId;
    }


    /**
     * Sets the emsId value for this FilterInfo.
     * 
     * @param emsId
     */
    public void setEmsId(java.lang.Integer emsId) {
        this.emsId = emsId;
    }


    /**
     * Gets the alarmTypeMask value for this FilterInfo.
     * 
     * @return alarmTypeMask
     */
    public java.lang.String getAlarmTypeMask() {
        return alarmTypeMask;
    }


    /**
     * Sets the alarmTypeMask value for this FilterInfo.
     * 
     * @param alarmTypeMask
     */
    public void setAlarmTypeMask(java.lang.String alarmTypeMask) {
        this.alarmTypeMask = alarmTypeMask;
    }


    /**
     * Gets the endTime value for this FilterInfo.
     * 
     * @return endTime
     */
    public java.lang.String getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this FilterInfo.
     * 
     * @param endTime
     */
    public void setEndTime(java.lang.String endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the neIdList value for this FilterInfo.
     * 
     * @return neIdList
     */
    public java.lang.String[] getNeIdList() {
        return neIdList;
    }


    /**
     * Sets the neIdList value for this FilterInfo.
     * 
     * @param neIdList
     */
    public void setNeIdList(java.lang.String[] neIdList) {
        this.neIdList = neIdList;
    }


    /**
     * Gets the severityMask value for this FilterInfo.
     * 
     * @return severityMask
     */
    public java.lang.String getSeverityMask() {
        return severityMask;
    }


    /**
     * Sets the severityMask value for this FilterInfo.
     * 
     * @param severityMask
     */
    public void setSeverityMask(java.lang.String severityMask) {
        this.severityMask = severityMask;
    }


    /**
     * Gets the startTime value for this FilterInfo.
     * 
     * @return startTime
     */
    public java.lang.String getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this FilterInfo.
     * 
     * @param startTime
     */
    public void setStartTime(java.lang.String startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the location value for this FilterInfo.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this FilterInfo.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FilterInfo)) return false;
        FilterInfo other = (FilterInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.emsId==null && other.getEmsId()==null) || 
             (this.emsId!=null &&
              this.emsId.equals(other.getEmsId()))) &&
            ((this.alarmTypeMask==null && other.getAlarmTypeMask()==null) || 
             (this.alarmTypeMask!=null &&
              this.alarmTypeMask.equals(other.getAlarmTypeMask()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.neIdList==null && other.getNeIdList()==null) || 
             (this.neIdList!=null &&
              java.util.Arrays.equals(this.neIdList, other.getNeIdList()))) &&
            ((this.severityMask==null && other.getSeverityMask()==null) || 
             (this.severityMask!=null &&
              this.severityMask.equals(other.getSeverityMask()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation())));
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
        if (getEmsId() != null) {
            _hashCode += getEmsId().hashCode();
        }
        if (getAlarmTypeMask() != null) {
            _hashCode += getAlarmTypeMask().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getNeIdList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNeIdList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNeIdList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSeverityMask() != null) {
            _hashCode += getSeverityMask().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FilterInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "FilterInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emsId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emsId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alarmTypeMask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alarmTypeMask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("neIdList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "neIdList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severityMask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "severityMask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("", "location"));
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
