# Leetcode Note
Note about data structure, problem solutions and mistakes during coding
### Two Sum
* the brutal force solution takes O(n^2) time
* define HashMap: Map \<type 1, type 2> map  = new HashMap<>();
* map.containsKey(k) is a O(1) weapon
* do manipulation while constructing the map
* use HashMap to reduce TP
* do not forget return statement in the end of the code

### Add Two Numbers
* ListNode use dummy to begin
* Do not spell wrong variable name
* Combine same code to a code block make code be more concise
* use carry to do digit manipulation

### Longest Substring Without Repeating Characters
* Character is a class, not Char
* left = map.get(c) > left ? map.get(c) : left; avoid "abba" bug

### Twitter OA 
* Stack<type> stack = new Stack<>();
* Queue<type> queue = new LinkedList<>();
* compare char equal use " c == '1' "
* queue.isEmpty() stack.isEmpty stack.empty()
* reduce time complexity: traverse the input first to get the key relations and store it in HashMap, then when solve problems use that relations in HashMap. this could help avoid time limited error
* s.substring(a, b) s.toCharArray() s.charAt()
* use StringBuilder .toString() Integer.valueOf
* map.getOrDefault(key, 0)
* stack push pop queue offer poll
* for(Map.Entry<String, Integer> entry : map.entrySet())
* for(Type c : list) for(Type c : array)
* use .equals() to compare String
* BFS use queue
* No direction tree or graph use Parent array or child number to indicate the relationship 
* isPrime function i < 2 and from 2 to i * i < num
* convert char[] to String: new String(charArray);

### Median of Two Sorted Arrays
* two sorted arrays fetch median first get the (m + n + 1)/2 element, use k / 2 mid compare, throw away a half of an array
* a special binary search
* mind the edge case, when array 1 or 2 is off or k == 1
* use recursion
 
