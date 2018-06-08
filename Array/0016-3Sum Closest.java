//Solution 1 actually a 3Sum Problem but with a diff property
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest=nums[0]+nums[1]+nums[2];
        int low,high;
        for(int i=0;i<nums.length-1;i++){
            low=i+1;
            high=nums.length-1;
            while(low<high){
                if(nums[low]+nums[high]==target-nums[i]) return target;
                else if(nums[low]+nums[high]>target-nums[i]){
                    while(low<high&&nums[low]+nums[high]>target-nums[i]) high--;
                    if(Math.abs(nums[i]+nums[low]+nums[high+1]-target)<Math.abs(closest-target))
                        closest=nums[i]+nums[low]+nums[high+1];
                }
                else{
                    while(low<high&&nums[low]+nums[high]<target-nums[i]) low++;
                    if(Math.abs(nums[i]+nums[low-1]+nums[high]-target)<Math.abs(closest-target))
                        closest=nums[i]+nums[low-1]+nums[high];
                }
            }
        }
        return closest;
    }
}