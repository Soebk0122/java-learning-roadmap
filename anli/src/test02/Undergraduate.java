package test02;

public class Undergraduate extends Student{
    private String degree;

    public Undergraduate(String number, String name, int age, String degree) {
        super(number, name, age);
        this.degree = degree;
    }

    @Override
    public void show(){
        System.out.println("学号：" + getNumber() + ",姓名：" + getName() + ",年龄：" + getAge() + ",学位：" + degree);
    }
}
