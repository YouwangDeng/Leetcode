# Project & Experience Focus

| Project  & Experience | Challenges | Mistakes | Enjoyed | Why this framework  | do differently |
| :-: | :-: | :-: | :-: | :-: | :-: |
| Research Assistant-Python Numpy and Pandas |  |  |  |  |  |
| Aureus-Python Web Framework |  |  |  |  |  |
| EasyCareer-React Chat Web App |  |  |  |  |  |
| QuickSearch-Scrapy and Django search application |  |  |  |  |  |
| BlogPlaza-Spring Boot Blog Site |  |  |  |  |  |

# Research Assistant - Python numpy and Pandas
## Impacts
## numpy
## Pandas
## Graph Create
## Matplotlib

# EasyCareer - React Chat Web App
## Impacts
## React
* A JavaScript library for building user interfaces
* JavaScript tutorial
    * https://developer.mozilla.org/en-US/docs/Web/JavaScript/A_re-introduction_to_JavaScript#
* An important difference between JavaScript and other languages like Java is that in JavaScript, blocks do not have scope; only functions have a scope. So if a variable is defined using var in a compound statement (for example inside an if control structure), it will be visible to the entire function. However, starting with ECMAScript 2015, let and const declarations allow you to create block-scoped variables.
* JavaScript objects can be thought of as simple collections of name-value pairs. As such, they are similar to:
    * Dictionaries in Python.
    * Hashes in Perl and Ruby.
    * Hash tables in C and C++.
    * HashMaps in Java.
    * Associative arrays in PHP.
* Note that array.length isn't necessarily the number of items in the array.
* ES2015 introduced the more concise for...of loop for iterable objects such as arrays:
* for (const currentValue of a) {
  // Do something with currentValue
}
* You could also iterate over an array using a for...in loop, however this does not iterate over the array elements, but the array indices. 
* Another way of iterating over an array that was added with ECMAScript 5 is forEach():
* ['dog', 'cat', 'hen'].forEach(function(currentValue, index, array) {
  // Do something with currentValue or array[index]
});
* If you want to append an item to an array simply do it like this: a.push(item);
* JavaScript lets you call a function with an arbitrary array of arguments, using the apply() method of any function object: avg.apply(null, [2, 3, 4, 5]); // 3.5
* The first argument to apply() is the object that should be treated as 'this'.
* The second argument to apply() is the array to use as arguments; the first will be discussed later on. This emphasizes the fact that functions are objects too
* apply() has a sister function named call, which again lets you set this but takes an expanded argument list as opposed to an array.

    ```
    function lastNameCaps() {
      return this.last.toUpperCase();
    }
    var s = new Person('Simon', 'Willison');
    lastNameCaps.call(s);
    // Is the same as:
    s.lastNameCaps = lastNameCaps;
    s.lastNameCaps(); // WILLISON
    ```
* React quick tutorial
    * https://www.taniarascia.com/getting-started-with-react/
* React is not a framework (unlike Angular, which is more opinionated).
* React is used to build user interfaces (UI) on the front end.
* React is the view layer of an MVC application (Model View Controller)
* As you’ve seen, we’ve been using what looks like HTML in our React code, but it’s not quite HTML. This is JSX, which stands for JavaScript XML.
* JSX is actually closer to JavaScript, not HTML, so there are a few key differences to note when writing it.
    * className is used instead of class for adding CSS classes, as class is a reserved keyword in JavaScript.
    * Properties and methods in JSX are camelCase – onclick will become onClick.
    * Self-closing tags must end in a slash – e.g. <img />
* JavaScript expressions can also be embedded inside JSX using curly braces, including variables, functions, and properties.

    ```
    const name = 'Tania';
    const heading = <h1>Hello, {name}</h1> ;
    ```
* A class component must include render(), and the return can only return one parent element.
* props is read-only, state can change
* To update the state, we’ll use this.setState(), a built-in method for manipulating state. 
* The new aspect to this code is componentDidMount(), a React lifecycle method. Lifecycle is the order in which methods are called in React. Mounting refers to an item being inserted into the DOM.
* When we pull in API data, we want to use componentDidMount, because we want to make sure the component has rendered to the DOM before we bring in the data. 
    
