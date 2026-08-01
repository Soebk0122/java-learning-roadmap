# Day6 学习笔记

## 📅 日期
2026-08-01

## 🎯 今日学习目标
- 继续学习 String / StringBuilder / ringBuffer
- String练习题
- 复习前五天内容


## 知识点
### 1. Stringjoiner  
跟StringBuilder一样看作一个容器 创建之后里面内容是可变的  
创建方法   

| 方法名 | 说明 |
| --- | --- |
| `public StringJoiner(间隔符号)` | 创建一个StringJoiner对象，指定拼接时的间隔符号 |
| `public StringJoiner(间隔符号, 开始符号, 结束符号)` | 创建一个StringJoiner对象，指定拼接时的间隔符号、开始符号、结束符号 |

| 方法名 | 说明                     |
| --- |------------------------|
| `public StringJoiner add(添加的内容)` | 添加数据 并返回对象本身           |
| `public int length()` | 返回长度（字符出现的个数）          |
| `public String toString()` | 返回一个字符串（该字符串就是拼接之后的结果） |    

### 2.遍历字符串
charAt()

## 今日代码
- Demo1.java：用户登录练习
- Demo2.java：Stringjoiner练习
- Demo3.java：遍历字符串查询大小写字母个数
- Demo4.java：字符串反转
- Demo5.java：java笔试题找素数

