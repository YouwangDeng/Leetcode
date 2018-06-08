//Solution 1 Just Merge O(m+n)
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int p = m + n;
        int index_1 = 0, index_2 = 0, index_3 = 0;
        int[] nums3 = new int[p];
        if (m == 0) {
            nums3 = nums2;
        }
        if (n == 0) {
            nums3 = nums1;
        }
        while(index_1 < m && index_2 < n) {
            if (nums1[index_1] <= nums2[index_2]) {
                nums3[index_3++] = nums1[index_1++];
            } else {
                nums3[index_3++] = nums2[index_2++];
            }
        }
        for (int i = index_1; i < m; i++) {
            nums3[index_3++] = nums1[i];
        }
        for (int i = index_2; i < n; i++) {
            nums3[index_3++] = nums2[i];
        }
        if (p % 2 == 0) {
            return (nums3[p / 2 - 1] + nums3[p / 2]) / 2.0;
        } else {
            return nums3[(p - 1) / 2];
        }
    }
}

//Solution 2 Binary Search O(log(m+n))
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int l = (m + n + 1) / 2; //left half of the combined median
        int r = (m + n + 2) / 2; //right half of the combined median
        
        // If the nums1.length + nums2.length is odd, the 2 function will return the same number
        // Else if nums1.length + nums2.length is even, the 2 function will return the left number and right number that make up a median
        return (getKth(nums1, 0, nums2, 0, l) + getKth(nums1, 0, nums2, 0, r)) / 2.0;
    }
    
    private double getKth(int[] nums1, int start1, int[] nums2, int start2, int k) {
        // This function finds the Kth element in nums1 + nums2
        
        // If nums1 is exhausted, return kth number in nums2
        if (start1 > nums1.length - 1) return nums2[start2 + k - 1];
        
        // If nums2 is exhausted, return kth number in nums1
        if (start2 > nums2.length - 1) return nums1[start1 + k - 1];
        
        // If k == 1, return the first number
        // Since nums1 and nums2 is sorted, the smaller one among the start point of nums1 and nums2 is the first one
        if (k == 1) return Math.min(nums1[start1], nums2[start2]);
        
        int mid1 = Integer.MAX_VALUE;
        int mid2 = Integer.MAX_VALUE;
        if (start1 + k / 2 - 1 < nums1.length) mid1 = nums1[start1 + k / 2 - 1];
        if (start2 + k / 2 - 1 < nums2.length) mid2 = nums2[start2 + k / 2 - 1];
        
        // Throw away half of the array from nums1 or nums2. And cut k in half
        if (mid1 < mid2) {
            return getKth(nums1, start1 + k / 2, nums2, start2, k - k / 2); //nums1.right + nums2
        } else {
            return getKth(nums1, start1, nums2, start2 + k / 2, k - k / 2); //nums1 + nums2.right
        }
    }
}