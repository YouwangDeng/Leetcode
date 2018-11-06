# Cracking the Code Interview
## Big O
* Suppose we had an algorithm that took in an array of strings, sorted each string, and then sorted the full array. What would the runtime be?
    * Sorting each string is0(s log s). We have to do this for every string (and there are a strings),so that's 0(a* s log s).
    * Now we have to sort all the strings.There are a strings,so you'll may be inclined to say that this takesO(a log a) time. Each string comparison takesO(s) time. There areO(a log a) comparisons, therefore this will take0(a*s log a) time.
    * If you add up these two parts,you get0(a*s (log a + log s)).