//Solution 1 Same as the max subarray problem, using the Kadane's Algorithm
class Solution {
    public int maxProfit(int[] prices) {
        int maxCur = 0, maxSoFar = 0;
        for(int i = 1; i < prices.length; i++) {
            maxCur = Math.max(0, maxCur += prices[i] - prices[i-1]);
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;
    }
}
//Solution 2 O(n) faster
class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0 ;
        }		
        int max = 0 ;
        int sofarMin = prices[0] ;
        for (int i = 0 ; i < prices.length ; ++i) {
            if (prices[i] > sofarMin) {
                max = Math.max(max, prices[i] - sofarMin) ;
             } else{
                sofarMin = prices[i];  
            }
        }	     
        return  max ;
    }
}
