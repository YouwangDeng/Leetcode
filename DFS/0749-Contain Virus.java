//Solution 1 neat DFS solution
class Solution {
    public int containVirus(int[][] grid) {
        int[] cost = new int[]{0};
        while(check(grid, cost));
        return cost[0];
    } 
    
    private boolean check(int[][] grid, int[] cost) {
    // update every day information and return false if no improvement can be made
        int count = 1;
        int max = -1;
        boolean flag = false;
        List<int[]> info = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    count++;
                    int[][] walls = new int[grid.length][grid[0].length];
                    int[] res = new int[2];
                    grid[i][j] = count;
                    dfs(i, j, grid, count, walls, res);
                    //if there still have cells to be infected then improvable
                    if (res[0] != 0) flag = true;
                    //Each day, you can install walls around only one region select the most valuable region to block
                    if (max == -1 || res[0] > info.get(max)[0]) {
                        max = count - 2;
                    }
                    info.add(res);
                }
            }
        }
        if (count == 1) {
            return false;
        }
        cost[0] += info.get(max)[1];
        update(grid, max + 2);
        return flag;
    }
    
    
    private void dfs(int row, int col, int[][] grid, int count, int[][] walls, int[] res) {
    //dfs and record number of walls need to block this area and how many 0s are under infection
        int[] shiftX = new int[]{1, 0, -1, 0};
        int[] shiftY = new int[]{0, 1, 0, -1};
        
        for(int i = 0; i < 4; i++) {
            int newRow = row + shiftX[i];
            int newCol = col + shiftY[i];
            if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length) {
                if (grid[newRow][newCol] == 1) {
                    grid[newRow][newCol] = count;
                    dfs(newRow, newCol, grid, count, walls, res);
                } else if (grid[newRow][newCol] == 0) {
                    //key point use bit manipulation to mark direction wall
                    if (walls[newRow][newCol] == 0) res[0]++;//number of cells infected
                    if ((walls[newRow][newCol] & 1 << i) == 0) {
                        res[1]++;
                        walls[newRow][newCol] |= 1 << i;
                    }
                }
            }
        }
    }
        
        
    private void update(int[][] grid, int quarantine) {
    //set the new infected area and set blocked area to be -1
        int[] shiftX = new int[]{1, 0, -1, 0};
        int[] shiftY = new int[]{0, 1, 0, -1};
            
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] > 1 && grid[i][j] != quarantine) {
                    for (int k = 0; k < 4; k++) {
                        int newRow = i + shiftX[k];
                        int newCol = j + shiftY[k];
                        if (newRow >= 0 && newRow < grid.length && newCol >= 0 
                            && newCol < grid[0].length && grid[newRow][newCol] == 0) {
                            grid[newRow][newCol] = 1;
                        }
                    }
                    grid[i][j] = 1;
                } else if (grid[i][j] == quarantine) {
                    grid[i][j] = -1;
                }
            }
        }
    }     
}