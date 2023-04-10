/**
 * SkeyInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class SkeyInfo  implements java.io.Serializable {
    private java.lang.String skey;

    private java.lang.String name;

    private java.lang.String svcType;

    private java.lang.String svcGrp;

    private java.lang.String in;

    public SkeyInfo() {
    }

    public SkeyInfo(
           java.lang.String skey,
           java.lang.String name,
           java.lang.String svcType,
           java.lang.String svcGrp,
           java.lang.String in) {
           this.skey = skey;
           this.name = name;
           this.svcType = svcType;
           this.svcGrp = svcGrp;
           this.in = in;
    }


    /**
     * Gets the skey value for this SkeyInfo.
     * 
     * @return skey
     */
    public java.lang.String getSkey() {
        return skey;
    }


    /**
     * Sets the skey value for this SkeyInfo.
     * 
     * @param skey
     */
    public void setSkey(java.lang.String skey) {
        this.skey = skey;
    }


    /**
     * Gets the name value for this SkeyInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this SkeyInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the svcType value for this SkeyInfo.
     * 
     * @return svcType
     */
    public java.lang.String getSvcType() {
        return svcType;
    }


    /**
     * Sets the svcType value for this SkeyInfo.
     * 
     * @param svcType
     */
    public void setSvcType(java.lang.String svcType) {
        this.svcType = svcType;
    }


    /**
     * Gets the svcGrp value for this SkeyInfo.
     * 
     * @return svcGrp
     */
    public java.lang.String getSvcGrp() {
        return svcGrp;
    }


    /**
     * Sets the svcGrp value for this SkeyInfo.
     * 
     * @param svcGrp
     */
    public void setSvcGrp(java.lang.String svcGrp) {
        this.svcGrp = svcGrp;
    }


    /**
     * Gets the in value for this SkeyInfo.
     * 
     * @return in
     */
    public java.lang.String getIn() {
        return in;
    }


    /**
     * Sets the in value for this SkeyInfo.
     * 
     * @param in
     */
    public void setIn(java.lang.String in) {
        this.in = in;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SkeyInfo)) return false;
        SkeyInfo other = (SkeyInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.skey==null && other.getSkey()==null) || 
             (this.skey!=null &&
              this.skey.equals(other.getSkey()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.svcType==null && other.getSvcType()==null) || 
             (this.svcType!=null &&
              this.svcType.equals(other.getSvcType()))) &&
            ((this.svcGrp==null && other.getSvcGrp()==null) || 
             (this.svcGrp!=null &&
              this.svcGrp.equals(other.getSvcGrp()))) &&
            ((this.in==null && other.getIn()==null) || 
             (this.in!=null &&
              this.in.equals(other.getIn())));
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
        if (getSkey() != null) {
            _hashCode += getSkey().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSvcType() != null) {
            _hashCode += getSvcType().hashCode();
        }
        if (getSvcGrp() != null) {
            _hashCode += getSvcGrp().hashCode();
        }
        if (getIn() != null) {
            _hashCode += getIn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SkeyInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "SkeyInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "skey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svcType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcGrp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svcGrp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("in");
        elemField.setXmlName(new javax.xml.namespace.QName("", "in"));
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
