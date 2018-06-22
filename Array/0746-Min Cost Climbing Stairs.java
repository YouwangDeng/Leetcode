//Solution 1 DP solution 
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int a = cost[0];//step one
        int b = cost[1];//step two
        int result = Math.min(a, b);
        for (int i = 2; i <= cost.length; i++) {
            int c = i == cost.length? 0: cost[i];
            result = Math.min(a + c, b + c);
            a = b;
            b = result;
        }
        return result;
    }
}