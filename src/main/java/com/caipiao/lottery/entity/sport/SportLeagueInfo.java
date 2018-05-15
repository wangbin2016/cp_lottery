package com.caipiao.lottery.entity.sport;

/**
 * 竞彩足球联盟
 * @author WangBin
 *
 */
public class SportLeagueInfo {
    private Integer id;

    private String name;

    private String shortName;

    private String color;

    private String picUrl;

    private String dcName;

    private String jcName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public String getDcName() {
        return dcName;
    }

    public void setDcName(String dcName) {
        this.dcName = dcName == null ? null : dcName.trim();
    }

    public String getJcName() {
        return jcName;
    }

    public void setJcName(String jcName) {
        this.jcName = jcName == null ? null : jcName.trim();
    }

	@Override
	public String toString() {
		return "SportLeagueInfo [id=" + id + ", name=" + name + ", shortName=" + shortName + ", color=" + color
				+ ", picUrl=" + picUrl + ", dcName=" + dcName + ", jcName=" + jcName + "]";
	}
}