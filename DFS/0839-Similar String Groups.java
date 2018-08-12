//Solution 1 clear mark null DFS solution
class Solution {
    public int numSimilarGroups(String[] A) {
        if(A.length < 2) return A.length;
        int res = 0;
        for(int i=0;i<A.length;i++){
            if(A[i] == null) continue;
            String str = A[i];
            A[i] = null;//key point
            res++;
            dfs(A,str);
        }
        return res;
    }
    public void dfs(String[] arr,String str){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == null) continue;
            if(helper(str,arr[i])){// both string str and arr[i] belong in same group
                String s = arr[i];
                arr[i] = null;
                dfs(arr,s);
            }
        }
    }
    public boolean helper(String s,String t){
        int res = 0, i = 0;
        while(res <= 2 && i < s.length()){
            if(s.charAt(i) != t.charAt(i)) res++;
            i++;
        }
        return res == 2 || res == 0;
    }
}