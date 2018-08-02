//Solution 1 BFS and Queue solution much faster
public class Solution {
    class Point {
        int x,y,l;
        public Point(int _x, int _y, int _l) {x=_x;y=_y;l=_l;}
    }
    public int shortestDistance(int[][] maze, int[] start, int[] destination) {
        int m=maze.length, n=maze[0].length;
        int[][] length=new int[m][n]; // record length
        for (int i=0;i<m*n;i++) length[i/n][i%n]=Integer.MAX_VALUE;
        int[][] dir=new int[][] {{-1,0},{0,1},{1,0},{0,-1}};
        Queue<Point> list=new LinkedList<>(); // using queue
        list.offer(new Point(start[0], start[1], 0));
        while (!list.isEmpty()) {
            Point p=list.poll();
            if (length[p.x][p.y]<=p.l) continue; // if we have already found a route shorter
            length[p.x][p.y]=p.l;
            for (int i=0;i<4;i++) {
                int xx=p.x, yy=p.y, l=p.l;
                while (xx>=0 && xx<m && yy>=0 && yy<n && maze[xx][yy]==0) {
                    xx+=dir[i][0];
                    yy+=dir[i][1];
                    l++;
                }
                xx-=dir[i][0];
                yy-=dir[i][1];
                l--;
                list.offer(new Point(xx, yy, l));
            }
        }
        return length[destination[0]][destination[1]]==Integer.MAX_VALUE?-1:length[destination[0]][destination[1]];
    }
}
//Solution 2 DFS solution slower for the length info lost
class Solution {
    static final int[] DIRS = {0, 1, 0, -1, 0};
    public int shortestDistance(int[][] maze, int[] start, int[] destination) {
        int[][] dist = new int[maze.length][maze[0].length];
        dist[start[0]][start[1]] = 1;
        dfs(start[0], start[1], destination, maze, dist);
        return dist[destination[0]][destination[1]] - 1;
    }
    void dfs(int row, int col, int[] dest, int[][] maze, int[][] dist) {
        if (row == dest[0] && col == dest[1]) return;
        int m = maze.length, n = maze[0].length;
        for (int d = 0; d < 4; ++d) {
            int i = row, j = col, p = DIRS[d], q = DIRS[d + 1], len = dist[row][col];
            while (i + p >= 0 && i + p < m && j + q >= 0 && j + q < n && maze[i + p][j + q] == 0) {
                i += p;
                j += q;
                len++;
            }
            if (dist[i][j] > 0 && len >= dist[i][j]) continue;
            dist[i][j] = len;
            dfs(i, j, dest, maze, dist);
        }
    }
}
