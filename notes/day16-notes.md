# Day16 学习笔记

## 📅 日期
2026-08-28

## 🎯 今日学习目标
- 理解 ArrayList 的底层结构（数组）
- 掌握 ArrayList 常用方法（增删改查）
- 理解 ArrayList 的扩容机制（面试高频）
- 用 ArrayList 存储自定义对象
## 知识点总结
##### 1、ArrayList
ArrayList代表集合，用来装数据的，类似数组，但是容量大小可变，功能丰富，开发中用的更多。
(1)、创建ArrayList对象：**ArrayList<String> list=new ArrayList<>();**

(2)、遍历集合：**for(int i=0;i<list.size();i++){String s=list.get(i);System.out.println(s);}**

| 常用方法                                          | 说明                          |
|:----------------------------------------------|:----------------------------|
| public ArrayList()                            | 创建一个空的集合对象                  |
| public boolean add(E e)                       | 在集合的末尾添加一个指定的元素，并返回true     |
| public void add(int index,E element)          | 在集合的指定索引位置添加一个指定的元素，并返回true |                            |
| public E get(int index)                       | 返回指定索引位置的元素                 |
| public int size()                             | 返回集合中元素的个数                  |
| public E remove(int index)                    | 删除指定索引位置的元素，并返回被删除的元素       |
| public boolean remove(Object o)               | 删除指定元素，并返回删除是否成功            |
| public E set(int index,E element)             | 修改指定索引位置的元素，并返回被修改的元素       |

## 今日代码
- Test1.java 智能家居开关系统
- Test2.java 学习Array List
- Test3.java Array List实战练习

## 🎤 面试小题（Day16）
### Q1：ArrayList 的扩容机制是什么？
> A：
> - 初始容量 10
> - 容量不够时，扩容为原来的 1.5 倍
> - 通过 `Arrays.copyOf()` 拷贝到新数组
> - 扩容代价较高，如果知道大概数据量，建议用 `new ArrayList<>(capacity)` 指定初始容量

### Q2：ArrayList 和 LinkedList 的区别？
> A：
> | 对比 | ArrayList | LinkedList |
> |---|---|---|
> | 底层 | 数组 | 双向链表 |
> | 查询 | 快 O(1) | 慢 O(n) |
> | 增删 | 尾部快，中间慢 | 首尾快，中间慢 |
> | 内存 | 连续空间 | 节点分散 |
> - 查多用 ArrayList，增删首尾多用 LinkedList

### Q3：ArrayList 是线程安全的吗？怎么解决？
> A：
> - 不安全
> - 多线程场景用 `CopyOnWriteArrayList` 或 `Collections.synchronizedList()`

### Q4：ArrayList 能不能存 null？
> A：
> - 可以，ArrayList 允许存 null 值