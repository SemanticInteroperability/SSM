package com.atguigu.spring.pojo;

import java.util.List;

public class Clazz {
    private String cname;
    private Integer cid;
    private List<Student> students;
    public Clazz(){

    }

    public Clazz(String cname, Integer cid, List<Student> students) {
        this.cname = cname;
        this.cid = cid;
        this.students = students;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "cname='" + cname + '\'' +
                ", cid=" + cid +
                ", students=" + students +
                '}';
    }
}
