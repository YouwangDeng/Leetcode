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

### LRU Cache
* this is a design problem
* key point is least recently used cache idea, abandon the least used cache as the capacity is limited
* implement a double LinkedList to help update the visited key:value to the head, the methods we need to implement include: addNode, removeNode, moveToHead(addNode, removeNode), popTail(removeNode)
* use a HashMap to store the key and Node(key, value), the key stored in the Node is used to remove Node in the HashMap
* the HashMap and DLinkedList hold the same data but in different order, the DLinkedList have the LRU order, the HashMap is used to quickly look up(constant time)
* don't forget to decrease the count after pop the tail
* keep update the head
* use "this"
* DLinkedList parameter should not be private

### note
* Integer.parseInt(String s) and Integer.valueOf(String s), the former return int and the latter return Integer

### Container With Most Water
* 
 
