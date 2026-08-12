package com.example.day15.Test3;

public class ClassDataInterlmpl2 implements ClassDataInter {

    private Student[] students;
    public ClassDataInterlmpl2  (Student[] students) {
        this.students = students;
    }
    @Override
    public void printAllStudentInfos() {
        System.out.println("全班学生信息如下：");
        int malecount = 0;
        for (int i = 0; i < students.length; i++) {
           Student s = students[i];
           System.out.println(s.getName() + " " + s.getSex() + " " + s.getScore());
           System.out.println("--------------------");
           if (s.getSex() == '男'){
               malecount++;
           }
        }
        System.out.println("全班男生人数为：" + malecount);
        System.out.println("全班女生人数为：" + (students.length - malecount));
    }

    @Override
    public void printAverageScore() {
        System.out.println("全班平均分：");
        Student s1= students[0];
        double sum = s1.getScore();
        double max = s1.getScore();
        double min = s1.getScore();
        for(int i=1; i<students.length; i++){
            Student s = students[i];
            sum += s.getScore();

            if (s.getScore() > max){
                max = s.getScore();
            }
            if (s.getScore() < min){
                min = s.getScore();
            }
        }
        System.out.println("最高分：" + max);
        System.out.println("最低分：" + min);
        System.out.println("平均分：" + (sum-max-min)/(students.length-2));

    }
}
