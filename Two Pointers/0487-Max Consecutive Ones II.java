//Solution 1 use two pointers to keep a slicing window
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, zero = 0, k = 1; // flip at most k zero
        for (int l = 0, h = 0; h < nums.length; h++) {
            if (nums[h] == 0)                                           
                zero++;
            while (zero > k)
                if (nums[l++] == 0)
                    zero--;                                     
            max = Math.max(max, h - l + 1);
        }                                                               
        return max;             
    }
}
//Solution 2 use Queue and two pointers more clear solution
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {                 
        int max = 0, k = 1; // flip at most k zero
        Queue<Integer> zeroIndex = new LinkedList<>(); 
        for (int l = 0, h = 0; h < nums.length; h++) {
            if (nums[h] == 0)
                zeroIndex.offer(h);
            if (zeroIndex.size() > k)                                   
                l = zeroIndex.poll() + 1;
            max = Math.max(max, h - l + 1);
        }
        return max;                     
    }
}