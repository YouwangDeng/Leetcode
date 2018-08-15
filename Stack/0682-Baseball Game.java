//Solution 1 standard switch case stack solution
class Solution {
    public int calPoints(String[] ops) {
        int sum = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i < ops.length; i++) {
            switch(ops[i]) {
                case "+" :
                    int temp1 = stack.pop();
                    int temp2 = stack.peek();
                    int temp_sum = temp1 + temp2;
                    sum += temp_sum;
                    stack.push(temp1);
                    stack.push(temp_sum);
                    break;
                case "D" :
                    int temp_pre = stack.peek();
                    int temp_d = 2 * temp_pre;
                    sum += temp_d;
                    stack.push(temp_d);
                    break;
                case "C" :
                    int cancel = stack.pop();
                    sum -= cancel;
                    break;
                default :
                    int temp = Integer.parseInt(ops[i]);
                    sum += temp;
                    stack.push(temp);
                    
            }
        }
        return sum;
    }
}