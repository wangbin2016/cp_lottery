package com.caipiao.lottery.entity.sport.award;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class BFAward {
	
	public BFAward(JSONArray spfArr) {
		b10 = spfArr.getDouble(0);
		b20 = spfArr.getDouble(1);
		b21 = spfArr.getDouble(2);
		b30 = spfArr.getDouble(3);
		b31 = spfArr.getDouble(4);
		b32 = spfArr.getDouble(5);
		b40 = spfArr.getDouble(6);
		b41 = spfArr.getDouble(7);
		b42 = spfArr.getDouble(8);
		b43 = spfArr.getDouble(9);		
		b50 = spfArr.getDouble(10);
		b51 = spfArr.getDouble(11);
		b52 = spfArr.getDouble(12);
		bw = spfArr.getDouble(13);
		
		b00 = spfArr.getDouble(14);
		b11 = spfArr.getDouble(15);
		b22 = spfArr.getDouble(16);
		b33 = spfArr.getDouble(17);
		bd = spfArr.getDouble(18);
		
		b01 = spfArr.getDouble(19);		
		b02 = spfArr.getDouble(20);
		b12 = spfArr.getDouble(21);
		b03 = spfArr.getDouble(22);
		b13 = spfArr.getDouble(23);
		b23 = spfArr.getDouble(24);
		b04 = spfArr.getDouble(25);
		b14 = spfArr.getDouble(26);
		b24 = spfArr.getDouble(27);
		b34 = spfArr.getDouble(28);
		b05 = spfArr.getDouble(29);
		b15 = spfArr.getDouble(30);
		b25 = spfArr.getDouble(31);
		bl = spfArr.getDouble(32);
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
