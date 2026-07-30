# Day4 学习笔记

## 📅 日期
2026-07-30

## 🎯 今日学习目标
- 理解 break 和 continue 的区别
- 学习循环嵌套
- 理解死循环
- 进行综合实战 计算器 猜数字 验证码 


## 知识点
### 1. break 和 continue  
- **break**：跳出整个循环，继续执行循环后的代码
- **continue**：跳过本次循环，直接进入下一次循环的条件判断 只能在循环中使用

### 2. 循环嵌套
循环再嵌套一个循环
外部循环每循环一次，内部循环会全部执行完一轮

### 3. 死循环
for(;;){ }  
while(true){ }
do{ }while(true);

### 换行
print（） 不换行  println（） 换行 

### 拓展
Math.random() 生成0-1的随机数 [0,1)

## 今日代码
- Demo1.java：死循环练习
- Demo2.java：循环嵌套九九乘法表
- Demo3.java：break和 continue区别
- Demo4.java：简易版计算器开发
- Demo5.java：猜数字小游戏
- Demo6.java：验证码


## 面试小题
**Q：break 和 continue 的区别？**
> A：
> - break：用于完全终止循环（或 switch），跳出当前代码块
> - continue：用于跳过当前循环的剩余语句，直接进入下一次循环的判断
> - break 可以用在 switch 和循环中；continue 只能用在循环中

