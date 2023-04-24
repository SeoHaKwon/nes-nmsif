package com.ipageon.nmsif.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.ipageon.nmsif.data.AlarmVO;
import com.ipageon.nmsif.dataFnc.*;
import com.samsung.nms.agent.dataType.AlarmHistoryInfo;

@Mapper
public interface AlarmMapper {
	public AlarmVO getAlarmInfo();
	public AlarmHistoryInfo getAlarmHistory(GetAlarmHistory history);
}
