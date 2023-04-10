/**
 * AppInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class AppInfo  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String file;

    private java.lang.String nodeType;

    private java.lang.String dualType;

    private java.lang.String java;

    public AppInfo() {
    }

    public AppInfo(
           java.lang.String name,
           java.lang.String file,
           java.lang.String nodeType,
           java.lang.String dualType,
           java.lang.String java) {
           this.name = name;
           this.file = file;
           this.nodeType = nodeType;
           this.dualType = dualType;
           this.java = java;
    }


    /**
     * Gets the name value for this AppInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this AppInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the file value for this AppInfo.
     * 
     * @return file
     */
    public java.lang.String getFile() {
        return file;
    }


    /**
     * Sets the file value for this AppInfo.
     * 
     * @param file
     */
    public void setFile(java.lang.String file) {
        this.file = file;
    }


    /**
     * Gets the nodeType value for this AppInfo.
     * 
     * @return nodeType
     */
    public java.lang.String getNodeType() {
        return nodeType;
    }


    /**
     * Sets the nodeType value for this AppInfo.
     * 
     * @param nodeType
     */
    public void setNodeType(java.lang.String nodeType) {
        this.nodeType = nodeType;
    }


    /**
     * Gets the dualType value for this AppInfo.
     * 
     * @return dualType
     */
    public java.lang.String getDualType() {
        return dualType;
    }


    /**
     * Sets the dualType value for this AppInfo.
     * 
     * @param dualType
     */
    public void setDualType(java.lang.String dualType) {
        this.dualType = dualType;
    }


    /**
     * Gets the java value for this AppInfo.
     * 
     * @return java
     */
    public java.lang.String getJava() {
        return java;
    }


    /**
     * Sets the java value for this AppInfo.
     * 
     * @param java
     */
    public void setJava(java.lang.String java) {
        this.java = java;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AppInfo)) return false;
        AppInfo other = (AppInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.file==null && other.getFile()==null) || 
             (this.file!=null &&
              this.file.equals(other.getFile()))) &&
            ((this.nodeType==null && other.getNodeType()==null) || 
             (this.nodeType!=null &&
              this.nodeType.equals(other.getNodeType()))) &&
            ((this.dualType==null && other.getDualType()==null) || 
             (this.dualType!=null &&
              this.dualType.equals(other.getDualType()))) &&
            ((this.java==null && other.getJava()==null) || 
             (this.java!=null &&
              this.java.equals(other.getJava())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getFile() != null) {
            _hashCode += getFile().hashCode();
        }
        if (getNodeType() != null) {
            _hashCode += getNodeType().hashCode();
        }
        if (getDualType() != null) {
            _hashCode += getDualType().hashCode();
        }
        if (getJava() != null) {
            _hashCode += getJava().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AppInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "AppInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file");
        elemField.setXmlName(new javax.xml.namespace.QName("", "file"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nodeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dualType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dualType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("java");
        elemField.setXmlName(new javax.xml.namespace.QName("", "java"));
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
