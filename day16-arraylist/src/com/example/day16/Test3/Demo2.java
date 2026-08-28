package com.example.day16.Test3;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        Phone p1 = new Phone("HUAWEI", 1999);
        Phone p2 = new Phone("XIAOMI", 2999);
        Phone p3 = new Phone("IPHONE", 4999);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        ArrayList<Phone> list1 = getPhoneInfo(list);
        for (int i = 0; i < list1.size(); i++) {
            Phone phone = list1.get(i);
            System.out.println(phone.getBrand() + " " + phone.getPrice());
        }
    }
    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list) {
        ArrayList<Phone> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);
            double price = p.getPrice();
            if (price < 3000){
                list1.add(p);
            }
        }
        return list1;
    }
}
