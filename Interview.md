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


第13个问题是跨域，实现jsonp。

第14个问题是网络攻防xss。

第21个问题是深克隆问题。




* https工作流程
    * 5 分钟理解 https 工作流程 https://www.jianshu.com/p/a68ca86183d7
* viewpoint
    * 常用的针对移动端网页的meta viewpoint大致是:
    
    ```
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no" />
这段代码的意思是，让viewport的宽度等于物理设备上的真实分辨率，不允许用户缩放。
width 控制 viewport 的大小
device-width 获取当前设备的宽度
initial-scale   设备初始缩放比例,就是当页面第一次 load 的时候缩放比例
maxium-scale    允许用户缩放的最大比例
manium-scale 允许用户缩放的最小的比例
user-scalable  设备是否允许用户进行缩放  'yes/no'
    ```
*  JavaScript:void(0)
    *  一般在写A标签的时候，格式是<a href="#">链接文字</a>,但是点击a链接的时候会自动跳转到页面的顶部，如果写成<a href="javascript:void(0)">链接文字</a>，就不会跳转，不会发生任何问题，等后面写完后添加连接的时候改成跳转后的地址就行了   

* 元素水平与垂直居中问题
    * https://www.cnblogs.com/coco1s/p/4444383.html  

* 霍夫曼编码
    * 霍夫曼编码（Huffman Coding）是一种编码方式，是一种用于无损数据压缩的熵编码（权编码）算法。
    * 霍夫曼编码使用变长编码表对源符号（如文件中的一个字母）进行编码，其中变长编码表是通过一种评估来源符号出现机率的方法得到的，出现机率高的字母使用较短的编码，反之出现机率低的则使用较长的编码，这便使编码之后的字符串的平均长度、期望值降低，从而达到无损压缩数据的目的。
    * 霍夫曼树又称最优二叉树，是一种带权路径长度最短的二叉树。所谓树的带权路径长度，就是树中所有的叶结点的权值乘上其到根结点的路径长度（若根结点为0层，叶结点到根结点的路径长度为叶结点的层数）。树的路径长度是从树根到每一结点的路径长度之和。   
* Java 与 JavaScript
    * JavaScript 是动态类型语言，而 Java 是静态类型语言；JavaScript 是弱类型的，Java 属于强类型；JavaScript 的面向对象是基于原型的（prototype-based）实现的，Java 是基于类（class-based）的；
* JavaScript的继承方式
    * http://www.cnblogs.com/humin/p/4556820.html

* opacity与background-color:rgba()。
    * 那么，它们到底有啥区别呢？ 在使用opacity时，处了对背景生效之外，应用它的元素的内容也会继承它。
    * rgba不会产生继承问题
* 点透问题
    * touch和click事件混用造成的
    * touch 300ms后会触发click事件
    * https://www.jianshu.com/p/01ccc3d71852   

* http缓存机制
    * 强制缓存和对比缓存
    * F5（对比刷新，如无变化就用缓存）
    * CTRL+F5（删除缓存，强制刷新） 
    * https://juejin.im/entry/599afbe5f265da247c4ee6e3

* React diff算法
    * tree diff
    * component diff
    * element diff
    * https://zhuanlan.zhihu.com/p/20346379

* JavaScript的深拷贝和浅拷贝
    * https://segmentfault.com/a/1190000008637489 

* 对JavaScript闭包的理解
面试对细节考察很多，特别是JavaScript基础

* 需要事先想好怎么介绍自己   


# Amazon OA
## Amazon OA1
debugging 部分
1. appearsK element 
2. count element, return element greater than twice of input n. 
3. 去掉vowl
4. median val  （名字记不清了）
5. palindrome （他的做法是直接reverse input num， 然后判断是不是和原数字相等，需修改return 里面的num 为temp， num 已经被updated了）

