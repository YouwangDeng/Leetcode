//Solution 1 bit manipulation to store DP state 
public class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (desiredTotal<=0) return true;
        if (maxChoosableInteger*(maxChoosableInteger+1)/2<desiredTotal) return false;
        return canIWin(desiredTotal, maxChoosableInteger, 0, new HashMap<>());
    }
    private boolean canIWin(int total, int n, int state, HashMap<Integer, Boolean> hashMap) {
        if (hashMap.containsKey(state)) return hashMap.get(state);
        for (int i=0;i<n;i++) {
            if ((state&(1<<i))!=0) continue;
            if (total<=i+1 || !canIWin(total-(i+1), n, state|(1<<i), hashMap)) {
                hashMap.put(state, true);
                return true;
            }
        }
        hashMap.put(state, false);
        return false;
    }
}