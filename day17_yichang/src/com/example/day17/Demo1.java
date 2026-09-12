package com.example.day17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {
        public static void main(String[] args) {
            //        Runtimeshow();
            //        CompileShow();//方法一、在main添加throws ParseException标签抛出异常
            try {//方法二、捕获异常
                CompileShow();
            } catch (ParseException e){
                e.printStackTrace();//输出异常信息
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

            try {//两个异常时可以只抛一个Exception类异常，同时CompileShow只需捕获Exception异常即可
                CompileShow();
            } catch (java.lang.Exception e){
                e.printStackTrace();
            }
        }

        public static void CompileShow() throws ParseException, FileNotFoundException {//两个异常一起抛可以只抛一个Exception父异常
            System.out.println("程序开始");
            //编译时异常：编译阶段报错，继承自 Exception
            String str = "2024-08-09 11:40:00";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = sdf.parse(str);//编译时异常，提醒这里代码容易出错
            System.out.println(date);

            InputStream is = new FileInputStream("D/file");
            System.out.println("程序结束");
        }
}
