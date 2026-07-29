package com.example.day3;

public class Demo3 {
    public static void main(String[] args) {
        print1();
        System.out.println("------------------");
        print2();
        System.out.println("------------------");
        print3();
        System.out.println("------------------");
        print4();
    }

    public static void print1(){
        boolean red=true;
        boolean yellow=false;
        boolean green=false;
        if (red){
            System.out.println("红灯亮，停止");
        }else if (yellow){
            System.out.println("黄灯亮，准备");
        }else if (green){
            System.out.println("绿灯亮，开始");
        }else {
            System.out.println("灯泡故障");
        }
    }

    public static void print2(){
        boolean red=false;
        boolean yellow=true;
        boolean green=false;
        if (red){
            System.out.println("红灯亮，停止");
        }else if (yellow){
            System.out.println("黄灯亮，准备");
        }else if (green){
            System.out.println("绿灯亮，开始");
        }else {
            System.out.println("灯泡故障");
        }
    }

    public static void print3(){
        boolean red=false;
        boolean yellow=false;
        boolean green=true;
        if (red){
            System.out.println("红灯亮，停止");
        }else if (yellow){
            System.out.println("黄灯亮，准备");
        }else if (green){
            System.out.println("绿灯亮，开始");
        }else {
            System.out.println("灯泡故障");
        }
    }

    public static void print4(){
        boolean red=false;
        boolean yellow=false;
        boolean green=false;
        if (red){
            System.out.println("红灯亮，停止");
        }else if (yellow){
            System.out.println("黄灯亮，准备");
        }else if (green){
            System.out.println("绿灯亮，开始");
        }else {
            System.out.println("灯泡故障");
        }
    }
}
