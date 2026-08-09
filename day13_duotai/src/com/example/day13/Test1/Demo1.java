package com.example.day13.Test1;

public class Demo1 {
    public static void main(String[] args) {
        Animal s1=new Cat();
        s1.run();
        System.out.println(s1.name);
        Animal s2=new Dog();
        s2.run();
        System.out.println(s2.name);
    }
}
