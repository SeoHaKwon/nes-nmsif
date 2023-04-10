/**
 * SswIdList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class SswIdList  implements java.io.Serializable {
    private java.lang.Integer emsId;

    private java.lang.Integer[] sswId;

    public SswIdList() {
    }

    public SswIdList(
           java.lang.Integer emsId,
           java.lang.Integer[] sswId) {
           this.emsId = emsId;
           this.sswId = sswId;
    }


    /**
     * Gets the emsId value for this SswIdList.
     * 
     * @return emsId
     */
    public java.lang.Integer getEmsId() {
        return emsId;
    }


    /**
     * Sets the emsId value for this SswIdList.
     * 
     * @param emsId
     */
    public void setEmsId(java.lang.Integer emsId) {
        this.emsId = emsId;
    }


    /**
     * Gets the sswId value for this SswIdList.
     * 
     * @return sswId
     */
    public java.lang.Integer[] getSswId() {
        return sswId;
    }


    /**
     * Sets the sswId value for this SswIdList.
     * 
     * @param sswId
     */
    public void setSswId(java.lang.Integer[] sswId) {
        this.sswId = sswId;
    }

    public java.lang.Integer getSswId(int i) {
        return this.sswId[i];
    }

    public void setSswId(int i, java.lang.Integer _value) {
        this.sswId[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SswIdList)) return false;
        SswIdList other = (SswIdList) obj;
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
            ((this.sswId==null && other.getSswId()==null) || 
             (this.sswId!=null &&
              java.util.Arrays.equals(this.sswId, other.getSswId())));
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
        if (getSswId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSswId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSswId(), i);
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
        new org.apache.axis.description.TypeDesc(SswIdList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "SswIdList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emsId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emsId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sswId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sswId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
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
