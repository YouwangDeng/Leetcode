//Solution 1 Arrays.asList O(n)
class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        int i = 0, j = 0, N = S.length();
        List<List<Integer>> res = new ArrayList<>();
        while (j < N) {
            while (j < N && S.charAt(j) == S.charAt(i)) j++;
            if (j - i >= 3) res.add(Arrays.asList(i, j - 1));
            i = j;
        }
        return res;
    }
}