//Solution 1 cur and sum is the key point
class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int curr = 0, sum = 0;
        for (int i=2; i<A.length; i++)
            if (A[i]-A[i-1] == A[i-1]-A[i-2]) {
                curr += 1;
                sum += curr;//key point
            } else {
                curr = 0;
            }
        return sum;
    }
}