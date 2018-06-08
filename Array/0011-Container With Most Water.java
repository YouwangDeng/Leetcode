//Solution 1 Two pointers O(n)
public class Solution {
    public int maxArea(int[] height) {
    int L = height.length, lo = 0, hi = L-1;
    int max = 0;
    while(lo<hi) {	  
        int loMax = height[lo], hiMax = height[hi];      

    	int candidate = (hi-lo) * (loMax<hiMax ? loMax : hiMax);
    	max = candidate > max ? candidate : max;

    	if(height[lo]<=height[hi]) 
    	    while(lo<hi && height[lo]<=loMax) lo++; 
    	else 
    	    while(lo<hi && height[hi]<=hiMax) hi--;
    }
    return max;
    }
}