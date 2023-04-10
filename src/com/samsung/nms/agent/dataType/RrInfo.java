/**
 * RrInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class RrInfo  implements java.io.Serializable {
    private java.lang.Integer rte;

    private java.lang.String rt;

    private java.lang.String rr;

    private java.lang.String dlt;

    private java.lang.String id;

    public RrInfo() {
    }

    public RrInfo(
           java.lang.Integer rte,
           java.lang.String rt,
           java.lang.String rr,
           java.lang.String dlt,
           java.lang.String id) {
           this.rte = rte;
           this.rt = rt;
           this.rr = rr;
           this.dlt = dlt;
           this.id = id;
    }


    /**
     * Gets the rte value for this RrInfo.
     * 
     * @return rte
     */
    public java.lang.Integer getRte() {
        return rte;
    }


    /**
     * Sets the rte value for this RrInfo.
     * 
     * @param rte
     */
    public void setRte(java.lang.Integer rte) {
        this.rte = rte;
    }


    /**
     * Gets the rt value for this RrInfo.
     * 
     * @return rt
     */
    public java.lang.String getRt() {
        return rt;
    }


    /**
     * Sets the rt value for this RrInfo.
     * 
     * @param rt
     */
    public void setRt(java.lang.String rt) {
        this.rt = rt;
    }


    /**
     * Gets the rr value for this RrInfo.
     * 
     * @return rr
     */
    public java.lang.String getRr() {
        return rr;
    }


    /**
     * Sets the rr value for this RrInfo.
     * 
     * @param rr
     */
    public void setRr(java.lang.String rr) {
        this.rr = rr;
    }


    /**
     * Gets the dlt value for this RrInfo.
     * 
     * @return dlt
     */
    public java.lang.String getDlt() {
        return dlt;
    }


    /**
     * Sets the dlt value for this RrInfo.
     * 
     * @param dlt
     */
    public void setDlt(java.lang.String dlt) {
        this.dlt = dlt;
    }


    /**
     * Gets the id value for this RrInfo.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this RrInfo.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RrInfo)) return false;
        RrInfo other = (RrInfo) obj;
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
            ((this.rt==null && other.getRt()==null) || 
             (this.rt!=null &&
              this.rt.equals(other.getRt()))) &&
            ((this.rr==null && other.getRr()==null) || 
             (this.rr!=null &&
              this.rr.equals(other.getRr()))) &&
            ((this.dlt==null && other.getDlt()==null) || 
             (this.dlt!=null &&
              this.dlt.equals(other.getDlt()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId())));
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
        if (getRt() != null) {
            _hashCode += getRt().hashCode();
        }
        if (getRr() != null) {
            _hashCode += getRr().hashCode();
        }
        if (getDlt() != null) {
            _hashCode += getDlt().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RrInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "RrInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rte");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dlt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dlt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
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
