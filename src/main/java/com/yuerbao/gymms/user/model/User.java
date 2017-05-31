package com.yuerbao.gymms.user.model;


/**
 * Created by lhp_mac on 2017/5/30.
 */
public class User {
    private int uId ; //用户主键
    private String uName ; //用户姓名
    private String uPassword ;//用户密码
    private String uEmail ;//用户邮箱
    private  String uStidentId; //用户学号
    private String uPhone ; // 用户电话号码
    private int status ; // 用户状态 1 代表激活  0 代表未激活

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public String getuStidentId() {
        return uStidentId;
    }

    public void setuStidentId(String uStidentId) {
        this.uStidentId = uStidentId;
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", uPassword='" + uPassword + '\'' +
                ", uEmail='" + uEmail + '\'' +
                ", uStidentId='" + uStidentId + '\'' +
                ", uPhone='" + uPhone + '\'' +
                ", status=" + status +
                '}';
    }
}
