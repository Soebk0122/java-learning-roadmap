package com.example.day04;

public class Demo6 {
    public static void main(String[] args) {
        System.out.println(getCode(4));
        System.out.println(getCode(6));
    }

    public static String getCode(int n){
        String code="";
        for (int i=0;i<n;i++){
            int type=(int)(Math.random()*3);
            switch (type){
                case 0:
                    code+=(int)(Math.random()*10);
                    break;
                case 1:
                    code+=(char)(Math.random()*26+'a');
                    break;
                case 2:
                    code+=(char)(Math.random()*26+'A');
                    break;
            }
        }
        return code;
    }
}
