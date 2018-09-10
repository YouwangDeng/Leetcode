//Solution 1 use binary indexed tree solution https://www.topcoder.com/community/data-science/data-science-tutorials/binary-indexed-trees/
public class NumMatrix {

    int[][] tree;
    int[][] nums;
    int m;
    int n;
    
    public NumMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return;
        m = matrix.length;
        n = matrix[0].length;
        tree = new int[m+1][n+1];
        nums = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                update(i, j, matrix[i][j]);
            }
        }
    }

    public void update(int row, int col, int val) {
        if (m == 0 || n == 0) return;
        int delta = val - nums[row][col];
        nums[row][col] = val;
        for (int i = row + 1; i <= m; i += i & (-i)) {
            for (int j = col + 1; j <= n; j += j & (-j)) {
                tree[i][j] += delta;
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        if (m == 0 || n == 0) return 0;
        return sum(row2+1, col2+1) + sum(row1, col1) - sum(row1, col2+1) - sum(row2+1, col1);
    }
    
    public int sum(int row, int col) {
        int sum = 0;
        for (int i = row; i > 0; i -= i & (-i)) {
            for (int j = col; j > 0; j -= j & (-j)) {
                sum += tree[i][j];
            }
        }
        return sum;
    }
}
// time should be O(log(m) * log(n))

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * obj.update(row,col,val);
 * int param_2 = obj.sumRegion(row1,col1,row2,col2);
 */

//SOlution 2 use colsum concise and easy to understand
public class NumMatrix {
    private int[][] colSums;
    private int[][] matrix;

    public NumMatrix(int[][] matrix) {
        if(   matrix           == null
           || matrix.length    == 0
           || matrix[0].length == 0   ){
            return;   
         }

         this.matrix = matrix;

         int m   = matrix.length;
         int n   = matrix[0].length;
         colSums = new int[m + 1][n];
         for(int i = 1; i <= m; i++){
             for(int j = 0; j < n; j++){
                 colSums[i][j] = colSums[i - 1][j] + matrix[i - 1][j];
             }
         }
    }
    //time complexity for the worst case scenario: O(m)
    public void update(int row, int col, int val) {
        for(int i = row + 1; i < colSums.length; i++){
            colSums[i][col] = colSums[i][col] - matrix[row][col] + val;
        }

        matrix[row][col] = val;
    }
    //time complexity for the worst case scenario: O(n)
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int ret = 0;

        for(int j = col1; j <= col2; j++){
            ret += colSums[row2 + 1][j] - colSums[row1][j];
        }

        return ret;
    }   
}
// time should be O(log(m) * log(n))

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * obj.update(row,col,val);
 * int param_2 = obj.sumRegion(row1,col1,row2,col2);
 */