## Redux
* use redux to manage store and update store
* use redux-thunk library to deal with asynchronous actions
* use react-redux to connect react and redux, no need to write subscribe, just use connect and provider
* provider 组件在应用最外层，传入一次store即可
* connect负责从外部获取组件需要的参数
## React Router 4
* router library
* BrowserRouter, Link, Switch
* BrowserRouter embraces whole app component, inside of Provider
* Route corresponds to components
* Link used to redirection
* Redirect 组件跳转
* Switch only render one component
* 有多个reducer需要合并多个reducer为一个
## Socket.io
* 如何存储数据，user， chat数据存储方式
* 前后端联调，使用axios发送异步请求，端口不一致如何发送，使用proxy配置转发，部署出问题可能是因为这个
* axois拦截器，对所有数据进行拦截，做loading处理时需要用到
* redux里使用异步数据渲染页面
* socket.io是基于事件的实时双向通信库
    * 基于websocket协议
    * 前后端通过时间进行双向通信 
    * io.on 监听事件
    * io.emit 发送事件
* Ajax基于http协议，单向，实时获取数据只能轮询
## Express
* a lightweight web framework based on Node.js
* install cookie-parser, 基于cookie用户验证
* use cookie to store user id 
## MongoDB
* use mongoose library to connect mongoDB with Express
* mongoose find and findOne are different, the former return an array, the second return a object(dict)
* use utility library md5 method and salt string to encode password
* use express and mongoDB findOne method to verify the user and password
* use prop-types library to verify property types, func, string or isRequired 

## note
* 代码重利用
* 写代码就像搭积木，很多components, 但是比较麻烦的事参数的传递，redux

## React 核心原理
* virtual DOM, tree structure 
* JSX -- createELement
* Diff between same level tree node, and update the DOM
* lifecycle of a Component 
* shouldComponentUpdate could use to enhance the performance of the App, reduce render times
* setState method
    * update the data through a queue
    * update is asynchronous
    * never use setState in the render function, as setState will call render, if render call setState, will cause infinite loop

## Redux 核心原理
* createStore(reducer)
    * getState()
    * subscribe(listener)
    * dispatch(action)

    ```
    export function createStore(reducer) {
        let currentState = {}
        let currentListeners = []
        
        function getState() {
            return currentState
        }
        
        function subscribe(listener) {
            currentListeners.push(listener)
        }
        
        function dispatch(action) {
            currentState = reducer(currentState, action)
            currentListeners.forEach(v=>v())
            return action
        }
        dispatch({type: '@@redux/INIT'})
        return { getState, subscribe, dispatch }
    }
    function bindActionCreator(creator, dispatch) {
        return (...args) => dispatch(creator(...args)
    }
    export function bindActionCreators(creators, dispatch) {
        let bound  = {}
        Object.keys(creators).forEach(v=>{
            let creator = creators[v]
            bound[v] = bindActionCreator(creator, dispatch)
        })
        return bound
    }
    ```
## react-redux 原理
* connect is used to connect components and redux, put data in redux into the props in the component
    * input a Component, put state data into the component(map state to props) and return a new Component
    * inform the component when the data in state changes

    ```
    export function connect(mapStateToProps, mapDispatchToProps) {
        return function(WrapComponent) {
            return class ConnectComponent extends React.Component {
                static contextTypes = {
                    store : PropTypes.object
                }
                constructor(props, context) {
                    super(props, context)
                    props: {}
                }
                componentDidMount(){
                    const {store} = this.context
                    store.subscribe(()=>this.update())
                    this.update()
                }
                update(){
                    const {store} = this.context
                    const stateProps = mapStateToProps(store.getState())
                    const dispatchProps = bindActionsCreators(mapDispatchToProps, store.dispatch)
                    this.setState({
                        props: {
                            ...this.state.props,
                            ...stateProps,
                            ...dispatchProps,
                        }  
                    })
                }
                render() {
                    return <WrapComponent {...this.state.props}></WrapComponent>
                }
            }
        }
    }
    OR
    export const connect = (mapStateToProps=state=>state, mapDispatchToProps={})=>(WrapComponent)=>{
        return class ConnectComponent extends React.Component {
                
        }
    }
    
    
    ```
* context
    * global variable, could be directly used in child components 
* Provider is used to put store into the context and provide this context for its child components

    ```
    export  class Provider extends React.Component {
        static childContextTypes = {
            store : PropTypes.object
        }
        getChildContext() {
            return {store:this.store}
        }
        constructor(props, context) {
            super(props, context)
            this.store = props.store
        }
        render() {
            return this.props.children
        }
    }
    ```   
## Middleware 原理
* 中间件把createStore包一层

