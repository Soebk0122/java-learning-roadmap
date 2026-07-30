package com.example.day04;

public class Demo3 {
    public static void main(String[] args) {
        print1();
        System.out.println("================");
        print2();
    }

    public static void print1(){
        for (int i = 1; i <= 9; i++){
            if (i==5){
                break;
            }
            System.out.println(i);
        }
    }

    public static void print2(){
        for (int i = 1; i <= 9; i++){
            if (i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}
