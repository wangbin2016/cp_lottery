package com.caipiao.lottery.entity.sport.award;

import com.alibaba.fastjson.JSONArray;
import lombok.Data;

import static com.caipiao.lottery.entity.sport.award.AwardUtils.getSP;
@Data
public class JQSAward{
	public JQSAward(JSONArray jqsArr) {
		if(jqsArr.size() < 8) {
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
	
	@Override
	public String toString() {
		return AwardUtils.toJsonString(this);
	}
}
