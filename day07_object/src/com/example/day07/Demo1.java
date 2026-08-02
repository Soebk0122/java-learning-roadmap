package com.example.day07;

public class Demo1 {
    public static void main(String[] args) {
        print1();

    }
    public static void print1(){
        String[] names= new String[]{"张三","李四","王五"};
        int index=( int)(Math.random()* names.length);
        String name= names[index];
        System.out.println(name);
    }
}
