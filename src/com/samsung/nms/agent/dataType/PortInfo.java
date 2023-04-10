/**
 * PortInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class PortInfo  implements java.io.Serializable {
    private java.lang.Integer rackId;

    private java.lang.Integer shelfId;

    private java.lang.Integer slotId;

    private java.lang.Integer linkId;

    private java.lang.String operSts;

    private java.lang.String equipSts;

    private java.lang.String type;

    private java.lang.String speedCode;

    public PortInfo() {
    }

    public PortInfo(
           java.lang.Integer rackId,
           java.lang.Integer shelfId,
           java.lang.Integer slotId,
           java.lang.Integer linkId,
           java.lang.String operSts,
           java.lang.String equipSts,
           java.lang.String type,
           java.lang.String speedCode) {
           this.rackId = rackId;
           this.shelfId = shelfId;
           this.slotId = slotId;
           this.linkId = linkId;
           this.operSts = operSts;
           this.equipSts = equipSts;
           this.type = type;
           this.speedCode = speedCode;
    }


    /**
     * Gets the rackId value for this PortInfo.
     * 
     * @return rackId
     */
    public java.lang.Integer getRackId() {
        return rackId;
    }


    /**
     * Sets the rackId value for this PortInfo.
     * 
     * @param rackId
     */
    public void setRackId(java.lang.Integer rackId) {
        this.rackId = rackId;
    }


    /**
     * Gets the shelfId value for this PortInfo.
     * 
     * @return shelfId
     */
    public java.lang.Integer getShelfId() {
        return shelfId;
    }


    /**
     * Sets the shelfId value for this PortInfo.
     * 
     * @param shelfId
     */
    public void setShelfId(java.lang.Integer shelfId) {
        this.shelfId = shelfId;
    }


    /**
     * Gets the slotId value for this PortInfo.
     * 
     * @return slotId
     */
    public java.lang.Integer getSlotId() {
        return slotId;
    }


    /**
     * Sets the slotId value for this PortInfo.
     * 
     * @param slotId
     */
    public void setSlotId(java.lang.Integer slotId) {
        this.slotId = slotId;
    }


    /**
     * Gets the linkId value for this PortInfo.
     * 
     * @return linkId
     */
    public java.lang.Integer getLinkId() {
        return linkId;
    }


    /**
     * Sets the linkId value for this PortInfo.
     * 
     * @param linkId
     */
    public void setLinkId(java.lang.Integer linkId) {
        this.linkId = linkId;
    }


    /**
     * Gets the operSts value for this PortInfo.
     * 
     * @return operSts
     */
    public java.lang.String getOperSts() {
        return operSts;
    }


    /**
     * Sets the operSts value for this PortInfo.
     * 
     * @param operSts
     */
    public void setOperSts(java.lang.String operSts) {
        this.operSts = operSts;
    }


    /**
     * Gets the equipSts value for this PortInfo.
     * 
     * @return equipSts
     */
    public java.lang.String getEquipSts() {
        return equipSts;
    }


    /**
     * Sets the equipSts value for this PortInfo.
     * 
     * @param equipSts
     */
    public void setEquipSts(java.lang.String equipSts) {
        this.equipSts = equipSts;
    }


    /**
     * Gets the type value for this PortInfo.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this PortInfo.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the speedCode value for this PortInfo.
     * 
     * @return speedCode
     */
    public java.lang.String getSpeedCode() {
        return speedCode;
    }


    /**
     * Sets the speedCode value for this PortInfo.
     * 
     * @param speedCode
     */
    public void setSpeedCode(java.lang.String speedCode) {
        this.speedCode = speedCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PortInfo)) return false;
        PortInfo other = (PortInfo) obj;
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
            ((this.shelfId==null && other.getShelfId()==null) || 
             (this.shelfId!=null &&
              this.shelfId.equals(other.getShelfId()))) &&
            ((this.slotId==null && other.getSlotId()==null) || 
             (this.slotId!=null &&
              this.slotId.equals(other.getSlotId()))) &&
            ((this.linkId==null && other.getLinkId()==null) || 
             (this.linkId!=null &&
              this.linkId.equals(other.getLinkId()))) &&
            ((this.operSts==null && other.getOperSts()==null) || 
             (this.operSts!=null &&
              this.operSts.equals(other.getOperSts()))) &&
            ((this.equipSts==null && other.getEquipSts()==null) || 
             (this.equipSts!=null &&
              this.equipSts.equals(other.getEquipSts()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.speedCode==null && other.getSpeedCode()==null) || 
             (this.speedCode!=null &&
              this.speedCode.equals(other.getSpeedCode())));
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
        if (getShelfId() != null) {
            _hashCode += getShelfId().hashCode();
        }
        if (getSlotId() != null) {
            _hashCode += getSlotId().hashCode();
        }
        if (getLinkId() != null) {
            _hashCode += getLinkId().hashCode();
        }
        if (getOperSts() != null) {
            _hashCode += getOperSts().hashCode();
        }
        if (getEquipSts() != null) {
            _hashCode += getEquipSts().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getSpeedCode() != null) {
            _hashCode += getSpeedCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PortInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "PortInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rackId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rackId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shelfId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shelfId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slotId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "slotId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operSts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operSts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("equipSts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "equipSts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("speedCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "speedCode"));
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
