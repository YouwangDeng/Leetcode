//Solution 1 clear DFS solution
class Solution {
    
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor) return image;
        fill(image, sr, sc, image[sr][sc], newColor);
        return image;
    }
    
    private void fill(int[][] image, int sr, int sc, int oricolor, int newColor) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != oricolor) return;
        image[sr][sc] = newColor;
        fill(image, sr + 1, sc, oricolor, newColor);
        fill(image, sr - 1, sc, oricolor, newColor);
        fill(image, sr, sc + 1, oricolor, newColor);
        fill(image, sr, sc - 1, oricolor, newColor);
    }
}