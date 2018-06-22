//Soulution 1 use sum and half clear solution
class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0, half = 0; 
        for (int n : nums) sum += n; 
        
        for (int i = 0; i < nums.length; i++) {
            if (sum == half * 2 + nums[i]) return i;    
            half += nums[i]; 
        }
        return -1; 
    }
}