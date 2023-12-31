package com.atguigu.mybatis.pojo;

import java.util.List;

public class User {
    private Integer id ;
    private String uname ;
    private String pwd ;
    private String email;
    private Integer role  = 0;


    public User(){}

    public User(Integer id) {
        this.id = id;
    }

    public User(String uname, String pwd, String email, Integer role) {
        this.uname=uname;
        this.pwd=pwd;
        this.email=email;
        this.role=role;
    }

    public User(Integer id, String uname, String pwd, String email, Integer role) {
        this.id = id;
        this.uname = uname;
        this.pwd = pwd;
        this.email = email;
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", pwd='" + pwd + '\'' +
                ", email='" + email + '\'' +
                ", role=" + role +
                '}';
    }
}
