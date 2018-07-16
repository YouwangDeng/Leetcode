//Solution 1
class Solution {
    public int preimageSizeFZF(int K) {
        return (int)(binarySearch(K) - binarySearch(K - 1));
    }

    private long binarySearch(int K) {

        //long data type defination "L"
        long l = 0, r =  5L * (K + 1);//key point "K+1" i.e. 25,26,27,28,29

        while (l <= r) {
            long m = l + (r - l) / 2;
            long k = numOfTrailingZeros(m);

            if (k <= K) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return r;
    }
    
    private long numOfTrailingZeros(long x) {
        long res = 0;

        for (; x > 0; x /= 5) {
            res += x/5;
        }

        return res;
    }
}