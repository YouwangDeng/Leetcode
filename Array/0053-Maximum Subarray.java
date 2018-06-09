//Solution 1 A little trick
class Solution {
    public int maxSubArray(int[] nums) { 
        int maxSoFar=nums[0], maxEndingHere=nums[0];
        for (int i=1;i<nums.length;i++){
            maxEndingHere= Math.max(maxEndingHere+nums[i],nums[i]); //core logic
            maxSoFar=Math.max(maxSoFar, maxEndingHere);	
        }
        return maxSoFar;
    }
}