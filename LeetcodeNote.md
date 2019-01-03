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
* queue.isEmpty() stack.isEmpty() stack.empty()
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
* remove the less than half since this idea is to find the kth smallest element, each time reduce k by half

### LRU Cache
* this is a design problem
* key point is least recently used cache idea, abandon the least used cache as the capacity is limited
* implement a double LinkedList to help update the visited key:value to the head, the methods we need to implement include: addNode, removeNode, moveToHead(addNode, removeNode), popTail(removeNode)
* use a HashMap to store the key and Node(key, value), the key stored in the Node is used to remove Node in the HashMap
* the HashMap and DLinkedList hold the same data but in different order, the DLinkedList have the LRU order, the HashMap is used to quickly look up(constant time)
* don't forget to decrease the count after pop the tail
* keep update the head
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
* three places to skip duplicated elements

### Roman to Integer
* use HashMap cache the roman number
* loop from the end to the beginning, store pre value, determine add or decrease 

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

### Merge Two Sorted Lists
* must update cur, cur = cur.next
* check null pointer

### Reverse String
* classic toCharArray() and swap solution
* be carful about the s.length()

## Review Data Structures and Algorithms
### Time Complexity
#### How to calculate
* Recursive deduction
    * T(n) = T(n-1) + cn 
    * T(n-1) = T(n-2) + c(n-1)
    * ...
* Solution space
    * Permutation, Combination, etc.
    * Two Sum, etc.
* Master method
    * T(n) = aT(n/b) + n^c
    * Compare log<sub>b</sub>a and c
        * if log<sub>b</sub>a > c, T(n) = n^log<sub>b</sub>a
        * if log<sub>b</sub>a = c, T(n) = n^c *logn
        * if log<sub>b</sub>a < c, T(n) = n^c
* Commonly used time complexities

#### How to get the equation
* How do you solve the problem?
* How do you divide the problem into smaller part?
* Before going into smaller parts, how many operation do you need?
* After solving smaller parts, how many more operations do you need?

### Array
* A data structure consisting of a collection of elements (values or variables), each identiﬁed by at least one array index or key.
    * Continuous space
    * Same type elements
    * Identiﬁed by index
* Questions - Always ASK before you write code
    * Second minimum element of the array
    * Two Sum
        * could use sort and two pointers O(nlogn)
        * Two pointers
            * Use TWO pointers, instead of one, to traverse the array in the same/opposite direction.
            * Mostly, SORTED. in number order. in sequence order. linked list order.
            * To ﬁnd two numbers, or two set of numbers, which are subject to some conditions.
        * could also use HashMap O(n)
    * Three Sum
        * sort and two sum O(nlogn) + n * O(n) = O(n^(2))
    * Summary for k-Sum
        * Sort.
        * Try ﬁrst number, use (k-1)-Sum. 
        * Time Complexity
            * 2-Sum: O(nlogn) + O(n) = O(nlogn)
            * 3-Sum: O(nlogn) + O(n^2) = O(n^2)
            * 4-Sum: O(nlogn) + O(n^3) = O(n^3)
            * k-Sum: O(nlogn) + O(n^(k-1)) = O(n^(k-1))
    * Reverse Array
        * swap and two pointers
    * Reverse Number
        * % and / trick
    * Palindrome Number/String
        * two pointers
    * Odd Even Sort || Pivot Sort || Remove Element
        * two pointers
        * continuous move(while loop) and then swap
    * Merge Two Sorted Array
    * Merge Two Sorted Linked List
    * Merge K Sorted Array
        * index manipulation

### ArrayList

| Operation | Input | Output | Time Complexity |
| --- | --- | --- | --- |
| get | index | value | constant |
| set | index, value | void | constant |
| add | [index],value | void | linear |
| remove | index/value | void | linear |
| contains | value | boolean | linear |

### Java Data Types & Variables
* Primitive Type - Stack Memory
    * byte, char, short, int, long, ﬂoat, double, boolean
    * Passing the COPY of primitive value.
    * The original variable will NEVER be changed.
* Reference Type - Heap Memory
    * Class, Interface, Array, Enum
    * Type a = new Type();
    * Passing the COPY of object address.

### Inheritance and Polymorphism
* JComponent comp = new CarComponent();
* comp.getWheels(); doesn't compile
* CarComponent carComp = (CarComponent) comp;
* carComp.getWheels(); will compile
    

### LinkedList
* A data structure consisting of a linear collection of data elements, called nodes pointing to the next node by means of pointer.
    * Each node knows the address of its next node.
    * The ﬁrst node can represent the whole linked list.
    * Accessing any element in the linked list, needs going through all nodes before it. O(n).
    * Sometimes, the node also knows the address of its previous node, then the list is known as "Doubly Linked List".
* Cost of array resizing is very large, so we need to set capacity in advance
* ListIterator<Integer> iter = list.listIterator(list.size());//把iterator放在最后的位置
* Usually we don't know how much space we need

| Operation | Input | Output | Time Complexity |
| --- | --- | --- | --- |
| get | index | value | linear |
| set | index, value | void | linear |
| add | [index],value | void | linear |
| remove | index/value | void | linear |
| offer | value | value | constant |
| poll | void | value | constant |
| push | value | value | constant |
| pop | void | value | constant |
| peek | void | value | constant |

* dummy.next can represent original linked list.
* If data structure of the linkedlist will be changed, dummy node is needed.
    * add, remove.
