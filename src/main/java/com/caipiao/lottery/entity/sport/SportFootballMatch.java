package com.caipiao.lottery.entity.sport;

import java.io.Serializable;
import java.util.Date;

public class SportFootballMatch implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String homeTeam;

    private Integer leagueInfoId;

    private String guestTeam;

    private Date matchTime;

    private String intTime;

    private String lineId;

    private Integer status;

    private Integer homeScore;

    private Integer guestScore;

    private Integer conncede;

    private String homeGroup;

    private String guestGroup;

    private Date createTime;

    private String homeSupport;

    private String drawSupport;

    private String guestSupport;

    private Date createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam == null ? null : homeTeam.trim();
    }

    public Integer getLeagueInfoId() {
        return leagueInfoId;
    }

    public void setLeagueInfoId(Integer leagueInfoId) {
        this.leagueInfoId = leagueInfoId;
    }

    public String getGuestTeam() {
        return guestTeam;
    }

    public void setGuestTeam(String guestTeam) {
        this.guestTeam = guestTeam == null ? null : guestTeam.trim();
    }

    public Date getMatchTime() {
        return matchTime;
    }

    public void setMatchTime(Date matchTime) {
        this.matchTime = matchTime;
    }
    
    public String getIntTime() {
		return intTime;
	}

	public void setIntTime(String intTime) {
		this.intTime = intTime;
	}

	public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId == null ? null : lineId.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(Integer homeScore) {
        this.homeScore = homeScore;
    }

    public Integer getGuestScore() {
        return guestScore;
    }

    public void setGuestScore(Integer guestScore) {
        this.guestScore = guestScore;
    }

    public Integer getConncede() {
        return conncede;
    }

    public void setConncede(Integer conncede) {
        this.conncede = conncede;
    }

    public String getHomeGroup() {
        return homeGroup;
    }

    public void setHomeGroup(String homeGroup) {
        this.homeGroup = homeGroup == null ? null : homeGroup.trim();
    }

    public String getGuestGroup() {
        return guestGroup;
    }

    public void setGuestGroup(String guestGroup) {
        this.guestGroup = guestGroup == null ? null : guestGroup.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getHomeSupport() {
        return homeSupport;
    }

    public void setHomeSupport(String homeSupport) {
        this.homeSupport = homeSupport == null ? null : homeSupport.trim();
    }

    public String getDrawSupport() {
        return drawSupport;
    }

    public void setDrawSupport(String drawSupport) {
        this.drawSupport = drawSupport == null ? null : drawSupport.trim();
    }

    public String getGuestSupport() {
        return guestSupport;
    }

    public void setGuestSupport(String guestSupport) {
        this.guestSupport = guestSupport == null ? null : guestSupport.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

	@Override
	public String toString() {
		return "SportFootballMatch [id=" + id + ", homeTeam=" + homeTeam + ", leagueInfoId=" + leagueInfoId
				+ ", guestTeam=" + guestTeam + ", matchTime=" + matchTime + ", intTime=" + intTime + ", lineId="
				+ lineId + ", status=" + status + ", homeScore=" + homeScore + ", guestScore=" + guestScore
				+ ", conncede=" + conncede + ", homeGroup=" + homeGroup + ", guestGroup=" + guestGroup + ", createTime="
				+ createTime + ", homeSupport=" + homeSupport + ", drawSupport=" + drawSupport + ", guestSupport="
				+ guestSupport + ", createDate=" + createDate + "]";
	}
}