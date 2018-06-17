//Solution 1 mark visited as -1 O(n)
class Solution {
    public int arrayNesting(int[] nums) {
        int result = 1;
        for (int i = 0; i < nums.length; i++) {
            int index = i;
            int count = 0;
            while (nums[index] >= 0) {
                int newIndex = nums[index];
                nums[index] = -1;
                index = newIndex;
                count++;
            } 
            result = Math.max(result, count);
        }
        return result;
    }
}