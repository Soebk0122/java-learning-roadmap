package com.example.test;

public class Demo {
    public static void main(String[] args) {
        Student s1=new Student("张三" ,18,'男');
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.sex);

        Student s2=new Student("王五" ,19,'女');
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.sex);
    }

}
