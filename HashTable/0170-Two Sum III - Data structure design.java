//Solution 1
class TwoSum {

    /** Initialize your data structure here. */
    private HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    public void add(int number) {
        map.put(number, map.getOrDefault(number,0) + 1);
    }
    public boolean find(int value) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int i = entry.getKey();
            int j = value - i;
            if ((i == j && entry.getValue() > 1) || (i != j && map.containsKey(j))) {
                return true;
            }
        }
        return false;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */
 