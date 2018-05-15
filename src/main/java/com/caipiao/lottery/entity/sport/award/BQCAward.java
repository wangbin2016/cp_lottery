package com.caipiao.lottery.entity.sport.award;

import com.alibaba.fastjson.JSONArray;

public class BQCAward {
	public BQCAward(JSONArray bqcArr) {
		ww = bqcArr.getDouble(0);
		dw = bqcArr.getDouble(1);
		lw = bqcArr.getDouble(2);
		
		wd = bqcArr.getDouble(3);
		dd = bqcArr.getDouble(4);
		ld = bqcArr.getDouble(5);
		
		wl = bqcArr.getDouble(6);
		dl = bqcArr.getDouble(7);
		ll = bqcArr.getDouble(8);
	}
	double ww;//win win
	double dw;//draw win;
	double lw;//lost win;
	
	double wd;//win draw
	double dd;//draw draw
	double ld;//lost draw;
	
	double wl;//win lost
	double dl;//draw lost
	double ll;//lost lost
	
	
}
