/**
 * OSSConfigBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ConfigService;

public interface OSSConfigBean extends java.rmi.Remote {
    public com.samsung.nms.agent.dataType.ResultInfo getNodeInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getEmsId() throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo setEmsId(int emsId, int id, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getEmsInfo(int emsId, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getSswId(int emsId, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getSysInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getSysInfoFromName(int emsId, java.lang.String sswName, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getEqpHolderInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getCardInfo(int emsId, java.lang.String col, int rackId, int shelfId, int slotid, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getLDUInfo(int emsId, java.lang.String col, int rackId, int shelfId, int slotid, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getMODInfo(int emsId, java.lang.String col, int rackId, int shelfId, int slotid, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getDKUInfo(int emsId, java.lang.String col, int rackId, int shelfId, int slotid, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getPortInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getRouteInfo(int emsId, java.lang.String col, int rteNum, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getDetailRteInfo(int emsId, java.lang.String col, int rteNum, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getMmsRouteInfo(int emsId, java.lang.String col, int rteNum, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getMgwInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getDetailMgwInfo(int emsId, java.lang.String col, int mgwId, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getAsInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getMsInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getOtherSswInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getSgwInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getNsInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getMgcInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getMmsInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getDnsInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getHssInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getNesCode(int emsId, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo setNesCode(int emsId, java.lang.String col, java.lang.String nesCode, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getAllConfiguration(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo activateNode(int emsId, java.lang.String col, java.lang.String node, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo deactivateNode(int emsId, java.lang.String col, java.lang.String node, java.lang.String force, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo initNode(int emsId, java.lang.String col, java.lang.String node, java.lang.String cls, java.lang.String force, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getFANInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getPkgFileInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getAppInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo dumpNCopyPkg(int emsId, java.lang.String col, java.lang.String version, java.lang.String type, java.lang.String file, java.lang.String pkg, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo activateCapsule(int emsId, java.lang.String col, java.lang.String node, java.lang.String caps, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo deactivateCapsule(int emsId, java.lang.String col, java.lang.String node, java.lang.String caps, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo initCapsule(int emsId, java.lang.String col, java.lang.String node, java.lang.String caps, java.lang.String exe, java.lang.String role, java.lang.String type, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getAppsSts(int emsId, java.lang.String col, java.lang.String node, java.lang.String caps, java.lang.String role, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getCmsInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getSmsInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getQmsInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getEnumInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getSlfInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getPdpInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getCscfInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getScscfInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getApuInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getPkgVerInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getAllSubSysInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getInhRteInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getSvcIpInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.ResultInfo getPssInfo(int emsId, java.lang.String col, int timeout) throws java.rmi.RemoteException;
}
