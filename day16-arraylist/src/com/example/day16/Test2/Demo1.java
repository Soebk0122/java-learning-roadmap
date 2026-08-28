package com.example.day16.Test2;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> sa=new ArrayList<>();
        System.out.println(sa);
        sa.add("a");
        sa.add("b");
        sa.add("c");
        System.out.println(sa);
//        sa.remove("a");
//        System.out.println(sa);
//        String str=sa.remove(2);
//        System.out.println(str);
//        System.out.println(sa);
//        sa.set(1,"b1");
//        System.out.println(sa);
//        String s=sa.get(1);
//        System.out.println(s);
        for (int i = 0; i < sa.size(); i++) {
            System.out.println(sa.get(i));
        }
    }
}
