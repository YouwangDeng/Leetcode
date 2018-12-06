# Interview
## SnowFlake Snowflake Computing SDE Intern

## Akuna Capital Development Internship - Web
题是给篇文章，找重复单词。我开始用的set，然后在他的启发下改成了前缀树，虽然我并不知道他满不满意这个数据结构。. check 1point3acres for more.

而且当然是改不出来的，因为我既不会python也不会前缀树啊，我前两天一直在写string和vector<>啊orz……

然后就是第二轮电面
两轮45分钟
第一轮是OOP编程，写一个tic tac toc游戏，所有的方法都要自己想，自己写。但是不用跑。
第二轮是电梯设计，只用写伪代码。
搞笑的是，最后让我问问题，我问：你们啊困啊的work life balance怎么样（提示，这是一个黑色星期五上班的公司），他说：很好啊，你只要market开市的时候在就好了，我说：哦？那market几点开市啊，他说：八点半，虽然的确可能有点早，但是我们下班没有强制over time work的。我说：哦？那你们要求几点下班啊？他说：五点半。
说出来当个玩笑话，其实事实上fin tech的工作强度都是这样。
akuna的intern面试感觉很奇怪，同学的面试官说每年每个岗位只招5个intern。然后其实面试题，要么是有固定题库，要么就是大量非算法题，所以筛选标准还是有点奇怪的。
祝好。
补充内容 (2018-12-3 01:38):
timeline是
10.24 约一面时间
11.6 一面
11.7通知通过一面
11.19 确定final时间.
11.23 final round
11.27收到拒信

your project
OOP观念
decorator
why not list as default parameter. From 1point 3acres bbs
__callable__()
yield
GC/reference counting

有些考点会问比较准备的时候尽量多做点research

0. 讲一个project
1. encapsulation 和 abstraction2. inheritance3. decorator, property 和 classmethod4. yield5. with, 以及怎么应用在class里 （__enter__, __exit__）6. copy v.s. deepcopy，给了两个例子：
6.1: a = [1, 2, 3]; b = shallowcopy(a); b[0] = 10; 求 a[0]
6.2: a = [(1, 2), (1, 2), (1, 2)]; b = shallowcopy(a); b[0] = (1, 3); 求 a[0]
其实两个 a[0] 都是不变的，就算 a 是list of list 也是不变。。当时面试紧张脑袋短路一片空白第二个就答错了（虽然感觉第二个就是个坑。。）
7. is v.s. ==，一个例子：7.1: a = "阿库纳", b = "阿库纳"， 求 a is b 和 a == b
8. make object of a class callable (__call__)
9. garbage collection


1. 为什么要选择Akuna？（这个没准备，支支吾吾半天说我对这种高频交易公司很感兴趣。。）
2. 解释encapsulation和abstraction的区别
3. enumerate是什么
4. 为什么不使用mutable object 作为function的default parameter
5. yield是什么， generator是什么，有什么用处
6. == 和 is的区别
7. 如何使一个object callable？（这里我说了答案之后，他问我，你有没有用过，还好我老实回答了说没有，然后他给我说了下什么时候要用）
8. garbage collection

9. tell me about a project
10. challenge you face in 1, and how you overcome
11. inheritance (repeat两次才听清，我这渣听力）
12. oop里除了3还有哪些特点, 就encapsulation, polymorphism-baidu 1point3acres
13. how to use 'with' ?
14. use with for class, __enter__, __exit__
15. copy, shallow/deep, 举了个list赋值例子问是否==
16. difference between 'is' and '==', 举例子问true or false, string的话都是true, tuple的话is不是, 以及为什么
17. decorator, @classmethod和@staticmethod区别
18. generator, yield keyword有什么用
19. how to call an object (def __call__), 并让你举例(这个我真是停顿了几分钟，没听清他让我干嘛，后来才反应过来)-baidu 1point3acres
20. garbage collection, 以及会出现的问题 (refer cycle)
21. 最后提问

Inheritance
Composition
Garbage collector
Copy deepcopy 区别
如何reverse list，说两种方法。
Generator
Decorator
with statement用法

跟地里有的面经几乎一模一样，面试的是一个很nice的白人小哥，上来先让你描述一个project 然后问为什么对akuna感兴趣 
然后就开始问python概念题
1.encapsultaion 和 abstraction的区别
2.why shouldn't use mutable object as default argument in function 
3. map,filter,reduce的用法
4.什么是decorator
5. == 和is 的区别
6.enumerate是做什么的. From 1point 3acres bbs
7. how you make a python object callable
8. yield 是什么
9. garbage collection in python 
最后问我有什么问题问他 他说自己是infrastructure team的问我对哪个team感兴趣 
20多分钟就愉快的结束了 第二天收到了pass的邮件 

1. tell me about a project you worked on 
2. what's a technical challenge you faced?
3. how do you use "with" in python. 
3-2) If u have some class, what do you need to implement for "with"? (enter/exit)
what do u need to do for enter? (return obj)
4. what properties do decorators have? what's the difference between class decorator and static decorator?
5. define inheritance
6. diff between deep copy shallow copy?
6-2) diff between copy and renaming (reference)?
7. how does python handle garbage collection? when might there be a problem?