/**
 * SgwInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class SgwInfo  implements java.io.Serializable {
    private java.lang.Integer sgwId;

    private java.lang.String name;

    private java.lang.String ip1;

    private java.lang.String ip2;

    private java.lang.Integer port;

    private java.lang.Integer na;

    private java.lang.String asso_sts;

    private java.lang.String ua_type;

    private java.lang.String node;

    private java.lang.Integer scnt;

    private java.lang.String incf;

    private java.lang.String psp_sts;

    public SgwInfo() {
    }

    public SgwInfo(
           java.lang.Integer sgwId,
           java.lang.String name,
           java.lang.String ip1,
           java.lang.String ip2,
           java.lang.Integer port,
           java.lang.Integer na,
           java.lang.String asso_sts,
           java.lang.String ua_type,
           java.lang.String node,
           java.lang.Integer scnt,
           java.lang.String incf,
           java.lang.String psp_sts) {
           this.sgwId = sgwId;
           this.name = name;
           this.ip1 = ip1;
           this.ip2 = ip2;
           this.port = port;
           this.na = na;
           this.asso_sts = asso_sts;
           this.ua_type = ua_type;
           this.node = node;
           this.scnt = scnt;
           this.incf = incf;
           this.psp_sts = psp_sts;
    }


    /**
     * Gets the sgwId value for this SgwInfo.
     * 
     * @return sgwId
     */
    public java.lang.Integer getSgwId() {
        return sgwId;
    }


    /**
     * Sets the sgwId value for this SgwInfo.
     * 
     * @param sgwId
     */
    public void setSgwId(java.lang.Integer sgwId) {
        this.sgwId = sgwId;
    }


    /**
     * Gets the name value for this SgwInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this SgwInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the ip1 value for this SgwInfo.
     * 
     * @return ip1
     */
    public java.lang.String getIp1() {
        return ip1;
    }


    /**
     * Sets the ip1 value for this SgwInfo.
     * 
     * @param ip1
     */
    public void setIp1(java.lang.String ip1) {
        this.ip1 = ip1;
    }


    /**
     * Gets the ip2 value for this SgwInfo.
     * 
     * @return ip2
     */
    public java.lang.String getIp2() {
        return ip2;
    }


    /**
     * Sets the ip2 value for this SgwInfo.
     * 
     * @param ip2
     */
    public void setIp2(java.lang.String ip2) {
        this.ip2 = ip2;
    }


    /**
     * Gets the port value for this SgwInfo.
     * 
     * @return port
     */
    public java.lang.Integer getPort() {
        return port;
    }


    /**
     * Sets the port value for this SgwInfo.
     * 
     * @param port
     */
    public void setPort(java.lang.Integer port) {
        this.port = port;
    }


    /**
     * Gets the na value for this SgwInfo.
     * 
     * @return na
     */
    public java.lang.Integer getNa() {
        return na;
    }


    /**
     * Sets the na value for this SgwInfo.
     * 
     * @param na
     */
    public void setNa(java.lang.Integer na) {
        this.na = na;
    }


    /**
     * Gets the asso_sts value for this SgwInfo.
     * 
     * @return asso_sts
     */
    public java.lang.String getAsso_sts() {
        return asso_sts;
    }


    /**
     * Sets the asso_sts value for this SgwInfo.
     * 
     * @param asso_sts
     */
    public void setAsso_sts(java.lang.String asso_sts) {
        this.asso_sts = asso_sts;
    }


    /**
     * Gets the ua_type value for this SgwInfo.
     * 
     * @return ua_type
     */
    public java.lang.String getUa_type() {
        return ua_type;
    }


    /**
     * Sets the ua_type value for this SgwInfo.
     * 
     * @param ua_type
     */
    public void setUa_type(java.lang.String ua_type) {
        this.ua_type = ua_type;
    }


    /**
     * Gets the node value for this SgwInfo.
     * 
     * @return node
     */
    public java.lang.String getNode() {
        return node;
    }


    /**
     * Sets the node value for this SgwInfo.
     * 
     * @param node
     */
    public void setNode(java.lang.String node) {
        this.node = node;
    }


    /**
     * Gets the scnt value for this SgwInfo.
     * 
     * @return scnt
     */
    public java.lang.Integer getScnt() {
        return scnt;
    }


    /**
     * Sets the scnt value for this SgwInfo.
     * 
     * @param scnt
     */
    public void setScnt(java.lang.Integer scnt) {
        this.scnt = scnt;
    }


    /**
     * Gets the incf value for this SgwInfo.
     * 
     * @return incf
     */
    public java.lang.String getIncf() {
        return incf;
    }


    /**
     * Sets the incf value for this SgwInfo.
     * 
     * @param incf
     */
    public void setIncf(java.lang.String incf) {
        this.incf = incf;
    }


    /**
     * Gets the psp_sts value for this SgwInfo.
     * 
     * @return psp_sts
     */
    public java.lang.String getPsp_sts() {
        return psp_sts;
    }


    /**
     * Sets the psp_sts value for this SgwInfo.
     * 
     * @param psp_sts
     */
    public void setPsp_sts(java.lang.String psp_sts) {
        this.psp_sts = psp_sts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SgwInfo)) return false;
        SgwInfo other = (SgwInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sgwId==null && other.getSgwId()==null) || 
             (this.sgwId!=null &&
              this.sgwId.equals(other.getSgwId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.ip1==null && other.getIp1()==null) || 
             (this.ip1!=null &&
              this.ip1.equals(other.getIp1()))) &&
            ((this.ip2==null && other.getIp2()==null) || 
             (this.ip2!=null &&
              this.ip2.equals(other.getIp2()))) &&
            ((this.port==null && other.getPort()==null) || 
             (this.port!=null &&
              this.port.equals(other.getPort()))) &&
            ((this.na==null && other.getNa()==null) || 
             (this.na!=null &&
              this.na.equals(other.getNa()))) &&
            ((this.asso_sts==null && other.getAsso_sts()==null) || 
             (this.asso_sts!=null &&
              this.asso_sts.equals(other.getAsso_sts()))) &&
            ((this.ua_type==null && other.getUa_type()==null) || 
             (this.ua_type!=null &&
              this.ua_type.equals(other.getUa_type()))) &&
            ((this.node==null && other.getNode()==null) || 
             (this.node!=null &&
              this.node.equals(other.getNode()))) &&
            ((this.scnt==null && other.getScnt()==null) || 
             (this.scnt!=null &&
              this.scnt.equals(other.getScnt()))) &&
            ((this.incf==null && other.getIncf()==null) || 
             (this.incf!=null &&
              this.incf.equals(other.getIncf()))) &&
            ((this.psp_sts==null && other.getPsp_sts()==null) || 
             (this.psp_sts!=null &&
              this.psp_sts.equals(other.getPsp_sts())));
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
        if (getSgwId() != null) {
            _hashCode += getSgwId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getIp1() != null) {
            _hashCode += getIp1().hashCode();
        }
        if (getIp2() != null) {
            _hashCode += getIp2().hashCode();
        }
        if (getPort() != null) {
            _hashCode += getPort().hashCode();
        }
        if (getNa() != null) {
            _hashCode += getNa().hashCode();
        }
        if (getAsso_sts() != null) {
            _hashCode += getAsso_sts().hashCode();
        }
        if (getUa_type() != null) {
            _hashCode += getUa_type().hashCode();
        }
        if (getNode() != null) {
            _hashCode += getNode().hashCode();
        }
        if (getScnt() != null) {
            _hashCode += getScnt().hashCode();
        }
        if (getIncf() != null) {
            _hashCode += getIncf().hashCode();
        }
        if (getPsp_sts() != null) {
            _hashCode += getPsp_sts().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SgwInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "SgwInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sgwId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sgwId"));
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
        elemField.setFieldName("ip1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ip1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ip2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ip2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("", "port"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("na");
        elemField.setXmlName(new javax.xml.namespace.QName("", "na"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asso_sts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "asso_sts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ua_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ua_type"));
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
        elemField.setFieldName("scnt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scnt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "incf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("psp_sts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "psp_sts"));
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
