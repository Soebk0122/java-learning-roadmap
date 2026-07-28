public class Demo2 {
    public static void main(String[] args) {
        print1(10);
        System.out.println("最大值:" + print2(10,20,30));
    }

    public static void print1(int a){
        int b=a++;
        System.out.println(a);
        System.out.println(b);

        int c=++a;
        System.out.println(a);
        System.out.println(c);

    }

    public static int print2(int a,int b,int c){
        int max=a>b?a:b;
        max=max>c?max:c;
        return max;
    }
}
