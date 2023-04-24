/**
 * OSSConfigBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipageon.nmsif.ConfigService;

import com.samsung.nms.agent.dataType.ResultInfo;
import java.rmi.RemoteException;

public interface OSSConfigBean extends java.rmi.Remote {
    public ResultInfo getNodeInfo(int emsId, java.lang.String col, int timeout) throws RemoteException;
    public ResultInfo getEmsId() throws RemoteException;
    public ResultInfo setEmsId(int emsId, int id, int timeout) throws RemoteException;
    public ResultInfo getEmsInfo(int emsId, int timeout) throws RemoteException;
    public ResultInfo getSswId(int emsId, int timeout) throws RemoteException;
    public ResultInfo getSysInfo(int emsId, java.lang.String col, int timeout) throws RemoteException;
    public ResultInfo getSysInfoFromName(int emsId, java.lang.String sswName, int timeout) throws RemoteException;
    public ResultInfo getEqpHolderInfo(int emsId, java.lang.String col, int timeout) throws RemoteException;
    public ResultInfo getCardInfo(int emsId, java.lang.String col, int rackId, int shelfId, int slotid, int timeout) throws RemoteException;
    public ResultInfo getLDUInfo(int emsId, java.lang.String col, int rackId, int shelfId, int slotid, int timeout) throws RemoteException;
    public ResultInfo getMODInfo(int emsId, java.lang.String col, int rackId, int shelfId, int slotid, int timeout) throws RemoteException;
    public ResultInfo getDKUInfo(int emsId, java.lang.String col, int rackId, int shelfId, int slotid, int timeout) throws RemoteException;
    public ResultInfo getPortInfo(int emsId, java.lang.String col, int timeout) throws RemoteException;
    public ResultInfo getRouteInfo(int emsId, java.lang.String col, int rteNum, int timeout) throws RemoteException;
    public ResultInfo getDetailRteInfo(int emsId, java.lang.String col, int rteNum, int timeout) throws RemoteException;
    public ResultInfo getMmsRouteInfo(int emsId, java.lang.String col, int rteNum, int timeout) throws RemoteException;
    public ResultInfo getMgwInfo(int emsId, java.lang.String col, int timeout) throws RemoteException;
    public ResultInfo getDetailMgwInfo(int emsId, java.lang.String col, int mgwId, int timeout) throws RemoteException;
    public ResultInfo getAsInfo(int emsId, java.lang.String col, int timeout) throws RemoteException;
    public ResultInfo getMsInfo(int emsId, java.lang.String col, int timeout) throws RemoteException;
    public ResultInfo getOtherSswInfo(int emsId, java.lang.String col, int timeout) throws RemoteException;
    public ResultInfo getSgwInfo(int emsId, java.lang.String col, int timeout) throws RemoteException;
    public ResultInfo getNsInfo(int emsId, java.lang.String col, int timeout) throws RemoteException;
    public ResultInfo getMgcInfo(int emsId, java.lang.String col, int timeout) throws RemoteException;
    public ResultInfo getMmsInfo(int emsId, java.lang.String col, int timeout) throws RemoteException;
    public ResultInfo getDnsInfo(int emsId, java.lang.String col, int timeout) throws RemoteException;
    public ResultInfo getHssInfo(int emsId, java.lang.String col, int timeout) throws RemoteException;
    public ResultInfo getNesCode(int emsId, int timeout) throws RemoteException;
    public ResultInfo setNesCode(int emsId, java.lang.String col, java.lang.String nesCode, int timeout) throws RemoteException;
    public ResultInfo getAllConfiguration(int emsId, java.lang.String col, int timeout) throws RemoteException;
    public ResultInfo activateNode(int emsId, java.lang.String col, java.lang.String node, int timeout) throws RemoteException;
    public ResultInfo deactivateNode(int emsId, java.lang.String col, java.lang.String node, java.lang.String force, int timeout) throws RemoteException;
    public ResultInfo initNode(int emsId, java.lang.String col, java.lang.String node, java.lang.String cls, java.lang.String force, int timeout) throws RemoteException;
    public ResultInfo getFANInfo(int emsId, java.lang.String col, int timeout) throws RemoteException;
    public ResultInfo getPkgFileInfo(int emsId, java.lang.String col, int timeout) throws RemoteException;
    public ResultInfo getAppInfo(int emsId, java.lang.String col, int timeout) throws RemoteException;
    public ResultInfo dumpNCopyPkg(int emsId, java.lang.String col, java.lang.String version, java.lang.String type, java.lang.String file, java.lang.String pkg, int timeout) throws RemoteException;
    public ResultInfo activateCapsule(int emsId, java.lang.String col, java.lang.String node, java.lang.String caps, int timeout) throws RemoteException;
    public ResultInfo deactivateCapsule(int emsId, java.lang.String col, java.lang.String node, java.lang.String caps, int timeout) throws RemoteException;
    public ResultInfo initCapsule(int emsId, java.lang.String col, java.lang.String node, java.lang.String caps, java.lang.String exe, java.lang.String role, java.lang.String type, int timeout) throws RemoteException;
    public ResultInfo getAppsSts(int emsId, java.lang.String col, java.lang.String node, java.lang.String caps, java.lang.String role, int timeout) throws RemoteException;
    public ResultInfo getCmsInfo(int emsId, java.lang.String col, int timeout) throws RemoteException;
    public ResultInfo getSmsInfo(int emsId, java.lang.String col, int timeout) throws RemoteException;
    public ResultInfo getQmsInfo(int emsId, java.lang.String col, int timeout) throws RemoteException;
    public ResultInfo getEnumInfo(int emsId, java.lang.String col, int timeout) throws RemoteException;
    public ResultInfo getSlfInfo(int emsId, java.lang.String col, int timeout) throws RemoteException;
    public ResultInfo getPdpInfo(int emsId, java.lang.String col, int timeout) throws RemoteException;
    public ResultInfo getCscfInfo(int emsId, java.lang.String col, int timeout) throws RemoteException;
    public ResultInfo getScscfInfo(int emsId, java.lang.String col, int timeout) throws RemoteException;
    public ResultInfo getApuInfo(int emsId, java.lang.String col, int timeout) throws RemoteException;
    public ResultInfo getPkgVerInfo(int emsId, java.lang.String col, int timeout) throws RemoteException;
    public ResultInfo getAllSubSysInfo(int emsId, java.lang.String col, int timeout) throws RemoteException;
    public ResultInfo getInhRteInfo(int emsId, java.lang.String col, int timeout) throws RemoteException;
    public ResultInfo getSvcIpInfo(int emsId, java.lang.String col, int timeout) throws RemoteException;
    public ResultInfo getPssInfo(int emsId, java.lang.String col, int timeout) throws RemoteException;
}
