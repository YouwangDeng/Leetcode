//Solution 1 East to understand O(nLog(n))
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() <= 1)
            return intervals;

        // Sort by ascending starting point using an anonymous Comparator
        intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));

        List<Interval> result = new LinkedList<Interval>();
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;

        for (Interval interval : intervals) {
            if (interval.start <= end) // Overlapping intervals, move the end if needed
                end = Math.max(end, interval.end);
            else {                     // Disjoint intervals, add the previous one and reset bounds
                result.add(new Interval(start, end));
                start = interval.start;
                end = interval.end;
            }
        }

        // Add the last interval
        result.add(new Interval(start, end));
        return result;
    }
}

//Solution 2 smart about the sort process O(n)
public List<Interval> merge(List<Interval> intervals) {
    // sort start&end
    int n = intervals.size();
    int[] starts = new int[n];
    int[] ends = new int[n];
    for (int i = 0; i < n; i++) {
        starts[i] = intervals.get(i).start;
        ends[i] = intervals.get(i).end;
    }
    Arrays.sort(starts);
    Arrays.sort(ends);
    // loop through
    List<Interval> res = new ArrayList<Interval>();
    for (int i = 0, j = 0; i < n; i++) { // j is start of interval.
        if (i == n - 1 || starts[i + 1] > ends[i]) {
            res.add(new Interval(starts[j], ends[i]));
            j = i + 1;
        }
    }
    return res;
}