//Solution 1 use HashMap and frequency buckets
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        int max = 0;
        for (String w: words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
            max = Math.max(max, map.get(w));
        }
        List<String>[] bucket = new ArrayList[max + 1];
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            int fre = entry.getValue();
            if (bucket[fre] == null) {
                bucket[fre] = new ArrayList<>();
            }
            bucket[fre].add(entry.getKey());
        }
        List<String> res = new ArrayList<>();
        for (int i = max; i >= 0 && res.size() < k; i--) {
            if (bucket[i] != null) {
                Collections.sort(bucket[i]);//key point
                res.addAll(bucket[i]);//key point
            }
        }
        return res.subList(0, k);
    }
}
//Solution 2 use HashMap, PriorityQueue and Comparator slower
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        List<String> result = new LinkedList<>();
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<words.length; i++)
        {
            if(map.containsKey(words[i]))
                map.put(words[i], map.get(words[i])+1);
            else
                map.put(words[i], 1);
        }
        
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
                 (a,b) -> a.getValue()==b.getValue() ? b.getKey().compareTo(a.getKey()) : a.getValue()-b.getValue()
        );//key point
        
        for(Map.Entry<String, Integer> entry: map.entrySet())
        {
            pq.offer(entry);
            if(pq.size()>k)
                pq.poll();
        }

        while(!pq.isEmpty())
            result.add(0, pq.poll().getKey());
        
        return result;
    }
}