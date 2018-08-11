//Solution 1 use PriorityQueue and HashMap to store value (graph problem)
class Solution {
    public int networkDelayTime(int[][] times, int N, int K) {
        if(times == null || times.length == 0){
            return -1;
        }
        // store the source node as key. The value is another map of the neighbor nodes and distance.
        Map<Integer, Map<Integer, Integer>> path = new HashMap<>();
        for(int[] time : times){
            Map<Integer, Integer> sourceMap = path.get(time[0]);
            if(sourceMap == null){
                sourceMap = new HashMap<>();
                path.put(time[0], sourceMap);
            }
            Integer dis = sourceMap.get(time[1]);
            if(dis == null || dis > time[2]){
                sourceMap.put(time[1], time[2]);
            }
            
        }

        //Use PriorityQueue to get the node with shortest absolute distance 
        //and calculate the absolute distance of its neighbor nodes.
        Map<Integer, Integer> distanceMap = new HashMap<>();
        distanceMap.put(K, 0);
        PriorityQueue<int[]> pq = new PriorityQueue<>((i1, i2) -> {return i1[1] - i2[1];});
        pq.offer(new int[]{K, 0});
        int max = -1;
        while(!pq.isEmpty()){
            int[] cur = pq.poll();
            int node = cur[0];
            int distance = cur[1];

            // Ignore processed nodes
            if(distanceMap.containsKey(node) && distanceMap.get(node) < distance){
                continue;
            }
            
            Map<Integer, Integer> sourceMap = path.get(node);
            if(sourceMap == null){
                continue;
            }
            for(Map.Entry<Integer, Integer> entry : sourceMap.entrySet()){
                int absoluteDistence = distance + entry.getValue();
                int targetNode = entry.getKey();
                if(distanceMap.containsKey(targetNode) && distanceMap.get(targetNode) <= absoluteDistence){
                    continue;
                }
                distanceMap.put(targetNode, absoluteDistence);
                pq.offer(new int[]{targetNode, absoluteDistence});
            }
        }
        // get the largest absolute distance.
        for(int val : distanceMap.values()){
            if(val > max){
                max = val;
            }
        }
        return distanceMap.size() == N ? max : -1;
    }
}