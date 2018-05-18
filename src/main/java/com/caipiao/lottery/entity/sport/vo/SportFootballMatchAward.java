package com.caipiao.lottery.entity.sport.vo;

import com.caipiao.lottery.entity.sport.SportFootballAward;
import com.caipiao.lottery.entity.sport.SportFootballMatch;
import com.caipiao.lottery.entity.sport.SportLeagueInfo;

public class SportFootballMatchAward extends SportFootballMatch {
	private SportFootballAward sportFootballAward;

	private SportLeagueInfo sportLeagueInfo;
	
	public SportFootballAward getSportFootballAward() {
		return sportFootballAward;
	}

	public void setSportFootballAward(SportFootballAward sportFootballAward) {
		this.sportFootballAward = sportFootballAward;
	}

	public SportLeagueInfo getSportLeagueInfo() {
		return sportLeagueInfo;
	}

	public void setSportLeagueInfo(SportLeagueInfo sportLeagueInfo) {
		this.sportLeagueInfo = sportLeagueInfo;
	}

	@Override
	public String toString() {
		return "SportFootballMatchAward [sportFootballAward=" + sportFootballAward + ", sportLeagueInfo="
				+ sportLeagueInfo + "]"+super.toString();
	}
	

}
