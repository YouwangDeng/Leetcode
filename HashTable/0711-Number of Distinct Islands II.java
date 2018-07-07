//Solution 1 use HashSet and direction and transform arrays and key generation
class Solution {
    int[][] dirs={{-1,0}, {1,0}, {0,-1}, {0,1}};
    int[][] trans={{1,1}, {1,-1}, {-1,1}, {-1,-1}};
    
    public int numDistinctIslands2(int[][] grid) {
        if (grid==null || grid.length==0 || grid[0].length==0) return 0;
        int m=grid.length, n=grid[0].length;
        Set<String>islands=new HashSet<>();
        
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (grid[i][j]==1){
                    List<int[]> cells=new ArrayList<>();
                    dfs(grid, i, j, cells);
                    String key=norm(cells);
                    islands.add(key);
                }
            }
        }
        return islands.size();
    }
    
    private void dfs(int[][] grid, int i, int j, List<int[]> cells){
        cells.add(new int[]{i, j});
        grid[i][j]=-1;
        
        for (int[] dir:dirs){
            int x=i+dir[0];
            int y=j+dir[1];
            if (x>=0 && x<grid.length && y>=0 && y<grid[0].length && grid[x][y]==1)
                dfs(grid, x, y, cells);
        }
    }

    private String norm(List<int[]>cells){
        List<String> forms=new ArrayList<>();
        // generate the 8 different transformations
        // (x, y), (x, -y), (-x, y), (-x, -y)
        // (y, x), (-y, x), (y, -x), (-y, -x)
        for (int[] ts:trans){
            List<int[]> list1=new ArrayList<>();
            List<int[]> list2=new ArrayList<>();
            for (int[] cell:cells){
                list1.add(new int[]{cell[0]*ts[0], cell[1]*ts[1]});
                list2.add(new int[]{cell[1]*ts[1], cell[0]*ts[0]});
            }
            forms.add(getKey(list1));
            forms.add(getKey(list2));
        }
        
        // sort the keys: take the first one as the representative key
        Collections.sort(forms);
        return forms.get(0);
    }
    
    private String getKey(List<int[]>cells){
        // sort the cells before generate the key
        Collections.sort(cells, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0]!=b[0]){
                    return a[0]-b[0];
                }else{
                    return a[1]-b[1];
                }
            }
        });

        StringBuilder sb=new StringBuilder();
        int x=cells.get(0)[0], y=cells.get(0)[1];
        for (int[] cell:cells)
            sb.append((cell[0]-x)+":"+(cell[1]-y)+":");
        
        return sb.toString();
    }
}