/**
 * MODInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class MODInfo  implements java.io.Serializable {
    private java.lang.Integer rackId;

    private java.lang.Integer shelfId;

    private java.lang.Integer slotId;

    private java.lang.Integer cardId;

    private java.lang.String name;

    private java.lang.String sdu;

    private java.lang.String node;

    private java.lang.String comm;

    private java.lang.String scsi;

    private java.lang.String pwr;

    private java.lang.String drv;

    private java.lang.String mount;

    private java.lang.String mode;

    public MODInfo() {
    }

    public MODInfo(
           java.lang.Integer rackId,
           java.lang.Integer shelfId,
           java.lang.Integer slotId,
           java.lang.Integer cardId,
           java.lang.String name,
           java.lang.String sdu,
           java.lang.String node,
           java.lang.String comm,
           java.lang.String scsi,
           java.lang.String pwr,
           java.lang.String drv,
           java.lang.String mount,
           java.lang.String mode) {
           this.rackId = rackId;
           this.shelfId = shelfId;
           this.slotId = slotId;
           this.cardId = cardId;
           this.name = name;
           this.sdu = sdu;
           this.node = node;
           this.comm = comm;
           this.scsi = scsi;
           this.pwr = pwr;
           this.drv = drv;
           this.mount = mount;
           this.mode = mode;
    }


    /**
     * Gets the rackId value for this MODInfo.
     * 
     * @return rackId
     */
    public java.lang.Integer getRackId() {
        return rackId;
    }


    /**
     * Sets the rackId value for this MODInfo.
     * 
     * @param rackId
     */
    public void setRackId(java.lang.Integer rackId) {
        this.rackId = rackId;
    }


    /**
     * Gets the shelfId value for this MODInfo.
     * 
     * @return shelfId
     */
    public java.lang.Integer getShelfId() {
        return shelfId;
    }


    /**
     * Sets the shelfId value for this MODInfo.
     * 
     * @param shelfId
     */
    public void setShelfId(java.lang.Integer shelfId) {
        this.shelfId = shelfId;
    }


    /**
     * Gets the slotId value for this MODInfo.
     * 
     * @return slotId
     */
    public java.lang.Integer getSlotId() {
        return slotId;
    }


    /**
     * Sets the slotId value for this MODInfo.
     * 
     * @param slotId
     */
    public void setSlotId(java.lang.Integer slotId) {
        this.slotId = slotId;
    }


    /**
     * Gets the cardId value for this MODInfo.
     * 
     * @return cardId
     */
    public java.lang.Integer getCardId() {
        return cardId;
    }


    /**
     * Sets the cardId value for this MODInfo.
     * 
     * @param cardId
     */
    public void setCardId(java.lang.Integer cardId) {
        this.cardId = cardId;
    }


    /**
     * Gets the name value for this MODInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this MODInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the sdu value for this MODInfo.
     * 
     * @return sdu
     */
    public java.lang.String getSdu() {
        return sdu;
    }


    /**
     * Sets the sdu value for this MODInfo.
     * 
     * @param sdu
     */
    public void setSdu(java.lang.String sdu) {
        this.sdu = sdu;
    }


    /**
     * Gets the node value for this MODInfo.
     * 
     * @return node
     */
    public java.lang.String getNode() {
        return node;
    }


    /**
     * Sets the node value for this MODInfo.
     * 
     * @param node
     */
    public void setNode(java.lang.String node) {
        this.node = node;
    }


    /**
     * Gets the comm value for this MODInfo.
     * 
     * @return comm
     */
    public java.lang.String getComm() {
        return comm;
    }


    /**
     * Sets the comm value for this MODInfo.
     * 
     * @param comm
     */
    public void setComm(java.lang.String comm) {
        this.comm = comm;
    }


    /**
     * Gets the scsi value for this MODInfo.
     * 
     * @return scsi
     */
    public java.lang.String getScsi() {
        return scsi;
    }


    /**
     * Sets the scsi value for this MODInfo.
     * 
     * @param scsi
     */
    public void setScsi(java.lang.String scsi) {
        this.scsi = scsi;
    }


    /**
     * Gets the pwr value for this MODInfo.
     * 
     * @return pwr
     */
    public java.lang.String getPwr() {
        return pwr;
    }


    /**
     * Sets the pwr value for this MODInfo.
     * 
     * @param pwr
     */
    public void setPwr(java.lang.String pwr) {
        this.pwr = pwr;
    }


    /**
     * Gets the drv value for this MODInfo.
     * 
     * @return drv
     */
    public java.lang.String getDrv() {
        return drv;
    }


    /**
     * Sets the drv value for this MODInfo.
     * 
     * @param drv
     */
    public void setDrv(java.lang.String drv) {
        this.drv = drv;
    }


    /**
     * Gets the mount value for this MODInfo.
     * 
     * @return mount
     */
    public java.lang.String getMount() {
        return mount;
    }


    /**
     * Sets the mount value for this MODInfo.
     * 
     * @param mount
     */
    public void setMount(java.lang.String mount) {
        this.mount = mount;
    }


    /**
     * Gets the mode value for this MODInfo.
     * 
     * @return mode
     */
    public java.lang.String getMode() {
        return mode;
    }


    /**
     * Sets the mode value for this MODInfo.
     * 
     * @param mode
     */
    public void setMode(java.lang.String mode) {
        this.mode = mode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MODInfo)) return false;
        MODInfo other = (MODInfo) obj;
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
            ((this.sdu==null && other.getSdu()==null) || 
             (this.sdu!=null &&
              this.sdu.equals(other.getSdu()))) &&
            ((this.node==null && other.getNode()==null) || 
             (this.node!=null &&
              this.node.equals(other.getNode()))) &&
            ((this.comm==null && other.getComm()==null) || 
             (this.comm!=null &&
              this.comm.equals(other.getComm()))) &&
            ((this.scsi==null && other.getScsi()==null) || 
             (this.scsi!=null &&
              this.scsi.equals(other.getScsi()))) &&
            ((this.pwr==null && other.getPwr()==null) || 
             (this.pwr!=null &&
              this.pwr.equals(other.getPwr()))) &&
            ((this.drv==null && other.getDrv()==null) || 
             (this.drv!=null &&
              this.drv.equals(other.getDrv()))) &&
            ((this.mount==null && other.getMount()==null) || 
             (this.mount!=null &&
              this.mount.equals(other.getMount()))) &&
            ((this.mode==null && other.getMode()==null) || 
             (this.mode!=null &&
              this.mode.equals(other.getMode())));
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
        if (getSdu() != null) {
            _hashCode += getSdu().hashCode();
        }
        if (getNode() != null) {
            _hashCode += getNode().hashCode();
        }
        if (getComm() != null) {
            _hashCode += getComm().hashCode();
        }
        if (getScsi() != null) {
            _hashCode += getScsi().hashCode();
        }
        if (getPwr() != null) {
            _hashCode += getPwr().hashCode();
        }
        if (getDrv() != null) {
            _hashCode += getDrv().hashCode();
        }
        if (getMount() != null) {
            _hashCode += getMount().hashCode();
        }
        if (getMode() != null) {
            _hashCode += getMode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MODInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "MODInfo"));
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
        elemField.setFieldName("sdu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sdu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("node");
        elemField.setXmlName(new javax.xml.namespace.QName("", "node"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scsi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scsi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pwr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pwr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "drv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mode"));
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
