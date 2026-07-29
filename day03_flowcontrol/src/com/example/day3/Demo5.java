package com.example.day3;

public class Demo5 {
    public static void main(String[] args) {
        print1();
        System.out.println(sum(10));
        System.out.println(sum2(10));
    }

    public static void print1(){
        for (int i=0;i<3;i++){
            System.out.println("Hello World");
        }
    }

    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static  int sum2(int n) {
        int sum2 = 0;
        for (int i = 1; i <= n; i+=2) {
            sum2 += i;
        }
        return sum2;
    }
}
