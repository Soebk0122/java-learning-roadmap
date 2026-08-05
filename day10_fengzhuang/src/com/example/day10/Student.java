package com.example.day10;

public class Student {
    String name;
    private int age;
    private double chinese;
    private double math;

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }




    public void print1(){
        System.out.println(name + "的总成绩：" + (chinese + math));
    }

    public void print2(){
        System.out.println(name + "的平均成绩：" + (chinese + math) / 2);
    }
}
