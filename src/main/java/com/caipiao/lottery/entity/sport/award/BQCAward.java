package com.caipiao.lottery.entity.sport.award;

import com.alibaba.fastjson.JSONArray;

public class BQCAward extends BaseAward{
	public BQCAward(JSONArray bqcArr) {
		if(bqcArr.size() < 9) {
			return;
		}
		ww = getSP(bqcArr,0);
		dw = getSP(bqcArr,1);
		lw = getSP(bqcArr,2);
		
		wd = getSP(bqcArr,3);
		dd = getSP(bqcArr,4);
		ld = getSP(bqcArr,5);
		
		wl = getSP(bqcArr,6);
		dl = getSP(bqcArr,7);
		ll = getSP(bqcArr,8);
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
