package com.caipiao.lottery.entity.sport.award;

import com.alibaba.fastjson.JSONArray;

public class JQSAward {
	public JQSAward(JSONArray jqsArr) {
		j0 = jqsArr.getDouble(0);
		j1 = jqsArr.getDouble(1);
		j2 = jqsArr.getDouble(3);
		j3 = jqsArr.getDouble(4);
		j4 = jqsArr.getDouble(5);
		j5 = jqsArr.getDouble(6);
		j6 = jqsArr.getDouble(7);
		j7 = jqsArr.getDouble(8);
	}
	double j0;
	double j1;
	double j2;
	double j3;
	double j4;
	double j5;
	double j6;
	double j7;
}
