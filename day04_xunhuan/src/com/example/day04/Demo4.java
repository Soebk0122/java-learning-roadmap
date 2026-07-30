package com.example.day04;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        System.out.println("请输入第一个数字：");
        Scanner sc=new Scanner(System.in);
        double num1=sc.nextDouble();
        System.out.println("请输入第二个数字：");
        double num2=sc.nextDouble();
        System.out.println("请输入运算符号：");
        String symbol=sc.next();
        double result=calculate(num1,num2,symbol);
        System.out.println("结果是："+ result);
    }

    public static double calculate(double num1,double num2,String symbol){
        double result=0;
        switch (symbol){
            case "+":
                result=num1+num2;
                break;
            case "-":
                result=num1-num2;
                break;
            case "*":
                result=num1*num2;
                break;
            case "/":
                result=num1/num2;
                break;
            default:
                System.out.println("输入错误");
        }
        return result;
    }
}
