//Solution 1 use HashMap and Arrays.binarySearch method
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
    public int[] findRightInterval(Interval[] intervals) {
        int[] starts = new int[intervals.length];

        Map<Integer, Integer> indices = new HashMap<>();
        for (int i=0;i<intervals.length;i++) {
            indices.put(intervals[i].start, i);
            starts[i] = intervals[i].start;
        }

        Arrays.sort(starts);

        int[] result = new int[intervals.length];
        for (int i=0;i<intervals.length;i++) {
            int index = Arrays.binarySearch(starts, intervals[i].end);
            if (index >= 0) {
                result[i] = indices.get(starts[index]);
            } else {
                index = -index - 1;//key point
                if (index < intervals.length)//key point
                    result[i] = indices.get(starts[index]);
                else
                    result[i] = -1;
            }
        }

        return  result;
    }
}