package com.example.day12.Test4;

public class Demo1 {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.show();
    }

}

class  Fu{
    String name = "Fu的name";

    public void run(){
        System.out.println("fu类中run的方法");
    }
}

class   Zi extends Fu{
    String name = "Zi的name";
    public void show(){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
        run();
        super.run();

    }
    public void run(){
        System.out.println("zi类中run的方法");
    }


}
