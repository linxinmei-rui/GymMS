package com.yuerbao.gymms.ground.vo;

import java.io.Serializable;

/**
 * Created by lhp_mac on 2017/6/1.
 * 操作场地的时候的状态信息vo类
 */
public class GroundCrudVo implements Serializable {

    private int status;  //状态 0 表示失败 1表示成功

    private String errorMessage;  //错误信息

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
