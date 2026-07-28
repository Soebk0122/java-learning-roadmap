import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        print1();

    }
    public static void print1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名:");
        String name=sc.next();
        System.out.println("您叫"+name);
        System.out.println("请输入年龄:");
        int age=sc.nextInt();
        System.out.println("您今年"+age+"岁");

    }
}
