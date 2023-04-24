/**
 * OSSConfigBeanService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipageon.nmsif.ConfigService;

public interface OSSConfigBeanService extends javax.xml.rpc.Service {
    public java.lang.String getConfigServiceAddress();

    public com.ipageon.nmsif.ConfigService.OSSConfigBean getConfigService() throws javax.xml.rpc.ServiceException;

    public com.ipageon.nmsif.ConfigService.OSSConfigBean getConfigService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
