//Solution 1 use HashMap
class Solution {
    public int numRabbits(int[] answers) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int answer : answers) {
            map.put(answer, map.getOrDefault(answer, 0) + 1);
            
            if (map.get(answer) == answer + 1) {
                result += answer + 1;
                map.remove(answer);
            }
        }
        
        for (int key : map.keySet()) {
            result += key + 1;
        }
        
        return result;
    }
}