//Solution 1 use binary search to find targrt value
class Solution {
    public char nextGreatestLetter(char[] a, char x) {
        int n = a.length;
       
        if (x >= a[n - 1])   x = a[0];
        else    x++;//key point
        
        int lo = 0, hi = n - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] == x)    return a[mid];
            if (a[mid] < x)     lo = mid + 1;
            else    hi = mid;
        }
        return a[lo];
    }
}