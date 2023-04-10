/**
 * MmsPfxInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class MmsPfxInfo  implements java.io.Serializable {
    private java.lang.String pfx;

    private java.lang.String pfxType;

    private java.lang.String callType;

    private java.lang.Integer min;

    private java.lang.Integer max;

    private java.lang.String svcType;

    private java.lang.String pcha;

    private java.lang.String psi;

    private java.lang.String enumS;

    private java.lang.String acf;

    private java.lang.String asi;

    private java.lang.Integer rlst;

    public MmsPfxInfo() {
    }

    public MmsPfxInfo(
           java.lang.String pfx,
           java.lang.String pfxType,
           java.lang.String callType,
           java.lang.Integer min,
           java.lang.Integer max,
           java.lang.String svcType,
           java.lang.String pcha,
           java.lang.String psi,
           java.lang.String enumS,
           java.lang.String acf,
           java.lang.String asi,
           java.lang.Integer rlst) {
           this.pfx = pfx;
           this.pfxType = pfxType;
           this.callType = callType;
           this.min = min;
           this.max = max;
           this.svcType = svcType;
           this.pcha = pcha;
           this.psi = psi;
           this.enumS = enumS;
           this.acf = acf;
           this.asi = asi;
           this.rlst = rlst;
    }


    /**
     * Gets the pfx value for this MmsPfxInfo.
     * 
     * @return pfx
     */
    public java.lang.String getPfx() {
        return pfx;
    }


    /**
     * Sets the pfx value for this MmsPfxInfo.
     * 
     * @param pfx
     */
    public void setPfx(java.lang.String pfx) {
        this.pfx = pfx;
    }


    /**
     * Gets the pfxType value for this MmsPfxInfo.
     * 
     * @return pfxType
     */
    public java.lang.String getPfxType() {
        return pfxType;
    }


    /**
     * Sets the pfxType value for this MmsPfxInfo.
     * 
     * @param pfxType
     */
    public void setPfxType(java.lang.String pfxType) {
        this.pfxType = pfxType;
    }


    /**
     * Gets the callType value for this MmsPfxInfo.
     * 
     * @return callType
     */
    public java.lang.String getCallType() {
        return callType;
    }


    /**
     * Sets the callType value for this MmsPfxInfo.
     * 
     * @param callType
     */
    public void setCallType(java.lang.String callType) {
        this.callType = callType;
    }


    /**
     * Gets the min value for this MmsPfxInfo.
     * 
     * @return min
     */
    public java.lang.Integer getMin() {
        return min;
    }


    /**
     * Sets the min value for this MmsPfxInfo.
     * 
     * @param min
     */
    public void setMin(java.lang.Integer min) {
        this.min = min;
    }


    /**
     * Gets the max value for this MmsPfxInfo.
     * 
     * @return max
     */
    public java.lang.Integer getMax() {
        return max;
    }


    /**
     * Sets the max value for this MmsPfxInfo.
     * 
     * @param max
     */
    public void setMax(java.lang.Integer max) {
        this.max = max;
    }


    /**
     * Gets the svcType value for this MmsPfxInfo.
     * 
     * @return svcType
     */
    public java.lang.String getSvcType() {
        return svcType;
    }


    /**
     * Sets the svcType value for this MmsPfxInfo.
     * 
     * @param svcType
     */
    public void setSvcType(java.lang.String svcType) {
        this.svcType = svcType;
    }


    /**
     * Gets the pcha value for this MmsPfxInfo.
     * 
     * @return pcha
     */
    public java.lang.String getPcha() {
        return pcha;
    }


    /**
     * Sets the pcha value for this MmsPfxInfo.
     * 
     * @param pcha
     */
    public void setPcha(java.lang.String pcha) {
        this.pcha = pcha;
    }


    /**
     * Gets the psi value for this MmsPfxInfo.
     * 
     * @return psi
     */
    public java.lang.String getPsi() {
        return psi;
    }


    /**
     * Sets the psi value for this MmsPfxInfo.
     * 
     * @param psi
     */
    public void setPsi(java.lang.String psi) {
        this.psi = psi;
    }


    /**
     * Gets the enumS value for this MmsPfxInfo.
     * 
     * @return enumS
     */
    public java.lang.String getEnumS() {
        return enumS;
    }


    /**
     * Sets the enumS value for this MmsPfxInfo.
     * 
     * @param enumS
     */
    public void setEnumS(java.lang.String enumS) {
        this.enumS = enumS;
    }


    /**
     * Gets the acf value for this MmsPfxInfo.
     * 
     * @return acf
     */
    public java.lang.String getAcf() {
        return acf;
    }


    /**
     * Sets the acf value for this MmsPfxInfo.
     * 
     * @param acf
     */
    public void setAcf(java.lang.String acf) {
        this.acf = acf;
    }


    /**
     * Gets the asi value for this MmsPfxInfo.
     * 
     * @return asi
     */
    public java.lang.String getAsi() {
        return asi;
    }


    /**
     * Sets the asi value for this MmsPfxInfo.
     * 
     * @param asi
     */
    public void setAsi(java.lang.String asi) {
        this.asi = asi;
    }


    /**
     * Gets the rlst value for this MmsPfxInfo.
     * 
     * @return rlst
     */
    public java.lang.Integer getRlst() {
        return rlst;
    }


    /**
     * Sets the rlst value for this MmsPfxInfo.
     * 
     * @param rlst
     */
    public void setRlst(java.lang.Integer rlst) {
        this.rlst = rlst;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MmsPfxInfo)) return false;
        MmsPfxInfo other = (MmsPfxInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pfx==null && other.getPfx()==null) || 
             (this.pfx!=null &&
              this.pfx.equals(other.getPfx()))) &&
            ((this.pfxType==null && other.getPfxType()==null) || 
             (this.pfxType!=null &&
              this.pfxType.equals(other.getPfxType()))) &&
            ((this.callType==null && other.getCallType()==null) || 
             (this.callType!=null &&
              this.callType.equals(other.getCallType()))) &&
            ((this.min==null && other.getMin()==null) || 
             (this.min!=null &&
              this.min.equals(other.getMin()))) &&
            ((this.max==null && other.getMax()==null) || 
             (this.max!=null &&
              this.max.equals(other.getMax()))) &&
            ((this.svcType==null && other.getSvcType()==null) || 
             (this.svcType!=null &&
              this.svcType.equals(other.getSvcType()))) &&
            ((this.pcha==null && other.getPcha()==null) || 
             (this.pcha!=null &&
              this.pcha.equals(other.getPcha()))) &&
            ((this.psi==null && other.getPsi()==null) || 
             (this.psi!=null &&
              this.psi.equals(other.getPsi()))) &&
            ((this.enumS==null && other.getEnumS()==null) || 
             (this.enumS!=null &&
              this.enumS.equals(other.getEnumS()))) &&
            ((this.acf==null && other.getAcf()==null) || 
             (this.acf!=null &&
              this.acf.equals(other.getAcf()))) &&
            ((this.asi==null && other.getAsi()==null) || 
             (this.asi!=null &&
              this.asi.equals(other.getAsi()))) &&
            ((this.rlst==null && other.getRlst()==null) || 
             (this.rlst!=null &&
              this.rlst.equals(other.getRlst())));
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
        if (getPfx() != null) {
            _hashCode += getPfx().hashCode();
        }
        if (getPfxType() != null) {
            _hashCode += getPfxType().hashCode();
        }
        if (getCallType() != null) {
            _hashCode += getCallType().hashCode();
        }
        if (getMin() != null) {
            _hashCode += getMin().hashCode();
        }
        if (getMax() != null) {
            _hashCode += getMax().hashCode();
        }
        if (getSvcType() != null) {
            _hashCode += getSvcType().hashCode();
        }
        if (getPcha() != null) {
            _hashCode += getPcha().hashCode();
        }
        if (getPsi() != null) {
            _hashCode += getPsi().hashCode();
        }
        if (getEnumS() != null) {
            _hashCode += getEnumS().hashCode();
        }
        if (getAcf() != null) {
            _hashCode += getAcf().hashCode();
        }
        if (getAsi() != null) {
            _hashCode += getAsi().hashCode();
        }
        if (getRlst() != null) {
            _hashCode += getRlst().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MmsPfxInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "MmsPfxInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pfx");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pfx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pfxType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pfxType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("min");
        elemField.setXmlName(new javax.xml.namespace.QName("", "min"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("max");
        elemField.setXmlName(new javax.xml.namespace.QName("", "max"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svcType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcha");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pcha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("psi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "psi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enumS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "asi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rlst");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rlst"));
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
