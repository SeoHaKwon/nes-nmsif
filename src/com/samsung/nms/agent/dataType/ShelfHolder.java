/**
 * ShelfHolder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class ShelfHolder  implements java.io.Serializable {
    private java.lang.Integer shelfId;

    private com.samsung.nms.agent.dataType.SlotHolder[] slotHolder;

    public ShelfHolder() {
    }

    public ShelfHolder(
           java.lang.Integer shelfId,
           com.samsung.nms.agent.dataType.SlotHolder[] slotHolder) {
           this.shelfId = shelfId;
           this.slotHolder = slotHolder;
    }


    /**
     * Gets the shelfId value for this ShelfHolder.
     * 
     * @return shelfId
     */
    public java.lang.Integer getShelfId() {
        return shelfId;
    }


    /**
     * Sets the shelfId value for this ShelfHolder.
     * 
     * @param shelfId
     */
    public void setShelfId(java.lang.Integer shelfId) {
        this.shelfId = shelfId;
    }


    /**
     * Gets the slotHolder value for this ShelfHolder.
     * 
     * @return slotHolder
     */
    public com.samsung.nms.agent.dataType.SlotHolder[] getSlotHolder() {
        return slotHolder;
    }


    /**
     * Sets the slotHolder value for this ShelfHolder.
     * 
     * @param slotHolder
     */
    public void setSlotHolder(com.samsung.nms.agent.dataType.SlotHolder[] slotHolder) {
        this.slotHolder = slotHolder;
    }

    public com.samsung.nms.agent.dataType.SlotHolder getSlotHolder(int i) {
        return this.slotHolder[i];
    }

    public void setSlotHolder(int i, com.samsung.nms.agent.dataType.SlotHolder _value) {
        this.slotHolder[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShelfHolder)) return false;
        ShelfHolder other = (ShelfHolder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shelfId==null && other.getShelfId()==null) || 
             (this.shelfId!=null &&
              this.shelfId.equals(other.getShelfId()))) &&
            ((this.slotHolder==null && other.getSlotHolder()==null) || 
             (this.slotHolder!=null &&
              java.util.Arrays.equals(this.slotHolder, other.getSlotHolder())));
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
        if (getShelfId() != null) {
            _hashCode += getShelfId().hashCode();
        }
        if (getSlotHolder() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSlotHolder());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSlotHolder(), i);
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
        new org.apache.axis.description.TypeDesc(ShelfHolder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ShelfHolder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shelfId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shelfId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slotHolder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "slotHolder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "SlotHolder"));
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
