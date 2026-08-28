package com.example.day16.Test2;

import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        Student s1=new Student("张三",18);
        Student s2=new Student("李四",18);
        Student s3=new Student("王五",18);
        list.add(s1);
        list.add(s2);
        list.add(s3);

        for (int i=0;i<list.size();i++){
            Student stu=list.get(i);
            System.out.println(stu.getName()+","+"年龄是"+stu.getAge());
        }
    }
}
