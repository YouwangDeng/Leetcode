//Solution 1 use Arrays.sort and Arrays.binarySearch methods
public class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int result = Integer.MIN_VALUE;
        
        for (int house : houses) {
            int index = Arrays.binarySearch(heaters, house);
            if (index < 0) {
        	index = -(index + 1);
            }
            int dist1 = index - 1 >= 0 ? house - heaters[index - 1] : Integer.MAX_VALUE;//key point
            int dist2 = index < heaters.length ? heaters[index] - house : Integer.MAX_VALUE;//key point
        
            result = Math.max(result, Math.min(dist1, dist2));
        }
        
        return result;
    }
}