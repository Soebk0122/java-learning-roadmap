package com.example.day10.staticfiled;



public class Test {
    public static void main(String[] args) {
        Student.name="张三";
        Student.name="李四";
        System.out.println(Student.name);

        Student s1=new Student();
        s1.age=18;
        System.out.println(s1.age);
        Student s2=new Student();
        s2.age=19;
        System.out.println(s2.age);
    }
}
