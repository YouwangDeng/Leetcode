# JavaScript Learning
* Data Types
    * Number
    * String
    * Boolean
    * Undefined
    * Null
* dynamic data type
* console.log()
* var item = prompt()
* basic operators
    * +
    * -
    * *
    * /
        * decimal type
    * >
    * <
    * === and ==
        * 77 === '77' false
        * 77 == '77' true
        * === both type and value are equal 
        * == only value are equal, will conduct type coreciona
    * !== and !=
    * typeof
        * var a =10
        * typeof a
        * return number
    * x += 1
    * x *= 2
    * x++
    * x--
    * if() {} else if() {} else {}
    * &&
    * ||
    * !
* Basic fundamental
    * Ternary operation a > b ? c : d
    * switch(item) { case: break; default: }
    * a switch trick: switch(true) {case logical coparision: break; default:}
    * falsy values: undefined, null, 0, NaN, ''
    * truthy values: not falsy values
    * functions
        * function declaration
            * function functionName(arguments) {return something;}
        * function expression
            * var functionName = function(arguments) {}
    * array
        * var names = ['John', 'Sam'];
        * var names = new Array('John', 'Sam');
        * names[0]
        * names[4] = 'Amy';
        * names.length; 
        * could put different data types in an array
        * names.push('David'); //add to last
        * names.unshift('David');//add to first
        * names.pop() //pop the last element
        * names.shift() //pop the first element
        * names.indexOf('John');//zero based
    * Objects and properties
        * var foo = {key:pair, key:pair}; or var foo = new Object(); and then fill the object
        * foo.key or foo['key']
        * foo.funcName = function(arguments) {}
        * could use 'this', foo.funcName = function(){return this.key...}
        * call a method, foo.funcName()
    * Loops
        * for(var i = 0; i < 10; i++) {}
        * var i = 0; while(i < names.length) {i++;} 
        * continue;
        * break;
    * Standard
        * 1996 released LiveScript --> JavaScript
        * 1997 ES1(ECMAScript 1)
        * 2009 ES5
            * fully supported in all browers
            * ready to be used today
        * 2015 ES6
            * supported by modern browsers
            * not supported by old browers
        * 2016 ES2016
        * ...
        * 2019 ES2019
    * Javascript Language Design
        * Where to execute javascript code
            * Browsers
            * Node.js
        * JavaScript Engine execute code
            * code --> parser --> abstract syntax tree --> conversion to machine code --> code runs
        * Execution context
            * a box, a container, or a wrapper which store our variables and in which a piece of our code is evaluated and executed
            * the global execution context
                * for code that is not inside any function
                * in the browser that is the window object
                * execution stack
            * Creation phase
                * creation of variable object(VO)
                    * the argument object is created, containing all the arguments that were passed to the function
                    * code is scanned for function declarations: for each function, a property is created in the variable object, pointing to the function
                    * code is scanned for variable declarations: for each variable, a property is created in the variable object, and set to undefined
                    * the second and third steps are called hoisting
                * creation of scope chain
                    * scope answers the question: where can we access a certain variable
                    * each new function create a scope
                    * lexical scoping: a function is lexically within another function gets access to the scope of the outer function
                * determine value of this variable
                    * function call "this": points to the global object(window in the browser)
                    * method call "this": points the object that calls the method
            * Execution phase
    * DOM manipulation in JavaScript
        * DOM: document object model
        * structured representation of an html document
        * the DOM is used to connect webpages to scripts like JavaScript
        * for each html box, there is an object in the DOM that we can access and interact with
        * querySelector
            * set an element content
                * document.querySelector('.something or #something').textContent = valueWantToSet;
                * document.querySelector('.something or #something').innerHTML = '<em>' + valueWantToSet + '</em>';
                * faster select id
                    * document.getElementById('idName').textContent = something;
            * get an element content
                * var value = document.querySelector('.something or #something').textContent
            * change an element css style
                * document.querySelector('.something or #something').style.propertyWant = something;
        * Event
            * document.querySelector('.something or #something').addEventListener('click', function() {});
        * Get input value
            * var input = document.querySelector('.something or #something').value;
        * ClassList add or remove or toggle
            * document.querySelector('.something or #something').classList.add/remove/toggle('someStyle');
        * Hide or Display a element
            * document.getElementById('someId').style.display = 'none';
            * document.getElementById('someId').style.display = 'block';
    * 