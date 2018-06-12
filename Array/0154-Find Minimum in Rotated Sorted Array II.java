//Solution 1 Perfect solution
class Solution {
    public int findMin(int[] nums) {
        for(int i = nums.length - 1; i > 0; i--) {
            if(nums[i - 1] > nums[i]) return nums[i];
        }
        return nums[0];
    }
}