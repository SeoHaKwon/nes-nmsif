/**
 * IsupTrcInfoList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class IsupTrcInfoList  implements java.io.Serializable {
    private java.lang.Integer emsId;

    private java.lang.String col;

    private com.samsung.nms.agent.dataType.IsupTrcInfo[] isupTrcInfo;

    public IsupTrcInfoList() {
    }

    public IsupTrcInfoList(
           java.lang.Integer emsId,
           java.lang.String col,
           com.samsung.nms.agent.dataType.IsupTrcInfo[] isupTrcInfo) {
           this.emsId = emsId;
           this.col = col;
           this.isupTrcInfo = isupTrcInfo;
    }


    /**
     * Gets the emsId value for this IsupTrcInfoList.
     * 
     * @return emsId
     */
    public java.lang.Integer getEmsId() {
        return emsId;
    }


    /**
     * Sets the emsId value for this IsupTrcInfoList.
     * 
     * @param emsId
     */
    public void setEmsId(java.lang.Integer emsId) {
        this.emsId = emsId;
    }


    /**
     * Gets the col value for this IsupTrcInfoList.
     * 
     * @return col
     */
    public java.lang.String getCol() {
        return col;
    }


    /**
     * Sets the col value for this IsupTrcInfoList.
     * 
     * @param col
     */
    public void setCol(java.lang.String col) {
        this.col = col;
    }


    /**
     * Gets the isupTrcInfo value for this IsupTrcInfoList.
     * 
     * @return isupTrcInfo
     */
    public com.samsung.nms.agent.dataType.IsupTrcInfo[] getIsupTrcInfo() {
        return isupTrcInfo;
    }


    /**
     * Sets the isupTrcInfo value for this IsupTrcInfoList.
     * 
     * @param isupTrcInfo
     */
    public void setIsupTrcInfo(com.samsung.nms.agent.dataType.IsupTrcInfo[] isupTrcInfo) {
        this.isupTrcInfo = isupTrcInfo;
    }

    public com.samsung.nms.agent.dataType.IsupTrcInfo getIsupTrcInfo(int i) {
        return this.isupTrcInfo[i];
    }

    public void setIsupTrcInfo(int i, com.samsung.nms.agent.dataType.IsupTrcInfo _value) {
        this.isupTrcInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IsupTrcInfoList)) return false;
        IsupTrcInfoList other = (IsupTrcInfoList) obj;
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
            ((this.isupTrcInfo==null && other.getIsupTrcInfo()==null) || 
             (this.isupTrcInfo!=null &&
              java.util.Arrays.equals(this.isupTrcInfo, other.getIsupTrcInfo())));
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
        if (getIsupTrcInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsupTrcInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsupTrcInfo(), i);
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
        new org.apache.axis.description.TypeDesc(IsupTrcInfoList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "IsupTrcInfoList"));
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
        elemField.setFieldName("isupTrcInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isupTrcInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "IsupTrcInfo"));
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
