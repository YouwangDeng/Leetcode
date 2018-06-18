//Solution 1 use HashMap and array value clear and efficient solution 
class Solution {
    public int findShortestSubArray(int[] nums) {
        if (nums.length == 0 || nums == null) return 0;
        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
           if (!map.containsKey(nums[i])){
               map.put(nums[i], new int[]{1, i, i});  // the first element in array is degree, second is first index of this key, third is last index of this key
           } else {
               int[] temp = map.get(nums[i]); //key point
               temp[0]++;
               temp[2] = i;
           }
        }
        int degree = Integer.MIN_VALUE, res = Integer.MAX_VALUE;
        for (int[] value : map.values()){
            if (value[0] > degree){
                degree = value[0];
                res = value[2] - value[1] + 1;
            } else if (value[0] == degree){ //key point
                res = Math.min( value[2] - value[1] + 1, res);
            } 
        }
        return res;
    }
}