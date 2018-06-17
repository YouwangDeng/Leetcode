//Solution 1 min and max 
class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int res = 0;
        for(int i = 0;i < arrays.size();i++){
            List<Integer> array = arrays.get(i);
            int curMin = array.get(0);
            int curMax = array.get(array.size()-1);
            //on condition 1: if max <= curMin,it couldn't be the result,because curMin <= curMax&&min <= max,so min <= curMax,
            //---the case would be covered in the second condition
            //Vice versa for the second condition
            if(max > curMin) res = Math.max(res,max - curMin);//condition 1
            if(curMax > min) res = Math.max(res,curMax - min);//condition 2
            min = Math.min(curMin,min);
            max = Math.max(curMax,max);
        }
        return res;
    }
}