//Solution 1 Another classic case of Binary Search
class Solution {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length ==0)
            return -1;
        int start=0, end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid] == target)
                return mid;
            boolean isLeftSorted = isSorted(nums, start,mid);
            boolean isRightSorted = isSorted(nums, mid,end);
            if(isLeftSorted && target>=nums[start] && target<nums[mid]){
                end = mid-1;
            } else if(isRightSorted && target>nums[mid] && target<=nums[end]){
                start = mid+1;
            } else {
                if(isLeftSorted) { // left part is sorted but target does not lie in sorted part (as above conditions are false) , hence search in rotated  right part
                    start =mid+1;
                } else { //right part is sorted but target does not lie in right sorted part (as above conditions are false) , hence search in rotated left part
                    end = mid-1;
                }
            }
        }
        return -1; 
    }    
    private boolean isSorted(int[] nums, int start, int end){
        if(nums[end]>nums[start] || start == end) //single element is sorted
            return true;
        return false;
    }
}