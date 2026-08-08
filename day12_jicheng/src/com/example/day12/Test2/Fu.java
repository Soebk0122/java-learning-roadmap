package com.example.day12.Test2;

public class Fu {
    public void publicshow() {
        System.out.println("public show");
    }
    void show(){
        System.out.println("show");
    }
    private void privateShow() {
        System.out.println("private show");
    }
    protected void protectedShow() {
        System.out.println("protected show");
    }

    public static void main(String[] args) {
        Fu fu = new Fu();
        fu.publicshow();
        fu.show();
        fu.privateShow();
        fu.protectedShow();
    }
}
