package com.example.day12.Test6;

public class Student {
    private String name;
    private int age;
    private String sex;
    private String schoolname;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", schoolname='" + schoolname + '\'' +
                '}';
    }

    public Student() {
    }

    public Student(String name, int age, String sex) {
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//        this.schoolname="南阳师范";
        this(name, age, sex, "南阳师范");
    }


    public Student(String name, int age, String sex, String schoolname) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.schoolname = schoolname;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }
}
