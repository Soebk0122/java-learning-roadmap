# Day3 学习笔记

## 📅 日期
2026-07-29

## 🎯 今日学习目标
- 掌握分支结构和循环结构中的
- 理解分支条件和循环条件的书写规范
- 能用分支语句解决实际问题


## 知识点

### 1. if 分支语句
- 单分支：if (条件) { ... }
- 双分支：if (条件) { ... } else { ... }
- 多重分支：if (条件1) { ... } else if (条件2) { ... } else { ... }
满足条件就运行 

### 2. switch 分支语句
- switch (变量) { case 值1: ... break; case 值2: ... break; ... default: ... }
- 表达类型只能是：byte、short、char、int、String 不支持double、long、float、boolean
- case值不能重复 不能是变量
- 不能忘记 break 否则会穿透
- 如果重复值 直接不写break直接穿透 简化代码
- 等于哪个值就运行哪个 都不满足就运行 default
- 冒号别丢

### 3. 循环结构
- for 循环：for (初始化; 条件; 迭代) { ... }
- **while 循环**：while(条件){ 循环体 （先判断后执行）
- **do-while 循环**：先初始化语句 do{ 循环体 }while(条件);（先执行后判断，至少执行一次）
- for循环变量不能在外面继续使用 while的可以

## 今日代码
- Demo1.java：if结构练习
- Demo2.java：根据学生成绩输出等级
- Demo3.java：自动驾驶汽车过红绿灯
- Demo4.java：switch结构练习
- Demo5.java：for循环结构练习
- Demo6.java：while循环结构练习

## 面试小题
**Q：if 后面的条件表达式结果必须是什么类型？**
> A：必须是 `boolean` 类型。  
> Java 不允许用 `0` 或非 `0` 表示真假（和 C/C++ 不同）。   

**Q：switch 能否作用在 byte、long、String 上？**
> A：
> - 可以作用在 byte、short、char、int 及其包装类
> - JDK7 之后可以作用在 String 上
> - **不能作用在 long** 上，因为 long 范围过大，不适合作为标签

**Q：for 循环和 while 循环的区别及如何选择？**
> A：
> - for 循环：知道循环次数时使用（如遍历数组），结构紧凑
> - while 循环：不知道循环次数，只知道结束条件时使用
> - 两者可以互相转换，功能上没有本质区别

