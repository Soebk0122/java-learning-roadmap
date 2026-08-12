package com.example.day15.Test4;

public interface A {
    default void method1() {
        System.out.println("method1");
    }

    private void method2() {
        System.out.println("method2");
    }

    static void method3() {
        System.out.println("method3");
    }
}
