/**
 * ConfigServiceSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipageon.nmsif.ConfigService;

public class ConfigServiceSoapBindingSkeleton implements com.ipageon.nmsif.ConfigService.OSSConfigBean, org.apache.axis.wsdl.Skeleton {
    private com.ipageon.nmsif.ConfigService.OSSConfigBean impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getNodeInfo", _params, new javax.xml.namespace.QName("", "getNodeInfoResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getNodeInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getNodeInfo") == null) {
            _myOperations.put("getNodeInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getNodeInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("getEmsId", _params, new javax.xml.namespace.QName("", "getEmsIdReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getEmsId"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getEmsId") == null) {
            _myOperations.put("getEmsId", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getEmsId")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("setEmsId", _params, new javax.xml.namespace.QName("", "setEmsIdReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "setEmsId"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("setEmsId") == null) {
            _myOperations.put("setEmsId", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("setEmsId")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getEmsInfo", _params, new javax.xml.namespace.QName("", "getEmsInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getEmsInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getEmsInfo") == null) {
            _myOperations.put("getEmsInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getEmsInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getSswId", _params, new javax.xml.namespace.QName("", "getSswIdReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getSswId"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getSswId") == null) {
            _myOperations.put("getSswId", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getSswId")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getSysInfo", _params, new javax.xml.namespace.QName("", "getSysInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getSysInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getSysInfo") == null) {
            _myOperations.put("getSysInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getSysInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sswName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getSysInfoFromName", _params, new javax.xml.namespace.QName("", "getSysInfoFromNameReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getSysInfoFromName"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getSysInfoFromName") == null) {
            _myOperations.put("getSysInfoFromName", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getSysInfoFromName")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getEqpHolderInfo", _params, new javax.xml.namespace.QName("", "getEqpHolderInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getEqpHolderInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getEqpHolderInfo") == null) {
            _myOperations.put("getEqpHolderInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getEqpHolderInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rackId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "shelfId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "slotid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getCardInfo", _params, new javax.xml.namespace.QName("", "getCardInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getCardInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getCardInfo") == null) {
            _myOperations.put("getCardInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getCardInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rackId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "shelfId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "slotid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getLDUInfo", _params, new javax.xml.namespace.QName("", "getLDUInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getLDUInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getLDUInfo") == null) {
            _myOperations.put("getLDUInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getLDUInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rackId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "shelfId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "slotid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getMODInfo", _params, new javax.xml.namespace.QName("", "getMODInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getMODInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getMODInfo") == null) {
            _myOperations.put("getMODInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getMODInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rackId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "shelfId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "slotid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getDKUInfo", _params, new javax.xml.namespace.QName("", "getDKUInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getDKUInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getDKUInfo") == null) {
            _myOperations.put("getDKUInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getDKUInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getPortInfo", _params, new javax.xml.namespace.QName("", "getPortInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getPortInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getPortInfo") == null) {
            _myOperations.put("getPortInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getPortInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rteNum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getRouteInfo", _params, new javax.xml.namespace.QName("", "getRouteInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getRouteInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getRouteInfo") == null) {
            _myOperations.put("getRouteInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getRouteInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rteNum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getDetailRteInfo", _params, new javax.xml.namespace.QName("", "getDetailRteInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getDetailRteInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getDetailRteInfo") == null) {
            _myOperations.put("getDetailRteInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getDetailRteInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rteNum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getMmsRouteInfo", _params, new javax.xml.namespace.QName("", "getMmsRouteInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getMmsRouteInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getMmsRouteInfo") == null) {
            _myOperations.put("getMmsRouteInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getMmsRouteInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getMgwInfo", _params, new javax.xml.namespace.QName("", "getMgwInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getMgwInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getMgwInfo") == null) {
            _myOperations.put("getMgwInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getMgwInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mgwId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getDetailMgwInfo", _params, new javax.xml.namespace.QName("", "getDetailMgwInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getDetailMgwInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getDetailMgwInfo") == null) {
            _myOperations.put("getDetailMgwInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getDetailMgwInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getAsInfo", _params, new javax.xml.namespace.QName("", "getAsInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getAsInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getAsInfo") == null) {
            _myOperations.put("getAsInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getAsInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getMsInfo", _params, new javax.xml.namespace.QName("", "getMsInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getMsInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getMsInfo") == null) {
            _myOperations.put("getMsInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getMsInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getOtherSswInfo", _params, new javax.xml.namespace.QName("", "getOtherSswInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getOtherSswInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getOtherSswInfo") == null) {
            _myOperations.put("getOtherSswInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getOtherSswInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getSgwInfo", _params, new javax.xml.namespace.QName("", "getSgwInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getSgwInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getSgwInfo") == null) {
            _myOperations.put("getSgwInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getSgwInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getNsInfo", _params, new javax.xml.namespace.QName("", "getNsInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getNsInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getNsInfo") == null) {
            _myOperations.put("getNsInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getNsInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getMgcInfo", _params, new javax.xml.namespace.QName("", "getMgcInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getMgcInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getMgcInfo") == null) {
            _myOperations.put("getMgcInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getMgcInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getMmsInfo", _params, new javax.xml.namespace.QName("", "getMmsInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getMmsInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getMmsInfo") == null) {
            _myOperations.put("getMmsInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getMmsInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getDnsInfo", _params, new javax.xml.namespace.QName("", "getDnsInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getDnsInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getDnsInfo") == null) {
            _myOperations.put("getDnsInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getDnsInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getHssInfo", _params, new javax.xml.namespace.QName("", "getHssInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getHssInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getHssInfo") == null) {
            _myOperations.put("getHssInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getHssInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getNesCode", _params, new javax.xml.namespace.QName("", "getNesCodeResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getNesCode"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getNesCode") == null) {
            _myOperations.put("getNesCode", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getNesCode")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nesCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("setNesCode", _params, new javax.xml.namespace.QName("", "setNesCodeResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "setNesCode"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("setNesCode") == null) {
            _myOperations.put("setNesCode", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("setNesCode")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getAllConfiguration", _params, new javax.xml.namespace.QName("", "getAllConfigurationResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getAllConfiguration"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getAllConfiguration") == null) {
            _myOperations.put("getAllConfiguration", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getAllConfiguration")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "node"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("activateNode", _params, new javax.xml.namespace.QName("", "activateNodeResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "activateNode"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("activateNode") == null) {
            _myOperations.put("activateNode", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("activateNode")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "node"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "force"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("deactivateNode", _params, new javax.xml.namespace.QName("", "deactivateNodeResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "deactivateNode"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("deactivateNode") == null) {
            _myOperations.put("deactivateNode", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("deactivateNode")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "node"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cls"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "force"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("initNode", _params, new javax.xml.namespace.QName("", "initNodeResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "initNode"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("initNode") == null) {
            _myOperations.put("initNode", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("initNode")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getFANInfo", _params, new javax.xml.namespace.QName("", "getFANInfoResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getFANInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getFANInfo") == null) {
            _myOperations.put("getFANInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getFANInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getPkgFileInfo", _params, new javax.xml.namespace.QName("", "getPkgFileInfoResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getPkgFileInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getPkgFileInfo") == null) {
            _myOperations.put("getPkgFileInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getPkgFileInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getAppInfo", _params, new javax.xml.namespace.QName("", "getAppInfoResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getAppInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getAppInfo") == null) {
            _myOperations.put("getAppInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getAppInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "file"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pkg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("dumpNCopyPkg", _params, new javax.xml.namespace.QName("", "dumpNCopyPkgResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "dumpNCopyPkg"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("dumpNCopyPkg") == null) {
            _myOperations.put("dumpNCopyPkg", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("dumpNCopyPkg")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "node"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "caps"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("activateCapsule", _params, new javax.xml.namespace.QName("", "activateCapsuleResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "activateCapsule"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("activateCapsule") == null) {
            _myOperations.put("activateCapsule", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("activateCapsule")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "node"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "caps"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("deactivateCapsule", _params, new javax.xml.namespace.QName("", "deactivateCapsuleResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "deactivateCapsule"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("deactivateCapsule") == null) {
            _myOperations.put("deactivateCapsule", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("deactivateCapsule")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "node"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "caps"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "exe"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "role"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("initCapsule", _params, new javax.xml.namespace.QName("", "initCapsuleResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "initCapsule"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("initCapsule") == null) {
            _myOperations.put("initCapsule", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("initCapsule")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "node"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "caps"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "role"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getAppsSts", _params, new javax.xml.namespace.QName("", "getAppsStsResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getAppsSts"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getAppsSts") == null) {
            _myOperations.put("getAppsSts", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getAppsSts")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getCmsInfo", _params, new javax.xml.namespace.QName("", "getCmsInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getCmsInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getCmsInfo") == null) {
            _myOperations.put("getCmsInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getCmsInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getSmsInfo", _params, new javax.xml.namespace.QName("", "getSmsInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getSmsInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getSmsInfo") == null) {
            _myOperations.put("getSmsInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getSmsInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getQmsInfo", _params, new javax.xml.namespace.QName("", "getQmsInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getQmsInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getQmsInfo") == null) {
            _myOperations.put("getQmsInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getQmsInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getEnumInfo", _params, new javax.xml.namespace.QName("", "getEnumInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getEnumInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getEnumInfo") == null) {
            _myOperations.put("getEnumInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getEnumInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getSlfInfo", _params, new javax.xml.namespace.QName("", "getSlfInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getSlfInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getSlfInfo") == null) {
            _myOperations.put("getSlfInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getSlfInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getPdpInfo", _params, new javax.xml.namespace.QName("", "getPdpInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getPdpInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getPdpInfo") == null) {
            _myOperations.put("getPdpInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getPdpInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getCscfInfo", _params, new javax.xml.namespace.QName("", "getCscfInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getCscfInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getCscfInfo") == null) {
            _myOperations.put("getCscfInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getCscfInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getScscfInfo", _params, new javax.xml.namespace.QName("", "getScscfInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getScscfInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getScscfInfo") == null) {
            _myOperations.put("getScscfInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getScscfInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getApuInfo", _params, new javax.xml.namespace.QName("", "getApuInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getApuInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getApuInfo") == null) {
            _myOperations.put("getApuInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getApuInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getPkgVerInfo", _params, new javax.xml.namespace.QName("", "getPkgVerInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getPkgVerInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getPkgVerInfo") == null) {
            _myOperations.put("getPkgVerInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getPkgVerInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getAllSubSysInfo", _params, new javax.xml.namespace.QName("", "getAllSubSysInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getAllSubSysInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getAllSubSysInfo") == null) {
            _myOperations.put("getAllSubSysInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getAllSubSysInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getInhRteInfo", _params, new javax.xml.namespace.QName("", "getInhRteInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getInhRteInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getInhRteInfo") == null) {
            _myOperations.put("getInhRteInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getInhRteInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getSvcIpInfo", _params, new javax.xml.namespace.QName("", "getSvcIpInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getSvcIpInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getSvcIpInfo") == null) {
            _myOperations.put("getSvcIpInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getSvcIpInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emsId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "col"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getPssInfo", _params, new javax.xml.namespace.QName("", "getPssInfoInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://dataType.agent.nms.samsung.com", "ResultInfo"));
        _oper.setElementQName(new javax.xml.namespace.QName("ConfigService", "getPssInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getPssInfo") == null) {
            _myOperations.put("getPssInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getPssInfo")).add(_oper);
    }

    public ConfigServiceSoapBindingSkeleton() {
        this.impl = new com.ipageon.nmsif.ConfigService.ConfigServiceSoapBindingImpl();
    }

    public ConfigServiceSoapBindingSkeleton(com.ipageon.nmsif.ConfigService.OSSConfigBean impl) {
        this.impl = impl;
    }
    public com.samsung.nms.agent.dataType.ResultInfo getNodeInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getNodeInfo(emsId, col, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getEmsId() throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getEmsId();
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo setEmsId(int emsId, int id, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.setEmsId(emsId, id, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getEmsInfo(int emsId, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getEmsInfo(emsId, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getSswId(int emsId, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getSswId(emsId, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getSysInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getSysInfo(emsId, col, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getSysInfoFromName(int emsId, java.lang.String sswName, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getSysInfoFromName(emsId, sswName, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getEqpHolderInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getEqpHolderInfo(emsId, col, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getCardInfo(int emsId, java.lang.String col, int rackId, int shelfId, int slotid, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getCardInfo(emsId, col, rackId, shelfId, slotid, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getLDUInfo(int emsId, java.lang.String col, int rackId, int shelfId, int slotid, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getLDUInfo(emsId, col, rackId, shelfId, slotid, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getMODInfo(int emsId, java.lang.String col, int rackId, int shelfId, int slotid, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getMODInfo(emsId, col, rackId, shelfId, slotid, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getDKUInfo(int emsId, java.lang.String col, int rackId, int shelfId, int slotid, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getDKUInfo(emsId, col, rackId, shelfId, slotid, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getPortInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getPortInfo(emsId, col, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getRouteInfo(int emsId, java.lang.String col, int rteNum, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getRouteInfo(emsId, col, rteNum, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getDetailRteInfo(int emsId, java.lang.String col, int rteNum, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getDetailRteInfo(emsId, col, rteNum, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getMmsRouteInfo(int emsId, java.lang.String col, int rteNum, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getMmsRouteInfo(emsId, col, rteNum, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getMgwInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getMgwInfo(emsId, col, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getDetailMgwInfo(int emsId, java.lang.String col, int mgwId, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getDetailMgwInfo(emsId, col, mgwId, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getAsInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getAsInfo(emsId, col, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getMsInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getMsInfo(emsId, col, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getOtherSswInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getOtherSswInfo(emsId, col, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getSgwInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getSgwInfo(emsId, col, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getNsInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getNsInfo(emsId, col, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getMgcInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getMgcInfo(emsId, col, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getMmsInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getMmsInfo(emsId, col, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getDnsInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getDnsInfo(emsId, col, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getHssInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getHssInfo(emsId, col, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getNesCode(int emsId, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getNesCode(emsId, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo setNesCode(int emsId, java.lang.String col, java.lang.String nesCode, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.setNesCode(emsId, col, nesCode, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getAllConfiguration(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getAllConfiguration(emsId, col, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo activateNode(int emsId, java.lang.String col, java.lang.String node, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.activateNode(emsId, col, node, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo deactivateNode(int emsId, java.lang.String col, java.lang.String node, java.lang.String force, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.deactivateNode(emsId, col, node, force, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo initNode(int emsId, java.lang.String col, java.lang.String node, java.lang.String cls, java.lang.String force, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.initNode(emsId, col, node, cls, force, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getFANInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getFANInfo(emsId, col, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getPkgFileInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getPkgFileInfo(emsId, col, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getAppInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getAppInfo(emsId, col, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo dumpNCopyPkg(int emsId, java.lang.String col, java.lang.String version, java.lang.String type, java.lang.String file, java.lang.String pkg, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.dumpNCopyPkg(emsId, col, version, type, file, pkg, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo activateCapsule(int emsId, java.lang.String col, java.lang.String node, java.lang.String caps, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.activateCapsule(emsId, col, node, caps, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo deactivateCapsule(int emsId, java.lang.String col, java.lang.String node, java.lang.String caps, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.deactivateCapsule(emsId, col, node, caps, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo initCapsule(int emsId, java.lang.String col, java.lang.String node, java.lang.String caps, java.lang.String exe, java.lang.String role, java.lang.String type, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.initCapsule(emsId, col, node, caps, exe, role, type, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getAppsSts(int emsId, java.lang.String col, java.lang.String node, java.lang.String caps, java.lang.String role, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getAppsSts(emsId, col, node, caps, role, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getCmsInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getCmsInfo(emsId, col, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getSmsInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getSmsInfo(emsId, col, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getQmsInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getQmsInfo(emsId, col, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getEnumInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getEnumInfo(emsId, col, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getSlfInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getSlfInfo(emsId, col, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getPdpInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getPdpInfo(emsId, col, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getCscfInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getCscfInfo(emsId, col, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getScscfInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getScscfInfo(emsId, col, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getApuInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getApuInfo(emsId, col, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getPkgVerInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getPkgVerInfo(emsId, col, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getAllSubSysInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getAllSubSysInfo(emsId, col, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getInhRteInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getInhRteInfo(emsId, col, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getSvcIpInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getSvcIpInfo(emsId, col, timeout);
        return ret;
    }

    public com.samsung.nms.agent.dataType.ResultInfo getPssInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException
    {
        com.samsung.nms.agent.dataType.ResultInfo ret = impl.getPssInfo(emsId, col, timeout);
        return ret;
    }

}
