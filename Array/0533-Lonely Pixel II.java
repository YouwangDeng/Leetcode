//Solution 1 HashMap O(m*n)
class Solution {
    public int findBlackPixel(char[][] picture, int N) {
        if (picture == null || picture.length == 0 || picture[0].length == 0) return 0;
        int m = picture.length, n = picture[0].length;
        int[] cols = new int[n];
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < m; i++) {
            int count = 0;
            //StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (picture[i][j] == 'B') {
                    cols[j]++;
                    count++;
                }
                //sb.append(picture[i][j]);
            }
            if (count == N) {
                String curRow = new String(picture[i]);
                map.put(curRow, map.getOrDefault(curRow, 0) + 1);
            }
        }
        
        int res = 0;
        for (String row : map.keySet()) {
            if (map.get(row) != N) continue;
            for (int i = 0; i < n; i++) {
                if (row.charAt(i) == 'B' && cols[i] == N) {
                    res += N;
                }
            }
        }
        return res;
    }
}