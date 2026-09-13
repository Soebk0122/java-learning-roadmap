package com.example.day17.Demo3;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {

        while (true) {
            try {
                double price = method1();
                System.out.println("商品定价为：" + price);
                break;
            } catch (Exception e) {
               System.out.println("输入有误");
            }
        }

    }

    public static double method1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入商品定价：");
        double price = scanner.nextDouble();
        return price;
    }
}
