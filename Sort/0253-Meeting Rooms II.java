//Solution 1 use two Arrays.sort math solution
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
    //whenever there is a start meeting, we need to add one room. 
    //But before adding rooms, we check to see if any previous meeting ends, which is why we check start with the first end. 
    //When the start is bigger than end, it means at this time one of the previous meeting ends, and it can take and reuse that room. 
    //Then the next meeting need to compare with the second end because the first end's room is already taken. 
    //One thing is also good to know: meetings start is always smaller than end. Whenever we pass a end, one room is released.
    public int minMeetingRooms(Interval[] intervals) {
        if (intervals == null || intervals.length == 0) return 0;
        int n = intervals.length, index = 0;
        int[] begins = new int[n];
        int[] ends = new int[n];
        for (Interval i: intervals) {
            begins[index] = i.start;
            ends[index] = i.end;
            index++;
        }
        Arrays.sort(begins);
        Arrays.sort(ends);
        int rooms = 0, pre = 0;
        for (int i = 0; i < n; i++) {
            rooms++;
            if (begins[i] >= ends[pre]) {
                rooms--;
                pre++;
            }
        }
        return rooms;
    }
}