package com.caipiao.lottery.entity.sport.award;

import com.alibaba.fastjson.JSONArray;

import lombok.Data;

import static com.caipiao.lottery.entity.sport.award.AwardUtils.getSP;

@Data
public class BFAward{
	
	public BFAward() {}
	
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
	private double b10;
	private double b20;
	private double b21;
	private double b30;
	private double b31;
	private double b32;
	private double b40;
	private double b41;
	private double b42;
	private double b43;
	private double b50;
	private double b51;
	private double b52;
	private double bw;//胜其它
	
	private double b00;
	private double b11;
	private double b22;
	private double b33;
	private double bd;//平其它
	
	private double b01;
	private double b02;
	private double b12;
	private double b03;
	private double b13;
	private double b23;
	private double b04;
	private double b14;
	private double b24;
	private double b34;
	private double b05;
	private double b15;
	private double b25;
	private double bl;//负其它
	
	@Override
	public String toString() {
		return AwardUtils.toJsonString(this);
	}
}
