package com.example.day04;

import java.util.Random;
import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        print2();
    }
//    public static void print1(){
//        int luckyNum=(int)(Math.random()*100)+1;
//        System.out.println(luckyNum);
//    }

    public static void print2(){
        Random r= new Random();
        int luckyNum=r.nextInt(100)+1;
//        System.out.println(luckyNum);

        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("请输入要猜的数字：");
            int num=sc.nextInt();

            if (num==luckyNum){
                System.out.println("恭喜你猜对了");
                break;
            }
            else if (num>luckyNum){
                System.out.println("您猜的数字太大了");
            }
            else{
                System.out.println( "您猜的数字太小了");
            }

        }


    }
}
