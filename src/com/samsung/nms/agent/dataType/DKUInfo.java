/**
 * DKUInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class DKUInfo  implements java.io.Serializable {
    private java.lang.Integer rackId;

    private java.lang.Integer shelfId;

    private java.lang.Integer slotId;

    private java.lang.Integer cardId;

    private java.lang.String name;

    private java.lang.String operSts;

    private java.lang.String active;

    private java.lang.String ld;

    private java.lang.String type;

    private java.lang.String size;

    private java.lang.String eqpSts;

    private java.lang.String detailedSts;

    public DKUInfo() {
    }

    public DKUInfo(
           java.lang.Integer rackId,
           java.lang.Integer shelfId,
           java.lang.Integer slotId,
           java.lang.Integer cardId,
           java.lang.String name,
           java.lang.String operSts,
           java.lang.String active,
           java.lang.String ld,
           java.lang.String type,
           java.lang.String size,
           java.lang.String eqpSts,
           java.lang.String detailedSts) {
           this.rackId = rackId;
           this.shelfId = shelfId;
           this.slotId = slotId;
           this.cardId = cardId;
           this.name = name;
           this.operSts = operSts;
           this.active = active;
           this.ld = ld;
           this.type = type;
           this.size = size;
           this.eqpSts = eqpSts;
           this.detailedSts = detailedSts;
    }


    /**
     * Gets the rackId value for this DKUInfo.
     * 
     * @return rackId
     */
    public java.lang.Integer getRackId() {
        return rackId;
    }


    /**
     * Sets the rackId value for this DKUInfo.
     * 
     * @param rackId
     */
    public void setRackId(java.lang.Integer rackId) {
        this.rackId = rackId;
    }


    /**
     * Gets the shelfId value for this DKUInfo.
     * 
     * @return shelfId
     */
    public java.lang.Integer getShelfId() {
        return shelfId;
    }


    /**
     * Sets the shelfId value for this DKUInfo.
     * 
     * @param shelfId
     */
    public void setShelfId(java.lang.Integer shelfId) {
        this.shelfId = shelfId;
    }


    /**
     * Gets the slotId value for this DKUInfo.
     * 
     * @return slotId
     */
    public java.lang.Integer getSlotId() {
        return slotId;
    }


    /**
     * Sets the slotId value for this DKUInfo.
     * 
     * @param slotId
     */
    public void setSlotId(java.lang.Integer slotId) {
        this.slotId = slotId;
    }


    /**
     * Gets the cardId value for this DKUInfo.
     * 
     * @return cardId
     */
    public java.lang.Integer getCardId() {
        return cardId;
    }


    /**
     * Sets the cardId value for this DKUInfo.
     * 
     * @param cardId
     */
    public void setCardId(java.lang.Integer cardId) {
        this.cardId = cardId;
    }


    /**
     * Gets the name value for this DKUInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DKUInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the operSts value for this DKUInfo.
     * 
     * @return operSts
     */
    public java.lang.String getOperSts() {
        return operSts;
    }


    /**
     * Sets the operSts value for this DKUInfo.
     * 
     * @param operSts
     */
    public void setOperSts(java.lang.String operSts) {
        this.operSts = operSts;
    }


    /**
     * Gets the active value for this DKUInfo.
     * 
     * @return active
     */
    public java.lang.String getActive() {
        return active;
    }


    /**
     * Sets the active value for this DKUInfo.
     * 
     * @param active
     */
    public void setActive(java.lang.String active) {
        this.active = active;
    }


    /**
     * Gets the ld value for this DKUInfo.
     * 
     * @return ld
     */
    public java.lang.String getLd() {
        return ld;
    }


    /**
     * Sets the ld value for this DKUInfo.
     * 
     * @param ld
     */
    public void setLd(java.lang.String ld) {
        this.ld = ld;
    }


    /**
     * Gets the type value for this DKUInfo.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this DKUInfo.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the size value for this DKUInfo.
     * 
     * @return size
     */
    public java.lang.String getSize() {
        return size;
    }


    /**
     * Sets the size value for this DKUInfo.
     * 
     * @param size
     */
    public void setSize(java.lang.String size) {
        this.size = size;
    }


    /**
     * Gets the eqpSts value for this DKUInfo.
     * 
     * @return eqpSts
     */
    public java.lang.String getEqpSts() {
        return eqpSts;
    }


    /**
     * Sets the eqpSts value for this DKUInfo.
     * 
     * @param eqpSts
     */
    public void setEqpSts(java.lang.String eqpSts) {
        this.eqpSts = eqpSts;
    }


    /**
     * Gets the detailedSts value for this DKUInfo.
     * 
     * @return detailedSts
     */
    public java.lang.String getDetailedSts() {
        return detailedSts;
    }


    /**
     * Sets the detailedSts value for this DKUInfo.
     * 
     * @param detailedSts
     */
    public void setDetailedSts(java.lang.String detailedSts) {
        this.detailedSts = detailedSts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DKUInfo)) return false;
        DKUInfo other = (DKUInfo) obj;
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
            ((this.cardId==null && other.getCardId()==null) || 
             (this.cardId!=null &&
              this.cardId.equals(other.getCardId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.operSts==null && other.getOperSts()==null) || 
             (this.operSts!=null &&
              this.operSts.equals(other.getOperSts()))) &&
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.ld==null && other.getLd()==null) || 
             (this.ld!=null &&
              this.ld.equals(other.getLd()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize()))) &&
            ((this.eqpSts==null && other.getEqpSts()==null) || 
             (this.eqpSts!=null &&
              this.eqpSts.equals(other.getEqpSts()))) &&
            ((this.detailedSts==null && other.getDetailedSts()==null) || 
             (this.detailedSts!=null &&
              this.detailedSts.equals(other.getDetailedSts())));
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
        if (getCardId() != null) {
            _hashCode += getCardId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOperSts() != null) {
            _hashCode += getOperSts().hashCode();
        }
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getLd() != null) {
            _hashCode += getLd().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        if (getEqpSts() != null) {
            _hashCode += getEqpSts().hashCode();
        }
        if (getDetailedSts() != null) {
            _hashCode += getDetailedSts().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DKUInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "DKUInfo"));
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
        elemField.setFieldName("cardId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operSts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operSts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ld");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ld"));
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
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eqpSts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eqpSts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailedSts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "detailedSts"));
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
