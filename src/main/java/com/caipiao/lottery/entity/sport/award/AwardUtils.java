package com.caipiao.lottery.entity.sport.award;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@Data
public class AwardUtils {
	public static double getSP(JSONArray spArr,int index) {
		Double value = spArr.getDouble(index);
		if(value == null) {
			value = 0.0;
			log.info("sp 值为空：：："+spArr.toJSONString());
		}
		return value.doubleValue();
	}
	
	public static String toJsonString(Object obj) { 
		return JSON.toJSONString(obj);
	}
}
