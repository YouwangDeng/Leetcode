//Solution 1 top down bit by bit manipulation solution
public class Solution {
    public int findMaximumXOR(int[] nums) {
        int max = 0, mask = 0;
        for(int i = 31; i >= 0; i--){
            mask = mask | (1 << i);
            Set<Integer> set = new HashSet<>();
            for(int num : nums){
                set.add(num & mask);
            }
            int tmp = max | (1 << i);
            for(int prefix : set){
                if(set.contains(tmp ^ prefix)) {//tricky here if there exsits one element such as prefix_1 for "tmp ^ prefix = prefix_1" then "prefix ^ prefix_1 = tmp"
                    max = tmp;
                    break;
                }
            }
        }
        return max;
    }
}