//Solution 1 return n minus max non-overlapping intervals
/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public int eraseOverlapIntervals(Interval[] intervals) {
    	//define conparator
        Arrays.sort(intervals, Comparator.comparingInt(i -> i.end));
        int max = 0, lastend = Integer.MIN_VALUE;
        for (Interval in : intervals) {
            if (lastend <= in.start) {
                lastend = in.end;
                max++;
            }
        }
        return intervals.length - max;
    }
}