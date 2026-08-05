package com.example.day10.javabean;

public class Demo2 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("张三"); ;
        s1.setChinese(80.0);
        s1.setMath(90.0);
        System.out.println(s1.getName());
        System.out.println(s1.getChinese());
        System.out.println(s1.getMath());

        Student s2=new Student("李四", 75.0, 80.0);
        System.out.println(s2.getName());
        System.out.println(s2.getChinese());
        System.out.println(s2.getMath());

        Studentservice ss=new Studentservice(s2);
        ss.print1();
        ss.print2();
    }
}
