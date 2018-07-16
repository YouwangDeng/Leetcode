//Solution 1 standard PriorityQueue solution
class Solution {
    public int swimInWater(int[][] grid) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> (grid[a[0]][a[1]] - grid[b[0]][b[1]]));
        pq.add(new int[]{0, 0});
        int level = 0;
        int n = grid.length;
        int[][] nexts = {{0 ,1}, {0, -1},{1, 0}, {-1, 0}};
        boolean[][] isVisited = new boolean[n ][n];
        while (!pq.isEmpty()){
            int[] top = pq.poll();
            level = Math.max(level, grid[top[0]][top[1]]);//key point
            if (top[0] == n - 1 && top[1] == n - 1){
                break;
            }
            
            for (int[] next : nexts){
                int x = top[0] + next[0];
                int y = top[1] + next[1];
                if (!(x < 0|| x > n - 1 || y < 0 || y > n - 1)  && !isVisited[x][y]){
                    isVisited[top[0]][top[1]] = true;
                    pq.add(new int[]{x, y});
                }
            }
        }
        
        return level;
    }
}