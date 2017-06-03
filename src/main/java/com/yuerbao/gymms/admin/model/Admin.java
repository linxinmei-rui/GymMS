package com.yuerbao.gymms.admin.model;

/**
 * Created by lhp_mac on 2017/6/3.
 */
public class Admin {

    private int aId;
    private String  aName;
    private String aPassword;

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaPassword() {
        return aPassword;
    }

    public void setaPassword(String aPassword) {
        this.aPassword = aPassword;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "aId=" + aId +
                ", aName='" + aName + '\'' +
                ", aPassword='" + aPassword + '\'' +
                '}';
    }
}
