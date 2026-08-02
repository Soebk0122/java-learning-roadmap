package com.example.day07;

public class Demo5 {
    public static void main(String[] args) {
        start();
    }
    public static void start(){
        String[] poker=new String[54];
        String[] colors={"♠","♥","♣","♦"};
        String[] numbers={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

        int index=0;
        for (int i=0;i<numbers.length;i++){
            for (int j=0;j<colors.length;j++){
                poker[index]=colors[j]+numbers[i];
                index++;
            }
        }
        poker[index++]="大王";
        poker[index]="小王";
        System.out.println("新牌：");
        for (int i=0;i<poker.length;i++){
            System.out.print(poker[i]+"\t");
        }
        System.out.println();

        for (int i=0;i<poker.length;i++){
            int index1=(int)(Math.random()*poker.length);
            int index2=(int)(Math.random()*poker.length);
            String temp=poker[index1];
            poker[index1]=poker[index2];
            poker[index2]=temp;
        }

        System.out.println("洗牌后：");
        for (int i=0;i<poker.length;i++){
            System.out.print(poker[i]+"\t");
        }
    }
}
