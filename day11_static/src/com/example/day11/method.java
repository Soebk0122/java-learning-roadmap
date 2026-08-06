package com.example.day11;

import java.util.Scanner;

public class method {
    private Movie[] movies;
    public method(Movie[] movies) {
        this.movies = movies;
    }
    public void show() {
        System.out.println("========全部电影信息========");
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println(m.getId() + "\t" + m.getName() + "\t" + m.getPrice() + "\t" + m.getActor());
        }
    }
    public void find(){
        System.out.println("请输入要查询的id：");
        Scanner sc=new Scanner(System.in);
        int id=sc.nextInt();
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            if (m.getId()==id){
                System.out.println(m.getId() + "\t" + m.getName() + "\t" + m.getPrice() + "\t" + m.getActor());
                return;
            }
        }
        System.out.println("没有找到该电影");
    }

}
