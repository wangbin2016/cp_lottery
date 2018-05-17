package com.caipiao.lottery.entity.sport.award;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class BFAward {
	
	public BFAward(JSONArray spfArr) {
		b10 = spfArr.getDouble(0).doubleValue();
		b20 = spfArr.getDouble(1).doubleValue();
		b21 = spfArr.getDouble(2).doubleValue();
		b30 = spfArr.getDouble(3).doubleValue();
		b31 = spfArr.getDouble(4).doubleValue();
		b32 = spfArr.getDouble(5).doubleValue();
		b40 = spfArr.getDouble(6).doubleValue();
		b41 = spfArr.getDouble(7).doubleValue();
		b42 = spfArr.getDouble(8).doubleValue();
		b43 = spfArr.getDouble(9).doubleValue();		
		b50 = spfArr.getDouble(10).doubleValue();
		b51 = spfArr.getDouble(11).doubleValue();
		b52 = spfArr.getDouble(12).doubleValue();
		bw = spfArr.getDouble(13).doubleValue();
		
		b00 = spfArr.getDouble(14).doubleValue();
		b11 = spfArr.getDouble(15).doubleValue();
		b22 = spfArr.getDouble(16).doubleValue();
		b33 = spfArr.getDouble(17).doubleValue();
		bd = spfArr.getDouble(18).doubleValue();
		
		b01 = spfArr.getDouble(19).doubleValue();		
		b02 = spfArr.getDouble(20).doubleValue();
		b12 = spfArr.getDouble(21).doubleValue();
		b03 = spfArr.getDouble(22).doubleValue();
		b13 = spfArr.getDouble(23).doubleValue();
		b23 = spfArr.getDouble(24).doubleValue();
		b04 = spfArr.getDouble(25).doubleValue();
		b14 = spfArr.getDouble(26).doubleValue();
		b24 = spfArr.getDouble(27).doubleValue();
		b34 = spfArr.getDouble(28).doubleValue();
		b05 = spfArr.getDouble(29).doubleValue();
		b15 = spfArr.getDouble(30).doubleValue();
		b25 = spfArr.getDouble(31).doubleValue();
		bl = spfArr.getDouble(32).doubleValue();
	}
	double b10;
	double b20;
	double b21;
	double b30;
	double b31;
	double b32;
	double b40;
	double b41;
	double b42;
	double b43;
	double b50;
	double b51;
	double b52;
	double bw;//胜其它
	
	double b00;
	double b11;
	double b22;
	double b33;
	double bd;//平其它
	
	double b01;
	double b02;
	double b12;
	double b03;
	double b13;
	double b23;
	double b04;
	double b14;
	double b24;
	double b34;
	double b05;
	double b15;
	double b25;
	double bl;//负其它
	
	@Override
	public String toString() {
		return JSONObject.toJSONString(this);
	}
}
