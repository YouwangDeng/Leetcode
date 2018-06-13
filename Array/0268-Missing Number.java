//Solution 1 use sum to find missing numbers O(n) very fast
class Solution {
    public int missingNumber(int[] nums) {
    int len = nums.length;
    int sum = (0+len)*(len+1)/2;
    for(int i=0; i<len; i++)
        sum-=nums[i];
    return sum;
    }
}
//Solution 2 Bit Manipulation a^b^b = a  O(n)
class Solution {
    public int missingNumber(int[] nums) {
        int res = nums.length;
        for(int i=0; i<nums.length; i++){
            res = res ^ i ^ nums[i]; // a^b^b = a
        }
        return res;
    }
}