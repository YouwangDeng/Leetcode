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

OA2: 1） two sum closest, return一个Pair 2）max average node 感觉实习的OA就那么4-5道的题库

1. Count substrings with K distinct characters：
计算含k个不同字符的substring的数量

2. find subtree with maximum average node：
给一个树。求每一个子subtree的平均值（只计算子树的平均值，不用计算叶子），找出最大值。

1. Count substrings with K distinct characters
2. Most popular Category node.

第一题 distinct k character
第二题 high five

第一题是给定一个数组和一个上限，要求你从数组中找两个数，使得两数之和最接近某个上限。
第二题是给你学生的id和成绩，一个id可以有多次成绩，要求你为每个id找出其最好的5次成绩的平均值。

1. k-distinct character substring, 楼主一开始只过了一半的case, 后面发现是返回的substring array要求不能重复, 所以改为用hashset, 返回前cast一下就好了
2. maximum average of child nodes

第一道是 two closest sum， 背景知识是亚麻卡车装货物， 找到两个containers 加起来可以装的weight最多且小于maxCapacity， 属于single array 找two closest sum
第二道是 highest five, 背景知识是有一堆productID 和product的reviews， 给每一个productID找出最高的五个review的平均值，用priorityqueue做就可以，注意data type是double

1. longest palindromic substring
2. 卡车送货，选取最接近capacity的两个
3. 找出句子里面最多but not in the word to exclude list
4. count number of substrings with exactly k distinct characters
5. maximum minimum path
6. reOrder log files
7. find subtree with maximum average node
8. Highest 5
9. Top k closet numbers/找最近的k个restaurants
10. remove obstacle
11. find subarrays of size of with no duplicates
12. merge two sorted linkedlist
13. find substrings of size k with k-1 distinct characters
14. 有一排数据中心，求最小的cost把所有的数据中心连起来 (MST)

1. closet sum
2.high 5

1，给一个容器，一个list表示物品重量，找到两个和最大且不超过最大限额的物品重量
2，返回平均值最大的子树的树节点

1. substring with k distinct Character，字符串长度不必须是k。我提前准备了这道题，悲剧的是我准备的也不完全对，有6个隐藏的test过不了，调试了快50分钟也没做出来，太菜了。。。
2. High Five。这个和地里面经一样。我用的是HashMap<Integer, PriorityQueue>.

题库基本也没变，但是又小的变形。比如distinct k substrings， 有的要求substring长度也为k，有的没要求，有的要求长度是k-1。提前准备一下也没问题。

