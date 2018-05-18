package com.caipiao.lottery.entity.sport.award;

import com.alibaba.fastjson.JSONArray;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class BaseAward {
	protected double getSP(JSONArray spArr,int index) {
		Double value = spArr.getDouble(index);
		if(value == null) {
			value = 0.0;
			log.info("sp 值为空：：："+spArr.toJSONString());
		}
		return value.doubleValue();
	}
}
