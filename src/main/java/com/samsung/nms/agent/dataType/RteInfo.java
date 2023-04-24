/**
 * RteInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class RteInfo  implements java.io.Serializable {
    private java.lang.Integer rte;

    private java.lang.String name;

    private java.lang.String sigType;

    private java.lang.String _class;

    private java.lang.String ipAddr;

    private java.lang.String hunt;

    private java.lang.Integer equip;

    private java.lang.Integer busy;

    private java.lang.Integer mblk;

    private java.lang.Integer fblk;

    private java.lang.Integer pblk;

    private java.lang.Integer fault;

    private java.lang.Integer next;

    private java.lang.String hostName;

    private java.lang.String port;

    private java.lang.String sts;

    public RteInfo() {
    }

    public RteInfo(
           java.lang.Integer rte,
           java.lang.String name,
           java.lang.String sigType,
           java.lang.String _class,
           java.lang.String ipAddr,
           java.lang.String hunt,
           java.lang.Integer equip,
           java.lang.Integer busy,
           java.lang.Integer mblk,
           java.lang.Integer fblk,
           java.lang.Integer pblk,
           java.lang.Integer fault,
           java.lang.Integer next,
           java.lang.String hostName,
           java.lang.String port,
           java.lang.String sts) {
           this.rte = rte;
           this.name = name;
           this.sigType = sigType;
           this._class = _class;
           this.ipAddr = ipAddr;
           this.hunt = hunt;
           this.equip = equip;
           this.busy = busy;
           this.mblk = mblk;
           this.fblk = fblk;
           this.pblk = pblk;
           this.fault = fault;
           this.next = next;
           this.hostName = hostName;
           this.port = port;
           this.sts = sts;
    }


    /**
     * Gets the rte value for this RteInfo.
     * 
     * @return rte
     */
    public java.lang.Integer getRte() {
        return rte;
    }


    /**
     * Sets the rte value for this RteInfo.
     * 
     * @param rte
     */
    public void setRte(java.lang.Integer rte) {
        this.rte = rte;
    }


    /**
     * Gets the name value for this RteInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this RteInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the sigType value for this RteInfo.
     * 
     * @return sigType
     */
    public java.lang.String getSigType() {
        return sigType;
    }


    /**
     * Sets the sigType value for this RteInfo.
     * 
     * @param sigType
     */
    public void setSigType(java.lang.String sigType) {
        this.sigType = sigType;
    }


    /**
     * Gets the _class value for this RteInfo.
     * 
     * @return _class
     */
    public java.lang.String get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this RteInfo.
     * 
     * @param _class
     */
    public void set_class(java.lang.String _class) {
        this._class = _class;
    }


    /**
     * Gets the ipAddr value for this RteInfo.
     * 
     * @return ipAddr
     */
    public java.lang.String getIpAddr() {
        return ipAddr;
    }


    /**
     * Sets the ipAddr value for this RteInfo.
     * 
     * @param ipAddr
     */
    public void setIpAddr(java.lang.String ipAddr) {
        this.ipAddr = ipAddr;
    }


    /**
     * Gets the hunt value for this RteInfo.
     * 
     * @return hunt
     */
    public java.lang.String getHunt() {
        return hunt;
    }


    /**
     * Sets the hunt value for this RteInfo.
     * 
     * @param hunt
     */
    public void setHunt(java.lang.String hunt) {
        this.hunt = hunt;
    }


    /**
     * Gets the equip value for this RteInfo.
     * 
     * @return equip
     */
    public java.lang.Integer getEquip() {
        return equip;
    }


    /**
     * Sets the equip value for this RteInfo.
     * 
     * @param equip
     */
    public void setEquip(java.lang.Integer equip) {
        this.equip = equip;
    }


    /**
     * Gets the busy value for this RteInfo.
     * 
     * @return busy
     */
    public java.lang.Integer getBusy() {
        return busy;
    }


    /**
     * Sets the busy value for this RteInfo.
     * 
     * @param busy
     */
    public void setBusy(java.lang.Integer busy) {
        this.busy = busy;
    }


    /**
     * Gets the mblk value for this RteInfo.
     * 
     * @return mblk
     */
    public java.lang.Integer getMblk() {
        return mblk;
    }


    /**
     * Sets the mblk value for this RteInfo.
     * 
     * @param mblk
     */
    public void setMblk(java.lang.Integer mblk) {
        this.mblk = mblk;
    }


    /**
     * Gets the fblk value for this RteInfo.
     * 
     * @return fblk
     */
    public java.lang.Integer getFblk() {
        return fblk;
    }


    /**
     * Sets the fblk value for this RteInfo.
     * 
     * @param fblk
     */
    public void setFblk(java.lang.Integer fblk) {
        this.fblk = fblk;
    }


    /**
     * Gets the pblk value for this RteInfo.
     * 
     * @return pblk
     */
    public java.lang.Integer getPblk() {
        return pblk;
    }


    /**
     * Sets the pblk value for this RteInfo.
     * 
     * @param pblk
     */
    public void setPblk(java.lang.Integer pblk) {
        this.pblk = pblk;
    }


    /**
     * Gets the fault value for this RteInfo.
     * 
     * @return fault
     */
    public java.lang.Integer getFault() {
        return fault;
    }


    /**
     * Sets the fault value for this RteInfo.
     * 
     * @param fault
     */
    public void setFault(java.lang.Integer fault) {
        this.fault = fault;
    }


    /**
     * Gets the next value for this RteInfo.
     * 
     * @return next
     */
    public java.lang.Integer getNext() {
        return next;
    }


    /**
     * Sets the next value for this RteInfo.
     * 
     * @param next
     */
    public void setNext(java.lang.Integer next) {
        this.next = next;
    }


    /**
     * Gets the hostName value for this RteInfo.
     * 
     * @return hostName
     */
    public java.lang.String getHostName() {
        return hostName;
    }


    /**
     * Sets the hostName value for this RteInfo.
     * 
     * @param hostName
     */
    public void setHostName(java.lang.String hostName) {
        this.hostName = hostName;
    }


    /**
     * Gets the port value for this RteInfo.
     * 
     * @return port
     */
    public java.lang.String getPort() {
        return port;
    }


    /**
     * Sets the port value for this RteInfo.
     * 
     * @param port
     */
    public void setPort(java.lang.String port) {
        this.port = port;
    }


    /**
     * Gets the sts value for this RteInfo.
     * 
     * @return sts
     */
    public java.lang.String getSts() {
        return sts;
    }


    /**
     * Sets the sts value for this RteInfo.
     * 
     * @param sts
     */
    public void setSts(java.lang.String sts) {
        this.sts = sts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RteInfo)) return false;
        RteInfo other = (RteInfo) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.sigType==null && other.getSigType()==null) || 
             (this.sigType!=null &&
              this.sigType.equals(other.getSigType()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.ipAddr==null && other.getIpAddr()==null) || 
             (this.ipAddr!=null &&
              this.ipAddr.equals(other.getIpAddr()))) &&
            ((this.hunt==null && other.getHunt()==null) || 
             (this.hunt!=null &&
              this.hunt.equals(other.getHunt()))) &&
            ((this.equip==null && other.getEquip()==null) || 
             (this.equip!=null &&
              this.equip.equals(other.getEquip()))) &&
            ((this.busy==null && other.getBusy()==null) || 
             (this.busy!=null &&
              this.busy.equals(other.getBusy()))) &&
            ((this.mblk==null && other.getMblk()==null) || 
             (this.mblk!=null &&
              this.mblk.equals(other.getMblk()))) &&
            ((this.fblk==null && other.getFblk()==null) || 
             (this.fblk!=null &&
              this.fblk.equals(other.getFblk()))) &&
            ((this.pblk==null && other.getPblk()==null) || 
             (this.pblk!=null &&
              this.pblk.equals(other.getPblk()))) &&
            ((this.fault==null && other.getFault()==null) || 
             (this.fault!=null &&
              this.fault.equals(other.getFault()))) &&
            ((this.next==null && other.getNext()==null) || 
             (this.next!=null &&
              this.next.equals(other.getNext()))) &&
            ((this.hostName==null && other.getHostName()==null) || 
             (this.hostName!=null &&
              this.hostName.equals(other.getHostName()))) &&
            ((this.port==null && other.getPort()==null) || 
             (this.port!=null &&
              this.port.equals(other.getPort()))) &&
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
        if (getRte() != null) {
            _hashCode += getRte().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSigType() != null) {
            _hashCode += getSigType().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getIpAddr() != null) {
            _hashCode += getIpAddr().hashCode();
        }
        if (getHunt() != null) {
            _hashCode += getHunt().hashCode();
        }
        if (getEquip() != null) {
            _hashCode += getEquip().hashCode();
        }
        if (getBusy() != null) {
            _hashCode += getBusy().hashCode();
        }
        if (getMblk() != null) {
            _hashCode += getMblk().hashCode();
        }
        if (getFblk() != null) {
            _hashCode += getFblk().hashCode();
        }
        if (getPblk() != null) {
            _hashCode += getPblk().hashCode();
        }
        if (getFault() != null) {
            _hashCode += getFault().hashCode();
        }
        if (getNext() != null) {
            _hashCode += getNext().hashCode();
        }
        if (getHostName() != null) {
            _hashCode += getHostName().hashCode();
        }
        if (getPort() != null) {
            _hashCode += getPort().hashCode();
        }
        if (getSts() != null) {
            _hashCode += getSts().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RteInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "RteInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rte");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rte"));
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
        elemField.setFieldName("sigType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sigType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("", "class"));
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
        elemField.setFieldName("hunt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hunt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("equip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "equip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("busy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "busy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mblk");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mblk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fblk");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fblk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pblk");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pblk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fault");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("next");
        elemField.setXmlName(new javax.xml.namespace.QName("", "next"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hostName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("", "port"));
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
