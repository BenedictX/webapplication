package com.invengo.domain;

/**
 * Created By IntelliJ IDEA
 * User:Administrator
 * Date:2018/08/23
 * Time:09:25
 */
public class User {
    private Integer uid;
    private String username;
    private String password;
    private Integer age;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
