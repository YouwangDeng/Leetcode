//Solution 1 Binary Search
class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            min = Math.min(min, nums[i] - nums[i - 1]);
        }
        int max = nums[nums.length - 1] - nums[0];
        
        while (min < max) {
            int mid = min + (max - min) / 2;
            if (getNum(nums, mid) < k) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }
        return min;
    }
    
    private int getNum(int[] nums, int mid) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res += firstGreaterThanK(nums, nums[i] + mid) - (i + 1);
        }
        return res;
    }
    
    private int firstGreaterThanK(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return right;
    }
}
//Solution 2 Binary Search but shorter and faster
class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length, low = 0, hi = nums[n-1] - nums[0];
        while (low < hi) {
            int cnt = 0, j = 0, mid = (low + hi)/2;
            for (int i = 0; i < n; i++) {
                while (j < n && nums[j] - nums[i] <= mid) j++;
                cnt += j - i-1;
            }
            if (cnt >= k) 
                hi = mid;
            
            else low = mid + 1;
        }
        
        return low;
    }
}
//Solution 3 Bucket Sort much slower
class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        int len=nums.length;
        int len2=1000000;
        int[] dp= new int[len2];
        for(int i=1;i<len;i++){
            for(int j=0;j<i;j++){
             int dif= Math.abs(nums[i]-nums[j]);
               dp[dif]++;
            }
        }
        int sum=0;
        for(int i=0;i<len2;i++){
            sum+=dp[i];
            if(sum>=k) return i;
        }
        return 0;
    }
}
