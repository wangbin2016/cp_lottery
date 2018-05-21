package com.caipiao.lottery.entity.sport.vo;

import java.util.Date;

import lombok.Data;

@Data
public class SportFootballMatchAwardSearch {	
	//比赛时间
	private String intTime;
	//对阵id
	private String lineId;
	//比赛状态1:在售，2:停售，3:取消,4已完结,5已派奖
	private int status;
	//大于当等于当前Intime;
	private String greaterIntime;
	//比赛时间
	private Date matchTime;
	
}
