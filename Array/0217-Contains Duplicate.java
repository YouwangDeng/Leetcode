//Solution 1 HashSet O(n)
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i : nums) if(!set.add(i)) return true; 
        return false;
    }
}