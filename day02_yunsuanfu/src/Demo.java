import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("请输入您的身高:");
        double height=sc.nextDouble();

        System.out.println("请输入您的体重:");
        double weight=sc.nextDouble();

        System.out.println("请输入您的性别:");
        String sex=sc.next();

        System.out.println("请输入您的年龄:");
        int age=sc.nextInt();

        double bmi=calculateBMI(height,weight);
        System.out.println("您的BMI值为:"+bmi);

        double bmr=calculateBMR(height,weight,age,sex);
        System.out.println("您的BMR值为:"+bmr);
    }
    public static double calculateBMI(double height,double weight) {
        return weight / (height * height);
    }
    public static double calculateBMR(double height,double weight,int age,String sex){
        double bmr=0;
        if(sex.equals("男")){
            bmr=88.362+(13.397*weight+4.799*height-5.677*age);
        }else{
            bmr=447.593+(9.247*weight+3.098*height-4.330*age);
        }
        return bmr;
    }
}