```
export function createStore(reducer, enhancer) {
    if(enhancer) {
        return enhancer(createStore)(reducer)
    }
    ...
}
export function applyMiddleWare(middleware) {
    return createStore=>(...args)=>{
        const store = createStore(...args)
        let dispatch = store.dispatch
        const midApi = {
            getState: store.getState,
            dispatch: (...args)=>dispatch(...args)
        }
        dispatch = middleware(midApi)(store.dispatch)
        return {
            ...store,
            dispatch,
        }
        
    }
}

```

## react-thunk 中间件原理
* use async function on action

```
export function thunk = ({dispatch, getState})=>next=>action=>{
    if(typeof action == 'function') {
        return action(dispatch, getState)
    }
    return next(action)
}
```

## React.PureComponent
* have shouldComponentUpdate() function, skip the render process of those components that did not change, improve the performance
        

# QuickSearch - Scrapy and Django search application
## Impacts
## Scrapy
* Scrapy 基于 twisted，是异步IO的，性能比较高，技术选型， 不选beautiful soup（是库，不是框架）
* scrapy易于拓展，提供了很多内置的功能
* scrapy的css和xpath选择器比较好用， beautiful soup比较慢
* 网页的分类：
    * 静态网页
        * 页面不发生变化
        * 不需要与数据进行交互
    * 动态网页
        * web service（RESTful API）
        * 根据后台的数据页面发生变化
* 正则表达式
    * ^ begin with
    * . any char
    * * any times of char start with 0
    * + at least one time
    * $ end with
    * ? 非贪婪匹配，从左边开始的匹配，遇到第一个就开始判断模式，有时候需要多次添加非贪婪匹配符号, 正则表达式默认是贪婪的，即从右边开始匹配，匹配尽量多的字符
    * （）提取括号里面的东西
    * {} 字符出现的次数， 用法：a{2}, a{2,}, a{2,5}, 即a出现2次， 2次及以上，2次到5次（both included）
    * | or
    * [0-9a-zA-Z] any letter that match one of the letters in the bracket
        * [^1] means letters that are not 1, ^ is special here
        * [.*] means "." or "*", they do not have special meanings here
    * \s "a" space
    * \S not "a" space
    * \w means[a-zA-Z0-9_]
    * \W means not \w
    * [\u4E00-\u9FA5] 是一个汉字
    * \d a digit
* python里面正则的库是re， import re
    * result = re.match(reg, str)
    * ret = result.group(i),取第i层括号里面的字符串
* utf8 是可变长变码，比如英文字母，只用一个字节表示， 这样可以减少存储和传输压力
* utf8和unicode进行转换
* 爬虫步骤：
    * 查看网站url结构，明确数据来源，是否需要登陆，找到最简单有效的爬取逻辑
    * 设计数据存储字段
    * 通过scrapy进行爬取
* xpath和css解析页面数据后放进item，然后进入pipeline 进行数据筛选和存储
* Scrapy的暂停与重启，设置JOBDIR，每次启动和关闭爬虫时都带上这个工作目录，暂停时按一次ctrl-c，然后等待爬虫自动关闭即可，下次接着上次爬取的位置继续爬取（需要带上JOBDIR目录）
* Scrapy url去重原理，hash后放进set里面，每次取查询是否已经包含在set里面，特殊之处是hash函数比较复杂

    
## ElasticSearch
* 搜索引擎，基于restful api web接口，java开发的分布式全文搜索引擎
* nosql文档数据库
* mongoDB，redis， elasticsearch都是nosql数据库
* mysql是关系型数据库，主要应用于数据之间关系比较密切的场景，比如社交网络等
* update操作的效率：mysql > mongoDB > elasticsearch
* mongoDB 插入和查询 速度快于 mysql
* 概念
    * 集群
        * 多个服务器
    * 节点
        * 一个服务器
    * 分片
        * 将索引划分为多份， 提高性能和吞吐量
    * 副本
        * 将一份数据存储多份，增加分布式系统的可靠性

        | ElasticSearch | MySQL |
        | --- | --- |
        | index 索引 | 数据库 |
        | type 类型 | 表 |
        | document 文档 | 行 |
        | fields 区域 | 列 |
* HTTP 1.0 请求方法 GET POST HEAD PUT DELETE 
    * put 和 post区别，put是替换（覆盖），post是部分修改
* 搜索方法：
    * 倒排索引：由属性值来确定记录的位置
    * key是分词后的关键词，value是出现该关键词的记录
