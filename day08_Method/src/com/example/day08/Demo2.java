package com.example.day08;

public class Demo2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int[] newArrs=print1(arr,3,7);
        for (int i=0;i<newArrs.length;i++){
            System.out.print(newArrs[i]);
        }
    }
    public static int[] print1(int[] arr,int from,int to){
        int[] newArr=new int[to-from];
        int index=0;
        for (int i=from;i<to;i++){
            newArr[index]=arr[i];
            index++;
        }
        return newArr;
    }
}
