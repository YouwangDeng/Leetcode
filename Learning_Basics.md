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
    * Object oriented programming
        * Objects interacting with one another through methods and properties
        * used to store data, structure applications into modules and keep code clean
        * Prototype
            * every javascript object has a prototype property, which makes inheritance possible in javascript
            * the prototype property is where we put methods and properties that we want other objects to inherit
            * the constructor's prototype property is not the prototype of the constructor itself, it is the prototype of all its instances that are created through it
            * when a certain method or property is called, the search starts from the object, and if it can't be found, the search moves on to the object's prototype, this continues until the method is found: prototype chain
        * function constructor
            * var Person = function(name, yearOfBirth, job) { this.name = name; this.yearOfBirth = yearOfBirth; this.job = job; }
            * Person.prototype.calculateAge = function() {console.log(2018 - this.yearOfBirth);}
            * Person.prototype.lastName = 'Smith';
            * var john = new Person('John', 1990, 'teacher');
            * john.calculateAge();
            * john.lastName;
            * john.hasOwnProperty('job') --> true
            * john.hasOwnProperty('lastName') --> false
        * function is an object in javascript
        * callback functions: function passed to a function as an argument and will then be executed
    * closure
        * function return a customized function
    * call method 
        * allow to borrow a method and set "this" variable to another object
    * apply method
        * same as call method but arguments are in an array
    * bind method
        * similar as call method, but store the borrowed method in a variable
        * use "this"
    * prompt
        * var input = prompt("Please input something");
        * input get a string
        * var inputInt = parseInt(prompt("Please input an Integer"));
        * inputInt get an Integer

# HTML
* Hyper Text Markup Language
* <!DOCTYPE html>
* tags
    * html
        * head
            * title
            * \<link rel="stylesheet" type="text/css" href="css/file/path"
        * body 
            * div
            * h1
            * p
            * strong
            * em
            * u -- underline
            * \<br> for next line, no closing tag
            * \<img src="path/to/img" alt="text to describe the image"> no closing tag
            * \<a href="links or documents such as images" target="_blank">Links Title</a> for links, target set to blank will open a new tab
# CSS
* Cascading Style Sheets
* three ways to write css
    * css code inside a tag
        * \<p style="some style">
    * css code inside a html document
        * \<style> p { some style }</style>
    * css code in external file
        * p { some style }
* elements
    * font-size
    * font-family
    * color
    * text-align
    * global rule just use body selector
* inheritance
    * child inherit the properties from the parent element, but same defined property will override the inherited one
* Colors in CSS
    * #RRGGBB
    * for six value is the same, such as #666666 just use #666
    * could also use transparent attribute, rgba(RR,GG,BB, 0.7)
* Class and IDS
    * class could be applied to multiple elements 
    * id could only be applied to one element
    * use "." to select class
    * use "#" to select id
    * use "*" to select all elements
* CSS Box Model
    * content: text, img, etc. height and width 
    * padding: transparent area around the content, inside of the box
    * boarder: goes around the padding and content
    * margin: space between boxes margin-bottom ...
    * use box-sizing to set height and width for entire box
* block element and inline element

```
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box; 
  }
```