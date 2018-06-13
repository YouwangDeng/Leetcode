//Solution 1 use Graph entry point and meet point
class Solution {
    public int findDuplicate(int[] nums) {
        if (nums.length > 1) {
            int slow = nums[0];
            int fast = nums[nums[0]];
            //find meet point
            while (slow != fast) {
                slow = nums[slow];
                fast = nums[nums[fast]];
            }

            fast = 0;
            //find entry point
            while (fast != slow) {
                fast = nums[fast];
                slow = nums[slow];
            }
            return slow;
	    }
	return -1;
    }
}