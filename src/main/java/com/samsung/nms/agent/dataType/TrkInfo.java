/**
 * TrkInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class TrkInfo  implements java.io.Serializable {
    private java.lang.Integer trk;

    private java.lang.Integer connectedMgwId;

    private java.lang.String mgwIP;

    private java.lang.Integer card;

    private java.lang.Integer link;

    public TrkInfo() {
    }

    public TrkInfo(
           java.lang.Integer trk,
           java.lang.Integer connectedMgwId,
           java.lang.String mgwIP,
           java.lang.Integer card,
           java.lang.Integer link) {
           this.trk = trk;
           this.connectedMgwId = connectedMgwId;
           this.mgwIP = mgwIP;
           this.card = card;
           this.link = link;
    }


    /**
     * Gets the trk value for this TrkInfo.
     * 
     * @return trk
     */
    public java.lang.Integer getTrk() {
        return trk;
    }


    /**
     * Sets the trk value for this TrkInfo.
     * 
     * @param trk
     */
    public void setTrk(java.lang.Integer trk) {
        this.trk = trk;
    }


    /**
     * Gets the connectedMgwId value for this TrkInfo.
     * 
     * @return connectedMgwId
     */
    public java.lang.Integer getConnectedMgwId() {
        return connectedMgwId;
    }


    /**
     * Sets the connectedMgwId value for this TrkInfo.
     * 
     * @param connectedMgwId
     */
    public void setConnectedMgwId(java.lang.Integer connectedMgwId) {
        this.connectedMgwId = connectedMgwId;
    }


    /**
     * Gets the mgwIP value for this TrkInfo.
     * 
     * @return mgwIP
     */
    public java.lang.String getMgwIP() {
        return mgwIP;
    }


    /**
     * Sets the mgwIP value for this TrkInfo.
     * 
     * @param mgwIP
     */
    public void setMgwIP(java.lang.String mgwIP) {
        this.mgwIP = mgwIP;
    }


    /**
     * Gets the card value for this TrkInfo.
     * 
     * @return card
     */
    public java.lang.Integer getCard() {
        return card;
    }


    /**
     * Sets the card value for this TrkInfo.
     * 
     * @param card
     */
    public void setCard(java.lang.Integer card) {
        this.card = card;
    }


    /**
     * Gets the link value for this TrkInfo.
     * 
     * @return link
     */
    public java.lang.Integer getLink() {
        return link;
    }


    /**
     * Sets the link value for this TrkInfo.
     * 
     * @param link
     */
    public void setLink(java.lang.Integer link) {
        this.link = link;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrkInfo)) return false;
        TrkInfo other = (TrkInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.trk==null && other.getTrk()==null) || 
             (this.trk!=null &&
              this.trk.equals(other.getTrk()))) &&
            ((this.connectedMgwId==null && other.getConnectedMgwId()==null) || 
             (this.connectedMgwId!=null &&
              this.connectedMgwId.equals(other.getConnectedMgwId()))) &&
            ((this.mgwIP==null && other.getMgwIP()==null) || 
             (this.mgwIP!=null &&
              this.mgwIP.equals(other.getMgwIP()))) &&
            ((this.card==null && other.getCard()==null) || 
             (this.card!=null &&
              this.card.equals(other.getCard()))) &&
            ((this.link==null && other.getLink()==null) || 
             (this.link!=null &&
              this.link.equals(other.getLink())));
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
        if (getTrk() != null) {
            _hashCode += getTrk().hashCode();
        }
        if (getConnectedMgwId() != null) {
            _hashCode += getConnectedMgwId().hashCode();
        }
        if (getMgwIP() != null) {
            _hashCode += getMgwIP().hashCode();
        }
        if (getCard() != null) {
            _hashCode += getCard().hashCode();
        }
        if (getLink() != null) {
            _hashCode += getLink().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrkInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "TrkInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trk");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectedMgwId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "connectedMgwId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mgwIP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mgwIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("card");
        elemField.setXmlName(new javax.xml.namespace.QName("", "card"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("link");
        elemField.setXmlName(new javax.xml.namespace.QName("", "link"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
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
