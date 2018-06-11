//Solution 1 based on Largest Rectangle in Histogram
public class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return 0;

        int[] height = new int[matrix[0].length];
        for(int i = 0; i < matrix[0].length; i ++){
            if(matrix[0][i] == '1') height[i] = 1;
        }
        int result = largestInLine(height);
        for(int i = 1; i < matrix.length; i ++){
            resetHeight(matrix, height, i);
            result = Math.max(result, largestInLine(height));
        }

        return result;
    }

    private void resetHeight(char[][] matrix, int[] height, int idx){
        for(int i = 0; i < matrix[0].length; i ++){
            if(matrix[idx][i] == '1') height[i] += 1;
            else height[i] = 0;
        }
    }    

    public int largestInLine(int[] height) {
        if(height == null || height.length == 0) return 0;
        int len = height.length;
        Stack<Integer> s = new Stack<Integer>();
        int maxArea = 0;
        for(int i = 0; i <= len; i++){
            int h = (i == len ? 0 : height[i]);
            if(s.isEmpty() || h >= height[s.peek()]){
                s.push(i);
            }else{
                int tp = s.pop();
                maxArea = Math.max(maxArea, height[tp] * (s.isEmpty() ? i : i - 1 - s.peek()));
                i--;
            }
        }
        return maxArea;
    }
}
//Solution 2 DP solution faster
public class Solution {
    public int maximalRectangle(char[][] matrix) {
        int area = 0, new_area, r, l;
        if(matrix.length > 0){
            int[] line = new int[matrix[0].length];
            boolean[] is_processed = new boolean[matrix[0].length];
            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix[i].length; j++){
                    if (matrix[i][j] == '1') {
                        line[j]++;
                        is_processed[j] = false;
                    } else {
                        line[j] = 0;
                        is_processed[j] = true;
                    }
                }
                for(int j = 0; j < matrix[i].length; j++){
                    if(is_processed[j]) continue;
                    r = l = 1;
                    while((j + r < line.length)&&(line[j + r] >= line[j])){
                        if(line[j + r] == line[j]) is_processed[j + r] = true;
                        r++;
                    }
                    while((j - l >= 0)&&(line[j - l] >= line[j])) l++;
                    new_area = (r + l - 1)*line[j];
                    if (new_area > area) area = new_area;
                }
            }
        } return area;
    }
}