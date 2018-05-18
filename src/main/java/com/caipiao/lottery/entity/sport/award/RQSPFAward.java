package com.caipiao.lottery.entity.sport.award;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;

public class RQSPFAward extends BaseAward{
	double w;// win
	double d;// draw
	double l;// lost
	@JSONField(name="w_s")
	int wStatus = 2;// sp状态->3：升，2不变,1下降
	@JSONField(name="d_s")
	int dStatus = 2;// sp状态->3：升，2不变,1下降
	@JSONField(name="l_s")
	int lStatus = 2;// sp状态->3：升，2不变,1下降

	public RQSPFAward(double w, double d, double l) {
		setW(w);
		setD(d);
		setL(l);
	}
	
	public RQSPFAward(JSONArray arr) {
		if(arr.size()<3) {
			return;
		}
		setW(getSP(arr,0));
		setD(getSP(arr,1));
		setL(getSP(arr,2));
	}

	public void setW(double w) {
		if (this.w > w) {
			wStatus = 1;
		} else if (this.w < w) {
			wStatus = 3;
		}
		this.w = w;
	}

	public void setD(double d) {
		if (this.d > d) {
			dStatus = 1;
		} else if (this.d < d) {
			dStatus = 3;
		}
		this.d = d;
	}

	public void setL(double l) {
		if (this.l > l) {
			lStatus = 1;			
		} else if (this.l < l) {
			lStatus = 3;
		}
	}

	@Override
	public String toString() {
		return JSONObject.toJSONString(this);
	}
}
