//Solution 1 clear solution example: 2,0,3,1
class Solution {
    public boolean isIdealPermutation(int[] A) {
        int cmax = 0;
        for (int i = 0; i < A.length - 2; i++) {
            cmax = Math.max(cmax, A[i]);
            if (cmax > A[i + 2]) return false;
        }
        return true;
    }
}