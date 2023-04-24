/**
 * ApuInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class ApuInfo  implements java.io.Serializable {
    private java.lang.Integer apu;

    private java.lang.String cri;

    private java.lang.String maj;

    private java.lang.String min;

    private java.lang.String block;

    private java.lang.String audible;

    private java.lang.String clr;

    private java.lang.String sm1Link;

    private java.lang.String sm2Link;

    public ApuInfo() {
    }

    public ApuInfo(
           java.lang.Integer apu,
           java.lang.String cri,
           java.lang.String maj,
           java.lang.String min,
           java.lang.String block,
           java.lang.String audible,
           java.lang.String clr,
           java.lang.String sm1Link,
           java.lang.String sm2Link) {
           this.apu = apu;
           this.cri = cri;
           this.maj = maj;
           this.min = min;
           this.block = block;
           this.audible = audible;
           this.clr = clr;
           this.sm1Link = sm1Link;
           this.sm2Link = sm2Link;
    }


    /**
     * Gets the apu value for this ApuInfo.
     * 
     * @return apu
     */
    public java.lang.Integer getApu() {
        return apu;
    }


    /**
     * Sets the apu value for this ApuInfo.
     * 
     * @param apu
     */
    public void setApu(java.lang.Integer apu) {
        this.apu = apu;
    }


    /**
     * Gets the cri value for this ApuInfo.
     * 
     * @return cri
     */
    public java.lang.String getCri() {
        return cri;
    }


    /**
     * Sets the cri value for this ApuInfo.
     * 
     * @param cri
     */
    public void setCri(java.lang.String cri) {
        this.cri = cri;
    }


    /**
     * Gets the maj value for this ApuInfo.
     * 
     * @return maj
     */
    public java.lang.String getMaj() {
        return maj;
    }


    /**
     * Sets the maj value for this ApuInfo.
     * 
     * @param maj
     */
    public void setMaj(java.lang.String maj) {
        this.maj = maj;
    }


    /**
     * Gets the min value for this ApuInfo.
     * 
     * @return min
     */
    public java.lang.String getMin() {
        return min;
    }


    /**
     * Sets the min value for this ApuInfo.
     * 
     * @param min
     */
    public void setMin(java.lang.String min) {
        this.min = min;
    }


    /**
     * Gets the block value for this ApuInfo.
     * 
     * @return block
     */
    public java.lang.String getBlock() {
        return block;
    }


    /**
     * Sets the block value for this ApuInfo.
     * 
     * @param block
     */
    public void setBlock(java.lang.String block) {
        this.block = block;
    }


    /**
     * Gets the audible value for this ApuInfo.
     * 
     * @return audible
     */
    public java.lang.String getAudible() {
        return audible;
    }


    /**
     * Sets the audible value for this ApuInfo.
     * 
     * @param audible
     */
    public void setAudible(java.lang.String audible) {
        this.audible = audible;
    }


    /**
     * Gets the clr value for this ApuInfo.
     * 
     * @return clr
     */
    public java.lang.String getClr() {
        return clr;
    }


    /**
     * Sets the clr value for this ApuInfo.
     * 
     * @param clr
     */
    public void setClr(java.lang.String clr) {
        this.clr = clr;
    }


    /**
     * Gets the sm1Link value for this ApuInfo.
     * 
     * @return sm1Link
     */
    public java.lang.String getSm1Link() {
        return sm1Link;
    }


    /**
     * Sets the sm1Link value for this ApuInfo.
     * 
     * @param sm1Link
     */
    public void setSm1Link(java.lang.String sm1Link) {
        this.sm1Link = sm1Link;
    }


    /**
     * Gets the sm2Link value for this ApuInfo.
     * 
     * @return sm2Link
     */
    public java.lang.String getSm2Link() {
        return sm2Link;
    }


    /**
     * Sets the sm2Link value for this ApuInfo.
     * 
     * @param sm2Link
     */
    public void setSm2Link(java.lang.String sm2Link) {
        this.sm2Link = sm2Link;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApuInfo)) return false;
        ApuInfo other = (ApuInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.apu==null && other.getApu()==null) || 
             (this.apu!=null &&
              this.apu.equals(other.getApu()))) &&
            ((this.cri==null && other.getCri()==null) || 
             (this.cri!=null &&
              this.cri.equals(other.getCri()))) &&
            ((this.maj==null && other.getMaj()==null) || 
             (this.maj!=null &&
              this.maj.equals(other.getMaj()))) &&
            ((this.min==null && other.getMin()==null) || 
             (this.min!=null &&
              this.min.equals(other.getMin()))) &&
            ((this.block==null && other.getBlock()==null) || 
             (this.block!=null &&
              this.block.equals(other.getBlock()))) &&
            ((this.audible==null && other.getAudible()==null) || 
             (this.audible!=null &&
              this.audible.equals(other.getAudible()))) &&
            ((this.clr==null && other.getClr()==null) || 
             (this.clr!=null &&
              this.clr.equals(other.getClr()))) &&
            ((this.sm1Link==null && other.getSm1Link()==null) || 
             (this.sm1Link!=null &&
              this.sm1Link.equals(other.getSm1Link()))) &&
            ((this.sm2Link==null && other.getSm2Link()==null) || 
             (this.sm2Link!=null &&
              this.sm2Link.equals(other.getSm2Link())));
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
        if (getApu() != null) {
            _hashCode += getApu().hashCode();
        }
        if (getCri() != null) {
            _hashCode += getCri().hashCode();
        }
        if (getMaj() != null) {
            _hashCode += getMaj().hashCode();
        }
        if (getMin() != null) {
            _hashCode += getMin().hashCode();
        }
        if (getBlock() != null) {
            _hashCode += getBlock().hashCode();
        }
        if (getAudible() != null) {
            _hashCode += getAudible().hashCode();
        }
        if (getClr() != null) {
            _hashCode += getClr().hashCode();
        }
        if (getSm1Link() != null) {
            _hashCode += getSm1Link().hashCode();
        }
        if (getSm2Link() != null) {
            _hashCode += getSm2Link().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApuInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ApuInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cri");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maj");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("min");
        elemField.setXmlName(new javax.xml.namespace.QName("", "min"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("block");
        elemField.setXmlName(new javax.xml.namespace.QName("", "block"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audible");
        elemField.setXmlName(new javax.xml.namespace.QName("", "audible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sm1Link");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sm1Link"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sm2Link");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sm2Link"));
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
