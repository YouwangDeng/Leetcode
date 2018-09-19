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

### Note
* Integer.parseInt(String s) and Integer.valueOf(String s), the former return int and the latter return Integer

### Container With Most Water
* two pointers left and right from two edge to center
* compare the height of left and right

### Valid Parentheses
* use a stack
* check if the stack isEmpty()

### Number of Islands
* must four direction check
* compare char use ''

### Longest Palindromic Substring
* s.length()
* function name spell right when using it
* extend the substring in two cases

### Combine Two Tables
* A JOIN clause is used to combine rows from two or more tables, based on a related column between them.
* example: SELECT Orders.OrderID, Customers.CustomerName, Orders.OrderDate FROM Orders INNER JOIN Customers ON Orders.CustomerID=Customers.CustomerID;
* Here are the different types of the JOINs in SQL:
* (INNER) JOIN: Returns records that have matching values in both tables
* LEFT (OUTER) JOIN: Return all records from the left table, and the matched records from the right table
* RIGHT (OUTER) JOIN: Return all records from the right table, and the matched records from the left table
* FULL (OUTER) JOIN: Return all records when there is a match in either left or right table

### Integer to English Words
* new String[] {"One", "Two"}; don't forget to use ""
* care about corner case such as num == 0 return "Zero"
* first deal with the thousands then deal with hundred

### Reverse Integer
* could use Integer.toString() and then reverse the string
* trick here use res = res * 10 + x % 10; IMPORTANT
* use Integer.MAX_VALUE and Integer.MIN_VALUE instead of Math.pow()

### Maximum Subarray
* use two while loop O(n) time complexity
* be careful about the index Error when use while loop on array

### 3Sum
* check if there is a need to write code in function
* check left < right first then && nums operation
* use Arrays.asList(a,b,c); instead of new ArrayList<>() and then add element to it
* be careful about the duplicate element, use while or if to avoid duplicate

### Roman to Integer
* use array to store the value first
* switch case usage
* manipulate the data first the apply algorithm, this is more efficient

### Trapping water
* use leftMax and rightMax from edge to center
* be clear about the meaning of "trap", that only related with the left and right edge
* could also one way passing, use a stack

### Copy List with Random Pointer
* copy a list, consider make every node occurs twice in the list
* then allocate the random pointer for the copy node
* then extract the copy node from the list and restore the original list

### Palindrome Number
* could use string reverse but this will use some methods
* could use rev * 10 + num / 10 trick and compare reverse value and x
* be careful about that num = x, should use num in the reverse process instead of x

### Merge Intervals
* could use a PriorityQueue and sort the intervals with their start point
* use PriorityQueue<Interval> pq = new PriorityQueue<>(intervals.size(), (a, b) -> a.start - b.start);
* could also use two arrays store the start and end points of those intervals
* compare start[i+1] and end[i] and determine whether add a new Interval to the res list
* care about the end of the array that's i == n - 1

### Merge k Sorted Lists
* use a PriorityQueue
* the way to implement Comparator influence the efficiency of algorithm


```
PriorityQueue<ListNode> pq= new PriorityQueue<ListNode>(lists.length,new Comparator<ListNode>(){
    @Override
    public int compare(ListNode o1,ListNode o2){
         if (o1.val<o2.val)
             return -1;
         else if (o1.val==o2.val)
             return 0;
         else 
             return 1;
    }
});
```
* the above way is more efficient than new PriorityQueue<>(lists.length, (a,b) -> a.val - b.val);

### Linked List Cycle
* use two pointers, slow and fast
* careful about while(fast != null && fast.next != null)

### Reverse Linked List
* reverse LinkedList use three pointers, pre, cur and next
* IMPORTANT:do not forget set head.next = null, otherwise there will be a circle

