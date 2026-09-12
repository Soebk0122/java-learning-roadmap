package com.example.day17;

public class Demo2 {
    public static void main(String[] args)  {
        System.out.println("程序开始");
        try {
            System.out.println(div(10, 0));
            System.out.println("底层方法执行成功了");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("异常了");
        }
        System.out.println("程序结束");
    }

    public static int div(int a, int b) throws Exception     {
        if (b == 0){
            System.out.println("除数不能为0");
//            throw new RuntimeException("除数不能为0");//运行时异常，程序会终止
            throw new Exception("除数不能为0");
        }
        int result = a / b;
        return result;
    }
}
