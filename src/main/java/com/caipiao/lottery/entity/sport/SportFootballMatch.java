package com.caipiao.lottery.entity.sport;

import java.util.Date;

public class SportFootballMatch {
    private Integer id;

    private String homeTeam;

    private String color;

    private String guestTeam;

    private Date matchTime;

    private String inttime;

    private String lineId;

    private Integer status;

    private Integer homeScore;

    private Integer guestScore;

    private Integer conncede;

    private String homeGroup;

    private String guestGroup;

    private Date createTime;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
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

    public String getInttime() {
        return inttime;
    }

    public void setInttime(String inttime) {
        this.inttime = inttime == null ? null : inttime.trim();
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
}