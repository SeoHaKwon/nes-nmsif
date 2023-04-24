/**
 * AccInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class AccInfo  implements java.io.Serializable {
    private java.lang.String code;

    private java.lang.String sts;

    private java.lang.String limit;

    private java.lang.String anm;

    private java.lang.Integer tatm;

    private java.lang.Integer thtr;

    private java.lang.Integer tetr;

    private java.lang.String control;

    private java.lang.Integer trmt;

    public AccInfo() {
    }

    public AccInfo(
           java.lang.String code,
           java.lang.String sts,
           java.lang.String limit,
           java.lang.String anm,
           java.lang.Integer tatm,
           java.lang.Integer thtr,
           java.lang.Integer tetr,
           java.lang.String control,
           java.lang.Integer trmt) {
           this.code = code;
           this.sts = sts;
           this.limit = limit;
           this.anm = anm;
           this.tatm = tatm;
           this.thtr = thtr;
           this.tetr = tetr;
           this.control = control;
           this.trmt = trmt;
    }


    /**
     * Gets the code value for this AccInfo.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this AccInfo.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the sts value for this AccInfo.
     * 
     * @return sts
     */
    public java.lang.String getSts() {
        return sts;
    }


    /**
     * Sets the sts value for this AccInfo.
     * 
     * @param sts
     */
    public void setSts(java.lang.String sts) {
        this.sts = sts;
    }


    /**
     * Gets the limit value for this AccInfo.
     * 
     * @return limit
     */
    public java.lang.String getLimit() {
        return limit;
    }


    /**
     * Sets the limit value for this AccInfo.
     * 
     * @param limit
     */
    public void setLimit(java.lang.String limit) {
        this.limit = limit;
    }


    /**
     * Gets the anm value for this AccInfo.
     * 
     * @return anm
     */
    public java.lang.String getAnm() {
        return anm;
    }


    /**
     * Sets the anm value for this AccInfo.
     * 
     * @param anm
     */
    public void setAnm(java.lang.String anm) {
        this.anm = anm;
    }


    /**
     * Gets the tatm value for this AccInfo.
     * 
     * @return tatm
     */
    public java.lang.Integer getTatm() {
        return tatm;
    }


    /**
     * Sets the tatm value for this AccInfo.
     * 
     * @param tatm
     */
    public void setTatm(java.lang.Integer tatm) {
        this.tatm = tatm;
    }


    /**
     * Gets the thtr value for this AccInfo.
     * 
     * @return thtr
     */
    public java.lang.Integer getThtr() {
        return thtr;
    }


    /**
     * Sets the thtr value for this AccInfo.
     * 
     * @param thtr
     */
    public void setThtr(java.lang.Integer thtr) {
        this.thtr = thtr;
    }


    /**
     * Gets the tetr value for this AccInfo.
     * 
     * @return tetr
     */
    public java.lang.Integer getTetr() {
        return tetr;
    }


    /**
     * Sets the tetr value for this AccInfo.
     * 
     * @param tetr
     */
    public void setTetr(java.lang.Integer tetr) {
        this.tetr = tetr;
    }


    /**
     * Gets the control value for this AccInfo.
     * 
     * @return control
     */
    public java.lang.String getControl() {
        return control;
    }


    /**
     * Sets the control value for this AccInfo.
     * 
     * @param control
     */
    public void setControl(java.lang.String control) {
        this.control = control;
    }


    /**
     * Gets the trmt value for this AccInfo.
     * 
     * @return trmt
     */
    public java.lang.Integer getTrmt() {
        return trmt;
    }


    /**
     * Sets the trmt value for this AccInfo.
     * 
     * @param trmt
     */
    public void setTrmt(java.lang.Integer trmt) {
        this.trmt = trmt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccInfo)) return false;
        AccInfo other = (AccInfo) obj;
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
            ((this.sts==null && other.getSts()==null) || 
             (this.sts!=null &&
              this.sts.equals(other.getSts()))) &&
            ((this.limit==null && other.getLimit()==null) || 
             (this.limit!=null &&
              this.limit.equals(other.getLimit()))) &&
            ((this.anm==null && other.getAnm()==null) || 
             (this.anm!=null &&
              this.anm.equals(other.getAnm()))) &&
            ((this.tatm==null && other.getTatm()==null) || 
             (this.tatm!=null &&
              this.tatm.equals(other.getTatm()))) &&
            ((this.thtr==null && other.getThtr()==null) || 
             (this.thtr!=null &&
              this.thtr.equals(other.getThtr()))) &&
            ((this.tetr==null && other.getTetr()==null) || 
             (this.tetr!=null &&
              this.tetr.equals(other.getTetr()))) &&
            ((this.control==null && other.getControl()==null) || 
             (this.control!=null &&
              this.control.equals(other.getControl()))) &&
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
        if (getSts() != null) {
            _hashCode += getSts().hashCode();
        }
        if (getLimit() != null) {
            _hashCode += getLimit().hashCode();
        }
        if (getAnm() != null) {
            _hashCode += getAnm().hashCode();
        }
        if (getTatm() != null) {
            _hashCode += getTatm().hashCode();
        }
        if (getThtr() != null) {
            _hashCode += getThtr().hashCode();
        }
        if (getTetr() != null) {
            _hashCode += getTetr().hashCode();
        }
        if (getControl() != null) {
            _hashCode += getControl().hashCode();
        }
        if (getTrmt() != null) {
            _hashCode += getTrmt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "AccInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "code"));
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
        elemField.setFieldName("tatm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tatm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thtr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "thtr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tetr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tetr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("control");
        elemField.setXmlName(new javax.xml.namespace.QName("", "control"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
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
