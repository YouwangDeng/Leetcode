//Solution 1 pure math solution
class Solution {
    public String optimalDivision(int[] nums) {
        String ret = "";
        if (nums.length == 0) {
            return ret;
        }
        if (nums.length == 1) {
            ret = Integer.toString(nums[0]);
            return ret;
        }
        if (nums.length == 2) {
            ret = Integer.toString(nums[0]) + "/" + Integer.toString(nums[1]);
            return ret;
        }
        
        ret = Integer.toString(nums[0]) + "/(" + Integer.toString(nums[1]);
        for (int i=2; i<nums.length; i++) {
            ret += "/" + Integer.toString(nums[i]);
        }
        ret += ")";
        return ret;
    }
}