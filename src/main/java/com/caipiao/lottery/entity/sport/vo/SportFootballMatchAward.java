package com.caipiao.lottery.entity.sport.vo;

import com.caipiao.lottery.entity.sport.SportFootballAward;
import com.caipiao.lottery.entity.sport.SportFootballMatch;
import com.caipiao.lottery.entity.sport.SportLeagueInfo;


public class SportFootballMatchAward extends SportFootballMatch{
	private SportFootballAward award;
	private SportLeagueInfo leagueInfo;

	public SportFootballAward getAward() {
		return award;
	}

	public void setAward(SportFootballAward award) {
		this.award = award;
	}

	public SportLeagueInfo getLeagueInfo() {
		return leagueInfo;
	}

	public void setLeagueInfo(SportLeagueInfo leagueInfo) {
		this.leagueInfo = leagueInfo;
	}
}
