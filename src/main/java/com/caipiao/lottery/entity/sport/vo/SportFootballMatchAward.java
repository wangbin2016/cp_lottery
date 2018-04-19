package com.caipiao.lottery.entity.sport.vo;

import com.caipiao.lottery.entity.sport.SportFootballAward;
import com.caipiao.lottery.entity.sport.SportFootballMatch;


public class SportFootballMatchAward extends SportFootballMatch {
	private SportFootballAward award;

	public SportFootballAward getAward() {
		return award;
	}

	public void setAward(SportFootballAward award) {
		this.award = award;
	}
}
