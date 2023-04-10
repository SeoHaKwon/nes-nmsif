/**
 * TrlstInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class TrlstInfo  implements java.io.Serializable {
    private java.lang.Integer tldnRlst;

    private java.lang.String operName;

    private java.lang.String mscType;

    private java.lang.String chaType;

    private java.lang.String rteList;

    private java.lang.String spcRlst;

    public TrlstInfo() {
    }

    public TrlstInfo(
           java.lang.Integer tldnRlst,
           java.lang.String operName,
           java.lang.String mscType,
           java.lang.String chaType,
           java.lang.String rteList,
           java.lang.String spcRlst) {
           this.tldnRlst = tldnRlst;
           this.operName = operName;
           this.mscType = mscType;
           this.chaType = chaType;
           this.rteList = rteList;
           this.spcRlst = spcRlst;
    }


    /**
     * Gets the tldnRlst value for this TrlstInfo.
     * 
     * @return tldnRlst
     */
    public java.lang.Integer getTldnRlst() {
        return tldnRlst;
    }


    /**
     * Sets the tldnRlst value for this TrlstInfo.
     * 
     * @param tldnRlst
     */
    public void setTldnRlst(java.lang.Integer tldnRlst) {
        this.tldnRlst = tldnRlst;
    }


    /**
     * Gets the operName value for this TrlstInfo.
     * 
     * @return operName
     */
    public java.lang.String getOperName() {
        return operName;
    }


    /**
     * Sets the operName value for this TrlstInfo.
     * 
     * @param operName
     */
    public void setOperName(java.lang.String operName) {
        this.operName = operName;
    }


    /**
     * Gets the mscType value for this TrlstInfo.
     * 
     * @return mscType
     */
    public java.lang.String getMscType() {
        return mscType;
    }


    /**
     * Sets the mscType value for this TrlstInfo.
     * 
     * @param mscType
     */
    public void setMscType(java.lang.String mscType) {
        this.mscType = mscType;
    }


    /**
     * Gets the chaType value for this TrlstInfo.
     * 
     * @return chaType
     */
    public java.lang.String getChaType() {
        return chaType;
    }


    /**
     * Sets the chaType value for this TrlstInfo.
     * 
     * @param chaType
     */
    public void setChaType(java.lang.String chaType) {
        this.chaType = chaType;
    }


    /**
     * Gets the rteList value for this TrlstInfo.
     * 
     * @return rteList
     */
    public java.lang.String getRteList() {
        return rteList;
    }


    /**
     * Sets the rteList value for this TrlstInfo.
     * 
     * @param rteList
     */
    public void setRteList(java.lang.String rteList) {
        this.rteList = rteList;
    }


    /**
     * Gets the spcRlst value for this TrlstInfo.
     * 
     * @return spcRlst
     */
    public java.lang.String getSpcRlst() {
        return spcRlst;
    }


    /**
     * Sets the spcRlst value for this TrlstInfo.
     * 
     * @param spcRlst
     */
    public void setSpcRlst(java.lang.String spcRlst) {
        this.spcRlst = spcRlst;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrlstInfo)) return false;
        TrlstInfo other = (TrlstInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tldnRlst==null && other.getTldnRlst()==null) || 
             (this.tldnRlst!=null &&
              this.tldnRlst.equals(other.getTldnRlst()))) &&
            ((this.operName==null && other.getOperName()==null) || 
             (this.operName!=null &&
              this.operName.equals(other.getOperName()))) &&
            ((this.mscType==null && other.getMscType()==null) || 
             (this.mscType!=null &&
              this.mscType.equals(other.getMscType()))) &&
            ((this.chaType==null && other.getChaType()==null) || 
             (this.chaType!=null &&
              this.chaType.equals(other.getChaType()))) &&
            ((this.rteList==null && other.getRteList()==null) || 
             (this.rteList!=null &&
              this.rteList.equals(other.getRteList()))) &&
            ((this.spcRlst==null && other.getSpcRlst()==null) || 
             (this.spcRlst!=null &&
              this.spcRlst.equals(other.getSpcRlst())));
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
        if (getTldnRlst() != null) {
            _hashCode += getTldnRlst().hashCode();
        }
        if (getOperName() != null) {
            _hashCode += getOperName().hashCode();
        }
        if (getMscType() != null) {
            _hashCode += getMscType().hashCode();
        }
        if (getChaType() != null) {
            _hashCode += getChaType().hashCode();
        }
        if (getRteList() != null) {
            _hashCode += getRteList().hashCode();
        }
        if (getSpcRlst() != null) {
            _hashCode += getSpcRlst().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrlstInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "TrlstInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tldnRlst");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tldnRlst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mscType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mscType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chaType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chaType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rteList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rteList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spcRlst");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spcRlst"));
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
