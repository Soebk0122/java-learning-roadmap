package com.example.day3;

public class Demo6 {
    public static void main(String[] args) {
        print1();
        System.out.println(calc());
    }

    public static void print1(){
        int i=0;
        while (i<3){
            System.out.println("Hello World");
            i++;
        }
    }

    public static int calc(){
        double money=10000;
        double rate=0.017;
        int year=0;
        while (money<=20000){
            year++;
            money=money*(1+rate);
        }
        return year;
    }
}
