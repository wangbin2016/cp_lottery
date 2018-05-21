package com.caipiao.lottery.entity.sport.vo;

import com.caipiao.lottery.entity.sport.SportFootballAward;
import com.caipiao.lottery.entity.sport.SportFootballMatch;
import com.caipiao.lottery.entity.sport.SportLeagueInfo;

public class SportFootballMatchAward extends SportFootballMatch {
	
	
	
	
	private static final long serialVersionUID = 1L;

	private SportFootballAward sportFootballAward;

	private SportLeagueInfo sportLeagueInfo;
	
	public SportFootballMatchAward() {
		
	}
	
	public SportFootballMatchAward(SportFootballMatch match) {
		this.setId(match.getId());
		this.setHomeTeam(match.getHomeTeam());
		this.setLeagueInfoId(match.getLeagueInfoId());
		this.setGuestTeam(match.getGuestTeam());  
		this.setMatchTime(match.getMatchTime());
		this.setIntTime(match.getIntTime());
		this.setLineId(match.getLineId());
		this.setStatus(match.getStatus());
		this.setHomeScore(match.getHomeScore());
		this.setGuestScore(match.getGuestScore());
		this.setConncede(match.getConncede());
		this.setHomeGroup(match.getHomeGroup());
		this.setGuestGroup(match.getGuestGroup());		
		this.setCreateDate(match.getCreateDate());
		this.setDrawSupport(match.getDrawSupport());		
		this.setGuestSupport(match.getGuestSupport());	
		this.setHomeSupport(match.getHomeSupport());		
	}
	
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
