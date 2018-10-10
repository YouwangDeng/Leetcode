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
     


              
 
    
    


    
    
    



