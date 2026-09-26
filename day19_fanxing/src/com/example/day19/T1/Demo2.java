package com.example.day19.T1;

public class Demo2 {
    public static void main(String[] args) {
        MyArrayList<String> mlist = new MyArrayList<String>();//创建一个数组，包含5个Person对象，要求年龄从大到小排序
        mlist.add("张三");
        mlist.add("李四");
        mlist.add("王五");
        mlist.add("赵六");

        mlist.remove("张三");
        System.out.println(mlist);
    }
}
