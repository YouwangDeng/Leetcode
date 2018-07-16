//Solution 1 2D sorted matrix binary search solution
class Solution {
    public int findKthNumber(int m, int n, int k) {
        int lo=1, hi=m*n;
        while(lo<hi){
            int mid= (lo+hi)/2, cnt=0;
            for (int i=1, j=n; i<=m; i++){
                while(j>=1 && i*j>mid) j--;//key point
                cnt+=j;
            }
            if (cnt>=k) hi=mid;
            else lo=mid+1;
        }
        return lo;//key point
    }
}