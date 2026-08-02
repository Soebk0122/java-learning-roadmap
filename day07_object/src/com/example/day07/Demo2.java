package com.example.day07;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        inputScore();
    }

    public static void inputScore(){
        double[] scores=new double[5];
        Scanner sc= new Scanner(System.in);
        for (int i=0;i<scores.length;i++){
            System.out.println("请输入第"+(i+1)+"个学生的成绩：");
            scores[i]=sc.nextDouble();
        }
        double allScore=0.0;
        for (int i=0;i<scores.length;i++){
            double score=scores[i];
            allScore+=score;
        }
        System.out.println("所有学生的成绩和为："+allScore);
        System.out.println("所有学生的平均成绩为："+allScore/scores.length);
    }
}
