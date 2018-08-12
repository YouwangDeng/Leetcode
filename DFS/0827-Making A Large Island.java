//Solution 1 use HashMap, HashSet and DFS coloring solution 
class Solution {
    
    public int largestIsland(int[][] grid) {
        Map<Integer, Integer> map = new HashMap<>(); //Key: color, Val: size of island painted of that color
        map.put(0, 0); //We won't paint island 0, hence make its size 0, we will use this value later   
        int n = grid.length; 
        int colorIndex = 2; //0 and 1 is already used in grid, hence we start colorIndex from 2 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int size = paint(grid, i, j, colorIndex);
                    map.put(colorIndex, size);
                    colorIndex++;
                }
            }
        }
    
        //If there is no island 0 from grid, res should be the size of islands of first color
        //If there is no island 1 from grid, res should be 0 
        int res = map.getOrDefault(2, 0); 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    //We use a set to avoid repeatly adding islands with the same color
                    Set<Integer> set = new HashSet<>();
                    //If current island is at the boundary, we add 0 to the set, whose value is 0 in the map
                    set.add(i > 0 ? grid[i - 1][j] : 0);
                    set.add(i < n - 1 ? grid[i + 1][j] : 0);
                    set.add(j > 0 ? grid[i][j - 1] : 0);
                    set.add(j < n - 1 ? grid[i][j + 1] : 0);
                    
                    int newSize = 1; //We need to count current island as well, hence we init newSize with 1
                    for (int color : set) newSize += map.get(color);
                    res = Math.max(res, newSize);
                }
            }
        }
        return res;
    }
    
    //Helper method to paint current island and all its connected neighbors
    //Return the size of all painted islands at the end
    private int paint(int[][] grid, int i, int j, int color) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != 1) return 0;
        grid[i][j] = color;
        return 1 + paint(grid, i + 1, j, color) + paint(grid, i - 1, j, color) 
            + paint(grid, i, j + 1, color) + paint(grid, i, j - 1, color);
    }
}