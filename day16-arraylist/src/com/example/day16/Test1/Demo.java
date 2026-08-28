package com.example.day16.Test1;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        JD[] jds=new JD[4];
        jds[0]=new TV("小米电视",true);
        jds[1]=new WashMachine("美的洗衣机",false);
        jds[2]=new Air("格力空调",true);
        jds[3]=new Lamp(" Philips 灯泡",false);

        SmartHomeControl smartHomeControl=new SmartHomeControl();
        while (true){
        smartHomeControl.printAllStatus(jds);
        System.out.println("请您选择要控制的设备");
        Scanner scanner=new Scanner(System.in);
        String choice=scanner.next();
        switch (choice) {
            case "1":
                smartHomeControl.control(jds[0]);
                break;
            case "2":
                smartHomeControl.control(jds[1]);
                break;
            case "3":
                smartHomeControl.control(jds[2]);
                break;
            case "4":
                smartHomeControl.control(jds[3]);
                break;
            case "exit":
                System.out.println("退出程序");
                return;
            default:
                System.out.println("输入错误");
        }
    }
        }
}
