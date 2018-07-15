//Solution 1 2D matrix triangle tranverse trick and use TreeSet ceiling solution
class Solution {
    /* first  consider the situation matrix is 1D
        we can save every sum of 0~i(0<=i<len) and binary search previous sum to find 
        possible result for every index, time complexity is O(NlogN).
        so in 2D matrix, we can sum up all values from row i to row j and create a 1D array 
        to use 1D array solution.
        If col number is less than row number, we can sum up all values from col i to col j 
        then use 1D array solution.
    */
    public int maxSumSubmatrix(int[][] matrix, int target) {
        int row = matrix.length;
        if(row==0)return 0;
        int col = matrix[0].length;
        int m = Math.min(row,col);
        int n = Math.max(row,col);
        //indicating sum up in every row or every column
        boolean colIsBig = col>row;
        int res = Integer.MIN_VALUE;
        for(int i = 0;i<m;i++){
            int[] array = new int[n];
            // sum from row j to row i
            for(int j = i;j>=0;j--){
                int val = 0;
                TreeSet<Integer> set = new TreeSet<Integer>();
                set.add(0);
                //traverse every column/row and sum up
                for(int k = 0;k<n;k++){
                    array[k]=array[k]+(colIsBig?matrix[j][k]:matrix[k][j]);
                    val = val + array[k];
                    //use  TreeMap to binary search previous sum to get possible result 
                    Integer subres = set.ceiling(val-target);
                    if(null!=subres){
                        res=Math.max(res,val-subres);
                    }
                    set.add(val);
                }
            }
        }
        return res;
    }
}