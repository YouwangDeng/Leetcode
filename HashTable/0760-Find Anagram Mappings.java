//Solution 1 use HashMao and ArrayList consider multiple answers
class Solution {
    public int[] anagramMappings(int[] A, int[] B) {
        int[] result = new int [A.length];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < B.length; i++) {
            map.computeIfAbsent(B[i], k -> new ArrayList<>()).add(i);
        }
        for(int i = 0; i < A.length; i++) {
            result[i] = map.get(A[i]).remove(map.get(A[i]).size()-1);
        }
        return result;
    }
}
//Solution 2 bit manipulation trick
class Solution {
    public int[] anagramMappings(int[] A, int[] B) {
        int n = A.length;
        for(int i = 0; i < n; i++) {
            A[i] = (A[i] << 8) + i;
            B[i] = (B[i] << 8) + i;
        }
        Arrays.sort(A);
        Arrays.sort(B);
        int[] ans = new int[n];
        for(int i = 0; i < n; i++)
            ans[A[i] & 0xFF] = B[i] & 0xFF;
        return ans;
    }
}