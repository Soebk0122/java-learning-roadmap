package com.example.day07;

public class Demo4 {
    public static void main(String[] args) {
        String[][] names=new String[][]{
                {"张三","张三","张三"},
                {"张三","张三","张三","张三"},
                {"张三","张三","张三"}
        };

        String[] name=names[1];
        for (int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }

        System.out.println(names[1][1]);
        System.out.println(names[2][2]);

        System.out.println(names.length);
        System.out.println(names[1].length);

        print(names);
    }

    public static void print(String[][] names){
        for (int i=0;i<names.length;i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.print(names[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
