package com.example.day12.Test1;

public class Test {
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        demo1.setName("张三");
        demo1.setSex('男');
        demo1.setNumeber(123456);
        System.out.println(demo1.getName()+demo1.getSex()+demo1.getNumeber());
    }
}
