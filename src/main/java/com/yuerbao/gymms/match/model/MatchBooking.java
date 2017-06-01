package com.yuerbao.gymms.match.model;

import java.util.Date;

public class MatchBooking {
    private Integer bkId;

    private Integer userId;

    private String matchName;

    private String matchDesc;

    private String qcDesc;

    private String cdDesc;

    private String timeDesc;

    private String contactName1;

    private String contactPhone1;

    private String contactName2;

    private String contactPhone2;

    private Integer status;

    private Date createTime;

    public MatchBooking() {
    }

    public MatchBooking(Integer bkId, Integer userId, String matchName, String matchDesc, String qcDesc, String cdDesc, String timeDesc, String contactName1, String contactPhone1, String contactName2, String contactPhone2, Integer status, Date createTime) {
        this.bkId = bkId;
        this.userId = userId;
        this.matchName = matchName;
        this.matchDesc = matchDesc;
        this.qcDesc = qcDesc;
        this.cdDesc = cdDesc;
        this.timeDesc = timeDesc;
        this.contactName1 = contactName1;
        this.contactPhone1 = contactPhone1;
        this.contactName2 = contactName2;
        this.contactPhone2 = contactPhone2;
        this.status = status;
        this.createTime = createTime;
    }

    public Integer getBkId() {
        return bkId;
    }

    public void setBkId(Integer bkId) {
        this.bkId = bkId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getMatchName() {
        return matchName;
    }

    public void setMatchName(String matchName) {
        this.matchName = matchName == null ? null : matchName.trim();
    }

    public String getMatchDesc() {
        return matchDesc;
    }

    public void setMatchDesc(String matchDesc) {
        this.matchDesc = matchDesc == null ? null : matchDesc.trim();
    }

    public String getQcDesc() {
        return qcDesc;
    }

    public void setQcDesc(String qcDesc) {
        this.qcDesc = qcDesc == null ? null : qcDesc.trim();
    }

    public String getCdDesc() {
        return cdDesc;
    }

    public void setCdDesc(String cdDesc) {
        this.cdDesc = cdDesc == null ? null : cdDesc.trim();
    }

    public String getTimeDesc() {
        return timeDesc;
    }

    public void setTimeDesc(String timeDesc) {
        this.timeDesc = timeDesc == null ? null : timeDesc.trim();
    }

    public String getContactName1() {
        return contactName1;
    }

    public void setContactName1(String contactName1) {
        this.contactName1 = contactName1 == null ? null : contactName1.trim();
    }

    public String getContactPhone1() {
        return contactPhone1;
    }

    public void setContactPhone1(String contactPhone1) {
        this.contactPhone1 = contactPhone1 == null ? null : contactPhone1.trim();
    }

    public String getContactName2() {
        return contactName2;
    }

    public void setContactName2(String contactName2) {
        this.contactName2 = contactName2 == null ? null : contactName2.trim();
    }

    public String getContactPhone2() {
        return contactPhone2;
    }

    public void setContactPhone2(String contactPhone2) {
        this.contactPhone2 = contactPhone2 == null ? null : contactPhone2.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}