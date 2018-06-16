//Solution 1 clear solution three indexes
class Solution {
    public int thirdMax(int[] nums) {
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        for (Integer n : nums) {
            if (n.equals(max1) || n.equals(max2) || n.equals(max3)) continue;
            if (max1 == null || n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (max2 == null || n > max2) {
                max3 = max2;
                max2 = n;
            } else if (max3 == null || n > max3) {
                max3 = n;
            }
        }
        return max3 == null ? max1 : max3;
    }
}
//Solution 2 TreeSet Sorted Tree
class Solution {
    public final int N = 3;
    public int thirdMax(int[] nums) {
        if (nums.length == 0) return 0;

        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) continue;
            if (set.size() < N || nums[i] > set.first()) {
                if (set.size() == N) set.remove(set.first());
                set.add(nums[i]);
            }
        }
        return set.size() == N ? set.first() : set.last();
    }
}