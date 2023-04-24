/**
 * InhRteInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class InhRteInfo  implements java.io.Serializable {
    private java.lang.String iRte;

    private java.lang.String iName;

    private java.lang.String oRte;

    public InhRteInfo() {
    }

    public InhRteInfo(
           java.lang.String iRte,
           java.lang.String iName,
           java.lang.String oRte) {
           this.iRte = iRte;
           this.iName = iName;
           this.oRte = oRte;
    }


    /**
     * Gets the iRte value for this InhRteInfo.
     * 
     * @return iRte
     */
    public java.lang.String getIRte() {
        return iRte;
    }


    /**
     * Sets the iRte value for this InhRteInfo.
     * 
     * @param iRte
     */
    public void setIRte(java.lang.String iRte) {
        this.iRte = iRte;
    }


    /**
     * Gets the iName value for this InhRteInfo.
     * 
     * @return iName
     */
    public java.lang.String getIName() {
        return iName;
    }


    /**
     * Sets the iName value for this InhRteInfo.
     * 
     * @param iName
     */
    public void setIName(java.lang.String iName) {
        this.iName = iName;
    }


    /**
     * Gets the oRte value for this InhRteInfo.
     * 
     * @return oRte
     */
    public java.lang.String getORte() {
        return oRte;
    }


    /**
     * Sets the oRte value for this InhRteInfo.
     * 
     * @param oRte
     */
    public void setORte(java.lang.String oRte) {
        this.oRte = oRte;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InhRteInfo)) return false;
        InhRteInfo other = (InhRteInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.iRte==null && other.getIRte()==null) || 
             (this.iRte!=null &&
              this.iRte.equals(other.getIRte()))) &&
            ((this.iName==null && other.getIName()==null) || 
             (this.iName!=null &&
              this.iName.equals(other.getIName()))) &&
            ((this.oRte==null && other.getORte()==null) || 
             (this.oRte!=null &&
              this.oRte.equals(other.getORte())));
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
        if (getIRte() != null) {
            _hashCode += getIRte().hashCode();
        }
        if (getIName() != null) {
            _hashCode += getIName().hashCode();
        }
        if (getORte() != null) {
            _hashCode += getORte().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InhRteInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "InhRteInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IRte");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iRte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ORte");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oRte"));
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
