/**
 * CardInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class CardInfo  implements java.io.Serializable {
    private java.lang.Integer rackId;

    private java.lang.Integer shelfId;

    private java.lang.Integer slotId;

    private java.lang.Integer cardId;

    private java.lang.String name;

    private java.lang.String operSts;

    private java.lang.String side;

    private java.lang.String eqpSts;

    private java.lang.String actSts;

    private java.lang.String detailSts;

    private java.lang.String location;

    public CardInfo() {
    }

    public CardInfo(
           java.lang.Integer rackId,
           java.lang.Integer shelfId,
           java.lang.Integer slotId,
           java.lang.Integer cardId,
           java.lang.String name,
           java.lang.String operSts,
           java.lang.String side,
           java.lang.String eqpSts,
           java.lang.String actSts,
           java.lang.String detailSts,
           java.lang.String location) {
           this.rackId = rackId;
           this.shelfId = shelfId;
           this.slotId = slotId;
           this.cardId = cardId;
           this.name = name;
           this.operSts = operSts;
           this.side = side;
           this.eqpSts = eqpSts;
           this.actSts = actSts;
           this.detailSts = detailSts;
           this.location = location;
    }


    /**
     * Gets the rackId value for this CardInfo.
     * 
     * @return rackId
     */
    public java.lang.Integer getRackId() {
        return rackId;
    }


    /**
     * Sets the rackId value for this CardInfo.
     * 
     * @param rackId
     */
    public void setRackId(java.lang.Integer rackId) {
        this.rackId = rackId;
    }


    /**
     * Gets the shelfId value for this CardInfo.
     * 
     * @return shelfId
     */
    public java.lang.Integer getShelfId() {
        return shelfId;
    }


    /**
     * Sets the shelfId value for this CardInfo.
     * 
     * @param shelfId
     */
    public void setShelfId(java.lang.Integer shelfId) {
        this.shelfId = shelfId;
    }


    /**
     * Gets the slotId value for this CardInfo.
     * 
     * @return slotId
     */
    public java.lang.Integer getSlotId() {
        return slotId;
    }


    /**
     * Sets the slotId value for this CardInfo.
     * 
     * @param slotId
     */
    public void setSlotId(java.lang.Integer slotId) {
        this.slotId = slotId;
    }


    /**
     * Gets the cardId value for this CardInfo.
     * 
     * @return cardId
     */
    public java.lang.Integer getCardId() {
        return cardId;
    }


    /**
     * Sets the cardId value for this CardInfo.
     * 
     * @param cardId
     */
    public void setCardId(java.lang.Integer cardId) {
        this.cardId = cardId;
    }


    /**
     * Gets the name value for this CardInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CardInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the operSts value for this CardInfo.
     * 
     * @return operSts
     */
    public java.lang.String getOperSts() {
        return operSts;
    }


    /**
     * Sets the operSts value for this CardInfo.
     * 
     * @param operSts
     */
    public void setOperSts(java.lang.String operSts) {
        this.operSts = operSts;
    }


    /**
     * Gets the side value for this CardInfo.
     * 
     * @return side
     */
    public java.lang.String getSide() {
        return side;
    }


    /**
     * Sets the side value for this CardInfo.
     * 
     * @param side
     */
    public void setSide(java.lang.String side) {
        this.side = side;
    }


    /**
     * Gets the eqpSts value for this CardInfo.
     * 
     * @return eqpSts
     */
    public java.lang.String getEqpSts() {
        return eqpSts;
    }


    /**
     * Sets the eqpSts value for this CardInfo.
     * 
     * @param eqpSts
     */
    public void setEqpSts(java.lang.String eqpSts) {
        this.eqpSts = eqpSts;
    }


    /**
     * Gets the actSts value for this CardInfo.
     * 
     * @return actSts
     */
    public java.lang.String getActSts() {
        return actSts;
    }


    /**
     * Sets the actSts value for this CardInfo.
     * 
     * @param actSts
     */
    public void setActSts(java.lang.String actSts) {
        this.actSts = actSts;
    }


    /**
     * Gets the detailSts value for this CardInfo.
     * 
     * @return detailSts
     */
    public java.lang.String getDetailSts() {
        return detailSts;
    }


    /**
     * Sets the detailSts value for this CardInfo.
     * 
     * @param detailSts
     */
    public void setDetailSts(java.lang.String detailSts) {
        this.detailSts = detailSts;
    }


    /**
     * Gets the location value for this CardInfo.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this CardInfo.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardInfo)) return false;
        CardInfo other = (CardInfo) obj;
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
            ((this.side==null && other.getSide()==null) || 
             (this.side!=null &&
              this.side.equals(other.getSide()))) &&
            ((this.eqpSts==null && other.getEqpSts()==null) || 
             (this.eqpSts!=null &&
              this.eqpSts.equals(other.getEqpSts()))) &&
            ((this.actSts==null && other.getActSts()==null) || 
             (this.actSts!=null &&
              this.actSts.equals(other.getActSts()))) &&
            ((this.detailSts==null && other.getDetailSts()==null) || 
             (this.detailSts!=null &&
              this.detailSts.equals(other.getDetailSts()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation())));
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
        if (getSide() != null) {
            _hashCode += getSide().hashCode();
        }
        if (getEqpSts() != null) {
            _hashCode += getEqpSts().hashCode();
        }
        if (getActSts() != null) {
            _hashCode += getActSts().hashCode();
        }
        if (getDetailSts() != null) {
            _hashCode += getDetailSts().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "CardInfo"));
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
        elemField.setFieldName("side");
        elemField.setXmlName(new javax.xml.namespace.QName("", "side"));
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
        elemField.setFieldName("actSts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actSts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailSts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "detailSts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("", "location"));
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
