//Solution 1 Two Pointers O(n)
class Solution {
    public int minSubArrayLen(int s, int[] a) {
        if (a == null || a.length == 0)
        return 0;
        int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;
        while (j < a.length) {
            sum += a[j++];//key point about j
            while (sum >= s) {
              min = Math.min(min, j - i);//key point about j-i
              sum -= a[i++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
//Solution 2 BinarySearch O(nlog(n))
class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int[] sums = new int[nums.length + 1];
        for (int i = 1; i < sums.length; i++) sums[i] = sums[i - 1] + nums[i - 1];
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < sums.length; i++) {
            int end = binarySearch(i + 1, sums.length - 1, sums[i] + s, sums);
            if (end == sums.length) break;
            if (end - i < minLen) minLen = end - i;
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
    private int binarySearch(int lo, int hi, int key, int[] sums) {
        while (lo <= hi) {
           int mid = (lo + hi) / 2;
           if (sums[mid] >= key){
               hi = mid - 1;
           } else {
               lo = mid + 1;
           }
        }
        return lo;
    }
}