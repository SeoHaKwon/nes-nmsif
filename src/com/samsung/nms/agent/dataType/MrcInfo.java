/**
 * MrcInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class MrcInfo  implements java.io.Serializable {
    private java.lang.Integer rte;

    private java.lang.String func;

    private java.lang.String trmt;

    private java.lang.String drl;

    private java.lang.String arl;

    public MrcInfo() {
    }

    public MrcInfo(
           java.lang.Integer rte,
           java.lang.String func,
           java.lang.String trmt,
           java.lang.String drl,
           java.lang.String arl) {
           this.rte = rte;
           this.func = func;
           this.trmt = trmt;
           this.drl = drl;
           this.arl = arl;
    }


    /**
     * Gets the rte value for this MrcInfo.
     * 
     * @return rte
     */
    public java.lang.Integer getRte() {
        return rte;
    }


    /**
     * Sets the rte value for this MrcInfo.
     * 
     * @param rte
     */
    public void setRte(java.lang.Integer rte) {
        this.rte = rte;
    }


    /**
     * Gets the func value for this MrcInfo.
     * 
     * @return func
     */
    public java.lang.String getFunc() {
        return func;
    }


    /**
     * Sets the func value for this MrcInfo.
     * 
     * @param func
     */
    public void setFunc(java.lang.String func) {
        this.func = func;
    }


    /**
     * Gets the trmt value for this MrcInfo.
     * 
     * @return trmt
     */
    public java.lang.String getTrmt() {
        return trmt;
    }


    /**
     * Sets the trmt value for this MrcInfo.
     * 
     * @param trmt
     */
    public void setTrmt(java.lang.String trmt) {
        this.trmt = trmt;
    }


    /**
     * Gets the drl value for this MrcInfo.
     * 
     * @return drl
     */
    public java.lang.String getDrl() {
        return drl;
    }


    /**
     * Sets the drl value for this MrcInfo.
     * 
     * @param drl
     */
    public void setDrl(java.lang.String drl) {
        this.drl = drl;
    }


    /**
     * Gets the arl value for this MrcInfo.
     * 
     * @return arl
     */
    public java.lang.String getArl() {
        return arl;
    }


    /**
     * Sets the arl value for this MrcInfo.
     * 
     * @param arl
     */
    public void setArl(java.lang.String arl) {
        this.arl = arl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MrcInfo)) return false;
        MrcInfo other = (MrcInfo) obj;
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
            ((this.func==null && other.getFunc()==null) || 
             (this.func!=null &&
              this.func.equals(other.getFunc()))) &&
            ((this.trmt==null && other.getTrmt()==null) || 
             (this.trmt!=null &&
              this.trmt.equals(other.getTrmt()))) &&
            ((this.drl==null && other.getDrl()==null) || 
             (this.drl!=null &&
              this.drl.equals(other.getDrl()))) &&
            ((this.arl==null && other.getArl()==null) || 
             (this.arl!=null &&
              this.arl.equals(other.getArl())));
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
        if (getFunc() != null) {
            _hashCode += getFunc().hashCode();
        }
        if (getTrmt() != null) {
            _hashCode += getTrmt().hashCode();
        }
        if (getDrl() != null) {
            _hashCode += getDrl().hashCode();
        }
        if (getArl() != null) {
            _hashCode += getArl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MrcInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "MrcInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rte");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
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
        elemField.setFieldName("drl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "drl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arl"));
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
