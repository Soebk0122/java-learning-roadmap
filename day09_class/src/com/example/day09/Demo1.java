package com.example.day09;

public class Demo1 {
    public static void main(String[] args) {
        Test s1=new Test();
        s1.name="张三";
        s1.age=18;
        s1.height=1.7;
        s1.weight=70.0;

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.height);
        System.out.println(s1.weight);

        System.out.println("-----------------");
        Test s2=new Test();
        s2.name="李四";
        s2.age=19;
        s2.height=1.8;
        s2.weight=80.0;
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.height);
        System.out.println(s2.weight);


    }
}
