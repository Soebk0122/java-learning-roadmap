package com.example.day09;

public class Student {
    String name;
    double chinese;
    double math;

    public void print1(){
        System.out.println(name + "的总成绩：" + (chinese + math));
    }

    public void print2(){
        System.out.println(name + "的平均成绩：" + (chinese + math) / 2);
    }
}
