package com.cqu;

public class Student {
    private int id;
    private String name;
    private int age;
    private String major;
    private int grade;

    public Student(){}

    public Student(int id, String name, int age, String major, int grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.major = major;
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void show() {
        System.out.printf("| %-2d | %-4s | %-3d | %-5s | %-5d |\n",
                this.id, this.name, this.age, this.major, this.grade);
    }

}
