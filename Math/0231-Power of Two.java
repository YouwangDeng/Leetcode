//Solution 1 use Bit Manipulation if n is power of 2 then it only contain 1 bit is 1 and n&(n-1) must be 0
class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n>0&&((n&(n-1))==0));
    }
}
//Solution 2 iteration
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0) return false;
        while(n%2==0) n/=2;
        return (n==1);
    }
}