//Solution 1 StringBuilder Solution O(n)
class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {

        long[] newNums = new long[nums.length + 2];
        int ni = 0;
        newNums[ni++] = (long)lower - 1;//key point
        for (int num : nums) {
            newNums[ni++] = num;
        }
        newNums[ni] = (long)upper + 1;//key point

        List<String> ranges = new ArrayList<>();
        StringBuilder range = new StringBuilder();
        long low = 0, up = 0;
        for (int i = 0; i < newNums.length - 1; i++) {
            low = newNums[i] + 1;//key point
            up = newNums[i + 1] - 1;//key point
            if (low == up) {
                ranges.add(String.valueOf(low));
            } else if (low < up) {
                range.append(low).append("->").append(up);
                ranges.add(range.toString());
                range.delete(0, range.length());
            }
        }
        return ranges;
    }
}