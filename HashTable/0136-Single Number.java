//Solution 1 use XOR manipulation
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i< nums.length; i++) result ^=nums[i];
        return result; 
    }
}
//Solution 2 use HashMap
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) map.put(nums[i],map.getOrDefault(nums[i],0) + 1);   
        for ( Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (map.get(entry.getKey()) == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}