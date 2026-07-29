package com.example.day3;

public class Demo1 {
    public static void main(String[] args) {
        print1();
        print2();
        print3();

    }
    public static void print1(){
        int age=8;
        if (age> 10){
            System.out.println("允许");
        }
        System.out.println("结束"); //这一行也会输出
    }

    public static void print2(){
        int age=8;
        if (age>=10){
            System.out.println("允许");
        }else{
            System.out.println("不允许");
        }
    }

    public static void print3(){
        int age=8;
        if (age>=10){
            System.out.println("允许");
        }else if(age>=5){
            System.out.println("同意");
        }else{
            System.out.println("不允许");
        }
        System.out.println("结束");
    }


}
