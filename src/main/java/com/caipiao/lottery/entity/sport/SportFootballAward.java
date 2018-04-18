package com.caipiao.lottery.entity.sport;

import java.util.Date;

public class SportFootballAward {
    private Integer id;

    private Integer intTime;

    private Integer lineId;

    private String dgAward;

    private String bfAward;

    private String bqcAward;

    private String jqsAward;

    private String rqspfAward;

    private String spfAward;

    private String bfStatus;

    private String bqcStatus;

    private String jqsStatus;

    private String rqspfStatus;

    private String spfStatus;

    private String dgStatus;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIntTime() {
        return intTime;
    }

    public void setIntTime(Integer intTime) {
        this.intTime = intTime;
    }

    public Integer getLineId() {
        return lineId;
    }

    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    public String getDgAward() {
        return dgAward;
    }

    public void setDgAward(String dgAward) {
        this.dgAward = dgAward == null ? null : dgAward.trim();
    }

    public String getBfAward() {
        return bfAward;
    }

    public void setBfAward(String bfAward) {
        this.bfAward = bfAward == null ? null : bfAward.trim();
    }

    public String getBqcAward() {
        return bqcAward;
    }

    public void setBqcAward(String bqcAward) {
        this.bqcAward = bqcAward == null ? null : bqcAward.trim();
    }

    public String getJqsAward() {
        return jqsAward;
    }

    public void setJqsAward(String jqsAward) {
        this.jqsAward = jqsAward == null ? null : jqsAward.trim();
    }

    public String getRqspfAward() {
        return rqspfAward;
    }

    public void setRqspfAward(String rqspfAward) {
        this.rqspfAward = rqspfAward == null ? null : rqspfAward.trim();
    }

    public String getSpfAward() {
        return spfAward;
    }

    public void setSpfAward(String spfAward) {
        this.spfAward = spfAward == null ? null : spfAward.trim();
    }

    public String getBfStatus() {
        return bfStatus;
    }

    public void setBfStatus(String bfStatus) {
        this.bfStatus = bfStatus == null ? null : bfStatus.trim();
    }

    public String getBqcStatus() {
        return bqcStatus;
    }

    public void setBqcStatus(String bqcStatus) {
        this.bqcStatus = bqcStatus == null ? null : bqcStatus.trim();
    }

    public String getJqsStatus() {
        return jqsStatus;
    }

    public void setJqsStatus(String jqsStatus) {
        this.jqsStatus = jqsStatus == null ? null : jqsStatus.trim();
    }

    public String getRqspfStatus() {
        return rqspfStatus;
    }

    public void setRqspfStatus(String rqspfStatus) {
        this.rqspfStatus = rqspfStatus == null ? null : rqspfStatus.trim();
    }

    public String getSpfStatus() {
        return spfStatus;
    }

    public void setSpfStatus(String spfStatus) {
        this.spfStatus = spfStatus == null ? null : spfStatus.trim();
    }

    public String getDgStatus() {
        return dgStatus;
    }

    public void setDgStatus(String dgStatus) {
        this.dgStatus = dgStatus == null ? null : dgStatus.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}