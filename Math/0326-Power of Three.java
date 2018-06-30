//Solution 1 standard power math solution but not that fast
class Solution {
    public boolean isPowerOfThree(int n) {
        // 1162261467 is 3^19,  3^20 is bigger than int  
        return ( n>0 &&  1162261467%n==0);
    }
}
//Solution 2 Recursion solution
class Solution {
    public boolean isPowerOfThree(int n) {
        return n>0 && (n==1 || (n%3==0 && isPowerOfThree(n/3)));
    }
}
//Solution 3 iteration solution
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n>1)
            while(n%3==0) n /= 3;
        return n==1;
    }
}