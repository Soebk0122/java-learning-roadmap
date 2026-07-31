# Day5 学习笔记

## 📅 日期
2026-07-31

## 🎯 今日学习目标
- 掌握 String 的不可变性
- 区分 String / StringBuilder / StringBuffer


## 知识点
### 1. String
- String 是不可变的，一旦创建，就不能修改。
- String 使用不需要导包

### 2. 创建String对象的两种方式
- 方式1：String s = "hello";  直接赋值
- 方式2：new  

| 构造方法 | 说明 |
| --- | --- |
| `public String()` | 创建空白字符串，不含任何内容 |
| `public String(String original)` | 根据传入的字符串，创建字符串对象 |
| `public String(char[] chs)` | 根据字符数组，创建字符串对象 |
| `public String(byte[] chs)` | 根据字节数组，创建字符串对象 |

扩展  

| 方法名                                                       | 说明                                                     |
| :----------------------------------------------------------- | :------------------------------------------------------- |
| public int length()                                          | 获取字符串长度返回（字符个数）                           |
| public char cahrAt(int index)                                | 获取某个索引位置处的字符返回                             |
| public char[ ] toCharArray()                                 | 讲当前字符串转换成字符数组返回                           |
| public boolean equals(Object anObject)                       | 判断当前字符串与另一个字符串的内容是否一样，一样返回true |
| public boolean equalsIgnoreCase(String anotherString)        | 判断当前字符串与另一个字符串的内容是否一样（忽略大小写） |
| public String substring(int beginIndex,int endIndex)         | 根据开始和结束索引进行截取，得到新的字符串（包前不包后） |
| public String substring(int beginIndex)                      | 从传入的索引处截取，截取到末尾，得到新的字符串返回       |
| public String replace(CharSequence target,CharSequence replacement) | 使用新值，讲字符串中的旧值替换，得到新的字符串           |
| public boolean containt(CharSequence s)                      | 判断字符串中是否包含了某个字符串                         |
| public boolean startsWith(String prefix)                     | 判断字符串是否以某个字符串内容为开头，是则返回true       |
| public String[ ] split(String regex)                         | 把字符串按照某个字符串内容分割，返回字符串数组回来       |
### 3. String的比较
基本数据类型比较的是数据值
引用数据类型比较的是地址值  
equals()比较内容是否相等 euqalsIgnoreCase() 不考虑大小写   
==默认比较地址值  

### 4. StringBuilder
- StringBuilder 是可变的，可以修改。 可以看作一种容器 作用：提高字符串的操作效率
- 构造方法

| 方法名 | 说明 |
| --- | --- |
| `public StringBuilder()` | 创建一个空白可变字符串对象，不含有任何内容 |
| `public StringBuilder(String str)` | 根据字符串的内容，来创建可变字符串对象 |   

- 常用方法  

| 方法名 | 说明 |
| --- | --- |
| `public StringBuilder append(任意类型)` | 添加数据，并返回对象本身 |
| `public StringBuilder reverse()` | 反转容器中的内容 |
| `public int length()` | 返回长度（字符出现的个数） |
| `public String toString()` | 通过toString()就可以实现把StringBuilder转换为String |

## 今日代码
- Demo1.java：String的两种创建方式
- Demo2.java：String的比较
- Demo3.java：StringBuilder


## 面试小题
**Q：String 为什么不可变？**
> A：String 类被 final 修饰，底层数组也是 final，创建后不能修改，线程安全，适合做 key。

**Q：StringBuilder 和 StringBuffer 区别？**
> A：StringBuilder 线程不安全但效率高，StringBuffer 线程安全但效率低；单线程用前者，多线程用后者。  写法一模一样