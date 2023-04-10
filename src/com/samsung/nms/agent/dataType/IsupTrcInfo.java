/**
 * IsupTrcInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class IsupTrcInfo  implements java.io.Serializable {
    private java.lang.String item;

    private java.lang.Integer rte;

    private java.lang.Integer trk;

    private java.lang.Integer mgid;

    private java.lang.String pln;

    private java.lang.String cgpn;

    private java.lang.String cdpn;

    private java.lang.String type;

    private java.lang.String port;

    private java.lang.String sessid;

    private java.lang.String cnt;

    private java.lang.String output;

    private java.lang.String can;

    public IsupTrcInfo() {
    }

    public IsupTrcInfo(
           java.lang.String item,
           java.lang.Integer rte,
           java.lang.Integer trk,
           java.lang.Integer mgid,
           java.lang.String pln,
           java.lang.String cgpn,
           java.lang.String cdpn,
           java.lang.String type,
           java.lang.String port,
           java.lang.String sessid,
           java.lang.String cnt,
           java.lang.String output,
           java.lang.String can) {
           this.item = item;
           this.rte = rte;
           this.trk = trk;
           this.mgid = mgid;
           this.pln = pln;
           this.cgpn = cgpn;
           this.cdpn = cdpn;
           this.type = type;
           this.port = port;
           this.sessid = sessid;
           this.cnt = cnt;
           this.output = output;
           this.can = can;
    }


    /**
     * Gets the item value for this IsupTrcInfo.
     * 
     * @return item
     */
    public java.lang.String getItem() {
        return item;
    }


    /**
     * Sets the item value for this IsupTrcInfo.
     * 
     * @param item
     */
    public void setItem(java.lang.String item) {
        this.item = item;
    }


    /**
     * Gets the rte value for this IsupTrcInfo.
     * 
     * @return rte
     */
    public java.lang.Integer getRte() {
        return rte;
    }


    /**
     * Sets the rte value for this IsupTrcInfo.
     * 
     * @param rte
     */
    public void setRte(java.lang.Integer rte) {
        this.rte = rte;
    }


    /**
     * Gets the trk value for this IsupTrcInfo.
     * 
     * @return trk
     */
    public java.lang.Integer getTrk() {
        return trk;
    }


    /**
     * Sets the trk value for this IsupTrcInfo.
     * 
     * @param trk
     */
    public void setTrk(java.lang.Integer trk) {
        this.trk = trk;
    }


    /**
     * Gets the mgid value for this IsupTrcInfo.
     * 
     * @return mgid
     */
    public java.lang.Integer getMgid() {
        return mgid;
    }


    /**
     * Sets the mgid value for this IsupTrcInfo.
     * 
     * @param mgid
     */
    public void setMgid(java.lang.Integer mgid) {
        this.mgid = mgid;
    }


    /**
     * Gets the pln value for this IsupTrcInfo.
     * 
     * @return pln
     */
    public java.lang.String getPln() {
        return pln;
    }


    /**
     * Sets the pln value for this IsupTrcInfo.
     * 
     * @param pln
     */
    public void setPln(java.lang.String pln) {
        this.pln = pln;
    }


    /**
     * Gets the cgpn value for this IsupTrcInfo.
     * 
     * @return cgpn
     */
    public java.lang.String getCgpn() {
        return cgpn;
    }


    /**
     * Sets the cgpn value for this IsupTrcInfo.
     * 
     * @param cgpn
     */
    public void setCgpn(java.lang.String cgpn) {
        this.cgpn = cgpn;
    }


    /**
     * Gets the cdpn value for this IsupTrcInfo.
     * 
     * @return cdpn
     */
    public java.lang.String getCdpn() {
        return cdpn;
    }


    /**
     * Sets the cdpn value for this IsupTrcInfo.
     * 
     * @param cdpn
     */
    public void setCdpn(java.lang.String cdpn) {
        this.cdpn = cdpn;
    }


    /**
     * Gets the type value for this IsupTrcInfo.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this IsupTrcInfo.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the port value for this IsupTrcInfo.
     * 
     * @return port
     */
    public java.lang.String getPort() {
        return port;
    }


    /**
     * Sets the port value for this IsupTrcInfo.
     * 
     * @param port
     */
    public void setPort(java.lang.String port) {
        this.port = port;
    }


    /**
     * Gets the sessid value for this IsupTrcInfo.
     * 
     * @return sessid
     */
    public java.lang.String getSessid() {
        return sessid;
    }


    /**
     * Sets the sessid value for this IsupTrcInfo.
     * 
     * @param sessid
     */
    public void setSessid(java.lang.String sessid) {
        this.sessid = sessid;
    }


    /**
     * Gets the cnt value for this IsupTrcInfo.
     * 
     * @return cnt
     */
    public java.lang.String getCnt() {
        return cnt;
    }


    /**
     * Sets the cnt value for this IsupTrcInfo.
     * 
     * @param cnt
     */
    public void setCnt(java.lang.String cnt) {
        this.cnt = cnt;
    }


    /**
     * Gets the output value for this IsupTrcInfo.
     * 
     * @return output
     */
    public java.lang.String getOutput() {
        return output;
    }


    /**
     * Sets the output value for this IsupTrcInfo.
     * 
     * @param output
     */
    public void setOutput(java.lang.String output) {
        this.output = output;
    }


    /**
     * Gets the can value for this IsupTrcInfo.
     * 
     * @return can
     */
    public java.lang.String getCan() {
        return can;
    }


    /**
     * Sets the can value for this IsupTrcInfo.
     * 
     * @param can
     */
    public void setCan(java.lang.String can) {
        this.can = can;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IsupTrcInfo)) return false;
        IsupTrcInfo other = (IsupTrcInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.rte==null && other.getRte()==null) || 
             (this.rte!=null &&
              this.rte.equals(other.getRte()))) &&
            ((this.trk==null && other.getTrk()==null) || 
             (this.trk!=null &&
              this.trk.equals(other.getTrk()))) &&
            ((this.mgid==null && other.getMgid()==null) || 
             (this.mgid!=null &&
              this.mgid.equals(other.getMgid()))) &&
            ((this.pln==null && other.getPln()==null) || 
             (this.pln!=null &&
              this.pln.equals(other.getPln()))) &&
            ((this.cgpn==null && other.getCgpn()==null) || 
             (this.cgpn!=null &&
              this.cgpn.equals(other.getCgpn()))) &&
            ((this.cdpn==null && other.getCdpn()==null) || 
             (this.cdpn!=null &&
              this.cdpn.equals(other.getCdpn()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.port==null && other.getPort()==null) || 
             (this.port!=null &&
              this.port.equals(other.getPort()))) &&
            ((this.sessid==null && other.getSessid()==null) || 
             (this.sessid!=null &&
              this.sessid.equals(other.getSessid()))) &&
            ((this.cnt==null && other.getCnt()==null) || 
             (this.cnt!=null &&
              this.cnt.equals(other.getCnt()))) &&
            ((this.output==null && other.getOutput()==null) || 
             (this.output!=null &&
              this.output.equals(other.getOutput()))) &&
            ((this.can==null && other.getCan()==null) || 
             (this.can!=null &&
              this.can.equals(other.getCan())));
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
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getRte() != null) {
            _hashCode += getRte().hashCode();
        }
        if (getTrk() != null) {
            _hashCode += getTrk().hashCode();
        }
        if (getMgid() != null) {
            _hashCode += getMgid().hashCode();
        }
        if (getPln() != null) {
            _hashCode += getPln().hashCode();
        }
        if (getCgpn() != null) {
            _hashCode += getCgpn().hashCode();
        }
        if (getCdpn() != null) {
            _hashCode += getCdpn().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getPort() != null) {
            _hashCode += getPort().hashCode();
        }
        if (getSessid() != null) {
            _hashCode += getSessid().hashCode();
        }
        if (getCnt() != null) {
            _hashCode += getCnt().hashCode();
        }
        if (getOutput() != null) {
            _hashCode += getOutput().hashCode();
        }
        if (getCan() != null) {
            _hashCode += getCan().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IsupTrcInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "IsupTrcInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rte");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trk");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mgid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mgid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pln");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pln"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cgpn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cgpn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdpn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdpn"));
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
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("", "port"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cnt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cnt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("output");
        elemField.setXmlName(new javax.xml.namespace.QName("", "output"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("can");
        elemField.setXmlName(new javax.xml.namespace.QName("", "can"));
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
