/**
 * MmsDetailRteInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class MmsDetailRteInfo  implements java.io.Serializable {
    private java.lang.Integer rte;

    private java.lang.Integer rlstCnt;

    private java.lang.Integer[] rlst;

    public MmsDetailRteInfo() {
    }

    public MmsDetailRteInfo(
           java.lang.Integer rte,
           java.lang.Integer rlstCnt,
           java.lang.Integer[] rlst) {
           this.rte = rte;
           this.rlstCnt = rlstCnt;
           this.rlst = rlst;
    }


    /**
     * Gets the rte value for this MmsDetailRteInfo.
     * 
     * @return rte
     */
    public java.lang.Integer getRte() {
        return rte;
    }


    /**
     * Sets the rte value for this MmsDetailRteInfo.
     * 
     * @param rte
     */
    public void setRte(java.lang.Integer rte) {
        this.rte = rte;
    }


    /**
     * Gets the rlstCnt value for this MmsDetailRteInfo.
     * 
     * @return rlstCnt
     */
    public java.lang.Integer getRlstCnt() {
        return rlstCnt;
    }


    /**
     * Sets the rlstCnt value for this MmsDetailRteInfo.
     * 
     * @param rlstCnt
     */
    public void setRlstCnt(java.lang.Integer rlstCnt) {
        this.rlstCnt = rlstCnt;
    }


    /**
     * Gets the rlst value for this MmsDetailRteInfo.
     * 
     * @return rlst
     */
    public java.lang.Integer[] getRlst() {
        return rlst;
    }


    /**
     * Sets the rlst value for this MmsDetailRteInfo.
     * 
     * @param rlst
     */
    public void setRlst(java.lang.Integer[] rlst) {
        this.rlst = rlst;
    }

    public java.lang.Integer getRlst(int i) {
        return this.rlst[i];
    }

    public void setRlst(int i, java.lang.Integer _value) {
        this.rlst[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MmsDetailRteInfo)) return false;
        MmsDetailRteInfo other = (MmsDetailRteInfo) obj;
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
            ((this.rlstCnt==null && other.getRlstCnt()==null) || 
             (this.rlstCnt!=null &&
              this.rlstCnt.equals(other.getRlstCnt()))) &&
            ((this.rlst==null && other.getRlst()==null) || 
             (this.rlst!=null &&
              java.util.Arrays.equals(this.rlst, other.getRlst())));
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
        if (getRlstCnt() != null) {
            _hashCode += getRlstCnt().hashCode();
        }
        if (getRlst() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRlst());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRlst(), i);
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
        new org.apache.axis.description.TypeDesc(MmsDetailRteInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "MmsDetailRteInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rte");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rlstCnt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rlstCnt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rlst");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rlst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
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
