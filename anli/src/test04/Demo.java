package test04;

import java.util.Random;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Random random = new Random();
        String chars="abcdefghijklmnopqrstuvwxyz0123456789";
        StringBuffer code=new StringBuffer();
        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(chars.length());
            code.append(chars.charAt(index));
        }

        System.out.println("验证码：" + code.toString());

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入内容进行验证：");
        String input = sc.next();

        if (code.toString().equalsIgnoreCase(input)) {
            System.out.println("验证通过");
        } else {
            System.out.println("验证失败");
        }

        sc.close();
    }
}
