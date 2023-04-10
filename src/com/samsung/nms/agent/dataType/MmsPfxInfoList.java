/**
 * MmsPfxInfoList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class MmsPfxInfoList  implements java.io.Serializable {
    private java.lang.Integer emsId;

    private java.lang.String col;

    private com.samsung.nms.agent.dataType.MmsPfxInfo[] mmsPfxInfo;

    public MmsPfxInfoList() {
    }

    public MmsPfxInfoList(
           java.lang.Integer emsId,
           java.lang.String col,
           com.samsung.nms.agent.dataType.MmsPfxInfo[] mmsPfxInfo) {
           this.emsId = emsId;
           this.col = col;
           this.mmsPfxInfo = mmsPfxInfo;
    }


    /**
     * Gets the emsId value for this MmsPfxInfoList.
     * 
     * @return emsId
     */
    public java.lang.Integer getEmsId() {
        return emsId;
    }


    /**
     * Sets the emsId value for this MmsPfxInfoList.
     * 
     * @param emsId
     */
    public void setEmsId(java.lang.Integer emsId) {
        this.emsId = emsId;
    }


    /**
     * Gets the col value for this MmsPfxInfoList.
     * 
     * @return col
     */
    public java.lang.String getCol() {
        return col;
    }


    /**
     * Sets the col value for this MmsPfxInfoList.
     * 
     * @param col
     */
    public void setCol(java.lang.String col) {
        this.col = col;
    }


    /**
     * Gets the mmsPfxInfo value for this MmsPfxInfoList.
     * 
     * @return mmsPfxInfo
     */
    public com.samsung.nms.agent.dataType.MmsPfxInfo[] getMmsPfxInfo() {
        return mmsPfxInfo;
    }


    /**
     * Sets the mmsPfxInfo value for this MmsPfxInfoList.
     * 
     * @param mmsPfxInfo
     */
    public void setMmsPfxInfo(com.samsung.nms.agent.dataType.MmsPfxInfo[] mmsPfxInfo) {
        this.mmsPfxInfo = mmsPfxInfo;
    }

    public com.samsung.nms.agent.dataType.MmsPfxInfo getMmsPfxInfo(int i) {
        return this.mmsPfxInfo[i];
    }

    public void setMmsPfxInfo(int i, com.samsung.nms.agent.dataType.MmsPfxInfo _value) {
        this.mmsPfxInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MmsPfxInfoList)) return false;
        MmsPfxInfoList other = (MmsPfxInfoList) obj;
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
            ((this.col==null && other.getCol()==null) || 
             (this.col!=null &&
              this.col.equals(other.getCol()))) &&
            ((this.mmsPfxInfo==null && other.getMmsPfxInfo()==null) || 
             (this.mmsPfxInfo!=null &&
              java.util.Arrays.equals(this.mmsPfxInfo, other.getMmsPfxInfo())));
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
        if (getCol() != null) {
            _hashCode += getCol().hashCode();
        }
        if (getMmsPfxInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMmsPfxInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMmsPfxInfo(), i);
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
        new org.apache.axis.description.TypeDesc(MmsPfxInfoList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "MmsPfxInfoList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emsId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emsId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("col");
        elemField.setXmlName(new javax.xml.namespace.QName("", "col"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mmsPfxInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mmsPfxInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "MmsPfxInfo"));
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
