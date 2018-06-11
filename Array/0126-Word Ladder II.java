//Solution 1 *hard problem use DFS and BFS
class Solution {
    
    boolean found = false;
    
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> result = new ArrayList<>();
        Set<String> dict = new HashSet<>(wordList);
        if (!dict.contains(endWord)) {
            return result;
        }
        
        HashMap<String, List<List<String>>> begin = new HashMap<>();
        List<List<String>> bPath = new ArrayList<>();
        List<String> b = new ArrayList<>();
        b.add(beginWord);
        bPath.add(b);
        begin.put(beginWord, bPath);
        
        HashMap<String, List<List<String>>> end = new HashMap<>();
        List<List<String>> ePath = new ArrayList<>();
        List<String> e = new ArrayList<>();
        e.add(endWord);
        ePath.add(e);
        end.put(endWord, ePath);
        
        while (!begin.isEmpty() && !end.isEmpty() && !found) {
            if (begin.size() <= end.size()) {
                traverse(begin, end, dict, beginWord, result);
            } else {
                traverse(end, begin, dict, beginWord, result);
            }
        }
        
        return result;
    }
    
    private void traverse(HashMap<String, List<List<String>>> begin, HashMap<String, List<List<String>>> end, 
                          Set<String> dict, String beginWord, List<List<String>> result) {
        HashMap<String, List<List<String>>> currLevel = new HashMap<>();
        for (String from : begin.keySet()) {
            char[] fromWord = from.toCharArray();
            for (int i = 0; i < fromWord.length; i ++) {
                for (char j ='a'; j <= 'z'; j ++) {
                    fromWord[i] = j;
                    String to = new String(fromWord);
                    if (end.containsKey(to)) {
                        found = true;
                        for (int m = 0; m < begin.get(from).size(); m ++) {
                            for (int n = 0; n < end.get(to).size(); n ++) {
                                List<String> path1 = new ArrayList<>(begin.get(from).get(m));
                                List<String> path2 = new ArrayList<>(end.get(to).get(n));
                                Collections.reverse(path2);
                                path1.addAll(path2);
                                if (!path1.get(0).equals(beginWord)) {
                                    Collections.reverse(path1);
                                }
                                result.add(path1);
                            }
                        }
                    } else if (fromContains(to, begin.get(from))) {
                        continue;
                    } else if (dict.contains(to)) {
                        List<List<String>> newBeginPath = new ArrayList<>();
                        if (currLevel.containsKey(to)) {
                            newBeginPath = currLevel.get(to);
                        }
                        for (List<String> beginPath : begin.get(from)) {
                            beginPath.add(to);
                            newBeginPath.add(new ArrayList<>(beginPath));
                            beginPath.remove(beginPath.size() - 1);
                        }
                        currLevel.put(to, newBeginPath);
                    }
                }
                fromWord[i] = from.charAt(i);
            }
        }
        begin.clear();
        begin.putAll(currLevel);
    }
    
    private boolean fromContains(String to, List<List<String>> from) {
        for (List<String> fromPath : from) {
            if (fromPath.contains(to)) {
                return true;
            }
        }
        return false;
    }
}