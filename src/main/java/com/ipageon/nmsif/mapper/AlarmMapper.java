package com.ipageon.nmsif.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.ipageon.nmsif.data.AlarmVO;

@Mapper
public interface AlarmMapper {
	public List<AlarmVO> getAlarmInfo();
}
