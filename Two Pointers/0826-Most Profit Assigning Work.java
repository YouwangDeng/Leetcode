//Solution 1 use TreeMap and floorEntry method
class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
       
        TreeMap<Integer, Integer> tmap = new TreeMap<>();
        for (int i = 0; i < difficulty.length; i++) {
            tmap.put(difficulty[i], Math.max(profit[i], tmap.getOrDefault(difficulty[i], 0)));
        }

        int max = 0, res = 0;
        for (Integer key : tmap.keySet()) {
            max = Math.max(tmap.get(key), max);
            tmap.put(key, max);
        }
        
        Map.Entry<Integer, Integer> entry = null;
        for (int i = 0; i < worker.length; i++) {
            entry = tmap.floorEntry(worker[i]);            
            if (entry != null) {
                res += entry.getValue();
            }  
        }
        return res;  
    }
}