package com.ipageon.nmsif.data;

import java.sql.Date;

import lombok.Data;

@Data
public class AlarmVO {
	private String SEQ;
	private Date STIME;
	private float PC;
	private float SPC;
	private float SEVERITY;
	private Integer KEY;
	private String VALUE;
	private float TH_VALUE;
	private String INFO;
}
