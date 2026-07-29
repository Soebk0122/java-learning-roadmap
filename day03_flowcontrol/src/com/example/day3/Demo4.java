package com.example.day3;
import java.util.Scanner;

public class Demo4 {
    public static void main(String[] arges){

    }

    public static void print1(){
        System.out.println("请输入您的性别：");
        Scanner sc=new Scanner(System.in);
        String sex=sc.next();

        switch ( sex){

            case "男":
                System.out.println("你是男生");
                break;

            case "女":
                System.out.println("你是女生");
                break;

            default:
                System.out.println("输入错误");
                break;
        }
    }
}
