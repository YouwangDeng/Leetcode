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
        * 