![oa2_9](https://i.imgur.com/bYRsqSN.jpg)
![oa2_10](https://i.imgur.com/coRUTLR.jpg)
![oa2_11](https://i.imgur.com/9UXlwSQ.jpg)

领扣吴酒柒


貢獻 data point (1/31 OA2 deadline )

1. High Five[]()
    http://www.th7.cn/Program/java/201610/977868.shtml
    我是用java 寫的  
    地里原題，不過值得注意的是 input 是 ArrayList<productscore> , 而這個productscore class 是題目定義的，但沒有把class 定義寫出來! 我是看到input 才知道productscore 有 productId 和 reviewScore 這兩個member variable.
   (ps, 需要自己import 自己要用到的package, ex: import java.util.HashMap;)


2. Count number of substrings with exactly k distinct character



#面试攻略
* https://wdxtub.com/interview
* http://52.14.116.56/categories/

# Notes About Interview
* first understand the problem
* Write some constrains on the comment
* Problem to solve on the comment
* Ask for clarification
* Create a general example
* Don’t rush to code
* Explain your ideas
* Ask for hint
* Coding
* Write short comment on code block

## Amazon VO Prep
### Behavioral Questions
* 主要还是考behavior吧 网上有很多这方面的问题 选几个问题 一定要准备一些例子project什么的 而且要特别具体
* 多笑笑 让他觉得你是一个挺好交流的人
* 面试感受挺push虽然问的都很简单面试官是个老印manager
* 一开始问了20min简历。。问的超级详细从产品是什么到技术细节，到每一个环节
* 讲一件没有达成自己目标的事情
* 1. 先解释项目
* 1.1 项目怎么展开的
* 1.2. 项目中遇到了哪些困难
* 1.3. 项目中技术trade off
* 2. 以往有限时间内必须拿出结果的经历
* 2.1. 为什么选了某个特定的技术
* 2.2. 有没有什么规划好却没有实现的功能
* 3. 最自豪的经历
* 然后我问了他十分钟问题，包括他的工作(中间层)，career path / opportunity 巴拉巴拉。
* 一開始問了我的背景和project，BQ 要我說一個要compromise小細節來趕上的deadline的經驗。
* BQ: Tell me about a time when you had difficulty working with someone on a side or class project?
* What did you do to overcome this?
* 首先让我自我介绍
* Tell me about a time when you had difficulty working with someone on a side or class project?
* What did you do to overcome this?
* 我问
* 1.我对cybersecurity 有兴趣但没有prior experience 能不能选组后进去学习
* 2 有没有机会接触echo dot, kindle等产品
* 3 给即将毕业的我一些建议 
* 他们都回答得非常认真 且说第三题问得很好
* 要求提前15min 进Amazon chime， 然后坐等， 等时间差不多了打开摄像头。 之前可以先看到面试官名字， 刚开始看见名字 好奇怪以为是个三姐 心里默念大悲咒。结果开摄像头发现是个大胡子白人大哥 心里顿时定下来了
* 上来 简单的自我介绍一下 
* BQ： 有没有遇到过需要赶deadline 的project 怎么处理的 ：答： 有，期末project， reprioritize tasks 然后produce working product
* bq： 现在的学习目标或者工作目标： 答： 多学点技术，准备工作 掌握基础知识， 之后打算自己想搞开发，研究新商业模式
* bq： 说一个你具体的project： 之前有工作半年， 所以扔了一个网址给面试官看， 然后带他走了遍当时用的technology，面试官说thanks for sharing， 然后就没深究
* 说challenge project
* 一点点经验总结： vo 气氛还是很重要的，决定你过不过。 12月面谷歌两轮，面试官全程严肃究代码错误，跪。 dropbox 没写完 面试官严肃教我写代码 跪。 谷歌拒信隔了一礼拜发的，dropbox 第二天就发了。
* vo亚麻面得很是轻松，面我的是security 组的manager，白人大哥。 先问的bq 问了10分钟（认真准备下 我觉得我就是靠bq答得好过的，最好能展示下lauch 到 aws 成品的项目，不然面试官看不到会各种细究技术问题直到他觉得这个项目你真的参与了）
* 面试是叫amazon chime，一个像Skype 可以视频的东西，coding 是一个coding pad 链接，叫Livecode 不用 share screen 但是全程开摄像头
* vo的话就是一个 文档，只是不是google doc 是amazon 自己内部的系统 面试官先把题写在上面，再开给你的
* 类似Describe a situation in which you took extra responsibility for a task that does not belong to you..
* 然后各种细究做了哪些task，是哪个project，有哪些responsibility之类的。。
* 刚刚面完了virtual interview对方是一个说不清哪里人的大叔，全程效率都很高，直奔主题。先介绍了一下他自己，是一个组的manager，手下有20几个人，然后让我介绍一下自己，平常喜欢做什么，做过什么project。稍微跟我讨论了一下简历上的一个project之后问了一个behavior，让我说一个需要很快时间学习一个新知识来完成的项目。
* 好好提高 BQ这方面吧。 我当时大二大三的时候 遇到BQ 问题总是各种挂，然后后来就找美国朋友陪我狂练 BQ，直到后来研一的时候面亚麻实习，小哥问我两个 BQ 问题，我在没有准备的情况下 马上给他编了两个故事 最后毫无破绽地过了。包括 Fb，airbnb 也会注重 culture fit 所以也会问不少 BQ的。
* 首先，连自我介绍都没有让我做，直接开始问我问题：
* any project that i take extra responsibility，然后一个个问题深揪，包括问我react redux的内容，还好最近在写这方面的，都回答上了。
* any project that i use analysis什么之类的，我说了我之前的intern，然后又是将近的深揪，问到我吐血。




### Coding Questions
* pow(), 写了O(logN)的解法
* 考的题很简单 领口零八 我也没想到会是这东西= =
* String to Integer
* 后来开始算法，题目很简单就是象棋中骑士从a点到b点到最短距离。。详细的问了dfs和bfs
* 面试官的头从头摇到尾。。。
* 相似题太多了吧😂就是一个2d array上点到点的最短距离
* 烙印的摇头就是点头认同...
* 利口六尔易 请问楼主vo面试的时候题目是用最优方法写的还是用的priority queue写的 用priorityqueue写的
* find longest reapted substring 还有给与一个数组， 输出出现次数为基数的数字 第一题
* 8会，只会做without repeat。 第二题用hashtable 解， 最后问能不能优化，优化了一下。
* 一开始先让我问问题， 然后问我数据结构， 然后扣丁， 然后bq, 然后再问问题
* 就是banana 返回ana tomato 返回to说input can be anything
* 题目是给一个先递增后递减的数组[1,2,3,4,5,4,3]。查找一个数，返回true和false，问了边界怎么处理，有负数怎么办，有重复的数字怎么办。
* easy的括号匹配，follow up我自己提出来了，然后解释一下为什么要用数据结构
* easy题的follow up还是easy哈哈哈，就是括号包扩自定义括号，用一个map就可以啦
* 之後來了一道超簡單的題。 一個機器人在infinite的grid上，可以往上下左右走， 從（0，0）開始，給你一list的command，記錄在每個點經過多少次。 跟他講了思路，解釋了complexity。他說ok，然後就寫出來。
* 不需要. 他們自己的code editor run不了code 
* boolean hasDuplicate(String input)
* void printDuplicateByFrequency(String Input）
* 接着就问coding 用一个link进去后会是个共同编辑的网页
* 问一个string input里 有没有duplicate words
* 我一开始以为是duplicate characters 埋头写了下去
* 面试官提醒我说我是要找word
* 赶紧把code改了下
* 写到一半他看我用list 问我知不知道time complexity
* 我想了下说这样会是n平方
* 他问能不能改进
* 我说用map
* 他说还有个结构原理一样 但问我key, value打算用什么 就让我继续写完
* 写完后问map的 time complexity
* 我想了下差点讲成n 突然想到是O(1)
* 他说没有错 问知不知道原理
* 我就讲了string.equals()的计算方式 也就是hashing 
* 到这他知道我了解原理 就跟我说不知道我学校有没有学到HashSet这结构 原理相仿但可以省下space
* 接着第二题是第一题变形 要将string input里找frequency由高至低 print 出每个word
* 他说不一定要用前面写的code
* 我就改用hashtable 将value当作出现次数
* 最后要print的部分我说若是找最阳春的方式得花n平方时间
* 他问我哪有没有什么方法改进
* 我说如果能把hashtable里的资料sort过最好
* 但要挑比n平方快的
* 我说用mergeSort好了
* 他就说那假设已有mergeSort function存在让我用
* 我接下来怎么做
* 我说最好能够有个结构存放每个word 且有个field存放出现次数 若有comparator 的话那更方便
* 他就说comparator也可以假设已存在
* 让我继续写code 写完也问个 time complexity 
* 我说前面存放花n 后面print也花n 那么就是sort的时间了
* 他问那mergeSort的time complexity是什么 我想了下回答nlogn 他满意了就换问BQ
* Given a string return true/false if it contains any duplicate words
* I like ice cream -> False
* I really really like ice cream -> True
* 面試官說可以assume 全是lowercase . check 1point3acres for more. 第二個input 是true因為really重複了
* coding： 找岛屿数量, 然后给他看了，大哥觉得挺合理， 也没问时间复杂度和空间复杂度。 直接愉快的说我们现在有15min 问问题了 没上第二题, 可能是大哥本来就准备的少吧
* 之后15min 愉快的我问他答， 气氛倒时挺轻松的。
* leetcode 298
* 我只看了最直接的sum做法，他问有没有更好的，我说有啊二分法，结果写的时候就卡在怎么比较那里了。
* 所以教训就是，不管什么题一定要多看几种算法。祝大家好运。
* 做题20分钟，磕磕绊绊代码并没有百分百对，做之前有大概讲思路直到面试官说ok 我才开始写。 面试官没深究，连时空复杂度都没问，之后十五分钟纯聊天，聊亚麻的 working culture。过的提示是，他直接告诉我了是2-5天就能有回复，结果offer两天来。 
* num of island
* 忘提了 找岛屿数量稍微变了下型 要两个连续的1， 单蹦的一个1不算
* 第一题，zigzag 型打印出一个binary tree。楼主给了一个BFS的做法，面试官说不错，能不能再想另一种数据结构，我就说还能用stack做。
* 第二题，给一个由0和1组成的matrix，打印出duplicate的row的序列。
* 比如说：
* 01010
* 00011
* 00110
* 01010
* 00110
* 就打印3，4。
* 楼主刚开始的做法是把每个row看成binary representation然后转成numeric number，存在hashset里。
* 小哥哥问number太大怎么办，我说还可以转换成string存在hashset里
* 小哥哥又问能不能不转换任何东西做，给了提示说用别的数据结构
* 我说能用trie，然后写了一半说了一下想法，因为时间不够就没有在继续下去。
* 本来是面45分钟的，到了45分钟的时候小哥哥又开始问behavior question，最后到1小时才结束。
* 讲完之后coding用recursive的方式求一个数的factorial，想了一下写出来了。但是想太快，漏掉了input是负数这种情。
* LRU，count islands
* coding：
* coin change变形变形+变形，包括有可能不能change，有可能coin数量不够，一道dp+各种edge case要考虑，20分钟完全写不完。我把我的思路说了一遍，写了一些cases，面试官说算法是对的，写的也是对的，就是来不及完成。
* leetcode 69













       
