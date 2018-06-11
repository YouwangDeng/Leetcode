//Solution 1 DP solution bottom to top 
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int [] sum = new int [triangle.size() + 1];
        for (int idx = triangle.get(triangle.size() - 1).size() - 1; idx >= 0; idx --)
           for (int col = 0; col < triangle.get (idx).size(); col ++)
               sum [col] = triangle.get (idx).get (col) + Math.min (sum [col], sum [col + 1]);
        return sum [0];
    }
}