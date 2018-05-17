package com.caipiao.lottery.entity.sport.award;

import com.alibaba.fastjson.JSONArray;

public class BQCAward {
	public BQCAward(JSONArray bqcArr) {
		ww = bqcArr.getDouble(0).doubleValue();
		dw = bqcArr.getDouble(1).doubleValue();
		lw = bqcArr.getDouble(2).doubleValue();
		
		wd = bqcArr.getDouble(3).doubleValue();
		dd = bqcArr.getDouble(4).doubleValue();
		ld = bqcArr.getDouble(5).doubleValue();
		
		wl = bqcArr.getDouble(6).doubleValue();
		dl = bqcArr.getDouble(7).doubleValue();
		ll = bqcArr.getDouble(8).doubleValue();
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
