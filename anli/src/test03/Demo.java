package test03;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        JD[] jds = new JD[3];
        jds[0] = new TV("1", "智能电视", true);
        jds[1] = new Light("2", "智能电灯", true);
        jds[2] = new Air("3", "智能空调", false);
        printJD(jds);
        System.out.print("请您选择要控制的设备：");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        JD target = null;
        switch (choice) {
            case "1":
                target = jds[0];
                break;
            case "2":
                target = jds[1];
                break;
            case "3":
                target = jds[2];
                break;
            default:
                System.out.println("编号错误，程序结束。");
                return;
        }
        String action = target.isStatus() ? "关闭" : "开启";
        System.out.println("【" + target.getName() + "】当前状态：" + (target.isStatus() ? "开启" : "关闭"));
        System.out.print("确定要【" + action + "】" + target.getName() + "？(Y/N)：");
        String confirm = scanner.next();

        if ("Y".equalsIgnoreCase(confirm)) {
            target.press();
        } else {
            System.out.println("已取消。\n");
        }
        printJD(jds);
    }

    public static void printJD(JD[] jds) {
        System.out.println("编号  名称   状态");
        for (int i = 0; i < jds.length; i++) {
            System.out.println(jds[i].getId() + "\t" + jds[i].getName() + "\t" + (jds[i].isStatus() ? "开启" : "关闭"));
        }
    }
}
