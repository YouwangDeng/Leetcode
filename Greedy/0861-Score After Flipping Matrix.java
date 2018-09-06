//Solution 1 greedy == simple rule first flip row and then flop col solution
class Solution {
    public int matrixScore(int[][] A) {
        //first flip/not fiip every row to make the first element to be "1"
        int M = A.length, N = A[0].length, res = (1 << (N - 1)) * M;
        //then flip/not flip every colomns from the second col to the end col
        for (int j = 1; j < N; j++) {
            int cur = 0;
            for (int i = 0; i < M; i++) cur += A[i][j] == A[i][0] ? 1:0;
            res += Math.max(cur, M - cur) * (1 << (N - j - 1));
        }
        return res;
    }
}