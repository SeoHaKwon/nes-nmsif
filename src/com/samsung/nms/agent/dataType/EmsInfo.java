/**
 * EmsInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class EmsInfo  implements java.io.Serializable {
    private java.lang.Integer emsId;

    private java.lang.String emsIp;

    private java.lang.String cpuUsage;

    private java.lang.String memUsage;

    private java.lang.String diskUsage;

    private java.lang.String currentTime;

    private java.lang.String elapsedTime;

    private java.lang.String swVersion;

    private java.lang.String updatedDate;

    private java.lang.String nesCode;

    public EmsInfo() {
    }

    public EmsInfo(
           java.lang.Integer emsId,
           java.lang.String emsIp,
           java.lang.String cpuUsage,
           java.lang.String memUsage,
           java.lang.String diskUsage,
           java.lang.String currentTime,
           java.lang.String elapsedTime,
           java.lang.String swVersion,
           java.lang.String updatedDate,
           java.lang.String nesCode) {
           this.emsId = emsId;
           this.emsIp = emsIp;
           this.cpuUsage = cpuUsage;
           this.memUsage = memUsage;
           this.diskUsage = diskUsage;
           this.currentTime = currentTime;
           this.elapsedTime = elapsedTime;
           this.swVersion = swVersion;
           this.updatedDate = updatedDate;
           this.nesCode = nesCode;
    }


    /**
     * Gets the emsId value for this EmsInfo.
     * 
     * @return emsId
     */
    public java.lang.Integer getEmsId() {
        return emsId;
    }


    /**
     * Sets the emsId value for this EmsInfo.
     * 
     * @param emsId
     */
    public void setEmsId(java.lang.Integer emsId) {
        this.emsId = emsId;
    }


    /**
     * Gets the emsIp value for this EmsInfo.
     * 
     * @return emsIp
     */
    public java.lang.String getEmsIp() {
        return emsIp;
    }


    /**
     * Sets the emsIp value for this EmsInfo.
     * 
     * @param emsIp
     */
    public void setEmsIp(java.lang.String emsIp) {
        this.emsIp = emsIp;
    }


    /**
     * Gets the cpuUsage value for this EmsInfo.
     * 
     * @return cpuUsage
     */
    public java.lang.String getCpuUsage() {
        return cpuUsage;
    }


    /**
     * Sets the cpuUsage value for this EmsInfo.
     * 
     * @param cpuUsage
     */
    public void setCpuUsage(java.lang.String cpuUsage) {
        this.cpuUsage = cpuUsage;
    }


    /**
     * Gets the memUsage value for this EmsInfo.
     * 
     * @return memUsage
     */
    public java.lang.String getMemUsage() {
        return memUsage;
    }


    /**
     * Sets the memUsage value for this EmsInfo.
     * 
     * @param memUsage
     */
    public void setMemUsage(java.lang.String memUsage) {
        this.memUsage = memUsage;
    }


    /**
     * Gets the diskUsage value for this EmsInfo.
     * 
     * @return diskUsage
     */
    public java.lang.String getDiskUsage() {
        return diskUsage;
    }


    /**
     * Sets the diskUsage value for this EmsInfo.
     * 
     * @param diskUsage
     */
    public void setDiskUsage(java.lang.String diskUsage) {
        this.diskUsage = diskUsage;
    }


    /**
     * Gets the currentTime value for this EmsInfo.
     * 
     * @return currentTime
     */
    public java.lang.String getCurrentTime() {
        return currentTime;
    }


    /**
     * Sets the currentTime value for this EmsInfo.
     * 
     * @param currentTime
     */
    public void setCurrentTime(java.lang.String currentTime) {
        this.currentTime = currentTime;
    }


    /**
     * Gets the elapsedTime value for this EmsInfo.
     * 
     * @return elapsedTime
     */
    public java.lang.String getElapsedTime() {
        return elapsedTime;
    }


    /**
     * Sets the elapsedTime value for this EmsInfo.
     * 
     * @param elapsedTime
     */
    public void setElapsedTime(java.lang.String elapsedTime) {
        this.elapsedTime = elapsedTime;
    }


    /**
     * Gets the swVersion value for this EmsInfo.
     * 
     * @return swVersion
     */
    public java.lang.String getSwVersion() {
        return swVersion;
    }


    /**
     * Sets the swVersion value for this EmsInfo.
     * 
     * @param swVersion
     */
    public void setSwVersion(java.lang.String swVersion) {
        this.swVersion = swVersion;
    }


    /**
     * Gets the updatedDate value for this EmsInfo.
     * 
     * @return updatedDate
     */
    public java.lang.String getUpdatedDate() {
        return updatedDate;
    }


    /**
     * Sets the updatedDate value for this EmsInfo.
     * 
     * @param updatedDate
     */
    public void setUpdatedDate(java.lang.String updatedDate) {
        this.updatedDate = updatedDate;
    }


    /**
     * Gets the nesCode value for this EmsInfo.
     * 
     * @return nesCode
     */
    public java.lang.String getNesCode() {
        return nesCode;
    }


    /**
     * Sets the nesCode value for this EmsInfo.
     * 
     * @param nesCode
     */
    public void setNesCode(java.lang.String nesCode) {
        this.nesCode = nesCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmsInfo)) return false;
        EmsInfo other = (EmsInfo) obj;
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
            ((this.emsIp==null && other.getEmsIp()==null) || 
             (this.emsIp!=null &&
              this.emsIp.equals(other.getEmsIp()))) &&
            ((this.cpuUsage==null && other.getCpuUsage()==null) || 
             (this.cpuUsage!=null &&
              this.cpuUsage.equals(other.getCpuUsage()))) &&
            ((this.memUsage==null && other.getMemUsage()==null) || 
             (this.memUsage!=null &&
              this.memUsage.equals(other.getMemUsage()))) &&
            ((this.diskUsage==null && other.getDiskUsage()==null) || 
             (this.diskUsage!=null &&
              this.diskUsage.equals(other.getDiskUsage()))) &&
            ((this.currentTime==null && other.getCurrentTime()==null) || 
             (this.currentTime!=null &&
              this.currentTime.equals(other.getCurrentTime()))) &&
            ((this.elapsedTime==null && other.getElapsedTime()==null) || 
             (this.elapsedTime!=null &&
              this.elapsedTime.equals(other.getElapsedTime()))) &&
            ((this.swVersion==null && other.getSwVersion()==null) || 
             (this.swVersion!=null &&
              this.swVersion.equals(other.getSwVersion()))) &&
            ((this.updatedDate==null && other.getUpdatedDate()==null) || 
             (this.updatedDate!=null &&
              this.updatedDate.equals(other.getUpdatedDate()))) &&
            ((this.nesCode==null && other.getNesCode()==null) || 
             (this.nesCode!=null &&
              this.nesCode.equals(other.getNesCode())));
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
        if (getEmsIp() != null) {
            _hashCode += getEmsIp().hashCode();
        }
        if (getCpuUsage() != null) {
            _hashCode += getCpuUsage().hashCode();
        }
        if (getMemUsage() != null) {
            _hashCode += getMemUsage().hashCode();
        }
        if (getDiskUsage() != null) {
            _hashCode += getDiskUsage().hashCode();
        }
        if (getCurrentTime() != null) {
            _hashCode += getCurrentTime().hashCode();
        }
        if (getElapsedTime() != null) {
            _hashCode += getElapsedTime().hashCode();
        }
        if (getSwVersion() != null) {
            _hashCode += getSwVersion().hashCode();
        }
        if (getUpdatedDate() != null) {
            _hashCode += getUpdatedDate().hashCode();
        }
        if (getNesCode() != null) {
            _hashCode += getNesCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmsInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "EmsInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emsId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emsId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emsIp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emsIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuUsage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpuUsage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memUsage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "memUsage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskUsage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "diskUsage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currentTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elapsedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "elapsedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("swVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "swVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updatedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nesCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nesCode"));
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
