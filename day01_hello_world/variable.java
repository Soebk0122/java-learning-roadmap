public class variable {
    public static void main(String[] args){
        print1();
        System.out.println("================");
        print2();
        System.out.println("================");
        print3();

    }
    public static void print1(){
        System.out.println(123);
        System.out.println(123.15);
        System.out.println('a');
        System.out.println("hello");
        System.out.println(true);
        System.out.println(false);
        System.out.println("Hello\nWorld");
        System.out.println("Hello\tWorld");
    }
    public static void print2(){
        int age=18;
        System.out.println(age);
        double score=98.5;
        System.out.println(score);


        System.out.println("==============");


        int age2=18;
        age2=19;
        System.out.println(age2);
        age2=age2+1;
        System.out.println(age2);
    }
    public static void print3(){
        //整型
        byte b=12;
        System.out.println(b);
        short s=1234;
        System.out.println(s);
        int i=123456789;
        System.out.println(i);
        long l=1234567890123456789L;
        System.out.println(l);
        System.out.println("==============");
        //浮点型
        float f=12.34f;
        System.out.println(f);
        double d=12.3456789;
        System.out.println(d);
        System.out.println("==============");
        //字符型
        char c='a';
        System.out.println(c);
        char c2='中';
        System.out.println(c2);
        System.out.println("==============");
        //布尔型
        boolean b2=true;
        System.out.println(b2);
        boolean b3=false;
        System.out.println(b3);
        System.out.println("==============");
        //字符串型
        String str="hello";
        System.out.println(str);
    }
}
