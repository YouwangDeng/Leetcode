//Solution 1 iterative permutation solution
public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if(nums.length == 0) return result;
        List<Integer> cur = new LinkedList<Integer>();
        cur.add(nums[0]);
        result.add(cur);
        for(int i = 1; i < nums.length; i++) {
            int curSize = result.size();
            for(int j = 0; j < curSize; j++) {
                for(int x = 0; x < result.get(j).size(); x++) {
                    List<Integer> newList = new LinkedList<Integer>(result.get(j));
                    newList.add(x, nums[i]);
                    result.add(newList);
                }
                result.get(j).add(nums[i]);
            }
        }
        return result;
    }
}
//Solution 2 standard backtracking solution
public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){
        if(tempList.size() == nums.length){
            list.add(new ArrayList<>(tempList));
        } else{
            for(int i = 0; i < nums.length; i++){ 
                if(tempList.contains(nums[i])) continue; // element already exists, skip
                tempList.add(nums[i]);
                backtrack(list, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    } 
}