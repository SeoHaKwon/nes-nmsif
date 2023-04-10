/**
 * DetailRteInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class DetailRteInfo  implements java.io.Serializable {
    private java.lang.Integer emsId;

    private java.lang.String col;

    private java.lang.Integer rteNum;

    private java.lang.String rteType;

    private com.samsung.nms.agent.dataType.TrkInfo[] trk;

    public DetailRteInfo() {
    }

    public DetailRteInfo(
           java.lang.Integer emsId,
           java.lang.String col,
           java.lang.Integer rteNum,
           java.lang.String rteType,
           com.samsung.nms.agent.dataType.TrkInfo[] trk) {
           this.emsId = emsId;
           this.col = col;
           this.rteNum = rteNum;
           this.rteType = rteType;
           this.trk = trk;
    }


    /**
     * Gets the emsId value for this DetailRteInfo.
     * 
     * @return emsId
     */
    public java.lang.Integer getEmsId() {
        return emsId;
    }


    /**
     * Sets the emsId value for this DetailRteInfo.
     * 
     * @param emsId
     */
    public void setEmsId(java.lang.Integer emsId) {
        this.emsId = emsId;
    }


    /**
     * Gets the col value for this DetailRteInfo.
     * 
     * @return col
     */
    public java.lang.String getCol() {
        return col;
    }


    /**
     * Sets the col value for this DetailRteInfo.
     * 
     * @param col
     */
    public void setCol(java.lang.String col) {
        this.col = col;
    }


    /**
     * Gets the rteNum value for this DetailRteInfo.
     * 
     * @return rteNum
     */
    public java.lang.Integer getRteNum() {
        return rteNum;
    }


    /**
     * Sets the rteNum value for this DetailRteInfo.
     * 
     * @param rteNum
     */
    public void setRteNum(java.lang.Integer rteNum) {
        this.rteNum = rteNum;
    }


    /**
     * Gets the rteType value for this DetailRteInfo.
     * 
     * @return rteType
     */
    public java.lang.String getRteType() {
        return rteType;
    }


    /**
     * Sets the rteType value for this DetailRteInfo.
     * 
     * @param rteType
     */
    public void setRteType(java.lang.String rteType) {
        this.rteType = rteType;
    }


    /**
     * Gets the trk value for this DetailRteInfo.
     * 
     * @return trk
     */
    public com.samsung.nms.agent.dataType.TrkInfo[] getTrk() {
        return trk;
    }


    /**
     * Sets the trk value for this DetailRteInfo.
     * 
     * @param trk
     */
    public void setTrk(com.samsung.nms.agent.dataType.TrkInfo[] trk) {
        this.trk = trk;
    }

    public com.samsung.nms.agent.dataType.TrkInfo getTrk(int i) {
        return this.trk[i];
    }

    public void setTrk(int i, com.samsung.nms.agent.dataType.TrkInfo _value) {
        this.trk[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DetailRteInfo)) return false;
        DetailRteInfo other = (DetailRteInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.emsId==null && other.getEmsId()==null) || 
             (this.emsId!=null &&
              this.emsId.equals(other.getEmsId()))) &&
            ((this.col==null && other.getCol()==null) || 
             (this.col!=null &&
              this.col.equals(other.getCol()))) &&
            ((this.rteNum==null && other.getRteNum()==null) || 
             (this.rteNum!=null &&
              this.rteNum.equals(other.getRteNum()))) &&
            ((this.rteType==null && other.getRteType()==null) || 
             (this.rteType!=null &&
              this.rteType.equals(other.getRteType()))) &&
            ((this.trk==null && other.getTrk()==null) || 
             (this.trk!=null &&
              java.util.Arrays.equals(this.trk, other.getTrk())));
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
        if (getEmsId() != null) {
            _hashCode += getEmsId().hashCode();
        }
        if (getCol() != null) {
            _hashCode += getCol().hashCode();
        }
        if (getRteNum() != null) {
            _hashCode += getRteNum().hashCode();
        }
        if (getRteType() != null) {
            _hashCode += getRteType().hashCode();
        }
        if (getTrk() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrk());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrk(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DetailRteInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "DetailRteInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emsId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emsId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("col");
        elemField.setXmlName(new javax.xml.namespace.QName("", "col"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rteNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rteNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rteType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rteType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trk");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "TrkInfo"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
