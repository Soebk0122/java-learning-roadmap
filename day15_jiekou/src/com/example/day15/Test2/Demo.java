package com.example.day15.Test2;

public class Demo {
    public static void main(String[] args) {
        People p = new Student();
        Driver d = new Student();
        Boyfriend b = new Student();
        Driver d2 = new Teacher();
        Boyfriend b2 = new Teacher();
    }
}
interface Driver{}
interface Boyfriend{}
class People{}
class Student extends People implements Driver, Boyfriend{}
class Teacher implements Driver, Boyfriend{}
