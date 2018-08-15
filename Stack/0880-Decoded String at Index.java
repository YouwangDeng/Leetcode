//Solution 1 math "%" and "/" solution 
class Solution {
    public String decodeAtIndex(String S, int K) {
        long N = 0L;
        int i;
        char[] chs = S.toCharArray();
        for (i = 0; N < K; i++) N = chs[i] >= '0' && chs[i] <= '9' ? N*(chs[i] - '0') : N + 1;
        i--;
        while (true){
            if (chs[i] >= '0' && chs[i] <= '9') {
                N /= chs[i] - '0';
                K %= N;
            } else if (K%N == 0) return "" + chs[i];
            else N--;
            i--;
        }
    }
}