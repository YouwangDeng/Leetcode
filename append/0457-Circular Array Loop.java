//Solution 1 two pointers solution
class Solution {
    public boolean circularArrayLoop(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            Integer slow = i;
            Integer fast = next(nums, slow);
            while (fast != null && next(nums, fast) != null) {
                slow = next(nums, slow);
                fast = next(nums, next(nums, fast));
                //key point
                if (slow == fast) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    private Integer next(int[] nums, Integer pos) {
        if (pos == null) {
            return null;
        }
        //key point
        int nextPos = pos + nums[pos];
        nextPos %= nums.length;
        if (nextPos < 0) {
            nextPos += nums.length;
        }
        
        // self-loop key point
        if (nextPos == pos) {
            return null;
        }
        // different direction key point
        if ((nums[nextPos] ^ nums[pos]) < 0) {
            return null;
        }
        
        return nextPos;
    }
}