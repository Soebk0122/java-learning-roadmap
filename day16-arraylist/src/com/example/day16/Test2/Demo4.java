package com.example.day16.Test2;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<3;i++){
            Student s=new Student();
            System.out.println("请输入学生姓名");
            String name=sc.next();
            System.out.println("请输入学生年龄");
            int age=sc.nextInt();
            s.setName(name);
            s.setAge(age);
            list.add(s);


        }
        for (int i=0;i<list.size();i++){
            Student stu=list.get(i);
            System.out.println(stu.getName()+","+"年龄是"+stu.getAge());
        }
    }
}
