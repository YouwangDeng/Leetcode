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
        

# QuickSearch - Scrapy and Django search application
## Impacts
## Scrapy
## ElasticSearch
## Django

# BlogPlaza - Spring Boot Blog Site
## Impacts
## Spring Boot
## thymeleaf
## MySQL
## Gradle







