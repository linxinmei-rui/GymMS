package com.yuerbao.gymms.ground.vo;

/**
 * Created by lhp_mac on 2017/6/2.
 */
public class BookGroundVo {

    private int status; //操作结果 1表示成功 0表示失败
    private String message; //预定信息


    public  BookGroundVo(){
        status =  1;
        message = "预定成功，请等待管理员审核"  ;
    }
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
