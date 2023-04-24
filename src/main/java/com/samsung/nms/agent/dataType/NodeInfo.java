/**
 * NodeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class NodeInfo  implements java.io.Serializable {
    private java.lang.Integer rackId;

    private java.lang.Integer shelfId;

    private java.lang.Integer slotId;

    private java.lang.Integer cardId;

    private java.lang.String cardName;

    private java.lang.String name;

    private java.lang.String ipAddr;

    private java.lang.String type;

    private java.lang.String admSts;

    private java.lang.String operSts;

    private java.lang.String usgSts;

    private java.lang.String detailSts;

    public NodeInfo() {
    }

    public NodeInfo(
           java.lang.Integer rackId,
           java.lang.Integer shelfId,
           java.lang.Integer slotId,
           java.lang.Integer cardId,
           java.lang.String cardName,
           java.lang.String name,
           java.lang.String ipAddr,
           java.lang.String type,
           java.lang.String admSts,
           java.lang.String operSts,
           java.lang.String usgSts,
           java.lang.String detailSts) {
           this.rackId = rackId;
           this.shelfId = shelfId;
           this.slotId = slotId;
           this.cardId = cardId;
           this.cardName = cardName;
           this.name = name;
           this.ipAddr = ipAddr;
           this.type = type;
           this.admSts = admSts;
           this.operSts = operSts;
           this.usgSts = usgSts;
           this.detailSts = detailSts;
    }


    /**
     * Gets the rackId value for this NodeInfo.
     * 
     * @return rackId
     */
    public java.lang.Integer getRackId() {
        return rackId;
    }


    /**
     * Sets the rackId value for this NodeInfo.
     * 
     * @param rackId
     */
    public void setRackId(java.lang.Integer rackId) {
        this.rackId = rackId;
    }


    /**
     * Gets the shelfId value for this NodeInfo.
     * 
     * @return shelfId
     */
    public java.lang.Integer getShelfId() {
        return shelfId;
    }


    /**
     * Sets the shelfId value for this NodeInfo.
     * 
     * @param shelfId
     */
    public void setShelfId(java.lang.Integer shelfId) {
        this.shelfId = shelfId;
    }


    /**
     * Gets the slotId value for this NodeInfo.
     * 
     * @return slotId
     */
    public java.lang.Integer getSlotId() {
        return slotId;
    }


    /**
     * Sets the slotId value for this NodeInfo.
     * 
     * @param slotId
     */
    public void setSlotId(java.lang.Integer slotId) {
        this.slotId = slotId;
    }


    /**
     * Gets the cardId value for this NodeInfo.
     * 
     * @return cardId
     */
    public java.lang.Integer getCardId() {
        return cardId;
    }


    /**
     * Sets the cardId value for this NodeInfo.
     * 
     * @param cardId
     */
    public void setCardId(java.lang.Integer cardId) {
        this.cardId = cardId;
    }


    /**
     * Gets the cardName value for this NodeInfo.
     * 
     * @return cardName
     */
    public java.lang.String getCardName() {
        return cardName;
    }


    /**
     * Sets the cardName value for this NodeInfo.
     * 
     * @param cardName
     */
    public void setCardName(java.lang.String cardName) {
        this.cardName = cardName;
    }


    /**
     * Gets the name value for this NodeInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this NodeInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the ipAddr value for this NodeInfo.
     * 
     * @return ipAddr
     */
    public java.lang.String getIpAddr() {
        return ipAddr;
    }


    /**
     * Sets the ipAddr value for this NodeInfo.
     * 
     * @param ipAddr
     */
    public void setIpAddr(java.lang.String ipAddr) {
        this.ipAddr = ipAddr;
    }


    /**
     * Gets the type value for this NodeInfo.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this NodeInfo.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the admSts value for this NodeInfo.
     * 
     * @return admSts
     */
    public java.lang.String getAdmSts() {
        return admSts;
    }


    /**
     * Sets the admSts value for this NodeInfo.
     * 
     * @param admSts
     */
    public void setAdmSts(java.lang.String admSts) {
        this.admSts = admSts;
    }


    /**
     * Gets the operSts value for this NodeInfo.
     * 
     * @return operSts
     */
    public java.lang.String getOperSts() {
        return operSts;
    }


    /**
     * Sets the operSts value for this NodeInfo.
     * 
     * @param operSts
     */
    public void setOperSts(java.lang.String operSts) {
        this.operSts = operSts;
    }


    /**
     * Gets the usgSts value for this NodeInfo.
     * 
     * @return usgSts
     */
    public java.lang.String getUsgSts() {
        return usgSts;
    }


    /**
     * Sets the usgSts value for this NodeInfo.
     * 
     * @param usgSts
     */
    public void setUsgSts(java.lang.String usgSts) {
        this.usgSts = usgSts;
    }


    /**
     * Gets the detailSts value for this NodeInfo.
     * 
     * @return detailSts
     */
    public java.lang.String getDetailSts() {
        return detailSts;
    }


    /**
     * Sets the detailSts value for this NodeInfo.
     * 
     * @param detailSts
     */
    public void setDetailSts(java.lang.String detailSts) {
        this.detailSts = detailSts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NodeInfo)) return false;
        NodeInfo other = (NodeInfo) obj;
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
            ((this.cardName==null && other.getCardName()==null) || 
             (this.cardName!=null &&
              this.cardName.equals(other.getCardName()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.ipAddr==null && other.getIpAddr()==null) || 
             (this.ipAddr!=null &&
              this.ipAddr.equals(other.getIpAddr()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.admSts==null && other.getAdmSts()==null) || 
             (this.admSts!=null &&
              this.admSts.equals(other.getAdmSts()))) &&
            ((this.operSts==null && other.getOperSts()==null) || 
             (this.operSts!=null &&
              this.operSts.equals(other.getOperSts()))) &&
            ((this.usgSts==null && other.getUsgSts()==null) || 
             (this.usgSts!=null &&
              this.usgSts.equals(other.getUsgSts()))) &&
            ((this.detailSts==null && other.getDetailSts()==null) || 
             (this.detailSts!=null &&
              this.detailSts.equals(other.getDetailSts())));
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
        if (getCardName() != null) {
            _hashCode += getCardName().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getIpAddr() != null) {
            _hashCode += getIpAddr().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getAdmSts() != null) {
            _hashCode += getAdmSts().hashCode();
        }
        if (getOperSts() != null) {
            _hashCode += getOperSts().hashCode();
        }
        if (getUsgSts() != null) {
            _hashCode += getUsgSts().hashCode();
        }
        if (getDetailSts() != null) {
            _hashCode += getDetailSts().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NodeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "NodeInfo"));
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
        elemField.setFieldName("cardName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipAddr"));
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
        elemField.setFieldName("admSts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "admSts"));
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
        elemField.setFieldName("usgSts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usgSts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailSts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "detailSts"));
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
