//Solution 1 
class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0, right =  nums.length-1, mid;
        while(left<=right) {
            mid = left +(right - left) / 2;
            if(nums[mid] == target) return true;
            // the only difference from the first one, trickly case, such as 3 1 2 3 3 3 3, so have to update left and right, so we can be clear about which part is ordered
            if((nums[left] == nums[mid]) && (nums[right] == nums[mid]) ) {
                ++left; 
                --right;
            } else if(nums[left] <= nums[mid]) {
                if( (nums[left]<=target) && (nums[mid] > target) ) right = mid-1;
                else left = mid + 1; 
            } else {
                if((nums[mid] < target) &&  (nums[right] >= target) ) left = mid+1;
                else right = mid-1;
            }
        }
        return false;
    }
}