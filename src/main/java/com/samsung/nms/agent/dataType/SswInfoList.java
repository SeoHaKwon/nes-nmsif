/**
 * SswInfoList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class SswInfoList  implements java.io.Serializable {
    private java.lang.Integer emsId;

    private com.samsung.nms.agent.dataType.SswInfo[] sswInfo;

    private com.samsung.nms.agent.dataType.MmsSswInfo[] mmsSswInfo;

    public SswInfoList() {
    }

    public SswInfoList(
           java.lang.Integer emsId,
           com.samsung.nms.agent.dataType.SswInfo[] sswInfo,
           com.samsung.nms.agent.dataType.MmsSswInfo[] mmsSswInfo) {
           this.emsId = emsId;
           this.sswInfo = sswInfo;
           this.mmsSswInfo = mmsSswInfo;
    }


    /**
     * Gets the emsId value for this SswInfoList.
     * 
     * @return emsId
     */
    public java.lang.Integer getEmsId() {
        return emsId;
    }


    /**
     * Sets the emsId value for this SswInfoList.
     * 
     * @param emsId
     */
    public void setEmsId(java.lang.Integer emsId) {
        this.emsId = emsId;
    }


    /**
     * Gets the sswInfo value for this SswInfoList.
     * 
     * @return sswInfo
     */
    public com.samsung.nms.agent.dataType.SswInfo[] getSswInfo() {
        return sswInfo;
    }


    /**
     * Sets the sswInfo value for this SswInfoList.
     * 
     * @param sswInfo
     */
    public void setSswInfo(com.samsung.nms.agent.dataType.SswInfo[] sswInfo) {
        this.sswInfo = sswInfo;
    }

    public com.samsung.nms.agent.dataType.SswInfo getSswInfo(int i) {
        return this.sswInfo[i];
    }

    public void setSswInfo(int i, com.samsung.nms.agent.dataType.SswInfo _value) {
        this.sswInfo[i] = _value;
    }


    /**
     * Gets the mmsSswInfo value for this SswInfoList.
     * 
     * @return mmsSswInfo
     */
    public com.samsung.nms.agent.dataType.MmsSswInfo[] getMmsSswInfo() {
        return mmsSswInfo;
    }


    /**
     * Sets the mmsSswInfo value for this SswInfoList.
     * 
     * @param mmsSswInfo
     */
    public void setMmsSswInfo(com.samsung.nms.agent.dataType.MmsSswInfo[] mmsSswInfo) {
        this.mmsSswInfo = mmsSswInfo;
    }

    public com.samsung.nms.agent.dataType.MmsSswInfo getMmsSswInfo(int i) {
        return this.mmsSswInfo[i];
    }

    public void setMmsSswInfo(int i, com.samsung.nms.agent.dataType.MmsSswInfo _value) {
        this.mmsSswInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SswInfoList)) return false;
        SswInfoList other = (SswInfoList) obj;
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
            ((this.sswInfo==null && other.getSswInfo()==null) || 
             (this.sswInfo!=null &&
              java.util.Arrays.equals(this.sswInfo, other.getSswInfo()))) &&
            ((this.mmsSswInfo==null && other.getMmsSswInfo()==null) || 
             (this.mmsSswInfo!=null &&
              java.util.Arrays.equals(this.mmsSswInfo, other.getMmsSswInfo())));
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
        if (getSswInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSswInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSswInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMmsSswInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMmsSswInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMmsSswInfo(), i);
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
        new org.apache.axis.description.TypeDesc(SswInfoList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "SswInfoList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emsId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emsId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sswInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sswInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "SswInfo"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mmsSswInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mmsSswInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "MmsSswInfo"));
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
