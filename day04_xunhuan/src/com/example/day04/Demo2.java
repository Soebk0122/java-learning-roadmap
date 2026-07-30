package com.example.day04;

public class Demo2 {
    public static void main(String[] args) {
        print1();
    }

    public static void print1(){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"×"+j+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}
