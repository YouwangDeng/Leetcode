//Solution 1 duplicate up to 2 if no duplicate then change 2 to 1 in code
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i < 2 || n > nums[i-2]) //key point, i is slow grow, n continue
                nums[i++] = n;
        return i;
    }
}