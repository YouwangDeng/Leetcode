//Solution 1 iterative solution use bit manipulation
class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> rs=new ArrayList<Integer>();
        rs.add(0);
        for(int i=0;i<n;i++){
            int size=rs.size();
            for(int k=size-1;k>=0;k--)
                rs.add(rs.get(k) | 1<<i);
        }
        return rs;
    }
}
//Solution 2 backtracking solution up-down solution
class Solution {
    int nums = 0;
    public List<Integer> grayCode(int n) {
        List<Integer> ret = new ArrayList<>();
        backTrack(n, ret);
        return ret;
    }
    
    private void backTrack(int n, List<Integer> ret) {
        if (n == 0) {
            ret.add(nums);
            return;
        }
        else {
            backTrack(n - 1, ret);
            nums ^= (1 << n - 1);
            backTrack(n - 1, ret);
        }
    }
}