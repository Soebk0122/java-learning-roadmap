package com.example.day17.Demo4;

public class Demo1 {
    public static void main(String[] args) {
        try {
            method(201);
        } catch (AgeIllegalException e) {
            e.printStackTrace();
        }
    }

    public static void method(int age) throws AgeIllegalException {
        if (age<1 || age>200){
            throw new AgeIllegalException("年龄输入错误");
        }else {
            System.out.println("年龄输入正确");
            System.out.println("年龄是:"+age);
        }
    }
}
