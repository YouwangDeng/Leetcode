//Solution 1 clear solution
class Solution {
    public int[] pourWater(int[] heights, int V, int K) {
        for(int i = 0;i < V; i++) {
            int minIndex = getFirstHoleLeft(heights, K);
            if(minIndex != K) {
                heights[minIndex]++;
            }else {
                heights[getFirstHoleRight(heights, K)]++;
            }
        }
        return heights;
    }
    private int getFirstHoleLeft(int[] heights, int K) {
        int min = heights[K], minIndex = K;
        for(int j = K - 1; j >= 0; j--) {
            if(heights[j] < min) {
                minIndex = j;
                min = heights[j];
            } else if(heights[j] == min) continue;
            else break;
        }
        return minIndex;
    }
    private int getFirstHoleRight(int[] heights, int K) {
        int min = heights[K], minIndex = K;
        for(int j = K + 1; j < heights.length; j++) {
            if(heights[j] < min) {
                minIndex = j;
                min = heights[j];
            } else if(heights[j] == min) continue;
            else break;
        }
        return minIndex;
    }
}