* One node can only be accessed by its previous node.
* Linked List in interview
    * For most cases, there will only one head node given.
        * No size.
        * Check null when using while.
        * while (cur != null) { // do something }
        * while (pre.next != null) { // do something }
    * Communication before you write code !!!
        * size, index range, tail, etc.
* Questions
    * Linked list length.
    * Kth node from the end.
        * two pointers
        * slow and fast
        * fast ahead of slow kth nodes
    * Mid node of the list.
        * two pointers
        * slow and fast
        * fast speed is twice of slow speed
        * while (fast.next != null && fast.next.next != null) the order matters a lot
    * Whether circle exists.
        * two pointers
        * slow and fast
        * fast speed is twice of slow speed
    * Linked List Cycle - Follow up
        * Given a linked list, return the node where the cycle begins or null.
        ![circle start position](https://lh3.googleusercontent.com/-60qn8LTF3G8/W67R0r6AEDI/AAAAAAAAAJE/MOfM8lqMyXMD7tGBRtVdc73nCr0MVXupQCHMYCw/I/circle%2Bstart%2Bposition.png)
        
        ```
        public ListNode detectCycle(ListNode head) { 
            ListNode fast = head, slow = head; 
            while (fast != null && slow != null) { 
                if (fast.next != null) { 
                    fast = fast.next.next;
                } else { 
                    return null;
                }
                slow = slow.next;
                if (fast == slow) { 
                    ListNode temp = head; 
                    while (temp != slow) { 
                        temp = temp.next; 
                        slow = slow.next; 
                    } 
                return slow;
                }
            } 
            return null;
        }
        ```
    * Remove Duplicate from Sorted List
        * appear once
            * use one pointer
        * delete all duplicate
            * use dummy node
            * use one pointer
    * Reverse Linked List
        * three pointers
        * pre, cur, and temp
    * Swap Nodes in Pairs
        * use dummy node
        * use three pointers
        * pre, first, and second
    * Merge Sorted List
        * use dummy node
    * Null Pointer Exception be carful

### Stack & Queue
* Stack: LIFO (Last in ﬁrst out)
    * Stack<Type> stack = new Stack<>();
    * push, pop, peek O(1)
    * Implementation 
        * Based on array
        * elements, size, capacity
* When to use Stack?
    * Invoke a function
    * Recursion (This is a special case of the ﬁrst)
    * DFS (Depth-ﬁrst Search) (This is a special case of the second)
* Stack in Operating System
    * Stack and Heap
    * Stack is faster
        * primitive variables, function calls
    * Heap can dynamically allocate space
        * reference variables.
* Queue: FIFO (First in ﬁrst out)
    * Queue<Type> queue = new LinkedList<>();
    * offer(add), poll(remove), peek O(1)
    * LinkedList is used to implement features for Queue in Java
    * use front and rear to implement Queue in array
* When to use Queue?
    * BFS (Breadth-ﬁrst Search)
    * Priority Queue (Heap)
    * Multi Task Queue (Design)
* Implement Queue using Stacks
    * use two stacks
* Max Stack
    * Design a stack that supports push, pop, top, and retrieving the maximum element in constant time.
    * push(x) -- Push element x onto stack.
    * pop() -- Removes the element on top of the stack.
    * top() -- Get the top element.
    * getMax() -- Retrieve the maximum element in the stack.    
    * use two stacks, one stack normal, one stack store the simultaneous max value with the same size as the normal stack
* Valid Parentheses
    * use one stack
    * What if we want to return the number of valid pairs?
        * Return half of the length of the string.    
* Decode String
    * use one stack
    * If it's number, update the number for the repeating times, push it into stack
    * If it's '[', push the previous string into the stack and try to get the new string that needs to be repeated.
    * If it's ']', the current string is ﬁnished, the previous string + repeating_times * current_string
    * If it's other characters, update the current string.
* spell of punctuation marks
    * 'exclam'＝'!'
    * 'full stop' = '.'
    * 'comma' = ','
    * 'colon' = ':'
    * 'semicolon' = ';'
    * 'at'＝'@'
    * 'numbersign'＝'#'
    * 'dollar'＝'$'
    * 'percent'＝'%'
    * 'caret'＝'^'
    * 'ampersand'＝'&'
    * 'asterisk'＝'*'
    * 'parenleft'＝'('
    * 'parenright'＝')'
    * 'minus'＝'-'
    * 'underscore'＝'_'
    * 'equal'＝'='
    * 'plus'＝'+'
    * 'bracketleft'＝'['
    * 'braceleft'＝'{'  
* Largest Rectangle in Histogram
    * Given n non-negative integers representing the histogram's bar height where the width of each bar is 1, ﬁnd the area of largest rectangle in the histogram.
    * Keep one bar as long as it could possibly get a better result
    * Using a stack to maintain the order
    * Only add one bar if it is larger

    ```
    public int largestRectangleArea(int[] height) {
        int maxArea = 0; 
        java.util.Stack<Integer> stack = new java.util.Stack<Integer>(); 
        for (int i = 0; i <= height.length; i++) {
            int newHeight = i == height.length ? 0 : height[i];
            if (stack.empty() || height[stack.peek()] < newHeight) { 
                stack.push(i); 
            } else {
                int start = stack.pop(); 
                int width = stack.empty() ? i : i - stack.peek() - 1; 
                maxArea = Math.max(maxArea, height[start] * width); 
                i--;
            }
        }
        return maxArea;
    }
    ```
* Missing Number
    * use swap to reorder orders to continuous array
    
    ```
    for (int i = 0; i < nums.length; i++) {
        while (nums[i] != i && nums[i] < nums.length) {
            swap(nums, i, nums[i]); 
        }
    }
    ```    
### Recursion
* Recursion in computer science is a method where the solution to a problem depends on solutions to smaller instances of the same problem (as opposed to iteration).
* How to solve a problem
    * Divide into small problems.   
    * Solve small problems.
    * Use the result of small problems to solve the original problem.
    * If the small problems are the same as original one, just scale is diﬀerent. Then this is called recursion.
* Recursion Properties
    * Base case
        * simple scenario that does not need recursion to produce an answer.
    * Recursion
        * a set of rules that reduce all other cases toward the base case.

    ```
    function solveProblem() {
        divide into small problems;
        ...
        ...
        solveProblem();
    }
    ```
* Code problem with recursion
    * Base case
    * recursion rules
    * Represent the problem with coding function.
        * Deﬁne the essential parameters
            * Parameters that deﬁne the problem.
        * Deﬁne the return value    
* Questions
    * Fibonacci Number
    * Greatest Common Divisor
    * Binary Search
    * Towers of Hanoi
        * Move the ﬁrst (n-1) disk from A to B
        * Move the nth disk from A to C
        * Move the other (n-1) disk from B to C

        ```
        public static void hanoi(int n, char source, char spare, char target) { 
            if (n > 0) { 
                hanoi(n-1, source, target, spare);
                System.out.println("Move " + source + " to " + target); 
                hanoi(n-1, spare, source, target); 
            }
        }
        ```
    * Climb Building
    * Sum of Linked List
    * Remove Linked List Elements
    * Reverse Linked List

    
### Backtracking
* 0-1 Knapsack
    * Given a knapsack which can hold s pounds of items, and a set of items with weight w1, w2, ... wn. Return whether we can pick speciﬁc items so that their total weight s.
    * pick it, the problem become (s-w[i], w - w[i])
    * not pick it, the problem become (s, w - w[i])
    
        ```
        public static boolean knapsack(int s, int[] weights, int index) { 
            if (s == 0) { 
                return true;
            } 
            if (s < 0 || index >= weights.length) { 
                return false; 
            } 
            return knapsack(s - weights[index], weights, index+1) || knapsack(s, weights, index+1);
        }
        ```
* Maze
    * Given a maze and a start point and a target point, return whether the target can be reached.

        ```
        public static boolean solveMaze(char[][] maze, int startX, int startY, int targetX, int targetY, ArrayList<Character> path) {
            if (startX < 0 || startX >= maze.length 
                || startY < 0 || startY >= maze[0].length 
                || maze[startX][startY] == 'X' 
                || visited[startX][startY]) {
                return false;
            }
            if (startX == targetX && startY == targetY) {
                return true; 
            }
            maze[startX][startY] = 'X';
            int[] dx = {1, 0, -1, 0};
            int[] dy = {0, 1, 0, -1};
            char[] direction = {'D', 'R', 'U', 'L'};
            for (int i = 0; i < 4; i++) {
                path.add(direction[i]);
                if (solveMaze(maze, startX+dx[i], startY+dy[i], targetX, targetY, path)) {
                    return true;
                }
                path.remove(path.size() - 1);
            }
            return false;
        }
        ``` 
* Eight Queens
    * The eight queens puzzle is the problem of placing eight chess queens on an 8×8 chessboard so that no two queens threaten each other.
* Backtracking Summary
    * Backtrack = try, iterate, traverse, etc. 
    * Keep trying (in the search space) until
        * Solution is found
        * No more meaningful methods to try (no more search space)
    * Level-N problem -> M * Level-(N-1) subproblem
        * Keep states the same when entering subproblem except shared ﬁelds. 
* Permutation
    * use backtracking

    ```
    public List<List<Integer>> permute(int[] num) {
        List<List<Integer>> results = new ArrayList<List<Integer>>(); 
        Arrays.sort(num); 
        permute(results, num, 0); 
        return results;
    }
    public void permute(List<List<Integer>> results, ArrayList<Integer> cur, int[] num) {
        if (cur.size() == num.length) {
            results.add(new ArrayList<Integer>(cur)); 
            return;
        }
        for (int i = 0; i < num.length; i++) {
            if (cur.contains(num[i])) {
                continue;
            }
            cur.add(num[i]); 
            permute(results, cur, num); 
            cur.remove(cur.size() - 1);
        }
    }
    ```
* Combination
    * use backtracking

    ```
    public List<List<Integer>> combine(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        combination(results, nums, 0, new ArrayList<Integer>());
        return results;
    }
    public void combination(List<List<Integer>> results, int[] nums, int index, ArrayList<Integer> items) {
        if (index == nums.length) {
            results.add(new ArrayList<Integer>(items)); 
            return;
        }
        for (int i = index; i < nums.length; i++) {
            items.add(nums[i]);
            combination(results, nums, i+1, items);
            items.remove(items.size()-1);
        }
        combination(results, nums, nums.length, items);
    }
            
    ```
    
### Tree & Graph
#### What is tree?
* A tree data structure can be deﬁned recursively (locally) as a collection of nodes (starting at a root node), where each node is a data structure consisting of a value, together with a list of references to nodes (the "children"), with the constraints that no reference is duplicated, and none points to the root.  

#### When to Use Tree
* Simulating a hierarchical tree structure
    * File System, HTML, Compiler Pattern Recognition, etc.
* Simulating search space for solutions
    * DFS, BFS, Decision Tree, etc.
* Performance Improvement 
    * Red Black Tree, AVL, B/B+ Tree, etc.

#### Properties
* The depth of a node is the number of edges from the node to the tree's root node. A root node will have a depth of 0.  
* Note that depth doesn't make sense for a tree.
* The height of a node is the number of edges on the longest path from the node to a leaf. A leaf node will have a height of 0.
* The height of a tree would be the height of its root node, or equivalently, the depth of its deepest node.

#### Binary Tree
* Types of Binary Tree
    * Complete Binary Tree
    * Full Binary Tree
* Properties of Binary Tree
    * At Level i, at most 2^i nodes
    * A tree with height k, at most 2^(k+1)-1 nodes
    * Complete binary tree
        * With n nodes, the height will be log<sub>2</sub>(n + 1) − 1
        * number nodes from the root, then for node k, its children would be 2 * k + 1 and 2 * k + 2
* Traversal of a Binary Tree
    * Depth First Search
        * Tree is a recursive data structure.
        * PreOrder
        
            ```
            public void preorder(TreeNode root) { 
                if(root != null) { 
                    //Visit the node by printing the node data 
                    System.out.printf("%d ",root.val); 
                    preorder(root.left); 
                    preorder(root.right); 
                } 
            }
            ```
        * InOrder

            ```
                public void preorder(TreeNode root) { 
                    if(root != null) { 
                        //Visit the node by printing the node data 
                        preorder(root.left); 
                        System.out.printf("%d ",root.val); 
                        preorder(root.right); 
                    } 
                }
            ```
        
        * PostOrder

            ```
                public void preorder(TreeNode root) { 
                    if(root != null) { 
                        //Visit the node by printing the node data 
                        preorder(root.left); 
                        preorder(root.right); 
                        System.out.printf("%d ",root.val); 

                    } 
                }
            ```
                
            ![DFS-BT](https://lh3.googleusercontent.com/-d9K9DXhhDVk/W6_Uw3w8vbI/AAAAAAAAAJg/xPhrO6KwNywIThPis4KcRsRFyBTB8-8xwCHMYCw/I/DFS-BT.png)  
             
    * Breadth First Search
        * LevelOrder
        * Queue will be needed to keep the order

            ```
            public void levelorder(TreeNode root) { 
                // BFS 
                Queue<TreeNode> queue = new LinkedList<>();
                queue.offer(root);
                while (!queue.isEmpty()) {
                    TreeNode top = queue.pop(); 
                    System.out.printf("%d ", top.val); 
                    if (top.left != null) {
                        queue.offer(top.left); 
                    } 
                    if (top.right != null) {
                        queue.offer(top.right); 
                    }
                } 
                return;
            }
            ```
            
* Questions
    * Maximum Depth of Binary Tree
        * recursive solution

            ```
            public int maxDepth(TreeNode root) { 
                if (root == null) return 0; 
                int leftDepth = maxDepth(root.left); 
                int rightDepth = maxDepth(root.right); 
                return Math.max(leftDepth, rightDepth) + 1; 
            }
            ```    
    * Minimum Depth of Binary Tree
        * recursive solution

            ```
            public int minDepth(TreeNode root) { 
                if (root == null) return 0; 
                
                int leftDepth = minDepth(root.left); 
                int rightDepth = minDepth(root.right);
                
                if (leftDepth == 0) {
                    return rightDepth + 1; 
                } else if (rightDepth == 0) {
                    return leftDepth + 1; 
                } 
                
                return Math.min(leftDepth, rightDepth) + 1; 
            }
            ```
    * Same Tree
        * recursive solution
        
            ```
            public boolean isSameTree(TreeNode p, TreeNode q) { 
                if (p == null && q == null) { 
                    return true; 
                } else if (p == null || q == null) { 
                    return false; 
                } 
                return p.val == q.val 
                    && isSameTree(p.left, q.left) 
                    && isSameTree(p.right, q.right);
            }            
            ```
   * Symmetric Tree Tree
        * recursive solution
    
            ```
            public boolean isSymmetric(TreeNode root) {
                if(root == null) {
                    return true;
                }
                return isSymmetric(root.left, root.right);
            }
            public boolean isSymmetric(TreeNode left, TreeNode right) {
                if (left == null && right == null) { 
                    return true; 
                } else if (left == null || right == null) { 
                    return false; 
                } 
                return left.val == right.val 
                    && isSameTree(left.left, right.right) 
                    && isSameTree(left.right, right.left);
            }            
            ```
            
    * Path Sum
        * preorder DFS

#### Binary Search Tree
* All subtrees are BST
* All elements in left sub-tree is small than root
* All elements in Right sub-tree is larger than root
* If we do InOrder traversal, the result of BST is a sorted array
* Find  O(logn)
    ![find-BST](https://lh3.googleusercontent.com/-V5pGWOjiCh8/W6_z37WBVjI/AAAAAAAAAJ4/rAIcx8VIrd41mZtE-RsNBca73WrmHpWOwCHMYCw/I/find-BST.png)
    
* Add   O(logn)

    ![add-BST](https://lh3.googleusercontent.com/-3270ldSt1Ds/W6_z-5T2KoI/AAAAAAAAAJ8/OLtbgOHDu6gVfIAdTB8qyU5eIa5-IAdCACHMYCw/I/add-BST.png)

* Remove  O(logn)

    ![remove-2-BST](https://lh3.googleusercontent.com/-l7bHx3g8-hQ/W6_0D8mAhVI/AAAAAAAAAKA/n273nLbogNkW5UKGCRAzknu1jgpfNT-AACHMYCw/I/remove-2-BST.png)
    ![remove-1-BST](https://lh3.googleusercontent.com/-8cPTM_EaR3c/W6_0D-sW0uI/AAAAAAAAAKE/9brl2Qx1xv0RrRDmbtcLbqzaRNsWznExgCHMYCw/I/remove-1-BST.png)
    
* Binary Search Tree - R&B Tree, AVL tree
    * We know the search time is highly related to the height of the tree. If we keep add and remove elements in the tree, the tree will become unbalanced.
    * So we have Red-black tree and AVL tree, they could use rotation and reconstruct to make the tree balance.

### Graph
* A graph data structure consists of a ﬁnite (and possibly mutable) set of vertices or nodes or points, together with a set of unordered pairs of these vertices for an undirected graph or a set of ordered pairs for a directed graph.
* These pairs are known as edges, arcs, or lines for an undirected graph and as arrows, directed edges, directed arcs, or directed lines for a directed graph.
* Undirected graph
* Directed graph
    * Directed Acylic Graph
        * DFS
        * Topological Sort
* Graph Representation
    * GraphNode
    * Adjacent matrices
    * Adjacent lists
* Graph Traversal
    * DFS, BFS
        * Similar to Tree Traversal
        * There could be cycles in graph, so need to mark nodes visited after visiting. Different from tree here.
            * 3 states: not visited, visiting, visited

### Binary Search
* Search in an Sorted Array
* Binary search compares the target value to the middle element of the array
* If they are unequal, the half in which the target cannot lie is eliminated and the search continues on the remaining half until it is successful or the remaining half is empty.
* It is the fastest way to search in sorted array.
    ![binary search](https://lh3.googleusercontent.com/-buG9PoSWz6I/W6_21fitPvI/AAAAAAAAAKk/0Hf8wsARrEwAAsg-fbwxrhqIpDDp92xywCHMYCw/I/binary%2Bsearch.png)
         
* Search Insert Position
    ![search Insert position-BS](https://lh3.googleusercontent.com/-FZD37FqA1po/W6_5q-x3uqI/AAAAAAAAAK8/w8gz4Sc-YFIWtAUiL0UC179xR6gJwDVTwCHMYCw/I/search%2BInsert%2Bposition-BS.png)
    
* Search in Rotated Sorted Array
    ![search in rotated array-BS](https://lh3.googleusercontent.com/-XX9k3aUcUiI/W6___Hvi71I/AAAAAAAAALU/1j_2DD60vxAIG6T9fYnlCvU81zajM5dogCHMYCw/I/search%2Bin%2Brotated%2Barray-BS.png)
* Binary Search Summary
    * The fastest way to search in sorted array. O(logN)
    * Be careful with INFINITE LOOP.
    * int begin = 0, end = nums.length; [begin, end)
    * int begin = 0, end = nums.length-1; [begin, end]
    * Condition to terminate the loop
    * Condition for edge cases
    * In each loop iteration, there can be only two cases.
        * The range of [begin, end]/[begin, end) decrease.
        * Jump out of the loop
    * Make sure all cases are taken care of before writing code.

### Sorting
     
  ![sort-algorithms](https://lh3.googleusercontent.com/-50SW5TeUoqQ/W7L2l13GqzI/AAAAAAAAALw/78XYn4HqfT4G_Dhuy6GiwUdgIiQ1dTlMwCHMYCw/I/sort-algorithms.png)
* Questions
    * Sort Colors
        * bucket sort
    * Insert Sort List
        * Insertion Sort
    * Merge Intervals
    
         ```
         Collections.sort(Type, new Comparator<Type>(){
             @Override
             public int compare(Type a, Type b){
                return a.start - b.start;
             }
         });  
         ```

### HashMap
* In computing, a hash table (hash map) is a data structure used to implement an associative array, a structure that can map keys to values.
* Why to use HashMap
    * We need to store a mapping relationship
    * It is time-consuming to ﬁnd something in Array
    * If we can calculate the index by the object we want to store, then ﬁnding will become O(1).
        * use key to calculate index
* Basic Operations
    * size()
    * isEmpty()
    * containsValue(value) (not commonly used)
    ![hashmap-operation](https://lh3.googleusercontent.com/-6mNDTvq3UKo/W7L_T_SbQ4I/AAAAAAAAAMI/lZyLFV3L2q8fmWNX8RAfTDeWlZgSjhKdACHMYCw/I/hashmap-operation.png)
* HashMap is a array based data structure
    * HashMap is to store <key, value> pair
    * Use key to calculate index for the array
    * put <key, value> pair into the right position
* Implementation
    * Hash function (how to map)
        * Mod function
    * Collision resolve
        * Expand the space (Load Factor)
            * Load factor: size/capacity
            * Usually resize when load factor is larger than 0.75
        * Open hashing
            * Use a linked list (outside array) to store all collision elements
        * Closed hashing
            * Store collision elements somewhere else in the array
* HashSet
    * add, contains, remove
* HashMap Iteration
    
    ```
    for (Map.Entry<String, String> entry : map.entrySet()) { 
        System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue()); 
    }
    ```
* Questions
    * Two Sum
    * Word Pattern
        * use two HashMap
    * Group Anagrams
        * Sort and put in Hashmap

### Google Tech Dev Guide
* String
    * str = "Hello, World!"
    * str2 = str.concat(" Nice Day!")
    * str2 will be "Hello World! Nice Day!"
    * str3 = str2.replace('o','0')
    * str3 will be "Hell0 W0rld! Nice Day!" 
* Array
    * int[] nums = {1, 2, 3}; 
* Hangman Problem
* Object
    * str
    * str.equalsIgnoreCase(str2) return a boolean
    * can not use toArray method to covert a list<Integer> to a int[], could only convert to Integer[] use list.toArray(new Integer[list.size()]) 
    * HashTable collisions
        * clustering find next available position
            * worst case O(n)
        * seperate chaining insert the element at the head of the linkedlist
            * worst case will take O(n/k) time to find an element, k is the size of the table, k is constant, so still O(n)
            * n/k n over k
            * n * k n times k
        * to reduce collosions
            * make use of all info provided by key 
            * uniformly distributed output across table
            * map similar keys to very different hash values
            * use only very fast operations
* Constructor rules for class Construction
    * rule 1
        * extends Object
    * rule2 
        * if there is no constructor in the class, the compiler will insert one constructor with no arguments
    * Rule3
        * if there is no super() or this() in the constructor, the compiler will insert one
        
### Java File Read and Write

```
import java.io.IOException;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Map;

public class logProcess {
	public static void main(String[] args) {
		String fileName = "log.txt";
		Map<String, Integer> map = new HashMap<>();
		try (BufferedReader log = new BufferedReader(new FileReader(fileName))) {
			String record = "";
			String host = "";
			while((record = log.readLine()) != null) {
				host = record.split(" - - ")[0];
				map.put(host, map.getOrDefault(host, 0) + 1);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		String outputFile = "records_" + fileName;
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile, true))) {
			for(Map.Entry<String, Integer> entry : map.entrySet()) {
				bw.write(entry.getKey() + " " + Integer.toString(entry.getValue()) + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
```


## Advanced Review of Data Structures and Algorithms
### Recursion
* Tail Recursion
    * Tail recursion is a special kind of recursion where the recursive call is the very last thing in the function. It's a function that does not do anything at all after recursing.
* Classical Recursion Problem
    * Fibonacci Number
        * Can be solved by DP, which is better
    * Climbing Stairs
        * Same as Fibonacci
    * Merge Sort
        * We will talk more about that in Sort
    * Towers of Hanoi
    * Binary Search
        * This is a tail Recursion
* Questions
    * Gray Code
    
        ![Screen Shot 2018-10-27 at 14.05.56](https://lh3.googleusercontent.com/-4f1eesL_CSQ/W9TTYhyTSLI/AAAAAAAAAMo/-lRKn6KQU0MBBveG4JjKH2dqnLlQR96hACHMYCw/I/Screen%2BShot%2B2018-10-27%2Bat%2B14.05.56.png)
    
        ![Screen Shot 2018-10-27 at 14.09.59](https://lh3.googleusercontent.com/-QHkx-yAsnMI/W9TUQ7tpTVI/AAAAAAAAAMw/OggexFEbU4QlneAwqGXCzDf84qGyqfcyACHMYCw/I/Screen%2BShot%2B2018-10-27%2Bat%2B14.09.59.png)
    * 0-1 Knapsack
        
        ![Screen Shot 2018-10-27 at 14.12.45](https://lh3.googleusercontent.com/-C4zHIR-odLM/W9TU66z1zSI/AAAAAAAAAM4/1GiEONGw2u0Jm2v4trAdY5xpFcvdHvqJQCHMYCw/I/Screen%2BShot%2B2018-10-27%2Bat%2B14.12.45.png)
    * Maze
        
        ![Screen Shot 2018-10-27 at 14.18.12](https://lh3.googleusercontent.com/-pu19M1kqQ_8/W9TXECqK-sI/AAAAAAAAANQ/BoOb0caCeTE5W3m_6zij3-DoRlrWUrOIQCHMYCw/I/Screen%2BShot%2B2018-10-27%2Bat%2B14.18.12.png)

        ![Screen Shot 2018-10-27 at 14.18.31](https://lh3.googleusercontent.com/-mRxuPefBVF8/W9TXHpiscuI/AAAAAAAAANU/tH4danzbTpcarMFd11VkojlaqA9Jbe-kgCHMYCw/I/Screen%2BShot%2B2018-10-27%2Bat%2B14.18.31.png)

        ![Screen Shot 2018-10-27 at 14.21.58](https://lh3.googleusercontent.com/-0mdbMOGyovU/W9TXJ2fOSzI/AAAAAAAAANY/adfGSY5Ola05Yycz42va53tTb8Sr3Q1rgCHMYCw/I/Screen%2BShot%2B2018-10-27%2Bat%2B14.21.58.png)
        
* Backtracking Summary
    * Backtrack = try, iterate, traverse, etc.
    * Keep trying (in the search space) until
        * Solution is found
        * No more meaningful methods to try (no more search space)
    * Level-N problem -> M * Level-(N-1) subproblem
        * Keep states the same when entering subproblem except shared ﬁelds.
* Important Problems
    * Knapsack
        * Given a set of candidate numbers (C) and a target number (T), ﬁnd all unique combinations in C where the candidate numbers sums to T.
        * All candidate numbers are unique.
        * The same repeated number may be chosen from C unlimited number of times.
        
        ![Screen Shot 2018-10-27 at 14.40.51](https://lh3.googleusercontent.com/-d8WmiEkFR4g/W9TbeFVFXAI/AAAAAAAAAOE/HqA0E5uBB1E1AR69UOhL79iqqd51Hg6UACHMYCw/I/Screen%2BShot%2B2018-10-27%2Bat%2B14.40.51.png)


        ![Screen Shot 2018-10-27 at 14.38.58](https://lh3.googleusercontent.com/-9v0Nn4FPagI/W9TbTYS8kvI/AAAAAAAAAOA/LRe39teBz-c0zk2cSR5eCoMjPBXmQ4EtwCHMYCw/I/Screen%2BShot%2B2018-10-27%2Bat%2B14.38.58.png)
        
    * Knapsack II
        * Given a collection of candidate numbers (C) and a target number (T), ﬁnd all unique combinations in C where the candidate numbers sums to T.
        * Candidate numbers may contain duplicate.
        * Each number in C may only be used once in the combination.
        
        ![Screen Shot 2018-10-27 at 14.53.09](https://lh3.googleusercontent.com/-MXOppJ26Ve4/W9TeWyDyo_I/AAAAAAAAAOg/JsTROPE6quoNYdNhYNf2QtwWe3wCWoT8gCHMYCw/I/Screen%2BShot%2B2018-10-27%2Bat%2B14.53.09.png)
        
    * 0-1 Knapsack II
        * Given a knapsack which can hold s pounds of items, and a set of items with weight w1, w2, ... wn. Try to put items into the pack as many as possible, return the largest weight we can get in the knapsack.
        
        ![Screen Shot 2018-10-27 at 14.56.21](https://lh3.googleusercontent.com/-R7mclEN-aQo/W9TfG314QQI/AAAAAAAAAOo/S2JVMi-zecc1Qz605djo0KnPLnKKDILeQCHMYCw/I/Screen%2BShot%2B2018-10-27%2Bat%2B14.56.21.png)

    * Generate Parenthesis
        * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

        ![Screen Shot 2018-10-27 at 15.41.45](https://lh3.googleusercontent.com/-_7qGUDQx71o/W9TpwkH-C8I/AAAAAAAAAPA/VXM9qQURotEJcEK3tmHpGNCUOOi-JLdpwCHMYCw/I/Screen%2BShot%2B2018-10-27%2Bat%2B15.41.45.png)
        
    * Permutation
        * Given a collection of distinct numbers, return all possible permutations.
        
        ![Screen Shot 2018-10-27 at 15.50.54](https://lh3.googleusercontent.com/-W_i2OVMlw0E/W9Tr5mDDGyI/AAAAAAAAAPM/7w6OSzX39ZU2WjdBF-5KHvPTNbUrgd77QCHMYCw/I/Screen%2BShot%2B2018-10-27%2Bat%2B15.50.54.png)

    * Permutation II
        * Given a collection of ~~distinct~~ numbers, return all possible permutations.

        ![Screen Shot 2018-10-27 at 15.58.52](https://lh3.googleusercontent.com/-NsgFt_-ZJYA/W9Tty12fSTI/AAAAAAAAAPk/1fpDw8ddyYw4EvECOcbIuqyjFTs-OD2FQCHMYCw/I/Screen%2BShot%2B2018-10-27%2Bat%2B15.58.52.png)

    * Combination
        * Given a collection of distinct numbers, return all possible combinations.
         
        ![Screen Shot 2018-10-27 at 16.19.48](https://lh3.googleusercontent.com/-BANuRwITXNI/W9TzcjBc-NI/AAAAAAAAAQI/XB4sR1GtAnI8wEgmK2lIdiLXMWL9d7tRgCHMYCw/I/Screen%2BShot%2B2018-10-27%2Bat%2B16.19.48.png)

    * Lucky Numbers
        * 888 is a lucky number. And for each American phone number, we can actually add some operators to make it become 888. For example:
        * phone number is 7765332111, you will have 7/7\*65\*3+3\*21\*11 = 888 776+5+3\*32+11*1 = 888 ...
        * We want to get a full list of all the operation equations that can get a certain lucky number. The interface will be List<String> luckyNumbers(String num, int target)

        ![Screen Shot 2018-10-27 at 16.38.59](https://lh3.googleusercontent.com/-UoNTHd2xTEM/W9T3QmrP7mI/AAAAAAAAAQg/ALF4iraJtJU4YUal_j6zCDeSGezmGph0gCHMYCw/I/Screen%2BShot%2B2018-10-27%2Bat%2B16.38.59.png)
     
## Best time to buy and sell stock I（buy and sell at most once)
* use minSoFar track the min value so far
* use max to track the max profit: price - minSoFar

## Best time to buy and sell stock II（can buy and sell any times)
* find any increase part and add them up

## Best time to buy and sell stock III & IV (at most buy k times)
* use DP formula 
` dp[k, i] = max(dp[k, i-1], prices[i] - prices[j] + dp[k-1, j-1]), j=[0..i]`

    ```
    public int maxProfit(int[] prices) {
        if(prices.length < 2) return 0;
        int[][] profit = new int[3][prices.length];
        for(int k = 1; k < 3; k++) {
            int min = prices[0];
            for(int j = 1; j < prices.length; j++) {
                min = Math.min(min, prices[j] - profit[k - 1][j - 1]);
                profit[k][j] = Math.max(profit[k][j - 1], prices[j] - min);
            }
        }
        return profit[2][prices.length - 1];
    }
    ```
* optimization process: first original formula O(n^2) and then eliminate the duplicate calculation of min, to O(k*n), could also swap the for loop to compress the DP from 2D to 1D to decrease space complexity
* for k is very big, use another algorithm to solve the problem, avoid time limited or memory limited 

## Product of Array Except Self
* could not use division and must be O(n)
* multiply by the left part and the right part
* original version use linear space
* use res array first to store left n - 1 product, and update res from right to left, this method would only use constant space

## Regular Expression Matching
* use DP f[s.length() + 1][p.length() + 1]
* base case:
    * f[0][0] = true;
    * f[k][0] = false, f[0][2*k -1] = false for k >= 1
    * for p.charAt(2k - 1) == '*', f[0][2k - 2] = f[0][2k]
* DP formula:

    ```
    for (int i = 1; i <= s.length(); i++) {
        for (int j = 1; j <= p.length(); j++) {
            if (p.charAt(j - 1) != '*') {
                f[i][j] = f[i - 1][j - 1] && isCharMatch(s.charAt(i - 1), p.charAt(j - 1));
            } else {
                f[i][j] = f[i][j - 2] || f[i - 1][j] && isCharMatch(s.charAt(i - 1), p.charAt(j - 2));
            }
        }
    }
    ```
* return f[s.length()][p.length()] 
   
## Jewels and Stones
* s is a Sting, could not use for(char c : s)

## Palindrome Number
* reverse the number and compare the value with the original one  

## Remove Invalid Parentheses
* avoid duplicate results
    * store last_i and last_j
    * skip the same pair
    * return after the for loop
* reverse the string and reuse the code

## Fruit Into Baskets
* store the pre and cur fruit and number and update the lastIndex
* could also use a HashMap, more generic
* careful about the last element

## Letter Combinations of a Phone Number
* convert a char digit to a digit, use int digit = c - 'a';
* StringBuilder path = new StringBuilder();
* path.append("abc");
* path.delete(int start, int end);
* could use both DFS and BFS way to solve the problem;
* BFS is simpler and much more elegant

## Search in Rotated Sorted Array
* compare the mid with begin and end to find isLeftSorted or isRightSorted
* four cases, must be clear

## Search in Rotated Sorted Array II contain duplicates
* the only difference from the first one, trickly case, such as 3 1 2 3 3 3 3, so have to increase left and decrease right, so we can be clear about which part is ordered
* other code is simillar

## Next Closest Time
* use DFS to backtracking all possible times
* special case in DFS, remember to return
* use String[] s = new String[1] and int[] min = new int[1] to pass reference and avoid usage of global variable

## Meeting Rooms I check if can attend all meetings 
* to sort the array, use Arrays.sort not Collections.sort
* sort and compare the start and end

## Meeting Room II minimum meeting rooms needed
* use two Comparator, first sort the intervals according to the start
* add the intervals into a PriorityQueue according to the end

## License Key Formatting
* could format from the end to the beginning, find chance to append "-"
* % trick: sb.length() % (k + 1) == k, instead of sb.length() % k == 0

## Serialize and Deserialize Binary Tree
* use StringBuilder, define it in the function, then pass it to the recursive solution, don't have to use array reference
* index have to use array reference, if want to change the index globally
* TreeNode preorder traversal 

## Word Break
* can not use greedy algorithm
* use HashSet to cache list of words, contains method of set will consume only constant time, but for list will cost linear time
* use DP to solve the problem, base case and formula

## Next Permutation
* find the logic, from the end to the beginning, find the change location, find the next minimum change loc, swap, and reverse
* use function to build the structure

## Minimum Window Substring
* use a HashMap to cache data
* use a queue to store next move position
* use two pointers to indicate the length
* use while loop to update the left pointer

## Generate Parentheses
* use a String and "+", instead of a StringBuilder, because they will share a same reference, same with left and right indicator
* when left < n, increase left, when left > right, increase right

## Fizz Buzz
* no constructor for new String(int), could only use Integer.toString(int) to convert a int to a String

## Move Zeroes
* first write a swap function
* swap between 0 position and nonzero position, and increase left by 1.
* could also fill the array from the beginning with nonzero values, and fill the rest array with 0.

## Spiral Matrix
* use rowBegin, rowEnd, colBegin, colEnd four pointers to solve the problem
* constrains about the row and col should update with the while loop

## Alien Dictionary
* the  lexicographically order is compare by column, no concern with row
* use degree map and a queue to do BFS, use a map to store the data
* set has to be declared in the outer scope
* topological sort solution
* remember to break when a diff happened

## Friend Circles
* find a unvisited person, add 1 to count, dfs relationship with this person, find relation, continue dfs
* 2D array relation, line by line search, jump between lines
* could also use union find

    ```
    class Solution {
        public int findCircleNum(int[][] M) {
            int n = M.length;
            UnionFind uf = new UnionFind(n);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    if (M[i][j] == 1) {
                        uf.union(i, j);
                    } 
                }
            }
            return uf.count();
        }
        class UnionFind {
            int[] path; 
            int count;
            public UnionFind(int n) {
                path = new int[n];
                count = n;
                for (int i = 0; i < n; i++) {
                    path[i] = i;
                }
            }
            public int find(int i) {
                while (i != path[i]) i = path[i];
                return i;
            }
            public void union(int i, int j) {
                int rootI = find(i);
                int rootJ = find(j);
                if (rootI == rootJ) return;
                path[rootI] = rootJ; 
                count--;
            }
            public int count() {
                return count;
            }
        }
    }
    ```

## Merge Sorted Array
* shift array from left to right, start from the end one
* bottom-up solution is better

## Max Area of Island
* use DFS to traverse the 2D array, return an int
* be careful about the variable name

## String to Integer (atoi)
* take all conditions into consideration
* refractor the code, make it more clean, and more readable
* avoid nested if and else
* if do not want to use long, could use Integer.MAX_VALUE / 10, but have to take care of the last digit 

## Group Anagrams
* convert a char array to a string, use new String(cArr);
* if List is a value in the HashMap, directly use map.get(key).add(item), but remember to initialize put a new ArrayList in it.

# Arrays and Strings
* Hash Tables
    * A hash table is a data structure that maps keys to values for highly efficient lookup.
    * If the number of collisions is very high, the worst case runtime is O(N), where N is the number of keys. However, we generally assume a good implementation that keeps collisions to a minimum, in which case the lookup time is 0( 1).
    * Alternatively, we can implement the hash table with a balanced binary search tree. This gives us an O( log N) lookup time. The advantage of this is potentially using less space, since we no longer allocate a large array. We can also iterate through the keys in order, which can be useful sometimes.
* Arraylist & Resizable Arrays
    * An Arraylist is an array that resizes itself as needed while still providing 0(1) access.
* StringBuilder
    * normally, string concatenating: on each concatenation,a new copy of the string is created, and the two strings are copied over,character by character.
    * StringBuilder simply creates a resizable array of all the strings, copying them back to a string only when necessary.
    * How to implement a StringBuilder

# Linked Lists
* linked list is a data structure that represents a sequence of nodes. In a singly linked list, each node points to the next node in the linked list. A doubly linked list gives each node pointers to both the next node and the previous node.
* a linked list does not provide constant time access to a particular "index" within the list
* can add and remove items from the beginning of the list in constant time.
* Remember that when you're discussing a linked list in an interview, you must understand whether it is a singly linked list or a doubly linked list.
* check for the null pointer and (2) to update the head or tail pointer as necessary.
* The "Runner"Technique
    * The runner technique means that you iterate through the linked list with two pointers simultaneously, with one ahead of the other. The "fast" node might be ahead by a fixed amount, or it might be hopping multiple nodes for each one node that the "slow" node iterates through.
* Recursive Problems
    * recursive algorithms take at least O ( n) space, where n is the depth of the recursive call.  

# Stacks and Queues
* A stack uses LIFO (last-in first-out) ordering. That is, as in a stack of dinner plates, the most recent item added to the stack is the first item to be removed.
* Note that a stack can also be implemented using a linked list, if items were added and removed from the same side.
* One case where stacks are often useful is in certain recursive algorithms. Sometimes you need to push temporary data onto a stack as you recurse, but then remove them as you backtrack (for example, because the recursive check failed). A stack offers an intuitive way to do this.
* A queue implements FIFO (first-in first-out) ordering. As in a line or queue at a ticket stand, items are removed from the data structure in the same order that they are added.
* A queue can also be implemented with a linked list. In fact, they are essentially the same thing, as long as items are added and removed from opposite sides.
* One place where queues are often used is in breadth-first search or in implementing a cache.

# Trees and Graphs
* a tree is actually a type of graph.
* Types of Trees
    * A nice way to understand a tree is with a recursive explanation.
    * Trees vs. Binary Trees
        * A binary tree is a tree in which each node has up to two children. Not all trees are binary trees.
    * Binary Tree vs. Binary Search Tree
        * A binary search tree is a binary tree in which every node fits a specific ordering property: all descendents <= n < all right descendents. This must be true for each node n.
    * Balanced vs. Unbalanced
        * While many trees are balanced, not all are. Ask your interviewer for clarification here. Note that balancing a tree does not mean the left and right subtrees are exactly the same size
        * Two common types of balanced trees are red-black trees and AVL trees.
    * A complete binary tree is a binary tree in which every level of the tree is fully filled, except for perhaps the last level. To the extent that the last level is filled, it is filled left to right.
    * A full binary tree is a binary tree in which every node has either zero or two children. That is, no nodes have only one child.
    * A perfect binary tree is one that is both full and complete. All leaf nodes will be at the same level, and this level has the maximum number of nodes.
    * a perfect tree must have exactly 2^k - 1 nodes (where k is the number of levels).
    * Binary Tree Traversal
        * In-order traversal means to "visit" (often, print) the left branch, then the current node, and finally, the right branch.
        * Pre-order traversal visits the current node before its child nodes (hence the name "pre-order").
        * Post-order traversal visits the current node after its child nodes (hence the name "post-order").
    * Binary Heaps (Min-Heaps and Max-Heaps)
        * A min-heap is a complete binary tree
        * where each node is smaller than its children. The root, therefore, is the minimum element in the tree.
        * insert
            * When we insert into a min-heap, we always start by inserting the element at the bottom. We insert at the rightmost spot so as to maintain the complete tree property.
            * Then, we "fix"the tree by swapping the new element with its parent, until we find an appropriate spot for the element. We essentially bubble up the minimum element.
            * This takes O( log n) time, where n is the number of nodes in the heap.
        * Extract Minimum Element
            * First, we remove the minimum element and swap it with the last element in the heap (the bottommost, rightmost element). Then, we bubble down this element, swapping it with one of its children until the minheap property is restored.
            * Do we swap it with the left child or the right child? That depends on their values. There's no inherent ordering between the left and right element, but you'll need to take the smaller one in order to maintain the min-heap ordering.
    * Tries (Prefix Trees)
        * A trie is a variant of an n-ary tree in which characters are stored at each node. Each path down the tree may represent a word.
        * Very commonly, a trie is used to store the entire (English) language for quick prefix lookups. While a hash table can quickly look up whether a string is a valid word, it cannot tell us if a string is a prefix of any valid words. A trie can do this very quickly.
        
# Graphs
* A graph is simply a collection of nodes with edges between (some of) them.
* In terms of programming, there are two common ways to represent a graph.
    * Adjacency List
    * Every vertex (or node) stores a list of adjacent vertices. In an undirected graph, an edge like (a, b) would be stored twice: once in a's adjacent vertices and once in b's adjacent vertices.
    * An array (or a hash table) of lists (arrays, arraylists, linked lists, etc.) can store the adjacency list.
    * Adjacency Matrices
    * An adjacency matrix is an NxN boolean matrix (where N is the number of nodes), where a true value at matrix[ i] [j] indicates an edge from node i to node j.
* Graph Search
    * depth-first search (DFS) recursive
        * we start at the root (or another arbitrarily selected node) and explore each branch completely before moving on to the next branch. That is, we go deep first (hence the name depth first search) before we go wide.
    * breadth-first search (BFS) queue
        * we start at the root (or another arbitrarily selected node) and explore each neighbor before going on to any of their children. That is, we go wide (hence breadth-first search) before we go deep.
    * DFS is often preferred if we want to visit every node in the graph. Both will work just fine, but depth-first search is a bit simpler.
    * However, if we want to find the shortest path (or just any path) between two nodes, BFS is generally better.

# Bit Manipulation
* & | ^ ~
* bit tricks

    ![Screen Shot 2018-12-13 at 22.25.16](https://lh3.googleusercontent.com/-AlVHJZf09ac/XBNNAOOQ3JI/AAAAAAAAAT4/38Oi9gGfyDc7tWAlzHQLzGFv30ArFbUSgCHMYCw/I/Screen%2BShot%2B2018-12-13%2Bat%2B22.25.16.png)
    
* Two's Complement and Negative Numbers
* Arithmetic vs. Logical Right Shift
    * >> add sign to the head arithmetic
    * >>> add 0 to the head logical
* Common Bit Tasks: Getting and Setting
    * Get Bit
        * num & (1 « i)
    * Set Bit 0->1
        * num | ( 1 « i)
    * Clear Bit 1->0
        * num & (~(1 << i))
        * To clear all bits from the most significant bit through i (inclusive), we create a mask with a 1 at the ith bit (1 < < i).
        * num & ((1 << i) - 1)
        * To clear all bits from i through 0 (inclusive), we take a sequence of all ls (which is -1) and shift it left by i + 1 bits. This gives us a sequence of 1 s (in the most significant bits) followed by i 0 bits.
        * num & (-1 << (i + 1))

# Recursion and Dynamic Programming
* Recursive solutions, by definition, are built off of solutions to subproblems. Many times, this will mean simply to compute f ( n) by adding something, removing something, or otherwise changing the solution for f ( n-1). In other cases, you might solve the problem for the first half of the data set, then the second half, and then merge those results.
* Bottom-Up Approach
* Top-Down Approach
* Half-and-Half Approach
* Dynamic Programming & Memoization
* Dynamic programming is mostly just a matter of taking a recursive algorithm and finding the overlapping subproblems (that is, the repeated calls). You then cache those results for future recursive calls.

# Note
* String
    * end to start, in place save Space Complexity
    * use bit manipulation to decrease space complexity
    * check rotate string, could double rotated string first and then do is substring

* LinkedList
    * Pointers
    * head and tail
    * slow and fast
    * palindrome and stack

# New Start

## Game of Life
* flag states in place and restore use math solution
* original 1->live 0->dead
* changed 1->live not change 2->live to dead 3->dead to live
* restore by % 2
* make the code clean and easy to read and understand

## Subarray Sum Equals K 
* use a sum HashMap and curSum - k to query the map to get the count
* first update the curSum, then query, finally add curSum to Map

## 3Sum Closest
* 3 Sum, first sort then two pointers, keep updating the minDiff
* O(n^2)

## Insert Delete GetRandom O(1)
* use an ArrayList and a HashMap, list store the values, and map store the index of each value in the list
* remove a value form the list, if that value is not the last one then swap it with the last one, update the list and the map, and then delete the last one from the list and delete the val from the map
* java.util.Random rand = new java.util.Random();
* rand.nextInt(nums.size());

## Task Scheduler
* math problem
* Math.max(tasks.length, (maxFreq - 1) * (n + 1) + numOfMax);

## First Missing Positive
* goal: O(n) and constant space complexity
* first use swap to separate the array into two part, the first part is positive and the second part is negative, return the partition point
* treat positive num as index, flag the index's value to be negative
* find the first positive index, that's the missing value

## Word Search
* dfs solution, use visited backtracking

## Longest Substring with At Most Two Distinct Characters
* use a HashMap to store the distinct values
* could also use two pointers: left1 and left2 to accomplish this goal

## Top K Frequent Elements
* Map.Entry<E,E> can not create array
* List<Integer> [] is valid
* map and bucket idea

## Palindrome Pairs
* Arrays.asList(1,2,3);
* store words in a HashMap
* cut words and find palindrome in the HashMap

## Reverse Nodes in k-Group
* reverse k group
* use four pointers: prev, head, tail, temp, only keep moving temp, other pointers do not move in a loop
* new pointer redirect logic
* reverse linkedlist need three pointer

## Pow(x, n)
* recursive solution
* base case n = 0, n = - n, x = 1. / x
* Double.isInfinite(x)

## Basic Calculator
* use a sign stack
* use peek and push and pop

## Add Binary
* clean code and use a while loop when there are two ropes that might with different length
* use StringBuilder
* StringBuilder could also use charAt and length()

## Consecutive Numbers Sum
* math problem
* (n * (n - 1)) % 2 will always be 0

## Multiply Strings
* two ideas to multiply strings
* one is to use add string code and add these strings up
* another is just to use an int array int[m+n]

## Unique Email Addresses
* use a HashSet
* str.split("@") is valid, str.split('@') is invalid

## Decode Ways
* dp solution
* base case, dp[0] and dp[1]
* instead of using two nested if statement, use two separate if statement

## Reverse Words in a String
* use a stack
* s.substring(s.length(), s.length()) is a empty string not null

## Restore IP Addresses
* dfs solution
* most important ip property: if(i == 1 || (i == 2 && val >= 10) || (i == 3 && val >= 100 && val <= 255)) {doDFS}

## Edit Distance
* classic DP solution
* string DP is a classic category
* base case should be clear

## Read N Characters Given Read4 II - Call multiple times
* cache and use of pointers
* when cache has been completely read, reset the cache

## Kth Largest Element in an Array
* use a priorityqueue
* O(nlogk)
* could use partition and pivot idea along with 

## Binary Search Tree Iterator
* use a stack to store the pre nodes

## Min Stack
* solution 1: use two stack, another stack update the min
* solution 2: use a customized node class, use LinkedList to implement stack, operate on the head of the LinkedList

## Find Median from Data Stream
* maintain two PriorityQueue, a min heap and a max heap
* update the min and max heap according to the size of each one and the peek element of each one

## Sliding Window Maximum
* using a Deque to achieve O(n)
* Deque<E> dq = new ArrayDeque<>();

## Minimum Cost to Hire K Workers
* understand the rules first, implement a class
* sort the data
* find  k elements min sum in an array, could use a pq (nlogk), use -element to achieve the reverse effect
* over all nlogn 

## UTF-8 Validation
* 读题的能力最重要
* if(data & 224 == 224) is invalid, should be if((data & 224) == 224)

## Validate Binary Search Tree
* use min and max idea to identify the tree
* do not use Integer min value and max value, since that will conflict with the corner case, instead use a Integer type and set the default to be null, that's a great way to solve the max and min default value problem

## Lowest Common Ancestor of a Binary Tree
* post order traversal
* recursive return value is a single ancestor node

## Binary Tree Maximum Path Sum
* max and min problem, null node return 0
* to avoid 0 covers negative value, make every update(max or min or return value) involves with node.val 

## Binary Tree Zigzag Level Order Traversal
* BFS traversal, use a queue and during the while loop, level size is indicate by the size of the current queue
* or could use an indicator to mark the end of each level
* could use Collections.reverse(list) or could use list.add(0, item);

## Decode String
* use a stack and two StringBuilder
* pop and append
* StringBuilder sb.insert(0,str);

## Word Ladder
* use BFS instead of DFS, cause this is a shortest path problem
* use a queue and use queue size indicate the level
* to reduce time complexity, use 26 characters, and length of word, instead loop the O(n) array

## Evaluate Division
* use a nested HashMap to store data
* could use DFS and a visited HashSet to find the result
* could also use BFS to update the map, and find the value
* BFS is like Union Find

## K Empty Slots
* could use a bloom boolean array to represent the garden, and loop through k days to check if there is a meet result, takes O(nK) time
* could use days array, and check if any intermediate elements are less than the two sides, takes O(n), but this method will loop through all elements and return the min value







    
     


              
 
    
    


    
    
    



