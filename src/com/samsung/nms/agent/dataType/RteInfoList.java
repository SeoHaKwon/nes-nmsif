/**
 * RteInfoList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class RteInfoList  implements java.io.Serializable {
    private java.lang.Integer emsId;

    private java.lang.String col;

    private com.samsung.nms.agent.dataType.RteInfo[] rteInfo;

    private com.samsung.nms.agent.dataType.MmsRteInfo[] mmsRteInfo;

    public RteInfoList() {
    }

    public RteInfoList(
           java.lang.Integer emsId,
           java.lang.String col,
           com.samsung.nms.agent.dataType.RteInfo[] rteInfo,
           com.samsung.nms.agent.dataType.MmsRteInfo[] mmsRteInfo) {
           this.emsId = emsId;
           this.col = col;
           this.rteInfo = rteInfo;
           this.mmsRteInfo = mmsRteInfo;
    }


    /**
     * Gets the emsId value for this RteInfoList.
     * 
     * @return emsId
     */
    public java.lang.Integer getEmsId() {
        return emsId;
    }


    /**
     * Sets the emsId value for this RteInfoList.
     * 
     * @param emsId
     */
    public void setEmsId(java.lang.Integer emsId) {
        this.emsId = emsId;
    }


    /**
     * Gets the col value for this RteInfoList.
     * 
     * @return col
     */
    public java.lang.String getCol() {
        return col;
    }


    /**
     * Sets the col value for this RteInfoList.
     * 
     * @param col
     */
    public void setCol(java.lang.String col) {
        this.col = col;
    }


    /**
     * Gets the rteInfo value for this RteInfoList.
     * 
     * @return rteInfo
     */
    public com.samsung.nms.agent.dataType.RteInfo[] getRteInfo() {
        return rteInfo;
    }


    /**
     * Sets the rteInfo value for this RteInfoList.
     * 
     * @param rteInfo
     */
    public void setRteInfo(com.samsung.nms.agent.dataType.RteInfo[] rteInfo) {
        this.rteInfo = rteInfo;
    }

    public com.samsung.nms.agent.dataType.RteInfo getRteInfo(int i) {
        return this.rteInfo[i];
    }

    public void setRteInfo(int i, com.samsung.nms.agent.dataType.RteInfo _value) {
        this.rteInfo[i] = _value;
    }


    /**
     * Gets the mmsRteInfo value for this RteInfoList.
     * 
     * @return mmsRteInfo
     */
    public com.samsung.nms.agent.dataType.MmsRteInfo[] getMmsRteInfo() {
        return mmsRteInfo;
    }


    /**
     * Sets the mmsRteInfo value for this RteInfoList.
     * 
     * @param mmsRteInfo
     */
    public void setMmsRteInfo(com.samsung.nms.agent.dataType.MmsRteInfo[] mmsRteInfo) {
        this.mmsRteInfo = mmsRteInfo;
    }

    public com.samsung.nms.agent.dataType.MmsRteInfo getMmsRteInfo(int i) {
        return this.mmsRteInfo[i];
    }

    public void setMmsRteInfo(int i, com.samsung.nms.agent.dataType.MmsRteInfo _value) {
        this.mmsRteInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RteInfoList)) return false;
        RteInfoList other = (RteInfoList) obj;
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
            ((this.rteInfo==null && other.getRteInfo()==null) || 
             (this.rteInfo!=null &&
              java.util.Arrays.equals(this.rteInfo, other.getRteInfo()))) &&
            ((this.mmsRteInfo==null && other.getMmsRteInfo()==null) || 
             (this.mmsRteInfo!=null &&
              java.util.Arrays.equals(this.mmsRteInfo, other.getMmsRteInfo())));
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
        if (getRteInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRteInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRteInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMmsRteInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMmsRteInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMmsRteInfo(), i);
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
        new org.apache.axis.description.TypeDesc(RteInfoList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "RteInfoList"));
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
        elemField.setFieldName("rteInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rteInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "RteInfo"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mmsRteInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mmsRteInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "MmsRteInfo"));
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
