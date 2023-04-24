package com.ipageon.nmsif.service;

import java.rmi.RemoteException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ipageon.nmsif.data.AlarmVO;
import com.ipageon.nmsif.dataFnc.GetAlarmHistory;
import com.samsung.nms.agent.dataType.ResultInfo;

//@Service
public interface EmsService {
    void alarmEvent(String payload) throws Exception;
    void statusEvent(String payload) throws Exception;
    AlarmVO getAlarm() throws Exception;
    public ResultInfo getAlarmHistory(GetAlarmHistory payload) throws RemoteException;
}
