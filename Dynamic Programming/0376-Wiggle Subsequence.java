//Solution 1 boolean transfer DP solution
class Solution {
    public int wiggleMaxLength(int[] a) {
       if(a.length<2) return a.length;
       
       int start=1;
       while( (start<a.length) && (a[start] == a[start-1]) )
           start++;
       if(start==a.length)
            return 1;
        
       boolean increasing = a[start]>a[0];   // denoting if we are expecting increased relative to prev
       int prev = a[0], maxLen=1;
       for(int i=start; i<a.length; i++){
           if ( (increasing && (a[i] >prev)) || (!increasing && (a[i] < prev) ) ) {
                   increasing = !increasing;
                   maxLen++;
           }
           prev = a[i];
       }
       return maxLen;
  }
}