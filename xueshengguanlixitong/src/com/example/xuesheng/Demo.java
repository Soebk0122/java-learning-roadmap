package com.example.xuesheng;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        while (true) {
            System.out.println("---------------欢迎使用学生管理系统---------------");
            System.out.println("1. 添加学生信息");
            System.out.println("2. 删除学生信息");
            System.out.println("3. 修改学生信息");
            System.out.println("4. 查询学生信息");
            System.out.println("5. 退出系统");
            System.out.println("请输入你的选择：");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.next();
            switch (choice){
                case "1":
                    addStudent(list);
                    break;
                case "2":
                    deleteStudent(list);
                    break;
                case "3":
                    updateStudent(list);
                    break;
                case "4":
                    queryStudent(list);
                    break;
                case "5":
                    System.out.println("退出系统");
                    return;
                    //System.exit(0);
                default:
                    System.out.println("输入错误");
                    break;
            }
        }
    }

    public static void addStudent(ArrayList<Student> list) {
//        System.out.println("添加学生信息");
        Student stu = new Student();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入学生学号：");
            String id = scanner.next();
            if(contains(list, id)){
                System.out.println("学号已存在，请重新输入");
            }else {
                stu.setId(id);
                break;
            }
        }
        System.out.println("请输入学生姓名：");
        String name = scanner.next();
        stu.setName(name);
        System.out.println("请输入学生年龄：");
        int age = scanner.nextInt();
        stu.setAge(age);
        System.out.println("请输入学生地址：");
        String address = scanner.next();
        stu.setAddress(address);
//        Student stu = new Student(id, name, age, address);
        list.add(stu);
        System.out.println("添加成功");
    }
    public static void deleteStudent(ArrayList<Student> list) {
//        System.out.println("删除学生信息");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生学号：");
        String id = scanner.next();
        int index = getIndex(list, id);
        if (index>=0) {
            list.remove(index);
            System.out.println("删除成功");
        } else {
            System.out.println("学号不存在，请重新输入");
        }
    }
    public static void updateStudent(ArrayList<Student> list) {
//        System.out.println("修改学生信息");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要修改学生的id：");
        String id = scanner.next();
        int index = getIndex(list, id);
        if (index>=0) {
            Student stu = list.get(index);
            System.out.println("请输入学生姓名：");
            String name = scanner.next();
            stu.setName(name);
            System.out.println("请输入学生年龄：");
            int age = scanner.nextInt();
            stu.setAge(age);
            System.out.println("请输入学生地址：");
            String address = scanner.next();
            stu.setAddress(address);
            System.out.println("修改成功");
        } else {
            System.out.println("学号不存在，请重新输入");
            return;
        }
    }
    public static void queryStudent(ArrayList<Student> list) {
//        System.out.println("查询学生信息");
        if (list.size()==0){
            System.out.println("当前无学生信息，请添加后再查询");
            return;
        }
        System.out.println("学号\t\t姓名\t\t年龄\t\t地址");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId()+"\t\t"+stu.getName()+"\t\t"+stu.getAge()+"\t\t"+stu.getAddress());

        }
    }

    public static boolean contains(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String stuId = stu.getId();
            if (stuId.equals(id)) {
                return true;
            }
        }
        return false;
    }
    public static int getIndex(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
