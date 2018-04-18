package com.caipiao.lottery.entity.sport.award;

public class RQSPFAward {
	double w;// win
	double d;// draw
	double l;// lost
	int wStatus = 2;// sp状态->1：升，2不变,3下降
	int dStatus = 2;// sp状态->1：升，2不变,3下降
	int lStatus = 2;// sp状态->1：升，2不变,3下降

	public RQSPFAward(double w, double d, double l) {
		setW(w);
		setD(w);
		setL(w);
	}

	public void setW(double w) {
		if (this.w == 0) {
			this.w = w;
		} else if (this.w > w) {
			wStatus = 3;
		} else if (this.w < w) {
			wStatus = 1;
		}
	}

	public void setD(double d) {
		if (this.w == 0) {
			this.d = d;
		} else if (this.d > d) {
			wStatus = 3;
		} else if (this.d < d) {
			wStatus = 1;
		}
	}

	public void setL(double l) {
		if (this.l == 0) {
			this.l = l;
		} else if (this.l > l) {
			wStatus = 3;
		} else if (this.l < l) {
			wStatus = 1;
		}
	}

}