* 打分算法TF-IDF算法，即词频算法
    * lucene（lnsin）的评分是叫做TF/IDF算法，基本意思就是词频算法。
    * 根据分词词库，所有的文档在建立索引的时候进行分词划分。进行搜索的时候，也对搜索的短语进行分词划分。
    * TF代表分词项在文档中出现的次数（term frequency），IDF代表分词项在多少个文档中出现（inverse document frequency）。
    * lucene的算法简单来说就是将搜索的短语进行分词得出分词项，每个分词项和每个索引中的文档根据TF/IDF进行词频出现的评分计算。然后每个分词项的得分相加，就是这个搜索对应的文档得分 
* CRUD：create read update delete
* ElasticSearch拥有一个自动补全的借口：completion suggester

## Django

# BlogPlaza - Spring Boot Blog Site
## Impacts
## Spring Boot
* Spring框架功能很强大，但是就算是一个很简单的项目，我们也要配置很多东西。因此就有了Spring Boot框架，它的作用很简单，就是帮我们自动配置。Spring Boot框架的核心就是自动配置，只要存在相应的jar包，Spring就帮我们自动配置。如果默认配置不能满足需求，我们还可以替换掉自动配置类，使用我们自己的配置。另外，Spring Boot还集成了嵌入式的Web服务器，系统监控等很多有用的功，让我们快速构建企业及应用程序
## thymeleaf
## MySQL
## Gradle
* 一种打包工具，它可以帮你管理项目中的差异,依赖,编译,打包,部署......,你可以定义满足自己需要的构建逻辑,写入到build.gradle中供日后复用.
* Gradle不是一种编程语言,它不能帮你实现软件中的任何实际功能

## BootStrap
* 前端框架
* 响应式布局
* 移动设备优先适配

## 面向对象
* 面向对象编程是和面向过程编程相对比的，面向对象是现实世界中模型的自然延伸，面向对象以对象为核心，以消息为驱动，面向对象支持三大概念，封装、多态和继承，封装指的是把对象的数据和方法整合成一个整体，多态可以解释为一个接口，多个方法，在程序运行的过程中才决定调用哪个函数，继承是指派生类继承父类的参数和方法
* 重载（overload）和覆盖（override）的区别
    * overload是指编写一个与已知函数同名但是参数不同的函数
    * override是指编写一个与一只函数同名且参数相同的函数，但是函数内部的逻辑不相同，override是实现多态的手段
* 可以使用super（）调用父类构造函数，从而使用父类构造函数的变量和方法，子类的构造函数如果要引用super，那么必须把super放在函数的第一行，否则会出现报错
* this关键字使用在一个成员函数的内部，只带正在调用当前方法的对象

##进程和线程的区别和联系 
* 进程（process）是指在系统中正在运行的一个应用程序，是系统资源分配的基本单位，在内存中有其完备的数据空间和代码空间，拥有完整的虚拟空间地址。一个进程所拥有的数据和变量只属于它自己。
* 线程（thread）是进程内相对独立的可执行单元，所以也被称为轻量进程（lightweight processes）；是操作系统进行任务调度的基本单元。它与父进程的其它线程共享该进程所拥有的全部代码空间和全局变量，但拥有独立的堆栈（即局部变量对于线程来说是私有的）。
* 进程和线程都具有就绪、阻塞和运行三种基本状态。
* 联系
    * 一个进程至少拥有一个线程——主线程，也可以拥有多个线程；一个线程必须有一个父进程。多个进程可以并发执行；一个线程可以创建和撤销另一个线程；同一个进程中的多个线程之间可以并发执行。
* 区别
    * 系统开销：在创建或撤消进程时，由于系统都要为之分配和回收资源，导致系统的开销明显大于创建或撤消线程时的开销
    * 资源管理：进程有独立的地址空间，一个进程崩溃后，在保护模式下不会对其它进程产生影响，而线程只是一个进程中的不同执行路径。线程有自己的堆栈和局部变量，但线程之间没有单独的地址空间，一个线程死掉就等于整个进程死掉，所以多进程的程序要比多线程的程序健壮，但在进程切换时，耗费资源较大，效率要差一些。但对于一些要求同时进行并且又要共享某些变量的并发操作，只能用线程，不能用进程。
    * 通信方式：进程间通信主要包括管道、系统IPC(包括消息队列,信号量,共享内存)、SOCKET，具体说明参考linux进程间通信方式。进程间通信其实是指分属于不同进程的线程之间的通讯，所以进程间的通信方法同样适用于线程间的通信。但对应归于同一进程的不同线程来说，使用全局变量进行通信效率会更高。
    
