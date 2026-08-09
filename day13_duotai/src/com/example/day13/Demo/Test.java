package com.example.day13.Demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        GoldCard goldCard = new GoldCard("京A00008", "张三", "12345678901", 5000);
        pay(goldCard);
        SliverCard sliverCard = new SliverCard("京A88888", "李四", "1632894398", 2000);
        pay(sliverCard);
    }

    public static void pay(Card c){
        System.out.println("请刷卡，请您输入当前的消费金额");
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();
        c.consume(money);
    }
}
