package com.yuerbao.gymms.ground.model;

import java.io.Serializable;

/**
 * Created by lhp_mac on 2017/6/1.
 */
public class Ground implements Serializable {
    private int gId; //   id
    private String gName; // 场地名称
    private int gFee; // 租借费用
    private int gStatus; //   0代表空闲 可以被租借 1代表被租借
    private String gRemark; // 场地描述

    public int getgId() {
        return gId;
    }

    public void setgId(int gId) {
        this.gId = gId;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public int getgFee() {
        return gFee;
    }

    public void setgFee(int gFee) {
        this.gFee = gFee;
    }

    public int getgStatus() {
        return gStatus;
    }

    public void setgStatus(int gStatus) {
        this.gStatus = gStatus;
    }

    public String getgRemark() {
        return gRemark;
    }

    public void setgRemark(String gRemark) {
        this.gRemark = gRemark;
    }

    @Override
    public String toString() {
        return "Ground{" +
                "gId=" + gId +
                ", gName='" + gName + '\'' +
                ", gFee=" + gFee +
                ", gStatus=" + gStatus +
                ", gRemark='" + gRemark + '\'' +
                '}';
    }
}
