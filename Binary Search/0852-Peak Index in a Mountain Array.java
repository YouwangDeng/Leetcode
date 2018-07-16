//Solution 1 use binary search O(log(n))
class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int l = 0, r = A.length - 1, mid;
        while (l < r) {
            mid = (l + r) / 2;
            if (A[mid] < A[mid + 1]) l = mid;
            else if (A[mid - 1] > A[mid]) r = mid;
            else return mid;
        }
        return 0;
    }
}
//Solution 2 use iteration O(n)
class Solution {
    public int peakIndexInMountainArray(int[] A) {
        for (int i = 1; i < A.length - 1; i++) if (A[i] > A[i + 1]) return i;
        return 0;
    }
}