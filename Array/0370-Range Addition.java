//Solution 1  O(n+k) neat solution
class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] res = new int[length];
         for(int[] update : updates) {
            int value = update[2];
            int start = update[0];
            int end = update[1];
            res[start] += value;
            if(end < length - 1)
                res[end + 1] -= value;//key point
        }
        for(int i = 0; i < length-1; i++) {
           res[i+1] +=res[i];//key point
        }
        return res;
    }
}