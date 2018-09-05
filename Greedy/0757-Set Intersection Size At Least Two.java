//Solution 1 define sort and traverse right most
class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        int res = 0;
        if (intervals == null || intervals.length == 0) {
            return res;
        }
        Arrays.sort(intervals, (a, b)-> a[1] != b[1] ? a[1] - b[1] : b[0] - a[0]);
        // known two rightmost point in the set/res
        int left = intervals[0][1] - 1;
        int right = intervals[0][1];
        res += 2;
        for (int i = 1; i < intervals.length; i++) {
            int[] curr = intervals[i];
            // 1. one element of the set is in the interval
            // 2. no elemnet of the set is in the interval
            if (left < curr[0] && curr[0] <= right) {
                res++;
                left = right;
                right = curr[1];
            } else if (curr[0] > right) {
                res += 2;
                left = curr[1] - 1;
                right = curr[1];
            }
        }
        return res;
    }
}