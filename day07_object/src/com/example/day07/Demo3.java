package com.example.day07;

public class Demo3 {
    public static void main(String[] args) {
        int[] scores=new int[]{100,90,80,70,60};
        int max=getMax(scores);
        System.out.println("最大值为："+max);
    }
    public static int getMax(int[] arr){
        int max=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
}
