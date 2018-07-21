//Solution 1 pre and cur DP solution 
class Solution {
    public int deleteAndEarn(int[] nums) {
        Map<Integer, Integer> values = new TreeMap<>();
        for (int num : nums) {
            values.put(num, values.getOrDefault(num, 0) + num);
        }
        int pre = 0, cur = 0;
        for (int num : values.keySet()) {
            if (!values.containsKey(num - 1)) {
                pre = cur;
                cur += values.get(num);
            } else {
                int temp = Math.max(pre + values.get(num), cur);
                pre = cur;
                cur = temp;
            }
        }
        return cur;
    }
}