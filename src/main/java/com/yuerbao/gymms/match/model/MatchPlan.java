package com.yuerbao.gymms.match.model;

import java.util.Date;

public class MatchPlan {
    private Integer mpId;

    private Integer managerId;

    private Date timeOn;

    private Date timeOff;

    private Integer rent;

    private String desc;

    private Integer status;

    public Integer getMpId() {
        return mpId;
    }

    public void setMpId(Integer mpId) {
        this.mpId = mpId;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Date getTimeOn() {
        return timeOn;
    }

    public void setTimeOn(Date timeOn) {
        this.timeOn = timeOn;
    }

    public Date getTimeOff() {
        return timeOff;
    }

    public void setTimeOff(Date timeOff) {
        this.timeOff = timeOff;
    }

    public Integer getRent() {
        return rent;
    }

    public void setRent(Integer rent) {
        this.rent = rent;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}