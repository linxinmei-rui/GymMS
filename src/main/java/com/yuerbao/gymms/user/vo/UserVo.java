package com.yuerbao.gymms.user.vo;

/**
 * Created by lhp_mac on 2017/5/31.
 */
public class UserVo {
    private int status; //登录信息 1成功 0失败
    private String errorMessage;  //  错误信息

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }



}
