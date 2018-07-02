//Solution 1 calculate the square of length and use HashMap to store
class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[] dis = new int[]{distance(p1, p2), distance(p1, p3), distance(p1, p4), distance(p2, p3)
                                , distance(p2, p4), distance(p3, p4)};
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i : dis) {
            max = Math.max(max, i);
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        return map.get(max) == 2 && map.size() == 2;
    }
    
    public int distance(int[] p1, int[] p2) {
        return (p2[0] - p1[0]) * (p2[0] - p1[0]) + (p2[1] - p1[1]) * (p2[1] - p1[1]);
    }
}