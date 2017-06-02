package com.yuerbao.gymms.ground.model;

import com.yuerbao.gymms.user.model.User;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by lhp_mac on 2017/6/1.
 */
public class GroundBook implements Serializable {
    private int bId; //主键
    private User user;  //预定用户
    private Ground ground; //场地
    private String bDate;  //预定时间
    private String bStartTime; //使用场地开始时间
    private String bEndTime;   //使用场地结束时间
    private int bFee;      //预定费用
    private int bStatus; // 预定状态， 0表示未审核 1表示审核通过 2 表示审核失败

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Ground getGround() {
        return ground;
    }

    public void setGround(Ground ground) {
        this.ground = ground;
    }


    public String getbDate() {
        return bDate;
    }

    public void setbDate(String bDate) {
        this.bDate = bDate;
    }

    public String getbStartTime() {
        return bStartTime;
    }

    public void setbStartTime(String bStartTime) {
        this.bStartTime = bStartTime;
    }

    public String getbEndTime() {
        return bEndTime;
    }

    public void setbEndTime(String bEndTime) {
        this.bEndTime = bEndTime;
    }

    public int getbFee() {
        return bFee;
    }

    public void setbFee(int bFee) {
        this.bFee = bFee;
    }

    public int getbStatus() {
        return bStatus;
    }

    public void setbStatus(int bStatus) {
        this.bStatus = bStatus;
    }
}
