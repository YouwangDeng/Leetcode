//Solution 1 O(n) TP O(k) SP but efficient
class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length; 
        int[] temp = new int[k];
        int t = nums.length - k;
        int s = t-1;
        for (int i = 0; i < k; i++) {
            temp[i] = nums[t++];
        }
        for (int j = nums.length - 1; j >= k; j--) {
            nums[j] = nums[s--];
        }
        for (int z = 0; z < k; z++) {
            nums[z] = temp[z];
        }
    }
}
//Solution 2 Reverse Three Times O(n) TP O(1) SP
class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}