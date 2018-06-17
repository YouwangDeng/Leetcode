//Solution 1 direction vector O(m*n)
class Solution {
    public int[][] imageSmoother(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return new int[0][0];
        int m = matrix.length, n = matrix[0].length;
        int[][] res = new int[m][n];
        int[][] moves = new int[][] {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, -1}, {1, 1}, {1, -1}, {-1, 1}};
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = matrix[i][j];
                int count = 1;
                for (int[] move : moves) {
                    int I = i + move[0];
                    int J = j + move[1];
                    if (I >= 0 && I < m && J >= 0 && J < n) {
                        count++;
                        sum += matrix[I][J];
                    }
                }
                res[i][j] = sum / count;
            }
        }
        return res;
    }
}