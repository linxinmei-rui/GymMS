package com.yuerbao.gymms.match.vo;

/**
 * Created by lim9527 on 5/28 0028.
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 通用的返回类，json
 */
public class Message {

    private int code;

    private String msg;

    private Map<String, Object> extend = new HashMap<String, Object>();


    public static Message success(){
        Message result = new Message();
        result.setCode(200);
        result.setMsg("处理成功！");
        return result;
    }


    public static Message fail(){
        Message result = new Message();
        result.setCode(400);
        result.setMsg("处理失败！");
        return result;
    }


    /**
     * 往对象添加数据，链式操作
     * @param key
     * @param value
     * @return
     */
    public Message add(String key, Object value){
        this.getExtend().put(key, value);
        return this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, Object> extend) {
        this.extend = extend;
    }
}