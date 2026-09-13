# Day17 学习笔记

## 📅 日期
2026-09-12

## 🎯 今日学习目标
- 认识异常
- 异常的作用
- 自定义异常
- 处理解决异常


## 知识点总结
#### (一)、认识异常
Java异常体系：Java.lang.Throwable之下的异常类。

Throwable(父类)-->Error/ (Exception-->RuntimeException/其他异常)

>**Error**:系统级别错误（严重问题），系统出问题会封装成Error对象抛出，如：内存溢出、栈溢出等。
>
> **Exception:异常**，程序运行过程中出现的问题，又分为**运行时异常和编译时异常**。
>
>       RuntimeException:运行时异常，程序运行过程中出现的问题，如：空指针异常、数组越界等。
>       编译时异常：编译时出现的问题，如：语法错误、类型转换错误等。
>       
>       抛出异常：方法() throws 异常1,异常2{ }//或遇到两个异常只抛出父异常Exception。
>       捕获异常：try{ }catch(异常类型1 变量){ }catch(异常类型2 变量){ }


#### (二)、异常作用
1、用来定位程序bug关键信息

2、可以作为方法内的一种特殊的返回值，以便通知上层调用者，方法的执行出现问题，用来查找bug。

#### (三)、自定义异常
1、Java无法定义所有异常，企业内部某种问题想通过异常管理，以便用异常来管理问题，需要**自定义异常**。

2、自定义编译异常：定义一个异常类继承Exception类，并重写构造方法，通过throw new 异常类(**) 创建异常对象并抛出。

3、自定义运行时异常：定义一个异常类继承RuntimeException类，并重写构造方法，通过throw new 异常类(**) 创建异常对象并抛出。

4、如果想要表达**强烈的提醒**(他人易犯的错误)，就要用**编译时异常(少用)**，若然程序员自己能避免(别人不易犯错)，就使用**运行时异常(多用)**。

#### (四)、异常处理方案
1、底层异常层层上抛，最外层捕获异常，记录下异常信息，并响应适合用户观看的信息进行提醒。

2、最外层获取异常后，尝试重新修复。


## 今日代码
- Demo1.java 学习认识异常
- Demo2.java 异常的作用
- Demo4.java 自定义异常
- Demo3.java 处理解决异常

## 🎤 面试小题（Day17 · 高频）

### Q1：Checked Exception 和 Unchecked Exception 的区别？
> A：
> - Checked Exception（编译时异常）：
    >   - 继承 Exception（不含 RuntimeException）
>   - 编译时必须处理（try-catch 或 throws）
>   - 如 IOException、SQLException
> - Unchecked Exception（运行时异常）：
    >   - 继承 RuntimeException
>   - 编译时不强制处理
>   - 如 NullPointerException、ArrayIndexOutOfBoundsException

### Q2：try-catch-finally 中 finally 一定会执行吗？
> A：
> - 大多数情况一定会执行
> - 两种例外：
    >   1. `System.exit(0)` 直接退出 JVM
>   2. JVM 崩溃或断电

### Q3：final、finally、finalize 的区别？
> A：
> | 关键字 | 作用 |
> |---|---|
> | final | 修饰类（不可继承）、方法（不可重写）、变量（不可修改） |
> | finally | try-catch 中的代码块，用于释放资源 |
> | finalize | Object 类的方法，GC 回收对象前调用（已废弃，了解即可） |

### Q4：throw 和 throws 的区别？
> A：
> - throw：方法体内，主动抛出一个异常对象
> - throws：方法签名上，声明可能抛出的异常类型

### Q5：你在实际项目中怎么用异常的？
> A：
> - 在业务方法中用 try-catch 捕获异常，给用户友好提示
> - 自定义异常类处理业务校验（如年龄不合法、余额不足）
> - 在 finally 中释放资源（如关闭文件流）
