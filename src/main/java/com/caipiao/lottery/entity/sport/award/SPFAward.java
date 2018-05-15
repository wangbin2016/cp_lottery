package com.caipiao.lottery.entity.sport.award;

import com.alibaba.fastjson.JSONArray;

public class SPFAward extends RQSPFAward{

	public SPFAward(double w, double d, double l) {
		super(w, d, l);
	}
	
	public SPFAward(JSONArray arr) {
		super(arr);
	}
}
