package com.example.day19.T4;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        //手工包装
        Integer i = Integer.valueOf(10);
        Integer j = Integer.valueOf(10);
        System.out.println(i == j);

        //自动包装
        Integer k = 10;
        Integer l = 10;
        System.out.println(k == l);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        int rs = list.get(0);

        int a=23;
        String rs1=Integer.toString(a);
        System.out.println(rs1);

        Integer i2=a;
        String rs2=Integer.toString(i2);
        System.out.println(rs2);

        String a1="123";
//        int rs3=Integer.parseInt(a1);
        int rs3=Integer.valueOf(a1);
        System.out.println(rs3);


    }
}
