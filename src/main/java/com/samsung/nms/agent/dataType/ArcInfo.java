/**
 * ArcInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class ArcInfo  implements java.io.Serializable {
    private java.lang.Integer rte;

    private java.lang.String rt1;

    private java.lang.String rt2;

    private java.lang.String func;

    private java.lang.String trmt;

    private java.lang.String status;

    private java.lang.String category;

    public ArcInfo() {
    }

    public ArcInfo(
           java.lang.Integer rte,
           java.lang.String rt1,
           java.lang.String rt2,
           java.lang.String func,
           java.lang.String trmt,
           java.lang.String status,
           java.lang.String category) {
           this.rte = rte;
           this.rt1 = rt1;
           this.rt2 = rt2;
           this.func = func;
           this.trmt = trmt;
           this.status = status;
           this.category = category;
    }


    /**
     * Gets the rte value for this ArcInfo.
     * 
     * @return rte
     */
    public java.lang.Integer getRte() {
        return rte;
    }


    /**
     * Sets the rte value for this ArcInfo.
     * 
     * @param rte
     */
    public void setRte(java.lang.Integer rte) {
        this.rte = rte;
    }


    /**
     * Gets the rt1 value for this ArcInfo.
     * 
     * @return rt1
     */
    public java.lang.String getRt1() {
        return rt1;
    }


    /**
     * Sets the rt1 value for this ArcInfo.
     * 
     * @param rt1
     */
    public void setRt1(java.lang.String rt1) {
        this.rt1 = rt1;
    }


    /**
     * Gets the rt2 value for this ArcInfo.
     * 
     * @return rt2
     */
    public java.lang.String getRt2() {
        return rt2;
    }


    /**
     * Sets the rt2 value for this ArcInfo.
     * 
     * @param rt2
     */
    public void setRt2(java.lang.String rt2) {
        this.rt2 = rt2;
    }


    /**
     * Gets the func value for this ArcInfo.
     * 
     * @return func
     */
    public java.lang.String getFunc() {
        return func;
    }


    /**
     * Sets the func value for this ArcInfo.
     * 
     * @param func
     */
    public void setFunc(java.lang.String func) {
        this.func = func;
    }


    /**
     * Gets the trmt value for this ArcInfo.
     * 
     * @return trmt
     */
    public java.lang.String getTrmt() {
        return trmt;
    }


    /**
     * Sets the trmt value for this ArcInfo.
     * 
     * @param trmt
     */
    public void setTrmt(java.lang.String trmt) {
        this.trmt = trmt;
    }


    /**
     * Gets the status value for this ArcInfo.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ArcInfo.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the category value for this ArcInfo.
     * 
     * @return category
     */
    public java.lang.String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this ArcInfo.
     * 
     * @param category
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArcInfo)) return false;
        ArcInfo other = (ArcInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rte==null && other.getRte()==null) || 
             (this.rte!=null &&
              this.rte.equals(other.getRte()))) &&
            ((this.rt1==null && other.getRt1()==null) || 
             (this.rt1!=null &&
              this.rt1.equals(other.getRt1()))) &&
            ((this.rt2==null && other.getRt2()==null) || 
             (this.rt2!=null &&
              this.rt2.equals(other.getRt2()))) &&
            ((this.func==null && other.getFunc()==null) || 
             (this.func!=null &&
              this.func.equals(other.getFunc()))) &&
            ((this.trmt==null && other.getTrmt()==null) || 
             (this.trmt!=null &&
              this.trmt.equals(other.getTrmt()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory())));
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
        if (getRte() != null) {
            _hashCode += getRte().hashCode();
        }
        if (getRt1() != null) {
            _hashCode += getRt1().hashCode();
        }
        if (getRt2() != null) {
            _hashCode += getRt2().hashCode();
        }
        if (getFunc() != null) {
            _hashCode += getFunc().hashCode();
        }
        if (getTrmt() != null) {
            _hashCode += getTrmt().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArcInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ArcInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rte");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rt1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rt1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rt2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rt2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("func");
        elemField.setXmlName(new javax.xml.namespace.QName("", "func"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category"));
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
