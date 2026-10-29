package test02;

public class Student {
    private String number;
    private String name;
    private int age;

    public Student(String number, String name, int age) {
        this.number = number;
        this.name = name;
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void show(){
        System.out.println("学号：" + number + ",姓名：" + name + ",年龄：" + age);
    }
}