## 死锁
* 死锁是指两个或两个以上进程在执行过程中，因争夺资源而造成相互等待的现象，这时这些进程都无法推进下去，这种状态就是计算机中的死锁状态
* 产生死锁的四个必要条件时：
    * 互斥条件：资源只能被一个进程访问
    * 请求和保持条件：在进程执行完之前，已获取资源保持不会释放
    * 不剥夺条件：正在进行中的进程的资源不可被剥夺
    * 循环等待条件：若干进行的资源请求之间是一个循环等待的关系
* 避免死锁：银行家算法，即在进程执行之前先检查系统中是否有足够的资源，资源充足才会执行，执行完毕之后，对资源立即释放

## OSI七层模型

![0_1325744597WM32](https://lh3.googleusercontent.com/-hD6eS0WIZs8/XCvs9x8bPGI/AAAAAAAAAUs/YeZCcJMPe4UMPglGPTrp0Lb2JW22CgRLACHMYCw/I/0_1325744597WM32.gif)

* TCP（传输控制协议，面向连接，可靠）与UDP区别（用户数据报协议）
    * TCP面向连接（如打电话要先拨号建立连接）;UDP是无连接的，即发送数据之前不需要建立连接
    * TCP提供可靠的服务。也就是说，通过TCP连接传送的数据，无差错，不丢失，不重复，且按序到达;UDP尽最大努力交付，即不保证可靠交付
    * TCP通过校验和，重传控制，序号标识，滑动窗口、确认应答实现可靠传输。如丢包时的重发控制，还可以对次序乱掉的分包进行顺序控制。
    * UDP具有较好的实时性，工作效率比TCP高，适用于对高速传输和实时性有较高的通信或广播通信。
    * 每一条TCP连接只能是点到点的;UDP支持一对一，一对多，多对一和多对多的交互通信
    * TCP对系统资源要求较多，UDP对系统资源要求较少。
* 为什么UDP有时比TCP更有优势?
    * UDP以其简单、传输快的优势，在越来越多场景下取代了TCP,如实时游戏。
    * 网速的提升给UDP的稳定性提供可靠网络保障，丢包率很低，如果使用应用层重传，能够确保传输的可靠性。    
    * TCP为了实现网络通信的可靠性，使用了复杂的拥塞控制算法，建立了繁琐的握手过程，由于TCP内置的系统协议栈中，极难对其进行改进。 
    * 采用TCP，一旦发生丢包，TCP会将后续的包缓存起来，等前面的包重传并接收到后再继续发送，延时会越来越大，基于UDP对实时性要求较为严格的情况下，采用自定义重传机制，能够把丢包产生的延迟降到最低，尽量减少网络问题对游戏性造成影响。

## TCP三次握手和四次挥手
* 三次握手
![20180717202520531](https://lh3.googleusercontent.com/-svIJUScClHs/XCv3DOhcVsI/AAAAAAAAAVE/P2a254UImDkNk2SY8KRRV6Q9D7wYCbWDACHMYCw/I/20180717202520531.png)

* 四次挥手
![20180717204202563](https://lh3.googleusercontent.com/-WLtLTBcL3-o/XCv3OzDYNOI/AAAAAAAAAVI/DyrQPZP2XNonJDxpqrJ4rZXOL35grzGKwCHMYCw/I/20180717204202563.png)

* 从中可以看出，建立连接时客户端建立的早一些，关闭时，服务器端关闭的早一些
* 为什么连接的时候是三次握手，关闭的时候却是四次握手？
    * 因为当Server端收到Client端的SYN连接请求报文后，可以直接发送SYN+ACK报文。其中ACK报文是用来应答的，SYN报文是用来同步的。但是关闭连接时，当Server端收到FIN报文时，很可能并不会立即关闭SOCKET，所以只能先回复一个ACK报文，告诉Client端，"你发的FIN报文我收到了"。只有等到我Server端所有的报文都发送完了，我才能发送FIN报文，因此不能一起发送。故需要四步握手。
* 为什么TIME_WAIT状态需要经过2MSL(最大报文段生存时间)才能返回到CLOSE状态？
    * 虽然按道理，四个报文都发送完毕，我们可以直接进入CLOSE状态了，但是我们必须假象网络是不可靠的，有可以最后一个ACK丢失。所以TIME_WAIT状态就是用来重发可能丢失的ACK报文。在Client发送出最后的ACK回复，但该ACK可能丢失。Server如果没有收到ACK，将不断重复发送FIN片段。所以Client不能立即关闭，它必须确认Server接收到了该ACK。Client会在发送出ACK之后进入到TIME_WAIT状态。Client会设置一个计时器，等待2MSL的时间。如果在该时间内再次收到FIN，那么Client会重发ACK并再次等待2MSL。所谓的2MSL是两倍的MSL(Maximum Segment Lifetime)。MSL指一个片段在网络中最大的存活时间，2MSL就是一个发送和一个回复所需的最大时间。如果直到2MSL，Client都没有再次收到FIN，那么Client推断ACK已经被成功接收，则结束TCP连接。
* 为什么不能用两次握手进行连接？
    * 3次握手完成两个重要的功能，既要双方做好发送数据的准备工作(双方都知道彼此已准备好)，也要允许双方就初始序列号进行协商，这个序列号在握手过程中被发送和确认。
    * 现在把三次握手改成仅需要两次握手，死锁是可能发生的。作为例子，考虑计算机S和C之间的通信，假定C给S发送一个连接请求分组，S收到了这个分组，并发 送了确认应答分组。按照两次握手的协定，S认为连接已经成功地建立了，可以开始发送数据分组。可是，C在S的应答分组在传输中被丢失的情况下，将不知道S 是否已准备好，不知道S建立什么样的序列号，C甚至怀疑S是否收到自己的连接请求分组。在这种情况下，C认为连接还未建立成功，将忽略S发来的任何数据分组，只等待连接确认应答分组。而S在发出的分组超时后，重复发送同样的分组。这样就形成了死锁。
* 如果已经建立了连接，但是客户端突然出现故障了怎么办？
    * TCP还设有一个保活计时器，显然，客户端如果出现故障，服务器不能一直等下去，白白浪费资源。服务器每收到一次客户端的请求后都会重新复位这个计时器，时间通常是设置为2小时，若两小时还没有收到客户端的任何数据，服务器就会发送一个探测报文段，以后每隔75分钟发送一次。若一连发送10个探测报文仍然没反应，服务器就认为客户端出了故障，接着就关闭连接。

    ![Screen Shot 2019-01-01 at 15.38.37](https://lh3.googleusercontent.com/-YZoiAvf56pI/XCv6DHMt0NI/AAAAAAAAAVk/4u6u18-C4Y0WUL_XVKnPX3ZPSGyo5yAfACHMYCw/I/Screen%2BShot%2B2019-01-01%2Bat%2B15.38.37.png)

## 访问网页全过程
* URL访问网站时的网络传输全过程，可以归纳为：
* 首先通过域名找到IP，如果缓存里没有就要请求DNS服务器；
* 得到IP后开始与目的主机进行三次握手来建立TCP连接；
* 连接建立后进行HTTP访问，传输并获取网页内容，并渲染网页内容；
* 传输完后与目的主机四次挥手来断开TCP连接。

## ICMP协议（TCP/IP子协议）
* 网络控制消息协议
* 用于IP主机、路由器之间传输控制消息，用来测试网络是否通畅，主机或路由器是否可以到达，并不传输用户实际数据
* ping命令就是使用的ICMP协议

## URI与URL
* URI = Universal Resource Identifier（统一资源标识符）
* URL = Universal Resource Locator （统一资源定位符）
* URI是个纯粹的句法结构，用于指定标识Web资源的字符串的各个不同部分。URL是URI的一个特例，它包含了定位Web资源的足够信息。
* URI 是统一资源标识符，而 URL 是统一资源定位符。因此，笼统地说，每个 URL 都是 URI，但不一定每个 URI 都是 URL。这是因为 URI 还包括一个子类，即统一资源名称 (URN)，它命名资源但不指定如何定位资源。
* URI强调的是给资源标记命名，URL强调的是给资源定位，但是你会发现，URL显然比URI包含信息更多。URL充当了WWW万维网里面URI的角色，但是他比URI多了一层意义，我不光知道你叫什么，我还知道你在哪里。我们在浏览器输入的都是URL，因为我们输入的目的是为了找到某一个资源，当然你输入的是URI也是没错的，因为URL也是URI。


## Angular 7
* single page application



