//Solution 1 sort and sum the odd values O(nlog(n))
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i += 2) {
            result += nums[i];
        }
        return result;
    }
}

//Solution 2 bucket idea O(n) more SP but much faster
class Solution {
	public int arrayPairSum(int[] nums) {
		int[] exist = new int[20001];
		for (int i = 0; i < nums.length; i++) {
			exist[nums[i] + 10000]++;//key point
		}
		int sum = 0;
		boolean odd = true;//key point
		for (int i = 0; i < exist.length; i++) {
			while (exist[i] > 0) {
				if (odd) {
					sum += i - 10000;
				}
				odd = !odd;
				exist[i]--;//key point
			}
		}
		return sum;
	}
}