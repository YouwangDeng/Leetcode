//Solution 1 turn a 2-D matrix to an array 
//n * m matrix convert to an array => matrix[x][y] => a[x * m + y]
//an array convert to n * m matrix => a[x] =>matrix[x / m][x % m]
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        //bound check []
        if (n == 0) return false;
        int m = matrix[0].length;
        //bound check [[]]
        if (m == 0) return false;
        int l = 0, r = m * n - 1;
        while (l != r){
        	//avoid too big
            int mid = l + (r - l - 1) / 2;
            if (matrix[mid / m][mid % m] < target)
                l = mid + 1;
            else 
                r = mid;
        }
        return matrix[r / m][r % m] == target;
    }
}

//Soluton 2 specific solution
class Solution {
      public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) return false;
        int i = 0, j = matrix[0].length - 1;
        while (i < matrix.length && j >= 0) {
                if (matrix[i][j] == target) {
                    return true;
                } else if (matrix[i][j] > target) {
                    j--;
                } else {
                    i++;
                }
            }
        return false;
    }
}