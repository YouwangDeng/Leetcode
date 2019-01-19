# Interview
## SnowFlake Snowflake Computing SDE Intern
第一轮 skype 视频 + coding
1. reverse words in a string
略
2. Sum up a lot of numbers, in vector and linked list, which is faster, why?
vector, reasons:
1) cache locality 2) dereferencing costs CPU cycles 3) compiler optimization: automatic vectorization
3. kth smallest in an array
1) priority queue  2)quick select
4. RGB sort, in one pass
略
5. Design distributed storage server, supports fast query to find element at specific percentile e.g. find the element thats top 70% biggest
histogram updated on the fly

第二轮: skype 音频 + 聊天
1. Given dictionary, implement autocomplete
- Trie + backtracking
2. Given random number generator, calculate pi, how to test?
略

一个princeton的phd，另一个也是phd，结果没想到对bug free要求很高，感觉他们engineering强出一般的phd不少.....
第一轮聊的挺开心的，第二轮第一题写的bug百出花了太久。。。move on了。。。

#雪花公司#是做Cloud Data Warehouse的startup，提供的服务属于SaaS。base在SV，linkedIn显示公司规模在50-200人，我估了下developer大概在50%以上，team主力来自oracle和MS。目前基于AWS提供data warehous服务。今年春季拿到D轮100Million。所以应该是在扩招。HR说hiring all year round。BTW：他们在SIGMOD'16 有篇paper介绍设计和架构。似乎只接受官网直投不接受recruiter。

1轮店面的是个10多年经验的三哥，是从orcal跟过来的，在雪花干了4年多。店面40分钟水果没聊coding。回顾一下，一开始装懂行提问题耗了不少时间，可能也让三哥说的比较畅快愉悦。并没有遇到technical问题，可能是准备留到第二轮专门问，也可能准备扩充队伍所以水了。店面后1小时就收到了HR发的technical screen通知。湾区startup效率还是很高的。

第二轮是skype。啥也没准备就硬着头皮上了。面试官是西雅图分部美国大哥。前20分种聊prev project，问遇到了哪些challenging，怎么解决的。我一开始给自己挖了个坑扯到了不熟悉的项目，之后赶快绕出来了。还问了毕业后安排，学术界还是工业界，and why？后40分钟是coding部分，问题：两组integer找common。很久没练coding只能尬聊，说了个naive solution，勉强写出来。面试官说再写写optimal solution，卡了很久想不出，持续尬聊。最后在他提示下才意识到要hashmap。。。这会儿时间也来不及了。草草收尾。题目主要还是考察SQL相关知识，之后似乎还要往深问memory usage和scale的问题。

总体来说，面试官都很nice，HR回复非常快很有效率。但自己毫无准备水平也不行，只能是简单了解下面试的流程和感受，同时激励着我赶快刷题。很简单的问题就是想不出来，裸奔还是不现实。


snowflake是一家做Cloud Data Warehouse的startup

Snowflake
Pros: 
1. 做的东西很感兴趣，distributed cloud storage，挺有意思的。而且整个公司算是engineer driven，产品就是技术本身，未来发展基本靠engineer
2. 里面的人水平很高，即使是和Google相比也完全不落下风。工程师基本是senior以上的级别，大多是从ms，oracle跳来的，招的新人也以phd偏多。
3. 前景不错。商业模式清晰，近期融了不少的钱，也在扩张中，而且已经有企业用户
4. 面试体验很好，也很有诚意。面试体验应该是非常好，hr各种秒回邮件，和engineer面试沟通也很愉快，是面的所有公司里体验最好的。

Cons: 
1. It's a startup 有风险，而且近期没有ipo的计划
2. cloud warehouse这部分东西aws, azure自己也在做，不知道之后怎么样
3. 身为new grad比较在乎学习的机会，从cloud/distributed这方面看能学到不少东西，但是如果是更general来看可能Google能学到的东西还是会多一点。这个应该不算事cons，侧重点不同

Round A
1. reverse word in string (coding)
ex: I have a pen, I have an apple.
output: l evah a nep, I evah na elppa.
reverse words only, keep space and punctuations
2. sum up 10M numbers of element
array linkedlist which faster and why
3.find median in an array
sort -> find the median
how to sort?
merge heap time/space complexity
quick sort?. check 1point3acres for more.
how to improve quick sort to O(n)
Round B
1. B+ tree and BST compare
2. implement HashMap from scratch
what kind of hash function you want to use?
liner probin, cuckoo hashing
if the key,value pair exist , don't overwrite value, append it
ex (a,1) (b,2) (a,3)
lookup(a) -> 1,3
lookup(b) -> 2

snowflake 电话. 
1. iterator 接口实现 merge k iterator
2. 有些记不清了，是hashmap相关的

Behavioral Questions
Genuine
Collaboration
Passion

Signals Interviewer want to get from candidate:
* Resume Growing History

1.  事先去找找面试官的LinkedIn Profile, 看看面试官的背景，问问他为什么当初选了这家公司，刚进公司的时候有没有什么不适应或者需要注意的地方
2.  问问面试官现在在做的project, 表示无比崇拜之意
3.  问问未来公司的roadmap，表示自己对该公司的未来充满希望
4.  问问组里需要什么样背景的人，然后推销自己

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
1. how does python handle garbage collection? when might there be a problem?

# 字节跳动前端面试
了解TCP和UDP吗
说三次握手
为什么不是两次握手
了解编码吗，哈夫曼编码了解编码吗，哈夫曼编码
说说进程和线程的区别
作者：是猪头啊
链接：https://www.nowcoder.com/discuss/80133?type=2&order=0&pos=21&page=1
来源：牛客网

网络七层模型
DNS流程
死锁
银行家算法
系统调用的过程
内核级和用户级线程的区别
java和js的区别
解释jvm
快排（手写，时间复杂度，什么情况下最差，什么情况下最好）
数据库索引（什么情况下不能用索引）
Js的继承方法（手写）
cors
Node的内存模型，垃圾回收
Node的IO异步线程


第1个问题是viewport各个属性值的意义，以及如何实现不用viewport控制用户不能缩放，回答用js监听屏幕宽度。

第2个问题是设计弹出层的具体过程。

第3个问题是基础css水平垂直居中。

第4个问题是透明度问题。

第5个问题是点透问题。为什么会有点透现象。

第6个问题是http缓存机制。

第7个问题是五星好评点几颗星亮几颗，用css。

第8个问题是实现查询字符串中出现最多次数的字符，用js写代码。

第9个问题是三次握手四次挥手。

第10个问题是tcp如何保证有效传输及拥塞控制原理。

第11个问题是https具体流程。

第12个问题是进程线程，并发并行。

第13个问题是跨域，实现jsonp。

第14个问题是网络攻防xss。

第15个问题是cookie与session的区别。


第18个问题是一段js代码判断哪个先输出。

第19个问题是关于js请求需要时间的问题。

第20个问题是闭包问题，改进代码。

第21个问题是深克隆问题。




* https工作流程
    * 5 分钟理解 https 工作流程 https://www.jianshu.com/p/a68ca86183d7
* 