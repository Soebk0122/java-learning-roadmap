package com.example.day15.Test3;

public class Demo {
    public static void main(String[] args) {
        Student[] allstudents = new Student[10];
        allstudents[0] = new Student("张三", '男', 90);
        allstudents[1] = new Student("李四", '女', 80);
        allstudents[2] = new Student("王五", '男', 75);
        allstudents[3] = new Student("赵六", '女', 60);
        allstudents[4] = new Student("孙七", '男', 55);
        allstudents[5] = new Student("周八", '女', 45);
        allstudents[6] = new Student("吴九", '男', 35);
        allstudents[7] = new Student("郑十", '女', 25);
        allstudents[8] = new Student("王十一", '男', 15);
        allstudents[9] = new Student("赵十二", '女', 5);

        ClassDataInterlmpl1 classData = new ClassDataInterlmpl1(allstudents);
        classData.printAllStudentInfos();
        classData.printAverageScore();
    }
}
