package test02;

public class Demo {
    public static void main(String[] args) {
        Student student = new Student("001", "张三", 20);
        student.show();
        Undergraduate undergraduate = new Undergraduate("002", "李四", 21, "本科");
        undergraduate.show();
    }
}
