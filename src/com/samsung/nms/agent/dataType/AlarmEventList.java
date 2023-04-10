/**
 * AlarmEventList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class AlarmEventList  implements java.io.Serializable {
    private java.lang.Integer emsId;

    private com.samsung.nms.agent.dataType.AlarmEvent[] alarmEvent;

    public AlarmEventList() {
    }

    public AlarmEventList(
           java.lang.Integer emsId,
           com.samsung.nms.agent.dataType.AlarmEvent[] alarmEvent) {
           this.emsId = emsId;
           this.alarmEvent = alarmEvent;
    }


    /**
     * Gets the emsId value for this AlarmEventList.
     * 
     * @return emsId
     */
    public java.lang.Integer getEmsId() {
        return emsId;
    }


    /**
     * Sets the emsId value for this AlarmEventList.
     * 
     * @param emsId
     */
    public void setEmsId(java.lang.Integer emsId) {
        this.emsId = emsId;
    }


    /**
     * Gets the alarmEvent value for this AlarmEventList.
     * 
     * @return alarmEvent
     */
    public com.samsung.nms.agent.dataType.AlarmEvent[] getAlarmEvent() {
        return alarmEvent;
    }


    /**
     * Sets the alarmEvent value for this AlarmEventList.
     * 
     * @param alarmEvent
     */
    public void setAlarmEvent(com.samsung.nms.agent.dataType.AlarmEvent[] alarmEvent) {
        this.alarmEvent = alarmEvent;
    }

    public com.samsung.nms.agent.dataType.AlarmEvent getAlarmEvent(int i) {
        return this.alarmEvent[i];
    }

    public void setAlarmEvent(int i, com.samsung.nms.agent.dataType.AlarmEvent _value) {
        this.alarmEvent[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlarmEventList)) return false;
        AlarmEventList other = (AlarmEventList) obj;
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
            ((this.alarmEvent==null && other.getAlarmEvent()==null) || 
             (this.alarmEvent!=null &&
              java.util.Arrays.equals(this.alarmEvent, other.getAlarmEvent())));
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
        if (getAlarmEvent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAlarmEvent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAlarmEvent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlarmEventList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "AlarmEventList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emsId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emsId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alarmEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alarmEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "AlarmEvent"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
