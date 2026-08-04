package com.example.test;

public class Student1 {
    String name;
    int age;
    char sex;
    public Student1(){

    }
    public Student1(String name,int age,char sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }
    public void print1(String name){
        System.out.println(this.name + "喜欢" +name);
    }
}
