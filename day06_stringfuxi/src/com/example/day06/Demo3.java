package com.example.day06;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String username=sc.next();

        int smallCount=0;
        int bigCount=0;
        int numberCount=0;

        for (int i = 0; i < username.length(); i++){
            char c=username.charAt(i);
            if (c>='a' && c<='z'){
                smallCount++;
            }
            else if (c>='A' && c<='Z'){
                bigCount++;
            }
            else if (c>='0' && c<='9'){
                numberCount++;
            }
        }
        System.out.println("字符串中包含的小写字母有"+smallCount+"个");
        System.out.println("字符串中包含的大写字母有"+bigCount+"个");
        System.out.println("字符串中包含的数字有"+numberCount+"个");
    }

}
