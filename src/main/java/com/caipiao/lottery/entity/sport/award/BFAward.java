package com.caipiao.lottery.entity.sport.award;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class BFAward extends BaseAward{
	
	public BFAward(JSONArray spfArr) {
		if(spfArr.size()<33) {
			return;
		}
		b10 = getSP(spfArr,0);
		b20 = getSP(spfArr,1);
		b21 = getSP(spfArr,2);
		b30 = getSP(spfArr,3);
		b31 = getSP(spfArr,4);
		b32 = getSP(spfArr,5);
		b40 = getSP(spfArr,6);
		b41 = getSP(spfArr,7);
		b42 = getSP(spfArr,8);
		b43 = getSP(spfArr,9);		
		b50 = getSP(spfArr,10);
		b51 = getSP(spfArr,11);
		b52 = getSP(spfArr,12);
		bw = getSP(spfArr,13);
		
		b00 = getSP(spfArr,14);
		b11 = getSP(spfArr,15);
		b22 = getSP(spfArr,16);
		b33 = getSP(spfArr,17);
		bd = getSP(spfArr,18);
		
		b01 = getSP(spfArr,19);		
		b02 = getSP(spfArr,20);
		b12 = getSP(spfArr,21);
		b03 = getSP(spfArr,22);
		b13 = getSP(spfArr,23);
		b23 = getSP(spfArr,24);
		b04 = getSP(spfArr,25);
		b14 = getSP(spfArr,26);
		b24 = getSP(spfArr,27);
		b34 = getSP(spfArr,28);
		b05 = getSP(spfArr,29);
		b15 = getSP(spfArr,30);
		b25 = getSP(spfArr,31);
		bl = getSP(spfArr,32);
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
