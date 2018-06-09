//Solution 1 classic solution step by step
class Solution {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> result = new LinkedList<>();
        int i = 0;
        // add all the intervals ending before newInterval starts
        while (i < intervals.size() && intervals.get(i).end < newInterval.start)
            result.add(intervals.get(i++));
        // merge all overlapping intervals to one considering newInterval
        while (i < intervals.size() && intervals.get(i).start <= newInterval.end) {
            newInterval.start = Math.min(newInterval.start, intervals.get(i).start);  // we could mutate newInterval here also
            newInterval.end = Math.max(newInterval.end, intervals.get(i).end);               
            i++;
        }
        result.add(newInterval); // add the union of intervals we got
        // add all the rest
        while (i < intervals.size()) result.add(intervals.get(i++)); 
        return result;
    }
}
//Solution 2 use for unless while loop 
public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
    List<Interval> result = new ArrayList<Interval>();
    for (Interval i : intervals) {
        if (newInterval == null || i.end < newInterval.start)
            result.add(i);
        else if (i.start > newInterval.end) {
            result.add(newInterval);
            result.add(i);
            newInterval = null;
        } else {
            newInterval.start = Math.min(newInterval.start, i.start);
            newInterval.end = Math.max(newInterval.end, i.end);
        }
    }
    if (newInterval != null)
        result.add(newInterval);
    return result;
} 