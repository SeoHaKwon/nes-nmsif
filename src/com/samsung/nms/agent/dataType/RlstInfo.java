/**
 * RlstInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class RlstInfo  implements java.io.Serializable {
    private java.lang.Integer rlst;

    private java.lang.String rteType;

    private java.lang.Integer rte;

    private java.lang.Integer dltLength;

    private java.lang.Integer insertDgt;

    private java.lang.String type;

    public RlstInfo() {
    }

    public RlstInfo(
           java.lang.Integer rlst,
           java.lang.String rteType,
           java.lang.Integer rte,
           java.lang.Integer dltLength,
           java.lang.Integer insertDgt,
           java.lang.String type) {
           this.rlst = rlst;
           this.rteType = rteType;
           this.rte = rte;
           this.dltLength = dltLength;
           this.insertDgt = insertDgt;
           this.type = type;
    }


    /**
     * Gets the rlst value for this RlstInfo.
     * 
     * @return rlst
     */
    public java.lang.Integer getRlst() {
        return rlst;
    }


    /**
     * Sets the rlst value for this RlstInfo.
     * 
     * @param rlst
     */
    public void setRlst(java.lang.Integer rlst) {
        this.rlst = rlst;
    }


    /**
     * Gets the rteType value for this RlstInfo.
     * 
     * @return rteType
     */
    public java.lang.String getRteType() {
        return rteType;
    }


    /**
     * Sets the rteType value for this RlstInfo.
     * 
     * @param rteType
     */
    public void setRteType(java.lang.String rteType) {
        this.rteType = rteType;
    }


    /**
     * Gets the rte value for this RlstInfo.
     * 
     * @return rte
     */
    public java.lang.Integer getRte() {
        return rte;
    }


    /**
     * Sets the rte value for this RlstInfo.
     * 
     * @param rte
     */
    public void setRte(java.lang.Integer rte) {
        this.rte = rte;
    }


    /**
     * Gets the dltLength value for this RlstInfo.
     * 
     * @return dltLength
     */
    public java.lang.Integer getDltLength() {
        return dltLength;
    }


    /**
     * Sets the dltLength value for this RlstInfo.
     * 
     * @param dltLength
     */
    public void setDltLength(java.lang.Integer dltLength) {
        this.dltLength = dltLength;
    }


    /**
     * Gets the insertDgt value for this RlstInfo.
     * 
     * @return insertDgt
     */
    public java.lang.Integer getInsertDgt() {
        return insertDgt;
    }


    /**
     * Sets the insertDgt value for this RlstInfo.
     * 
     * @param insertDgt
     */
    public void setInsertDgt(java.lang.Integer insertDgt) {
        this.insertDgt = insertDgt;
    }


    /**
     * Gets the type value for this RlstInfo.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this RlstInfo.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RlstInfo)) return false;
        RlstInfo other = (RlstInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rlst==null && other.getRlst()==null) || 
             (this.rlst!=null &&
              this.rlst.equals(other.getRlst()))) &&
            ((this.rteType==null && other.getRteType()==null) || 
             (this.rteType!=null &&
              this.rteType.equals(other.getRteType()))) &&
            ((this.rte==null && other.getRte()==null) || 
             (this.rte!=null &&
              this.rte.equals(other.getRte()))) &&
            ((this.dltLength==null && other.getDltLength()==null) || 
             (this.dltLength!=null &&
              this.dltLength.equals(other.getDltLength()))) &&
            ((this.insertDgt==null && other.getInsertDgt()==null) || 
             (this.insertDgt!=null &&
              this.insertDgt.equals(other.getInsertDgt()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getRlst() != null) {
            _hashCode += getRlst().hashCode();
        }
        if (getRteType() != null) {
            _hashCode += getRteType().hashCode();
        }
        if (getRte() != null) {
            _hashCode += getRte().hashCode();
        }
        if (getDltLength() != null) {
            _hashCode += getDltLength().hashCode();
        }
        if (getInsertDgt() != null) {
            _hashCode += getInsertDgt().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RlstInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "RlstInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rlst");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rlst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rteType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rteType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rte");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dltLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dltLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertDgt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "insertDgt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
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
