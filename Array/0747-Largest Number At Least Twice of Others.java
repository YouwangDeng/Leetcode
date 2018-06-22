//Solution 1 max and secondmax
class Solution {
    public int dominantIndex(int[] nums) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        
        if(nums.length == 1){
            return 0;
        }
        int max = Integer.MIN_VALUE + 1;
        int secondMax = Integer.MIN_VALUE;
        int index = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                secondMax = max;
                max = nums[i];
                index = i;
            } else if(nums[i] != max && nums[i] > secondMax){
                secondMax = nums[i];
            }
        }
        if(secondMax * 2 <= max){
            return index;
        }
        return -1;
    }
}