package com.example.day19.T3;

import com.example.day19.T2.Student;

public class Demo1 {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        printArray(array);

        Student[] stus=new Student[3];
        printArray(stus);

        Student max=getMax(stus);
        Integer max2=getMax(array);


    }

    public static <T> void printArray(T[] array) {

    }
    public static <T> T getMax(T[] array) {
        return null;
    }
}
