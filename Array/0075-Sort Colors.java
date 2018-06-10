//Solution 1 Two Pass
class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int num0 = 0, num1 = 0, num2 = 0;
        for(int i = 0; i < n; i++) {
            if (nums[i] == 0) ++num0;
            else if (nums[i] == 1) ++num1;
            else if (nums[i] == 2) ++num2;
        }
        for(int i = 0; i < num0; i++) nums[i] = 0;
        for(int i = 0; i < num1; i++) nums[num0+i] = 1;
        for(int i = 0; i < num2; i++) nums[num0+num1+i] = 2; 
    }
}
//Solution 2 One pass
class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int n0 = 0, n1 = 0, n2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) 
            {
                nums[n2++] = 2; nums[n1++] = 1; nums[n0++] = 0;
            }
            else if (nums[i] == 1) 
            {
                nums[n2++] = 2; nums[n1++] = 1;
            }
            else if (nums[i] == 2) 
            {
                nums[n2++] = 2;
            }
        }
    }
}
//Solution 3 One pass
class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int j = 0, k = n-1;
        for (int i=0; i <= k; i++) {
            if (nums[i] == 0) {
                swap(nums,i,j++);
            } else if (nums[i] == 2) {
                swap(nums,i--,k--);
            }    
        }
    }
    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
        //如下位运算swap不对单元素成立
        // nums[a] ^= nums[b];
        // nums[b] ^= nums[a];
        // nums[a] ^= nums[b];
    }
}