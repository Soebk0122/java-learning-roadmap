package com.example.day19.T1;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>( );
        list.add("张三");
        list.add("李四");
        list.add("王五");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            System.out.println(name);
        }
    }
}
//public class Demo1 {
//    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<String>( );
//        list.add("张三");
//        list.add("李四");
//        list.add("王五");
//        for (int i = 0; i < list.size(); i++) {
//            String name = list.get(i);
//            System.out.println(name);
//        }
//    }
//}
//public class Demo1 {
//    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<String>( );
//        list.add("张三");
//        list.add("李四");
//        list.add("王五");
//        for (int i = 0; i < list.size(); i++) {
//            String name = list.get(i);
//            System.out.println(name);
//        }
//    }
//}
