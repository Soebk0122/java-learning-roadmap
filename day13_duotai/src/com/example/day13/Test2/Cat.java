package com.example.day13.Test2;

public class Cat  extends Animal {
    String name="猫";
    @Override
    public void run(){
        System.out.println("猫在跑");
    }

    public void eat(){
        System.out.println("猫在吃");
    }
}
