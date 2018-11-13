# Cracking the Code Interview
## Big O
* Suppose we had an algorithm that took in an array of strings, sorted each string, and then sorted the full array. What would the runtime be?
    * Sorting each string is0(s log s). We have to do this for every string (and there are a strings),so that's 0(a* s log s).
    * Now we have to sort all the strings.There are a strings,so you'll may be inclined to say that this takesO(a log a) time. Each string comparison takesO(s) time. There areO(a log a) comparisons, therefore this will take0(a*s log a) time.
    * If you add up these two parts,you get0(a*s (log a + log s)).
    
## Walking Through a Problem
* Listen Carefully
    * Many candidates will hear the problem correctly. But ten minutes into developing an algorithm, some of the key details of the problem have been forgotten. Now they are in a situation where they actually can't solve the problem optimally.
    * Your first algorithm doesn't need to use the information. But if you find yourself stuck, or you're still working to develop something more optimal, ask yourself if you've used all the information in the problem.
    * You might even find it useful to write the pertinent information on the whiteboard.
* Draw an Example
    * An example can dramatically improve your ability to solve an interview question, and yet so many candidates just try to solve the question in their heads.
    * Instead, you want to create an example that is:
        * Specific. It should use real numbers or strings (if applicable to the problem).
        * Sufficiently large. Most examples are too small, by about 50%.
        * Not a special case. Be careful. It's very easy to inadvertently draw a special case. If there's any way your example is a special case (even if you think it probably won't be a big deal), you should fix it.
        * Try to make the best example you can. If it later turns out your example isn't quite right, you can and should fix it.
* State a Brute Force
    * Some candidates don't state the brute force because they think it's both obvious and terrible. But here's the thing: Even if it's obvious for you, it's not necessarily obvious for all candidates. You don't want your interviewer to think that you're struggling to see even the easy solution.
    * It's okay that this initial solution is terrible. Explain what the space and time complexity is, and then dive into improvements.
    * Despite being possibly slow, a brute force algorithm is valuable to discuss. It's a starting point for optimizations, and it helps you wrap your head around the problem.
* 0ptimize
    * Once you have a brute force algorithm, you should work on optimizing it. A few techniques that work well are:
    * Look for any unused information. Did your interviewer tell you that the array was sorted? How can you leverage that information?
    * Use a fresh example. Sometimes, just seeing a different example will unclog your mind or help you see a pattern in the problem.
    * Solve it"incorrectly:' Just like having an inefficient solution can help you find an efficient solution, having an incorrect solution might help you find a correct solution. For example, if you're asked to generate a random value from a set such that all values are equally likely, an incorrect solution might be one that returns a semi-random value: Any value could be returned, but some are more likely than others. You can then think about why that solution isn't perfectly random. Can you rebalance the probabilities?
    * Make time vs. space tradeoff. Sometimes storing extra state about the problem can help you optimize the runtime.
    * Precompute information. Is there a way that you can reorganize the data (sorting, etc.) or compute some values upfront that will help save time in the long run?
    * Use a hash table. Hash tables are widely used in interview questions and should be at the top of your mind.
    * Think about the best conceivable runtime 
* Walk Through
    * After you've nailed down an optimal algorithm, don't just dive into coding. Take a moment to solidify your understanding of the algorithm.
    * Whiteboard coding is slow-very slow. So is testing your code and fixing it. As a result, you need to make sure that you get it as close to "perfect" in the beginning as possible.
    * Walk through your algorithm and get a feel for the structure of the code. Know what the variables are and when they change.
* Implement
    * Start coding in the far top left corner of the whiteboard (you'll need the space). Avoid "line creep" (where each line of code is written an awkward slant). It makes your code look messy and can be very confusing when working in a whitespace-sensitive language, like Python.
    * Remember that you only have a short amount of code to demonstrate that you're a great developer. Everything counts. Write beautiful code.
    * Beautiful code means:
    * Modularized code. This shows good coding style. It also makes things easier for you. If your algorithm uses a matrix initialized to { { 1, 2, 3}, { 4, 5, 6}, ...}, don't waste your time writing this initialization code. Just pretend you have a function initIncrementalMatrix(int size). Fill in the details later if you need to.
    * Error checks. Some interviewers care a lot about this, while others don't. A good compromise here is to add a todo and then just explain out loud what you'd like to test.
    * Use other classes/structs where appropriate. If you need to return a list of start and end points from a function, you could do this as a two-dimensional array. It's better though to do this as a list of StartEndPair (or possibly Range) objects. You don't necessarily have to fill in the details for the class. Just pretend it exists and deal with the details later if you have time.
    * Good variable names. Code that uses single-letter variables everywhere is difficult to read. That's not to say that there's anything wrong with using i and j, where appropriate (such as in a basic for-loop iterating through an array). However, be careful about where you do this. If you write something like int i = startOfChild ( array), there might be a better name for this variable, such as startChild. Long variable names can also be slow to write though. A good compromise that most interviewers will be okay with is to abbreviate it after the first usage. You can use startChild the first time, and then explain to your interviewer that you will abbreviate this as sc after this.
    * If you see something you can refactor later on, then explain this to your interviewer and decide whether or not it's worth the time to do so. Usually it is, but not always.
    * If you get confused (which is common), go back to your example and walk through it again.
* Test
    * What many candidates do is take their earlier example and test it against their code. That might discover bugs, but it'll take a really long time to do so. Hand testing is very slow. If you really did use a nice, big example to develop your algorithm, then it'll take you a very long time to find that little off-by-one error at the end of your code.
    * Instead, try this approach:
        * Start with a "conceptual"test. A conceptual test means just reading and analyzing what each line of code does. Think about it like you're explaining the lines of code for a code reviewer. Does the code do what you think it should do?
        * Weird looking code. Double check that line of code that says x = length - 2. Investigate that for loop that starts at i = 1. While you undoubtedly did this for a reason, it's really easy to get it just slightly wrong.
        * Hot spots. You've coded long enough to know what things are likely to cause problems. Base cases in recursive code. Integer division. Null nodes in binary trees. The start and end of iteration through a linked list. Double check that stuff.
        * Small test cases. This is the first time we use an actual, specific test case to test the code. Don't use that nice, big 8-element array from the algorithm part. Instead, use a 3 or 4 element array. It'll likely discover the same bugs, but it will be much faster to do so.
        * Special cases. Test your code against null or single element values, the extreme cases, and other special cases.
        * When you find bugs (and you probably will), you should of course fix them. But don't just make the first correction you think of. Instead, carefully analyze why the bug occurred and ensure that your fix is the best one.
        