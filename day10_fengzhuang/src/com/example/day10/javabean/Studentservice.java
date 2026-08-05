package com.example.day10.javabean;

public class Studentservice {
    private Student s;
    public Studentservice(Student s){
        this.s = s;
    }
    public void print1(){
        System.out.println(s.getName() + "的总成绩：" + (s.getChinese() + s.getMath()));
    }
    public void print2(){
        System.out.println(s.getName() + "的平均成绩：" + (s.getChinese() + s.getMath()) / 2);
    }
}
