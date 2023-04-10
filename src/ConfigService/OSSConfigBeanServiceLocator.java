/**
 * OSSConfigBeanServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ConfigService;

public class OSSConfigBeanServiceLocator extends org.apache.axis.client.Service implements ConfigService.OSSConfigBeanService {

    public OSSConfigBeanServiceLocator() {
    }


    public OSSConfigBeanServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OSSConfigBeanServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ConfigService
    private java.lang.String ConfigService_address = "http://localhost:8080/soap2/services/ConfigService";

    public java.lang.String getConfigServiceAddress() {
        return ConfigService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ConfigServiceWSDDServiceName = "ConfigService";

    public java.lang.String getConfigServiceWSDDServiceName() {
        return ConfigServiceWSDDServiceName;
    }

    public void setConfigServiceWSDDServiceName(java.lang.String name) {
        ConfigServiceWSDDServiceName = name;
    }

    public ConfigService.OSSConfigBean getConfigService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ConfigService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getConfigService(endpoint);
    }

    public ConfigService.OSSConfigBean getConfigService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ConfigService.ConfigServiceSoapBindingStub _stub = new ConfigService.ConfigServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getConfigServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setConfigServiceEndpointAddress(java.lang.String address) {
        ConfigService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ConfigService.OSSConfigBean.class.isAssignableFrom(serviceEndpointInterface)) {
                ConfigService.ConfigServiceSoapBindingStub _stub = new ConfigService.ConfigServiceSoapBindingStub(new java.net.URL(ConfigService_address), this);
                _stub.setPortName(getConfigServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ConfigService".equals(inputPortName)) {
            return getConfigService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("ConfigService", "OSSConfigBeanService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("ConfigService", "ConfigService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ConfigService".equals(portName)) {
            setConfigServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
