package com.yuerbao.gymms.match.model;

public class MatchQicai {
    private Integer tbId;

    private Integer mpId;

    private Integer qcId;

    private String desc;

    public Integer getTbId() {
        return tbId;
    }

    public void setTbId(Integer tbId) {
        this.tbId = tbId;
    }

    public Integer getMpId() {
        return mpId;
    }

    public void setMpId(Integer mpId) {
        this.mpId = mpId;
    }

    public Integer getQcId() {
        return qcId;
    }

    public void setQcId(Integer qcId) {
        this.qcId = qcId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}