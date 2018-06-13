//Solution 1 O(n^2)
class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        int n = nums.length, cnt = 0;
        Arrays.sort(nums);
        for (int i = 0; i < n - 2 && nums[i] * 3 < target; i++)
            for (int l = i + 1, r = n - 1; l < r;)
                if (nums[i] + nums[l] + nums[r] < target) 
                    cnt += r - l++; //all r in (l, r] will also satisfy the condition
                else
                    r--;
        return cnt;
    }
}