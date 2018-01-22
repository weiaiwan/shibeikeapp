package com.gbicc.shibeikeapp.entity;

import java.util.Date;

public class sysXuanChuan {
    private String xcId;

    private String xcImgUrl;

    private String xcName;

    private Date xcDate;

    private String xcNeirong;

    public String getXcId() {
        return xcId;
    }

    public void setXcId(String xcId) {
        this.xcId = xcId == null ? null : xcId.trim();
    }

    public String getXcImgUrl() {
        return xcImgUrl;
    }

    public void setXcImgUrl(String xcImgUrl) {
        this.xcImgUrl = xcImgUrl == null ? null : xcImgUrl.trim();
    }

    public String getXcName() {
        return xcName;
    }

    public void setXcName(String xcName) {
        this.xcName = xcName == null ? null : xcName.trim();
    }

    public Date getXcDate() {
        return xcDate;
    }

    public void setXcDate(Date xcDate) {
        this.xcDate = xcDate;
    }

    public String getXcNeirong() {
        return xcNeirong;
    }

    public void setXcNeirong(String xcNeirong) {
        this.xcNeirong = xcNeirong == null ? null : xcNeirong.trim();
    }
}