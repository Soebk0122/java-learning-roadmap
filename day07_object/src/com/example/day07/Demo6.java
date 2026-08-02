package com.example.day07;

public class Demo6 {
    public static void main(String[] args) {
        start(5);
    }

    public static void start(int n){
        int[][] arr=new int[n][n];
        int count=1;
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr[i].length;j++){
                arr[i][j]=count;
                count++;
            }
        }
        print1( arr);
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr[i].length;j++){
                int m=(int)(Math.random()* arr.length);
                int p=(int)(Math.random()* arr.length);

                int temp=arr[m][p];
                arr[m][p]=arr[i][j];
                arr[i][j]=temp;

            }
        }
        System.out.println("=================");
        print1(arr);
    }
    public static void print1(int[][] arr){
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
