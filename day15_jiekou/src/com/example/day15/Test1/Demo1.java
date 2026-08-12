package com.example.day15.Test1;

public class Demo1 {
    public static void main(String[] args) {
        C c = new C();
        c.study();
        c.play();
        System.out.println(c.getSchool());
    }
}

class C  implements A,B{
    @Override
    public void study() {
        System.out.println("study");
    }

    @Override
    public String getSchool() {
        return "";
    }

    @Override
    public void play() {
        System.out.println("play");
    }
}