reasoning 部分
1. 2, 5, 26, ___  (前一个数平方加1， 5=2^2+1, 26=5^2+1, ...)
2. tennis -> ...  (面经原题）
3. solar company （面经原题，连着2个问题）
4. ABCD 四个人做8个东西，每人做俩，怎么分配（面经原题，连着3个问题）

5. 买东西要不要付运费，jacob， emma （面经原题）


1. Count Element 要return number of elements in the input array which are greater than twice the input number n y要改一下for loop里面的statement和array【i+1】 变成array【i】
2. count number of occurrence of 'A' or 'a' 把&& 改成||

3. 这个没有见过 是 median value return the median of the even sized array after merging two arrays and sort the element 改成 arr2【i-size】
4. get digitsumparity 是要找到sum of digits of the smallest element in the input array 是把num = num/10 挪到后面

debug我记下的几道题是(想发大照片，但是资格不够，发不了)：. 1point3acres
1. returns the number of elements in the input array arr which are greater than twich the input number n. 很简单，忘了咋改

2.returns the number of occurrences of uppercase 'A' or lowercase'a' in the input string str. 应该是加个i++

1. returns an integer which is the reverse of the digits. 376->673.  reversedNum = reversedNum*10 + remainder

2. return an integer representing the sum of the distinct elements in the given array. 改sort和sum initial的顺序

3. returns the count of the unique elements in an array. 改flag, 那个题是输入一个int array,和int array 的size（非要给你，没啥办法），然后算distinct elements的个数，他新建了一个int array。flag是一个int（但是和boolean差不多），大概就是遇到和之前的一样，改一下flag，就不在新array里面动了，不一样的在新array加一下，然后count++。你就注意flag是1还是0，然后原array和新array元素赋值就差不多了


阅读都是变种，比如四个人在房间四个角，就出了好几道，主题干都是一样，只要画图就可以秒。

找规律把字母翻译成数字就好，都是普通题目，比如相隔几位。没有质数之类的偏题。

 debugging有两道新题，第一第二道，建议一时找不出来的先做后面几道（没错说的我自己），后面几道都很简单。 reasoning部分都是以往面经题，字母找规律最好提前写好字母表和数字的对应关系节省时间
 
 OA1 面经整理
 http://52.14.116.56/2017/09/03/Interview/Interview-Amazon-OA1-Logic/
 
debug的部分都是新题，我碰到的有两道题的代码还很长。。。如果碰到有arraysort的那道，就是顺序反了；还有一道是n和length的问题。。。其他的记不清了。。。sigh
logic部分看小土刀就行了，几乎都是原题，有个按照条件选择的是新题，不过套路都是一样的，仔细判断下就行了。不过一定要熟悉面经，不然根本来不及做完

OA1，deugging基本都是面经题，但是！如果想现场把每题code都看懂然后靠自己找出bug，时间是非常紧张的！所以还是建议提前看面经，做题的时候分配好时间，时间不够就别看code了直接按面经改吧。
logic题目不难面经题目也多，时间也够用，所以觉得看面经用处不是特别大。提前在纸上写上26个字母对应的数字就行。

1.24收到的oa, 2.7截止。今早做的oa1，debug全在射程范围内啊～～ logic有经典的判断方向，环保公司，身高问题。似乎我的逻辑题没有质数和圆桌那些的，都很简单，仔细点看题就可以了。

debug和logic我都有十几分钟剩余时间，可以慢慢做。

Debug全部截图都有，logic只有后半部分的（前面怕来不及就没截）。都是地里原题，debug有一道新题，当场做出来的 也不难。

逻辑题（背熟应用题题干，很重要！！）：
应用题1：A manufacture company has 8 products and 4 divisions. Four divisions are lead by Alan, Betty, Cathy, Diana. The 8 products are: mixer, iron, water pump, geyser, juicer, blender, grinder, and heater. Each division produces 2 products, no 2 divisions produces the same product. Diana’s division produced Geyser, Cathy’s division produces water pump. Mixer and iron areproduced by division lead by Alan and Betty respectively. The division that produces mixer doesn’t produce blender.

应用题二：
Conditions for appointing a distributor, for petroleum gas throughout Georgia, are as follows. The applicant should:
Be an American by nationality
Be in the age group of 21-50 years as on 5th September, 2008
Be at least a high school graduate or any other recognized equivalent
Be a resident of Georgia. He/she should have stayed in Georgia for not less than 5 years, immediately preceding the date of application.
Have a family income of not more than $30,000 annually.
Not have dealership of any oil company
Not have any close relative as a dealer/distributor of any oil company
However,
Restrictions related to annual income would not be applicable to applicants working in corporations, owned or controlled by state departments. Such a case should be referred to the Managing Director
For unemployed applicants who hold at least a bachelor’s degree, conditions (6) and (7) may be waived
If an applicant is from a rural district but is not a resident of Georgia, the case may be referred to the Chairman.

debugging
https://drive.google.com/open?id=1PyQpmOx4aCcl6fNRY6bwCagOLn2Z95DF

## Amazon OA2
1. Find Num of Substring with K distinct chars
2. 最大平均值子节点
![oa2_1](https://i.imgur.com/TPhBdMf.jpg)
![oa2_2](https://i.imgur.com/80m0bRh.jpg)
![oa2_3](https://i.imgur.com/NC9gBeJ.jpg)
![oa2_4](https://i.imgur.com/ju3PyCg.jpg)

1. high five 地里描述一大把，就不叙述了，题内容也都一样
2. 平均数最大的子树，注意！！！不是第二层的最大平均值而是整颗树的最大平均值。（领扣有原题，地里之前提到过，具体哪题忘了，可以去看看之前的帖子）

两道面经题，k-1 distinct substring，highest five，具体见图。work simulation是survey形式根据自己情况选就行

![oa2_5](https://i.imgur.com/yWZp1Rl.jpg)
![oa2_6](https://i.imgur.com/ZxDR7HT.jpg)

![oa2_7](https://i.imgur.com/JQIUViZ.png)
![oa_8](https://i.imgur.com/M622RxR.png)

OA2，不知道写brute force和优化的算法最后会不会区别对待，但是优化一下感觉也不是很难…
k substring (length k with k - 1 distinct characters)，用了双指针
average of top 5 scores: 用了map + priority queue








       
