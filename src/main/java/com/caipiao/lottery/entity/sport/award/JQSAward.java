package com.caipiao.lottery.entity.sport.award;

import com.alibaba.fastjson.JSONArray;

public class JQSAward extends BaseAward{
	public JQSAward(JSONArray jqsArr) {
		if(jqsArr.size() < 9) {
			return;
		}
		
		j0 = getSP(jqsArr,0);
		j1 = getSP(jqsArr,1);
		j2 = getSP(jqsArr,3);
		j3 = getSP(jqsArr,4);
		j4 = getSP(jqsArr,5);
		j5 = getSP(jqsArr,6);
		j6 = getSP(jqsArr,7);
		j7 = getSP(jqsArr,8);
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
