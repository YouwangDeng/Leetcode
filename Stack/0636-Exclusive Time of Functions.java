//Solution 1 use stack peek and pop methods to manipulate status
class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        // separate time to several intervals, add interval to their function
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();
        int pre = 0;
        // pre means the start of the interval
        for(String log: logs) {
            String[] arr = log.split(":");
            if(arr[1].equals("start")) {
                if(!st.isEmpty())  result[st.peek()] += Integer.parseInt(arr[2]) - pre;//use peek
                // arr[2] is the start of next interval, doesn't belong to current interval.
                st.push(Integer.parseInt(arr[0]));
                pre = Integer.parseInt(arr[2]);
            } else {
                result[st.pop()] += Integer.parseInt(arr[2]) - pre + 1;//use pop
                // arr[2] is end of current interval, belong to current interval. That's why we have +1 here
                pre = Integer.parseInt(arr[2]) + 1;
                // pre means the start of next interval, so we need to +1
            }
        }
        return result;
    }
}