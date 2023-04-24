/**
 * MccInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class MccInfo  implements java.io.Serializable {
    private java.lang.String code;

    private java.lang.String limit;

    private java.lang.String anm;

    private java.lang.String trmt;

    public MccInfo() {
    }

    public MccInfo(
           java.lang.String code,
           java.lang.String limit,
           java.lang.String anm,
           java.lang.String trmt) {
           this.code = code;
           this.limit = limit;
           this.anm = anm;
           this.trmt = trmt;
    }


    /**
     * Gets the code value for this MccInfo.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this MccInfo.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the limit value for this MccInfo.
     * 
     * @return limit
     */
    public java.lang.String getLimit() {
        return limit;
    }


    /**
     * Sets the limit value for this MccInfo.
     * 
     * @param limit
     */
    public void setLimit(java.lang.String limit) {
        this.limit = limit;
    }


    /**
     * Gets the anm value for this MccInfo.
     * 
     * @return anm
     */
    public java.lang.String getAnm() {
        return anm;
    }


    /**
     * Sets the anm value for this MccInfo.
     * 
     * @param anm
     */
    public void setAnm(java.lang.String anm) {
        this.anm = anm;
    }


    /**
     * Gets the trmt value for this MccInfo.
     * 
     * @return trmt
     */
    public java.lang.String getTrmt() {
        return trmt;
    }


    /**
     * Sets the trmt value for this MccInfo.
     * 
     * @param trmt
     */
    public void setTrmt(java.lang.String trmt) {
        this.trmt = trmt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MccInfo)) return false;
        MccInfo other = (MccInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.limit==null && other.getLimit()==null) || 
             (this.limit!=null &&
              this.limit.equals(other.getLimit()))) &&
            ((this.anm==null && other.getAnm()==null) || 
             (this.anm!=null &&
              this.anm.equals(other.getAnm()))) &&
            ((this.trmt==null && other.getTrmt()==null) || 
             (this.trmt!=null &&
              this.trmt.equals(other.getTrmt())));
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
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getLimit() != null) {
            _hashCode += getLimit().hashCode();
        }
        if (getAnm() != null) {
            _hashCode += getAnm().hashCode();
        }
        if (getTrmt() != null) {
            _hashCode += getTrmt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MccInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "MccInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "limit"));
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
        elemField.setFieldName("trmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trmt"));
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
