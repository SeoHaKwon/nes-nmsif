/**
 * MgwInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class MgwInfo  implements java.io.Serializable {
    private java.lang.Integer mgwId;

    private java.lang.String name;

    private java.lang.String mgwType;

    private java.lang.Integer firstLln;

    private java.lang.Integer maxCard;

    private java.lang.Integer equipCard;

    private java.lang.Integer maxEq;

    private java.lang.Integer equip;

    private java.lang.String ipAddr;

    private java.lang.String audit;

    private java.lang.String sts;

    public MgwInfo() {
    }

    public MgwInfo(
           java.lang.Integer mgwId,
           java.lang.String name,
           java.lang.String mgwType,
           java.lang.Integer firstLln,
           java.lang.Integer maxCard,
           java.lang.Integer equipCard,
           java.lang.Integer maxEq,
           java.lang.Integer equip,
           java.lang.String ipAddr,
           java.lang.String audit,
           java.lang.String sts) {
           this.mgwId = mgwId;
           this.name = name;
           this.mgwType = mgwType;
           this.firstLln = firstLln;
           this.maxCard = maxCard;
           this.equipCard = equipCard;
           this.maxEq = maxEq;
           this.equip = equip;
           this.ipAddr = ipAddr;
           this.audit = audit;
           this.sts = sts;
    }


    /**
     * Gets the mgwId value for this MgwInfo.
     * 
     * @return mgwId
     */
    public java.lang.Integer getMgwId() {
        return mgwId;
    }


    /**
     * Sets the mgwId value for this MgwInfo.
     * 
     * @param mgwId
     */
    public void setMgwId(java.lang.Integer mgwId) {
        this.mgwId = mgwId;
    }


    /**
     * Gets the name value for this MgwInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this MgwInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the mgwType value for this MgwInfo.
     * 
     * @return mgwType
     */
    public java.lang.String getMgwType() {
        return mgwType;
    }


    /**
     * Sets the mgwType value for this MgwInfo.
     * 
     * @param mgwType
     */
    public void setMgwType(java.lang.String mgwType) {
        this.mgwType = mgwType;
    }


    /**
     * Gets the firstLln value for this MgwInfo.
     * 
     * @return firstLln
     */
    public java.lang.Integer getFirstLln() {
        return firstLln;
    }


    /**
     * Sets the firstLln value for this MgwInfo.
     * 
     * @param firstLln
     */
    public void setFirstLln(java.lang.Integer firstLln) {
        this.firstLln = firstLln;
    }


    /**
     * Gets the maxCard value for this MgwInfo.
     * 
     * @return maxCard
     */
    public java.lang.Integer getMaxCard() {
        return maxCard;
    }


    /**
     * Sets the maxCard value for this MgwInfo.
     * 
     * @param maxCard
     */
    public void setMaxCard(java.lang.Integer maxCard) {
        this.maxCard = maxCard;
    }


    /**
     * Gets the equipCard value for this MgwInfo.
     * 
     * @return equipCard
     */
    public java.lang.Integer getEquipCard() {
        return equipCard;
    }


    /**
     * Sets the equipCard value for this MgwInfo.
     * 
     * @param equipCard
     */
    public void setEquipCard(java.lang.Integer equipCard) {
        this.equipCard = equipCard;
    }


    /**
     * Gets the maxEq value for this MgwInfo.
     * 
     * @return maxEq
     */
    public java.lang.Integer getMaxEq() {
        return maxEq;
    }


    /**
     * Sets the maxEq value for this MgwInfo.
     * 
     * @param maxEq
     */
    public void setMaxEq(java.lang.Integer maxEq) {
        this.maxEq = maxEq;
    }


    /**
     * Gets the equip value for this MgwInfo.
     * 
     * @return equip
     */
    public java.lang.Integer getEquip() {
        return equip;
    }


    /**
     * Sets the equip value for this MgwInfo.
     * 
     * @param equip
     */
    public void setEquip(java.lang.Integer equip) {
        this.equip = equip;
    }


    /**
     * Gets the ipAddr value for this MgwInfo.
     * 
     * @return ipAddr
     */
    public java.lang.String getIpAddr() {
        return ipAddr;
    }


    /**
     * Sets the ipAddr value for this MgwInfo.
     * 
     * @param ipAddr
     */
    public void setIpAddr(java.lang.String ipAddr) {
        this.ipAddr = ipAddr;
    }


    /**
     * Gets the audit value for this MgwInfo.
     * 
     * @return audit
     */
    public java.lang.String getAudit() {
        return audit;
    }


    /**
     * Sets the audit value for this MgwInfo.
     * 
     * @param audit
     */
    public void setAudit(java.lang.String audit) {
        this.audit = audit;
    }


    /**
     * Gets the sts value for this MgwInfo.
     * 
     * @return sts
     */
    public java.lang.String getSts() {
        return sts;
    }


    /**
     * Sets the sts value for this MgwInfo.
     * 
     * @param sts
     */
    public void setSts(java.lang.String sts) {
        this.sts = sts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MgwInfo)) return false;
        MgwInfo other = (MgwInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mgwId==null && other.getMgwId()==null) || 
             (this.mgwId!=null &&
              this.mgwId.equals(other.getMgwId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.mgwType==null && other.getMgwType()==null) || 
             (this.mgwType!=null &&
              this.mgwType.equals(other.getMgwType()))) &&
            ((this.firstLln==null && other.getFirstLln()==null) || 
             (this.firstLln!=null &&
              this.firstLln.equals(other.getFirstLln()))) &&
            ((this.maxCard==null && other.getMaxCard()==null) || 
             (this.maxCard!=null &&
              this.maxCard.equals(other.getMaxCard()))) &&
            ((this.equipCard==null && other.getEquipCard()==null) || 
             (this.equipCard!=null &&
              this.equipCard.equals(other.getEquipCard()))) &&
            ((this.maxEq==null && other.getMaxEq()==null) || 
             (this.maxEq!=null &&
              this.maxEq.equals(other.getMaxEq()))) &&
            ((this.equip==null && other.getEquip()==null) || 
             (this.equip!=null &&
              this.equip.equals(other.getEquip()))) &&
            ((this.ipAddr==null && other.getIpAddr()==null) || 
             (this.ipAddr!=null &&
              this.ipAddr.equals(other.getIpAddr()))) &&
            ((this.audit==null && other.getAudit()==null) || 
             (this.audit!=null &&
              this.audit.equals(other.getAudit()))) &&
            ((this.sts==null && other.getSts()==null) || 
             (this.sts!=null &&
              this.sts.equals(other.getSts())));
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
        if (getMgwId() != null) {
            _hashCode += getMgwId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getMgwType() != null) {
            _hashCode += getMgwType().hashCode();
        }
        if (getFirstLln() != null) {
            _hashCode += getFirstLln().hashCode();
        }
        if (getMaxCard() != null) {
            _hashCode += getMaxCard().hashCode();
        }
        if (getEquipCard() != null) {
            _hashCode += getEquipCard().hashCode();
        }
        if (getMaxEq() != null) {
            _hashCode += getMaxEq().hashCode();
        }
        if (getEquip() != null) {
            _hashCode += getEquip().hashCode();
        }
        if (getIpAddr() != null) {
            _hashCode += getIpAddr().hashCode();
        }
        if (getAudit() != null) {
            _hashCode += getAudit().hashCode();
        }
        if (getSts() != null) {
            _hashCode += getSts().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MgwInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "MgwInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mgwId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mgwId"));
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
        elemField.setFieldName("mgwType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mgwType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstLln");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstLln"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxCard");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("equipCard");
        elemField.setXmlName(new javax.xml.namespace.QName("", "equipCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxEq");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxEq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("equip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "equip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipAddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "audit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sts"));
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
