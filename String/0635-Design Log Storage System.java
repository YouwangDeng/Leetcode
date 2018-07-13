//Solution 1 use HashMap and ArrayList
public class LogSystem {

    private List<String[]> db;
    Map<String, Integer> unitIdxMap;
    
    public LogSystem() {
        db = new ArrayList<>();
        unitIdxMap = new HashMap<>();
        // init
        unitIdxMap.put("Year", 4);
        unitIdxMap.put("Month", 7);
        unitIdxMap.put("Day", 10);
        unitIdxMap.put("Hour", 13);
        unitIdxMap.put("Minute", 16);
        unitIdxMap.put("Second", 19);
    }
    
    public void put(int id, String timestamp) {
        db.add(new String[]{String.valueOf(id), timestamp});
    }
    
    public List<Integer> retrieve(String s, String e, String gra) {
        
        int idx = unitIdxMap.get(gra);
        List<Integer> res = new ArrayList<>();
        for (String[] st : db)
        {
            if (st[1].substring(0, idx).compareTo(s.substring(0, idx)) >= 0 
                && st[1].substring(0, idx).compareTo(e.substring(0, idx)) <= 0)
            {
                res.add(Integer.valueOf(st[0]));
            }
        }
        
        return res;
    }
}

/**
 * Your LogSystem object will be instantiated and called as such:
 * LogSystem obj = new LogSystem();
 * obj.put(id,timestamp);
 * List<Integer> param_2 = obj.retrieve(s,e,gra);
 */