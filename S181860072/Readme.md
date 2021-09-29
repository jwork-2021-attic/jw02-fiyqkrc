# 作业二

## 任务一

1. 类图:

   ![character](https://github.com/jwork-2021/jw02-fiyqkrc/blob/master/S181860072/uml/characters.png)

2. 时序图:

   ![timeline](https://github.com/jwork-2021/jw02-fiyqkrc/blob/master/S181860072/uml/timeline.png)
   
3. example

   - BubbleSorter是Sorter接口的实现,方便实现其它的排序算法;
   - Gourd继承于Linable,是一种可排序的对象的具体实现,方便实现其它的可排序的对象;
   - 葫芦娃的实现采用了枚举的方式完成,如果面对任务二这样的很多对象的场景,一一声明每个妖精并为他们随机分配位置可能会是很痛苦的一件事,可以考虑用写成普通类,在类外创建对象,利用静态类成员变量实现不同类的对象之间的排序.

## 任务二

**工作内容:**

- 根据example中的Geezer和Gourd改写创建了Snake和Monster类;

- Monster不再是枚举类型,而是普通的类;

- 实现了两种排序算法:选择排序,快速排序.(因为快速排序的swap步骤次数多,录制的cast过大无法上传,所以以下两个可视化排序的展示链接都是选择排序算法.)

- 在scene中实现为每一个创建的怪物赋予一个不同的颜色并随机排成一排;

**相关类图:**

![task2](https://github.com/jwork-2021/jw02-fiyqkrc/blob/master/S181860072/uml/characters_task2%263.png)

**可视化链接:**

[![asciicast](https://asciinema.org/a/bI7ppj7AHtXXXNkxfOuACdCR2.svg)](https://asciinema.org/a/bI7ppj7AHtXXXNkxfOuACdCR2)

## 任务三

**工作内容:**

改写了Line中的`toString()`方法;同时改写了Monster中的`toString()`,在小于100的数字前加0,使方阵看起来整齐.

**相关类图:**

​	*与task2相同*

![task3](https://github.com/jwork-2021/jw02-fiyqkrc/blob/master/S181860072/uml/characters_task2%263.png)

**可视化链接:**

[![asciicast](https://asciinema.org/a/6SiW9mlis6kVDt40m62rWgwxN.svg)](https://asciinema.org/a/6SiW9mlis6kVDt40m62rWgwxN)

