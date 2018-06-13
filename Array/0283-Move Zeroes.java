//Solution 1 swap mark 0 position
class Solution {
    public void moveZeroes(int[] nums) {
        int p0 = 0, num0 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if(num0 == 0) p0 = i;
                num0++;
            } else if(num0 > 0) {
                int temp = nums[i];
                nums[i] = nums[p0];
                nums[p0] = temp;
                p0++;
            }
        }
    }
}
//Solution 2 Insert easier to undersatand
class Solution {
    // Shift non-zero values as far forward as possible
    // Fill remaining space with zeros
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;        
        int insertPos = 0;
        for (int num: nums) {
            if (num != 0) nums[insertPos++] = num;
        }        
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
}