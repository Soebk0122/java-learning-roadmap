package com.example.day06;

import java.util.StringJoiner;

public class Demo2 {
    public static void main(String[] args) {
        StringJoiner sj=new StringJoiner("---");
        sj.add("aaa").add("bbb").add("ccc");
        System.out.println(sj);

        StringJoiner sj2=new StringJoiner("---","[","]");
        sj2.add("aaa").add("bbb").add("ccc");
        System.out.println(sj2);

        int length=sj2.length();
        System.out.println(length);

        String s=sj2.toString();
        System.out.println(s);
    }
}
