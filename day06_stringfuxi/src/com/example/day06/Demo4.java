package com.example.day06;

public class Demo4 {
    public static void main(String[] args) {
        String result=reverse("abcdefg");
        System.out.println(result);
    }
    public static String reverse(String str){
        String result="";
        for (int i = str.length()-1; i >=0; i--){
            char c=str.charAt(i);
            result+=c;
        }
        return result;
    }
}
