/**
 * RackHolder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class RackHolder  implements java.io.Serializable {
    private java.lang.Integer rackId;

    private com.samsung.nms.agent.dataType.ShelfHolder[] shelfHolder;

    public RackHolder() {
    }

    public RackHolder(
           java.lang.Integer rackId,
           com.samsung.nms.agent.dataType.ShelfHolder[] shelfHolder) {
           this.rackId = rackId;
           this.shelfHolder = shelfHolder;
    }


    /**
     * Gets the rackId value for this RackHolder.
     * 
     * @return rackId
     */
    public java.lang.Integer getRackId() {
        return rackId;
    }


    /**
     * Sets the rackId value for this RackHolder.
     * 
     * @param rackId
     */
    public void setRackId(java.lang.Integer rackId) {
        this.rackId = rackId;
    }


    /**
     * Gets the shelfHolder value for this RackHolder.
     * 
     * @return shelfHolder
     */
    public com.samsung.nms.agent.dataType.ShelfHolder[] getShelfHolder() {
        return shelfHolder;
    }


    /**
     * Sets the shelfHolder value for this RackHolder.
     * 
     * @param shelfHolder
     */
    public void setShelfHolder(com.samsung.nms.agent.dataType.ShelfHolder[] shelfHolder) {
        this.shelfHolder = shelfHolder;
    }

    public com.samsung.nms.agent.dataType.ShelfHolder getShelfHolder(int i) {
        return this.shelfHolder[i];
    }

    public void setShelfHolder(int i, com.samsung.nms.agent.dataType.ShelfHolder _value) {
        this.shelfHolder[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RackHolder)) return false;
        RackHolder other = (RackHolder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rackId==null && other.getRackId()==null) || 
             (this.rackId!=null &&
              this.rackId.equals(other.getRackId()))) &&
            ((this.shelfHolder==null && other.getShelfHolder()==null) || 
             (this.shelfHolder!=null &&
              java.util.Arrays.equals(this.shelfHolder, other.getShelfHolder())));
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
        if (getRackId() != null) {
            _hashCode += getRackId().hashCode();
        }
        if (getShelfHolder() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShelfHolder());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShelfHolder(), i);
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
        new org.apache.axis.description.TypeDesc(RackHolder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "RackHolder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rackId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rackId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shelfHolder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shelfHolder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ShelfHolder"));
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
