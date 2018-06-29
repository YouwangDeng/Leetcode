//Solution 1 binary search
class Solution {
    public int mySqrt(int x) {
	    if (x == 0)
	        return 0;
	    int left = 1, right = x;
	    while (true) {
	        int mid = left + (right - left)/2;//key point avoid overflow
	        if (mid > x/mid) {//key point avoid overflow
	            right = mid - 1;
	        } else {
	            if (mid + 1 > x/(mid + 1))//key point avoid overflow
	                return mid;//solution found
	            left = mid + 1;
	        }
	    }
	}
}
//Solution 2 use Integer Newton
class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        long i = x;
        while(i > x / i)  
            i = (i + x / i) / 2;	    	
        return (int)i;
    }
}