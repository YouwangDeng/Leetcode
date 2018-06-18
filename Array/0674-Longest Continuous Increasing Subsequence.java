//Solution 1 Math.max influent performance not necessary do max in every iteration
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int res = 0, cur = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) cur = 1;
            else if (nums[i] > nums[i-1]) cur++;
            else {
                res = Math.max(res, cur);
                cur = 1;
            }
            
        }
        res = Math.max(res, cur);
        
        return res;
    }
}