//Solution 1 PreSum and HashMap
class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0, result = 0;
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);//key point it is 1 result if i begin from 0
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (preSum.containsKey(sum - k)) {
                result += preSum.get(sum - k);//key point
            }
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);//update
        }
        
        return result;
    }
}