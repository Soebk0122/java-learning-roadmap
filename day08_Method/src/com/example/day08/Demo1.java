package com.example.day08;

public class Demo1 {
    public static void main(String[] args) {
        int number=100;
        System.out.println("调用方法前"+number);
        change1(number);
        System.out.println("调用方法后"+number);
        System.out.println("-----------------");
        int[] scores=new int[]{100,90,80,70,60};
        System.out.println("调用方法前"+scores[0]);
        change2(scores);
        System.out.println("调用方法后"+scores[0]);
    }
    public static void change1(int number){
        number=200;
    }
    public static void change2(int[] scores){
        scores[0]=200;
    }
}
