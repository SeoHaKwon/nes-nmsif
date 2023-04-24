/**
 * SrlstInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class SrlstInfo  implements java.io.Serializable {
    private java.lang.Integer srlst;

    private java.lang.String trafType;

    private java.lang.String trmt;

    private java.lang.Integer rlst;

    private java.lang.String dist;

    private java.lang.String call;

    private java.lang.String time;

    private java.lang.String date;

    private java.lang.String day;

    private java.lang.String drlst;

    public SrlstInfo() {
    }

    public SrlstInfo(
           java.lang.Integer srlst,
           java.lang.String trafType,
           java.lang.String trmt,
           java.lang.Integer rlst,
           java.lang.String dist,
           java.lang.String call,
           java.lang.String time,
           java.lang.String date,
           java.lang.String day,
           java.lang.String drlst) {
           this.srlst = srlst;
           this.trafType = trafType;
           this.trmt = trmt;
           this.rlst = rlst;
           this.dist = dist;
           this.call = call;
           this.time = time;
           this.date = date;
           this.day = day;
           this.drlst = drlst;
    }


    /**
     * Gets the srlst value for this SrlstInfo.
     * 
     * @return srlst
     */
    public java.lang.Integer getSrlst() {
        return srlst;
    }


    /**
     * Sets the srlst value for this SrlstInfo.
     * 
     * @param srlst
     */
    public void setSrlst(java.lang.Integer srlst) {
        this.srlst = srlst;
    }


    /**
     * Gets the trafType value for this SrlstInfo.
     * 
     * @return trafType
     */
    public java.lang.String getTrafType() {
        return trafType;
    }


    /**
     * Sets the trafType value for this SrlstInfo.
     * 
     * @param trafType
     */
    public void setTrafType(java.lang.String trafType) {
        this.trafType = trafType;
    }


    /**
     * Gets the trmt value for this SrlstInfo.
     * 
     * @return trmt
     */
    public java.lang.String getTrmt() {
        return trmt;
    }


    /**
     * Sets the trmt value for this SrlstInfo.
     * 
     * @param trmt
     */
    public void setTrmt(java.lang.String trmt) {
        this.trmt = trmt;
    }


    /**
     * Gets the rlst value for this SrlstInfo.
     * 
     * @return rlst
     */
    public java.lang.Integer getRlst() {
        return rlst;
    }


    /**
     * Sets the rlst value for this SrlstInfo.
     * 
     * @param rlst
     */
    public void setRlst(java.lang.Integer rlst) {
        this.rlst = rlst;
    }


    /**
     * Gets the dist value for this SrlstInfo.
     * 
     * @return dist
     */
    public java.lang.String getDist() {
        return dist;
    }


    /**
     * Sets the dist value for this SrlstInfo.
     * 
     * @param dist
     */
    public void setDist(java.lang.String dist) {
        this.dist = dist;
    }


    /**
     * Gets the call value for this SrlstInfo.
     * 
     * @return call
     */
    public java.lang.String getCall() {
        return call;
    }


    /**
     * Sets the call value for this SrlstInfo.
     * 
     * @param call
     */
    public void setCall(java.lang.String call) {
        this.call = call;
    }


    /**
     * Gets the time value for this SrlstInfo.
     * 
     * @return time
     */
    public java.lang.String getTime() {
        return time;
    }


    /**
     * Sets the time value for this SrlstInfo.
     * 
     * @param time
     */
    public void setTime(java.lang.String time) {
        this.time = time;
    }


    /**
     * Gets the date value for this SrlstInfo.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this SrlstInfo.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the day value for this SrlstInfo.
     * 
     * @return day
     */
    public java.lang.String getDay() {
        return day;
    }


    /**
     * Sets the day value for this SrlstInfo.
     * 
     * @param day
     */
    public void setDay(java.lang.String day) {
        this.day = day;
    }


    /**
     * Gets the drlst value for this SrlstInfo.
     * 
     * @return drlst
     */
    public java.lang.String getDrlst() {
        return drlst;
    }


    /**
     * Sets the drlst value for this SrlstInfo.
     * 
     * @param drlst
     */
    public void setDrlst(java.lang.String drlst) {
        this.drlst = drlst;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SrlstInfo)) return false;
        SrlstInfo other = (SrlstInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.srlst==null && other.getSrlst()==null) || 
             (this.srlst!=null &&
              this.srlst.equals(other.getSrlst()))) &&
            ((this.trafType==null && other.getTrafType()==null) || 
             (this.trafType!=null &&
              this.trafType.equals(other.getTrafType()))) &&
            ((this.trmt==null && other.getTrmt()==null) || 
             (this.trmt!=null &&
              this.trmt.equals(other.getTrmt()))) &&
            ((this.rlst==null && other.getRlst()==null) || 
             (this.rlst!=null &&
              this.rlst.equals(other.getRlst()))) &&
            ((this.dist==null && other.getDist()==null) || 
             (this.dist!=null &&
              this.dist.equals(other.getDist()))) &&
            ((this.call==null && other.getCall()==null) || 
             (this.call!=null &&
              this.call.equals(other.getCall()))) &&
            ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.day==null && other.getDay()==null) || 
             (this.day!=null &&
              this.day.equals(other.getDay()))) &&
            ((this.drlst==null && other.getDrlst()==null) || 
             (this.drlst!=null &&
              this.drlst.equals(other.getDrlst())));
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
        if (getSrlst() != null) {
            _hashCode += getSrlst().hashCode();
        }
        if (getTrafType() != null) {
            _hashCode += getTrafType().hashCode();
        }
        if (getTrmt() != null) {
            _hashCode += getTrmt().hashCode();
        }
        if (getRlst() != null) {
            _hashCode += getRlst().hashCode();
        }
        if (getDist() != null) {
            _hashCode += getDist().hashCode();
        }
        if (getCall() != null) {
            _hashCode += getCall().hashCode();
        }
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getDay() != null) {
            _hashCode += getDay().hashCode();
        }
        if (getDrlst() != null) {
            _hashCode += getDrlst().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SrlstInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "SrlstInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srlst");
        elemField.setXmlName(new javax.xml.namespace.QName("", "srlst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trafType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trafType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rlst");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rlst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dist");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("call");
        elemField.setXmlName(new javax.xml.namespace.QName("", "call"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("day");
        elemField.setXmlName(new javax.xml.namespace.QName("", "day"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drlst");
        elemField.setXmlName(new javax.xml.namespace.QName("", "drlst"));
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
