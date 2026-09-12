package com.example.day17;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("程序开始");
        System.out.println(div(10, 0));
        System.out.println("程序结束");
    }

    public static int div(int a, int b){
        if (b == 0){
            System.out.println("除数不能为0");
            throw new RuntimeException("除数不能为0"); // 运行时异常，程序会终止
        }
        int result = a / b;
        return result;
    }
}
