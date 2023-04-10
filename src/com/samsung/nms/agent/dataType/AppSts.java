/**
 * AppSts.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.samsung.nms.agent.dataType;

public class AppSts  implements java.io.Serializable {
    private java.lang.String node;

    private java.lang.String capsule;

    private java.lang.String admSts;

    private java.lang.String oprSts;

    private java.lang.String usage;

    private java.lang.String role;

    private java.lang.String mateNode;

    private java.lang.String mateCapsule;

    public AppSts() {
    }

    public AppSts(
           java.lang.String node,
           java.lang.String capsule,
           java.lang.String admSts,
           java.lang.String oprSts,
           java.lang.String usage,
           java.lang.String role,
           java.lang.String mateNode,
           java.lang.String mateCapsule) {
           this.node = node;
           this.capsule = capsule;
           this.admSts = admSts;
           this.oprSts = oprSts;
           this.usage = usage;
           this.role = role;
           this.mateNode = mateNode;
           this.mateCapsule = mateCapsule;
    }


    /**
     * Gets the node value for this AppSts.
     * 
     * @return node
     */
    public java.lang.String getNode() {
        return node;
    }


    /**
     * Sets the node value for this AppSts.
     * 
     * @param node
     */
    public void setNode(java.lang.String node) {
        this.node = node;
    }


    /**
     * Gets the capsule value for this AppSts.
     * 
     * @return capsule
     */
    public java.lang.String getCapsule() {
        return capsule;
    }


    /**
     * Sets the capsule value for this AppSts.
     * 
     * @param capsule
     */
    public void setCapsule(java.lang.String capsule) {
        this.capsule = capsule;
    }


    /**
     * Gets the admSts value for this AppSts.
     * 
     * @return admSts
     */
    public java.lang.String getAdmSts() {
        return admSts;
    }


    /**
     * Sets the admSts value for this AppSts.
     * 
     * @param admSts
     */
    public void setAdmSts(java.lang.String admSts) {
        this.admSts = admSts;
    }


    /**
     * Gets the oprSts value for this AppSts.
     * 
     * @return oprSts
     */
    public java.lang.String getOprSts() {
        return oprSts;
    }


    /**
     * Sets the oprSts value for this AppSts.
     * 
     * @param oprSts
     */
    public void setOprSts(java.lang.String oprSts) {
        this.oprSts = oprSts;
    }


    /**
     * Gets the usage value for this AppSts.
     * 
     * @return usage
     */
    public java.lang.String getUsage() {
        return usage;
    }


    /**
     * Sets the usage value for this AppSts.
     * 
     * @param usage
     */
    public void setUsage(java.lang.String usage) {
        this.usage = usage;
    }


    /**
     * Gets the role value for this AppSts.
     * 
     * @return role
     */
    public java.lang.String getRole() {
        return role;
    }


    /**
     * Sets the role value for this AppSts.
     * 
     * @param role
     */
    public void setRole(java.lang.String role) {
        this.role = role;
    }


    /**
     * Gets the mateNode value for this AppSts.
     * 
     * @return mateNode
     */
    public java.lang.String getMateNode() {
        return mateNode;
    }


    /**
     * Sets the mateNode value for this AppSts.
     * 
     * @param mateNode
     */
    public void setMateNode(java.lang.String mateNode) {
        this.mateNode = mateNode;
    }


    /**
     * Gets the mateCapsule value for this AppSts.
     * 
     * @return mateCapsule
     */
    public java.lang.String getMateCapsule() {
        return mateCapsule;
    }


    /**
     * Sets the mateCapsule value for this AppSts.
     * 
     * @param mateCapsule
     */
    public void setMateCapsule(java.lang.String mateCapsule) {
        this.mateCapsule = mateCapsule;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AppSts)) return false;
        AppSts other = (AppSts) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.node==null && other.getNode()==null) || 
             (this.node!=null &&
              this.node.equals(other.getNode()))) &&
            ((this.capsule==null && other.getCapsule()==null) || 
             (this.capsule!=null &&
              this.capsule.equals(other.getCapsule()))) &&
            ((this.admSts==null && other.getAdmSts()==null) || 
             (this.admSts!=null &&
              this.admSts.equals(other.getAdmSts()))) &&
            ((this.oprSts==null && other.getOprSts()==null) || 
             (this.oprSts!=null &&
              this.oprSts.equals(other.getOprSts()))) &&
            ((this.usage==null && other.getUsage()==null) || 
             (this.usage!=null &&
              this.usage.equals(other.getUsage()))) &&
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              this.role.equals(other.getRole()))) &&
            ((this.mateNode==null && other.getMateNode()==null) || 
             (this.mateNode!=null &&
              this.mateNode.equals(other.getMateNode()))) &&
            ((this.mateCapsule==null && other.getMateCapsule()==null) || 
             (this.mateCapsule!=null &&
              this.mateCapsule.equals(other.getMateCapsule())));
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
        if (getNode() != null) {
            _hashCode += getNode().hashCode();
        }
        if (getCapsule() != null) {
            _hashCode += getCapsule().hashCode();
        }
        if (getAdmSts() != null) {
            _hashCode += getAdmSts().hashCode();
        }
        if (getOprSts() != null) {
            _hashCode += getOprSts().hashCode();
        }
        if (getUsage() != null) {
            _hashCode += getUsage().hashCode();
        }
        if (getRole() != null) {
            _hashCode += getRole().hashCode();
        }
        if (getMateNode() != null) {
            _hashCode += getMateNode().hashCode();
        }
        if (getMateCapsule() != null) {
            _hashCode += getMateCapsule().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AppSts.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "AppSts"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("node");
        elemField.setXmlName(new javax.xml.namespace.QName("", "node"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capsule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "capsule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("admSts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "admSts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oprSts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oprSts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("", "role"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mateNode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mateNode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mateCapsule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mateCapsule"));
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
