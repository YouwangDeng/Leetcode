//Solution 1 Recursion Backtracking 
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        combination(ans, new ArrayList<Integer>(), k, 1, n);
        return ans; 
    }
    private static void combination(List<List<Integer>> ans, List<Integer> comb, int k,  int start, int n) {
        //restrict
        if (comb.size() > k) {
            return;
        }
        if (comb.size() == k && n == 0) {
            List<Integer> li = new ArrayList<Integer>(comb);
            ans.add(li);
            return;
        }
        for (int i = start; i<=9; i++) {
        		//restrict
               if (n-i >= 0) {
                   comb.add(i);
                   combination(ans, comb, k, i+1, n-i);
                   comb.remove(comb.size() - 1);
               }

        }
    }
}