package com.example.day3;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        print1();
    }

    public static void print1(){
        System.out.println("这位同学的成绩分数：");
        Scanner sc=new Scanner(System.in);
        int score=sc.nextInt();
        if (score>=90 && score<=100){
            System.out.println("优秀");
        }
        else if (score>=80 && score<90){
            System.out.println("良好");
        }
        else if (score>=70 && score<80){
            System.out.println("中等");
        }
        else if (score>=60 && score<70){
            System.out.println("及格");
        }
        else if (score>=0 && score<60){
            System.out.println("不及格");
        }
        else{
            System.out.println("输入错误");
        }
    }
}
