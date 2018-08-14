//Solution 1 use two stack to implement one queue solution
class MyQueue {

    Stack<Integer> input = new Stack();
    Stack<Integer> output = new Stack();
    
    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        peek();
        return output.pop();
    }

    public int peek() {
        if (output.empty())
            while (!input.empty())
                output.push(input.pop());
        return output.peek();
    }

    public boolean empty() {
        return input.empty() && output.empty();
    }
}
//Solution 2 another two stack solution faster
class MyQueue {
    Stack<Integer> queue = new Stack<Integer>();
    // Push element x to the back of queue.
    public void push(int x) {
        Stack<Integer> temp = new Stack<Integer>();
        while(!queue.empty()){
            temp.push(queue.pop());
        }
        queue.push(x);
        while(!temp.empty()){
            queue.push(temp.pop());
        }
    }

    // Removes the element from in front of queue.
    public int pop() {
        return queue.pop();
    }

    // Get the front element.
    public int peek() {
        return queue.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return queue.empty();
    }
}