package com.yuerbao.gymms.match.model;

/**
 * Created by lim9527 on 5/20 0020.
 */
public class User {

    private Integer id;
    private String user_name;
    private String password;
    private Integer age;



    @Override
    public String toString() {
        return "["+id+":"+user_name+"]";
    }

    public User() {
    }

    public User(Integer id, String user_name, String password, Integer age) {
        this.id = id;
        this.user_name = user_name;
        this.password = password;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
