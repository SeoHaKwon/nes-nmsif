/**
 * McTrcInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class McTrcInfo  implements java.io.Serializable {
    private java.lang.Integer rte;

    private java.lang.String dn;

    private java.lang.Integer lln;

    private java.lang.Integer mgid;

    private java.lang.Integer pln;

    private java.lang.String mode;

    private java.lang.String type;

    private java.lang.String port;

    private java.lang.String sessid;

    private java.lang.String cnt;

    private java.lang.String output;

    private java.lang.String can;

    public McTrcInfo() {
    }

    public McTrcInfo(
           java.lang.Integer rte,
           java.lang.String dn,
           java.lang.Integer lln,
           java.lang.Integer mgid,
           java.lang.Integer pln,
           java.lang.String mode,
           java.lang.String type,
           java.lang.String port,
           java.lang.String sessid,
           java.lang.String cnt,
           java.lang.String output,
           java.lang.String can) {
           this.rte = rte;
           this.dn = dn;
           this.lln = lln;
           this.mgid = mgid;
           this.pln = pln;
           this.mode = mode;
           this.type = type;
           this.port = port;
           this.sessid = sessid;
           this.cnt = cnt;
           this.output = output;
           this.can = can;
    }


    /**
     * Gets the rte value for this McTrcInfo.
     * 
     * @return rte
     */
    public java.lang.Integer getRte() {
        return rte;
    }


    /**
     * Sets the rte value for this McTrcInfo.
     * 
     * @param rte
     */
    public void setRte(java.lang.Integer rte) {
        this.rte = rte;
    }


    /**
     * Gets the dn value for this McTrcInfo.
     * 
     * @return dn
     */
    public java.lang.String getDn() {
        return dn;
    }


    /**
     * Sets the dn value for this McTrcInfo.
     * 
     * @param dn
     */
    public void setDn(java.lang.String dn) {
        this.dn = dn;
    }


    /**
     * Gets the lln value for this McTrcInfo.
     * 
     * @return lln
     */
    public java.lang.Integer getLln() {
        return lln;
    }


    /**
     * Sets the lln value for this McTrcInfo.
     * 
     * @param lln
     */
    public void setLln(java.lang.Integer lln) {
        this.lln = lln;
    }


    /**
     * Gets the mgid value for this McTrcInfo.
     * 
     * @return mgid
     */
    public java.lang.Integer getMgid() {
        return mgid;
    }


    /**
     * Sets the mgid value for this McTrcInfo.
     * 
     * @param mgid
     */
    public void setMgid(java.lang.Integer mgid) {
        this.mgid = mgid;
    }


    /**
     * Gets the pln value for this McTrcInfo.
     * 
     * @return pln
     */
    public java.lang.Integer getPln() {
        return pln;
    }


    /**
     * Sets the pln value for this McTrcInfo.
     * 
     * @param pln
     */
    public void setPln(java.lang.Integer pln) {
        this.pln = pln;
    }


    /**
     * Gets the mode value for this McTrcInfo.
     * 
     * @return mode
     */
    public java.lang.String getMode() {
        return mode;
    }


    /**
     * Sets the mode value for this McTrcInfo.
     * 
     * @param mode
     */
    public void setMode(java.lang.String mode) {
        this.mode = mode;
    }


    /**
     * Gets the type value for this McTrcInfo.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this McTrcInfo.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the port value for this McTrcInfo.
     * 
     * @return port
     */
    public java.lang.String getPort() {
        return port;
    }


    /**
     * Sets the port value for this McTrcInfo.
     * 
     * @param port
     */
    public void setPort(java.lang.String port) {
        this.port = port;
    }


    /**
     * Gets the sessid value for this McTrcInfo.
     * 
     * @return sessid
     */
    public java.lang.String getSessid() {
        return sessid;
    }


    /**
     * Sets the sessid value for this McTrcInfo.
     * 
     * @param sessid
     */
    public void setSessid(java.lang.String sessid) {
        this.sessid = sessid;
    }


    /**
     * Gets the cnt value for this McTrcInfo.
     * 
     * @return cnt
     */
    public java.lang.String getCnt() {
        return cnt;
    }


    /**
     * Sets the cnt value for this McTrcInfo.
     * 
     * @param cnt
     */
    public void setCnt(java.lang.String cnt) {
        this.cnt = cnt;
    }


    /**
     * Gets the output value for this McTrcInfo.
     * 
     * @return output
     */
    public java.lang.String getOutput() {
        return output;
    }


    /**
     * Sets the output value for this McTrcInfo.
     * 
     * @param output
     */
    public void setOutput(java.lang.String output) {
        this.output = output;
    }


    /**
     * Gets the can value for this McTrcInfo.
     * 
     * @return can
     */
    public java.lang.String getCan() {
        return can;
    }


    /**
     * Sets the can value for this McTrcInfo.
     * 
     * @param can
     */
    public void setCan(java.lang.String can) {
        this.can = can;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof McTrcInfo)) return false;
        McTrcInfo other = (McTrcInfo) obj;
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
            ((this.dn==null && other.getDn()==null) || 
             (this.dn!=null &&
              this.dn.equals(other.getDn()))) &&
            ((this.lln==null && other.getLln()==null) || 
             (this.lln!=null &&
              this.lln.equals(other.getLln()))) &&
            ((this.mgid==null && other.getMgid()==null) || 
             (this.mgid!=null &&
              this.mgid.equals(other.getMgid()))) &&
            ((this.pln==null && other.getPln()==null) || 
             (this.pln!=null &&
              this.pln.equals(other.getPln()))) &&
            ((this.mode==null && other.getMode()==null) || 
             (this.mode!=null &&
              this.mode.equals(other.getMode()))) &&
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
        if (getRte() != null) {
            _hashCode += getRte().hashCode();
        }
        if (getDn() != null) {
            _hashCode += getDn().hashCode();
        }
        if (getLln() != null) {
            _hashCode += getLln().hashCode();
        }
        if (getMgid() != null) {
            _hashCode += getMgid().hashCode();
        }
        if (getPln() != null) {
            _hashCode += getPln().hashCode();
        }
        if (getMode() != null) {
            _hashCode += getMode().hashCode();
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
        new org.apache.axis.description.TypeDesc(McTrcInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "McTrcInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rte");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lln");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lln"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mode"));
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
