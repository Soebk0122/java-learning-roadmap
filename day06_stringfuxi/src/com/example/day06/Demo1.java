package com.example.day06;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        String rightusername="xiaoming";
        String rightpassword="123456";

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            System.out.println("请输入您的用户名:");
            String username=sc.next();
            System.out.println("请输入您的密码:");
            String password=sc.next();
            if (rightusername.equals(username) && rightpassword.equals(password)){
                System.out.println("登录成功");
                break;
            }
            else{
                if (i==2){
                    System.out.println("您已输入错误次数过多，请稍后再试");
                }
                else {
                System.out.println("登录失败,用户名或者密码错误，您还剩下"+(2-i)+"次机会");
                }
            }

        }

    }
}
