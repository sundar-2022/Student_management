package com.Spring_testing.Student_management;

public class STUDENT {
    private String name;
    private int age;
    private int RegNo;
    private String state;

    public STUDENT(String name, int age, int regNo, String state) {
        this.name = name;
        this.age = age;
        this.RegNo = regNo;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRegNo() {
        return RegNo;
    }

    public void setRegNo(int regNo) {
        this.RegNo = regNo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
