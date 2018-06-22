//Solution 1 clear solution use LinkedList
class Solution {
	public int[][] candyCrush(int[][] a) {
        List<int[]> crush = new LinkedList<>();
        int n = a.length, m = a[0].length;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (a[i][j] != 0) {
                    int v = a[i][j];
                    if (j + 2 < m && v == a[i][j + 1] && v == a[i][j + 2])
                        for (int k = j; k < m && a[i][k] == v; k++)
                            crush.add(new int[]{i, k});
                    if (i + 2 < n && v == a[i + 1][j] && v == a[i + 2][j])
                        for (int k = i; k < n && a[k][j] == v; k++)
                            crush.add(new int[]{k, j});
                }
        if (crush.isEmpty()) return a;
        //crash
        for (int[] c : crush)
            a[c[0]][c[1]] = 0;
        //drop
        for (int j = 0; j < m; j++) {
            int bot = n - 1, top = n - 1;
            while (top >= 0)
                if (a[top][j] == 0)
                    top--;
                else a[bot--][j] = a[top--][j];
            while (bot >= 0)
                a[bot--][j] = 0;
        }
        return candyCrush(a);
    }
}