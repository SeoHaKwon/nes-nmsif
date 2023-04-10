/**
 * OtherSswInfoList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class OtherSswInfoList  implements java.io.Serializable {
    private java.lang.Integer emsId;

    private com.samsung.nms.agent.dataType.OtherSswInfo[] otherSswInfo;

    public OtherSswInfoList() {
    }

    public OtherSswInfoList(
           java.lang.Integer emsId,
           com.samsung.nms.agent.dataType.OtherSswInfo[] otherSswInfo) {
           this.emsId = emsId;
           this.otherSswInfo = otherSswInfo;
    }


    /**
     * Gets the emsId value for this OtherSswInfoList.
     * 
     * @return emsId
     */
    public java.lang.Integer getEmsId() {
        return emsId;
    }


    /**
     * Sets the emsId value for this OtherSswInfoList.
     * 
     * @param emsId
     */
    public void setEmsId(java.lang.Integer emsId) {
        this.emsId = emsId;
    }


    /**
     * Gets the otherSswInfo value for this OtherSswInfoList.
     * 
     * @return otherSswInfo
     */
    public com.samsung.nms.agent.dataType.OtherSswInfo[] getOtherSswInfo() {
        return otherSswInfo;
    }


    /**
     * Sets the otherSswInfo value for this OtherSswInfoList.
     * 
     * @param otherSswInfo
     */
    public void setOtherSswInfo(com.samsung.nms.agent.dataType.OtherSswInfo[] otherSswInfo) {
        this.otherSswInfo = otherSswInfo;
    }

    public com.samsung.nms.agent.dataType.OtherSswInfo getOtherSswInfo(int i) {
        return this.otherSswInfo[i];
    }

    public void setOtherSswInfo(int i, com.samsung.nms.agent.dataType.OtherSswInfo _value) {
        this.otherSswInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OtherSswInfoList)) return false;
        OtherSswInfoList other = (OtherSswInfoList) obj;
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
            ((this.otherSswInfo==null && other.getOtherSswInfo()==null) || 
             (this.otherSswInfo!=null &&
              java.util.Arrays.equals(this.otherSswInfo, other.getOtherSswInfo())));
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
        if (getOtherSswInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOtherSswInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOtherSswInfo(), i);
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
        new org.apache.axis.description.TypeDesc(OtherSswInfoList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "OtherSswInfoList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emsId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emsId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherSswInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "otherSswInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "OtherSswInfo"));
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
