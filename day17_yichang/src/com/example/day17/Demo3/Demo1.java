package com.example.day17.Demo3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("程序开始");
        try {
            CompileShow();
            System.out.println("方法执行成功");
        } catch (Exception e) {
           e.printStackTrace();
           System.out.println("异常了");
        }
        System.out.println("程序结束");
    }

    public static void CompileShow() throws Exception {//两个异常一起抛可以只抛一个Exception父异常
        //编译时异常：编译阶段报错，继承自 Exception
        String str = "2024-08-09 11:40:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str);//编译时异常，提醒这里代码容易出错
        System.out.println(date);

        InputStream is = new FileInputStream("D/file");
    }
}
