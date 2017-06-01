package com.yuerbao.gymms.match.model;

public class MatchChangdi {
    private Integer tbId;

    private Integer mpId;

    private Integer cdId;

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

    public Integer getCdId() {
        return cdId;
    }

    public void setCdId(Integer cdId) {
        this.cdId = cdId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}