//Solution 1 D(n) = (n-1) [D(n-2) + D(n-1)] math solution
class Solution {
    public int findDerangement(int n) {
        long dn2 = 0, dn1 = 1;
        long res = n==1 ? 0 : 1; 
        for (int i = 3; i <= n; i++){
            res = ((i-1) * (dn1+dn2))%1000000007;
            dn2 = dn1;
            dn1 = res;           
        }
        return (int) res;
    }
}