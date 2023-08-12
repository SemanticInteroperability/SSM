package com.atguigu.spring.pojo;

import java.util.Map;

public class Student implements Person{
    private Integer studentId;

    private String name;

    private Integer age;

    private String gender;
    private Clazz clazz;
    private Map<String,Teacher> teacherMap;

    public Student() {

    }

    public Student(Integer studentId, String name, Integer age, String gender,Clazz clazz) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.clazz=clazz;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", clazz=" + clazz +
                ", teacherMap=" + teacherMap +
                '}';
    }

    public void sayHi() {
        System.out.println("Hi,Person");
    }
}
