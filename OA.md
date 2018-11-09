# Twitter OA
OA questions and solutions about Twitter SDE OA 2018


## Note
1. Stack<type> stack = new Stack<>();
2. Queue<type> queue = new LinkedList<>();
3. compare char equal use " c == '1' "
4. queue.isEmpty() stack.isEmpty stack.empty()
5. reduce time complexity: traverse the input first to get the key relations and store it in HashMap, then when solve problems use that relations in HashMap. this could help avoid time limited error
6. s.substring(a, b) s.toCharArray() s.charAt()
7. use StringBuilder .toString() Integer.valueOf
8. map.getOrDefault(key, 0)
9. stack push pop queue offer poll
10. for(Map.Entry<String, Integer> entry : map.entrySet())
11. for(Type c : list) for(Type c : array)
12. use .equals() to compare String
13. BFS use queue
14. No direction tree or graph use Parent array or child number to indicate the relationship 
15. isPrime function i < 2 and from 2 to i * i < num
16. convert char[] to String: new String(charArray);

# OA

### Braces
```
    static String[] braces(String[] values) {
        String[] res = new String[values.length];
        int index = 0;
        for(String value : values) {
            Stack stack = new Stack();
            int i = 0;
            for(; i < value.length(); i++) {
                char c = value.charAt(i);
                //check if braces match
                if(c == ')') {
                    if(stack.empty() || (char) stack.pop() != '(') {
                        break;
                    }
                } else if(c == '}') {
                    if(stack.empty() || (char) stack.pop() != '{') {
                        break;
                    }
                } else if(c == ']') {
                    if(stack.isEmpty() || (char) stack.pop() != '[') {
                        break;
                    }
                } else {
                    stack.push(c);
                }
            }
            //check if all braces match
            if(stack.empty() && i == value.length()) {
                res[index++] = "YES";
            } else {
                res[index++] = "NO";
            }   
        }
        return res;
    }
```

### Who's the closest?
```
    // Complete the closest function below.
    static List<Integer> closest(String s, List<Integer> queries) {
        //store each char present positions into a list and map to that char
        Map<Character, List<Integer>> map = new HashMap<>();
        //store the order of closest char position in the list into an array
        int[] closestOrder = new int[s.length()];
        //traverse the string to get the closest information of each char
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //put a new list to map
            if(!map.containsKey(c)) {
                List<Integer> index = new ArrayList<>();
                index.add(i);
                map.put(c, index);
                //the default closest position is itself
                closestOrder[i] = 0;
            } else {
                List<Integer> index = map.get(c);
                index.add(i);
                map.put(c, index);
                int lastOrder = index.size() - 1;
                //only two same chars occur
                if(lastOrder == 1) {
                    closestOrder[index.get(0)] = 1;
                } else {
                    //more than two chars occur
                    //calculate the gaps of the last three chars
                    int backSpace = index.get(lastOrder) - index.get(lastOrder - 1);
                    int frontSpace = index.get(lastOrder - 1) - index.get(lastOrder - 2);
                    if(backSpace < frontSpace) {
                        //update the closest position to the back one
                        closestOrder[index.get(lastOrder - 1)] = lastOrder;
                    }
                }
                //the default closest position is the front char position
                closestOrder[i] = lastOrder - 1;
            }
        }
        List<Integer> res = new LinkedList<>();
        //do the query
        for(int q : queries) {
            char c = s.charAt(q);
            int cloest = map.get(c).get(closestOrder[q]);
            if(cloest == q) {
                res.add(-1);
            } else {
                res.add(cloest);
            }
        }
        return res;
    }
```

### Simple Text Queries
```
    // Complete the textQueries function below.
    static void textQueries(List<String> sentences, List<String> queries) {
        //store each sentence mapping into a list
        List<Map<String, Integer>> listOfMap = new ArrayList<>();
        for(String sentence : sentences) {
            String[] words = sentence.split(" ");
            //mapping the sentence words frequency
            Map<String, Integer> wordsMap = new HashMap<>();
            for(String word : words) {
                wordsMap.put(word, wordsMap.getOrDefault(word, 0) + 1);
            }
            listOfMap.add(wordsMap);
        }
        
        List<String> res = new ArrayList<>();
        //do the query
        for(String query : queries) {
            String[] queryWords = query.split(" ");
            StringBuilder ans = new StringBuilder();
            int index = 0;
            //traverse the sentence list
            for(Map<String, Integer> map : listOfMap) {
                int times = Integer.MAX_VALUE;
                //match each word in the query
                for(String queryWord : queryWords) {
                    if(!map.containsKey(queryWord)) {
                        times = Integer.MAX_VALUE;
                        break;
                    } else {
                        int num = map.get(queryWord);
                        //update the times to the minimum
                        times = times > num ? num : times;
                    }
                }
                //add the index to ans
                while(times != Integer.MAX_VALUE && times > 0) {
                    ans.append(index).append(" ");
                    times--;
                }
                index++;
            }
            //no match found
            if(ans.length() == 0) {
                ans.append("-1");
            }
            res.add(ans.toString());
        }
        //output the result
        for(String s : res) {
            System.out.println(s);
        }
    }
```


### The Huffman Decoder
```
class Solution {
    public static String Decoder(String[] code, String encode) {
        if(code.length == 0 || encode.length() == 0) {
            return "";
        }
        Map<String, String> map = new HashMap<>();
        for(String s : code) {
            String[] pair = s.split(" ");
            if(pair[0].equals("[newline]"){
                map.put(pair[1],"\n");
            } else {
                map.put(pair[1],pair[0]);
            }
        }
        StringBuilder sb = new StringBuilder();
        int left = 0;
        int right = 0;
        while(right < encode.length()) {
            while(!map.containsKey(encode.substring(left, right) && right < encode.length()) {
                right++;
            } 
            sb.append(map.get(encode.substring(left, right));
            left = right;
        }
        return sb.toString();
    } 
    public static void main(String[] args) {
                
    }
}
```

### HackLand Election
```
public String electionWinner(String[] votes) {
    if(votes.length == 0) {
        return null;
    }
    Map<String, Integer> map = new HashMap<>();
    for(String candidate : votes) {
        map.put(candidate, map.getOrDefault(candidate,0) + 1)
    }
    Map<Integer, List<String>> res = new HashMap<>();
    int max = 0;
    for(Map.Entry<String, Integer> entry : map.entrySet()) {
        String key = entry.getKey();
        int value = entry.getValue();
        if(res.get(value) == null) {
            res.put(value, new ArrayList());
        }
        res.get(value).add(key);
        if(value > max) {
            max = value;
        }
    }
    ArrayList<String> candidate = res.get(max);
    String ret = candidate.get(0);
    if(candidate.size() == 1) {
        return ret;
    }
    for(int i = 1; i < candidate.size(); i++) {
        if (candidate.get(i).compareTo(ret) < 0) {
            ret = candidate.get(i);
        }
    }
    return ret;
    }
```

### Missing Words

```
public String[] missingWord(String s, String t) {
    String[] sArray = s.split(" ");
    String[] tArray = t.split(" ");
    if(sArray.length == 0) return null;
    if(tArray.length == 0) return sArray;
    String[] missing = new String[sArray.length - tArray.length];
    int tIndex = 0;
    int mIndex = 0;
    for(String word : sArray) {
        if(tIndex < tArray.length && tArray[tIndex].equals(word)) {
            tIndex++;
        } else {
            missing[mIndex] = word;
            mIndex++;
        }
    }
    return missing;
}
```

### Rover Control
```
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int cmdNum = in.nextInt();
    String[] cmds = new String[cmdNum];
    for(int i = 0;i < cmdNum;i++) {
        cmds[i] = in.next();
    }
    int[][] cells = new int[n][n];
    for(int i = 0;i < n;i++) {
        for(int j = 0;j < n;j++) {
            cells[i][j] = i * n + j;
        } 
    }
    int[] dir = {-1, 0, 1, 0, -1};
    int row = 0;
    int col = 0;
    for(String cmd : cmds) {
        if(cmd.equals("LEFT") && isValidMove(row , col, dir[0], dir[1])) {
            col += dir[0];
            row += dir[1];
        
        } else if(cmd.equals("UP")isValidMove(row , col, dir[1], dir[2])) {
            col += dir[1];
            row += dir[2];
        } else if(cmd.equals("RIGHT")isValidMove(row , col, dir[2], dir[3])) {
            col += dir[2];
            row += dir[3];
        } else if(cmd.equals("DOWN")isValidMove(row , col, dir[3], dir[4])) {
            col += dir[3];
            row += dir[4];
        }
    }
    return cells[row][col];
    public boolean isValidMove(int row, int col, int colMove, int rowMove) {
        if(row + rowMove >= 0 && row + rowMove < n && col + colMove >= 0 && col + colMove < n) {
            return true;
        }
        return false;
    }
}
```

### Simple Text Queries
```
Scanner in = new Scanner(System.in);
int sNum = in.nextInt();
Map<String, HashMap<Integer,Integer>> sMap = new HashMap<>();
for(int i = 0; i < sNum; i++) {
    String s = in.next();
    String[] sArray = s.split(" ");
    for(String word : sArray) {
        if(!sMap.containsKey(word)) {
            sMap.put(word, new HashMap<Integer, Integer>());
        }
        match = sMap.get(word);
        match.put(i, match.getOrDefault(i, 0) + 1);
    }
}
int qNum = in.nextInt();
List<List<Integer>> res = new ArrayList<>();
for(int j = 0; j < qNum; q++) {
    String q = in.next();
    String[] qArray = q.split(" ");
    Map<String, Integer> query = new HashMap<>();
    for(String word : qArray) {
        query.put(word, query.getOrDefault(word, 0) + 1);
    }
    List<Integer> tempRes = new ArrayList<>();
    Map<Integer, Integer> matchTimes = new HashMap<>();
    int q = 0;
    for(Map.Entry<String, Integer> entry : query.entrySet()) {
        String key = entry.getKey();
        int value = entry.getValue();
        if(sMap.containsKey(key)) {
            if(q == 0) {
                for(Map.Entry<Integer, Integer> innerEntry : sMap.get(key).entrySet()) {
                    int sIndex = innerEntry.getKey();
                    int indexNum = innerEntry.getValue();
                    matchTimes.put(sIndex, indexNum/value);  
                }
            } else {
                for(Map.Entry<Integer, Integer> times : matchTimes.entrySet()) {
                    if(!sMap.get(key).containsKey(times.getKey())) {
                        matchTimes.remove(times.getKey());
                    } else {
                        matchTimes.put(times.getKey(), Math.min(times.getValue(), sMap.get(key).get(times.getKey())/value));
                    }
                }
            }
        } else {
            tempRes.add(-1);
            break;
        }
        q++;
    }
    if(tempRes.size() != 1) {
        for(Map.Entry<Integer, Integer> times : matchTimes.entrySet()) {
            int senIndex = times.getKey();
            int repTimes = times.getValue();
            if(repTimes == 0) continue;
            for(int i = 0; i < repTimes; i++) {
                tempRes.add(senIndex);
            }   
        }
        if(tempRes.size() == 0) {
            tempRes.add(-1);
        }
    }
    res.add(tempRes);    
}
return res;
```

### who's the closest
```
public int[] closest(int[] queries, String s) {
    int[] res = new int[queries.length];
    for(int i = 0; i < queries.length; i++) {
        int q = queries[i];
        int left = q;
        int right = q;
        while(left > 0 || right < s.length() - 1) {
            if(left > 0) {
                left--;
                if(s.charAt(left) == s.charAt(q)) {
                     res[i] = left;
                     break; 
                } 
            }
            if(right < s.length() - 1) {
                right++;
                if(s.charAt(left) == s.charAt(q)) {
                    res[i] = right; 
                    break;
                } 
            }
        }
        if(res[i] != -1) {
            res[i] = -1;
        } 
    }
    return res;
}
```

### Image Matching
```
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ImageMatching {
    private static int imageMatching(List<int[]> map1, List<int[]> map2) {
        // bfs traverse together
        // get the record
        int match = 0;

        for (int i = 0; i < map1.size(); i++) {
            for (int j = 0; j < map1.get(i).length; j++) {
                // change in place
                List<int[]> records1 = bfsMap(map1, i, j);
                List<int[]> records2 = bfsMap(map2, i, j);

                // compare the records
                if (isMatch(records1, records2)) {
                    match++;
                }
            }
        }
        return match;

    }

    private static List<int[]> bfsMap(List<int[]> map, int row, int col) {
        List<int[]> res = new ArrayList<>();

        if (map.get(row)[col] == 1) {
            Queue<int[]> queue = new LinkedList<>();
            queue.offer(new int[]{row, col});
            while (!queue.isEmpty()) {
                int[] temp = queue.poll();
                int r = temp[0];
                int c = temp[1];
                map.get(r)[c] = 0;
                res.add(temp);
                // check the 4 directions
                if (r - 1 >= 0 && c < map.get(r - 1).length && map.get(r - 1)[c] == 1) {
                    queue.offer(new int[]{r - 1, c});
                }
                if (r + 1 < map.size() && c < map.get(r + 1).length && map.get(r + 1)[c] == 1) {
                    queue.offer(new int[]{r + 1, c});
                }
                if (c - 1 >= 0 && map.get(r)[c - 1] == 1) {
                    queue.offer(new int[]{r, c - 1});
                }
                if (c + 1 < map.get(r).length && map.get(r)[c + 1] == 1) {
                    queue.offer(new int[]{r, c + 1});
                }
            }
        }

        return res;
    }

    private static boolean isMatch(List<int[]> l1, List<int[]> l2) {
        if (l1.size() != l2.size()) return false;
        if (l1.size() == 0) return false;
        for (int i = 0; i < l1.size(); i++) {
            if (l1.get(i)[0] != l2.get(i)[0] || l1.get(i)[1] != l2.get(i)[1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // testcase1
        List<int[]> map1a = new ArrayList<>();
        map1a.add(new int[]{0,0,1});
        map1a.add(new int[]{0,1,1,1});
        map1a.add(new int[]{1,0,1});

        List<int[]> map1b = new ArrayList<>();
        map1b.add(new int[]{0,0,1});
        map1b.add(new int[]{0,1,1,1});
        map1b.add(new int[]{0,0,1});
        System.out.println(imageMatching(map1a, map1b));
        // 1

        // testcase2
        List<int[]> map2a = new ArrayList<>();
        map2a.add(new int[]{0,0,1});
        map2a.add(new int[]{0,1,1,1});
        map2a.add(new int[]{1,0,1});

        List<int[]> map2b = new ArrayList<>();
        map2b.add(new int[]{0,0,1});
        map2b.add(new int[]{0,1,1,1});
        map2b.add(new int[]{0,1,1});
        System.out.println(imageMatching(map2a, map2b));
        // 0

        // testcase3
        List<int[]> map3a = new ArrayList<>();
        map3a.add(new int[]{0,1,0,0});
        map3a.add(new int[]{1,0,0,1});
        map3a.add(new int[]{0,0,1,1});
        map3a.add(new int[]{0,0,1,1});

        List<int[]> map3b = new ArrayList<>();
        map3b.add(new int[]{0,1,0,1});
        map3b.add(new int[]{1,0,0,1});
        map3b.add(new int[]{0,0,1,1});
        map3b.add(new int[]{0,0,1,1});
        System.out.println(imageMatching(map3a, map3b));
        // 2

        // testcase4
        List<int[]> map4a = new ArrayList<>();
        map4a.add(new int[]{0,0,1,0});
        map4a.add(new int[]{0,1,1,1});
        map4a.add(new int[]{0,1,0,0});
        map4a.add(new int[]{1,1,1,1});

        List<int[]> map4b = new ArrayList<>();
        map4b.add(new int[]{0,0,1,0});
        map4b.add(new int[]{0,1,1,1});
        map4b.add(new int[]{0,1,1,0});
        map4b.add(new int[]{1,1,1,1});
        System.out.println(imageMatching(map4a, map4b));
        // 0

    }
}

```
### No Pairs Allowed
```
public int[] minimalOperation(String[] words) {
    int index = 0;
    int[] res = new int[words.length];
    for(String word : words) {
        int operations = 0;
        int left = 0;
        char cur = word.charAt(0);
        for(int i = 1; i < word.length(); i++) {
            char next = word.charAt(i);
            if(next != cur) {
                operations += (i - left) / 2;
                left = i;
            }
        }
        operations += (i - left) / 2;
        res[index++] = operations;
    }
    return res;
}
```

### Parenthesis 
```
public static String[] braces(String[] values) {
    String[] res = new String[values.length];
    int index = 0;
    for(String value : values) {
        Stack<Character> stack = new LinkedList<>();
        for(int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if(c == ")") {
                if(stack.isEmpty() || stack.pop() != "(") {
                    break;
                }
            } else if(c == "}") {
                if(stack.isEmpty() || stack.pop() != "{") {
                    break;
                }
            } else if(c == "]") {
                if(stack.isEmpty() || stack.pop() != "[") {
                    
                    break;
                }
            } else {
                stack.push(c);
            }
        }
        if(stack.isEmpty() && i == value.length()) {
            res[index++] = "YES";
        } else {
            res[index++] = "NO";
        }
    }
    return res;
}
```

### Primes in Subtree
```
private  static List<Integer> primeQ(int n, List<Integer> first, List<Integer> second, List<Integer> values, List<Integer> queries) {        int[] primCount = new int[n+1];        int[] parentIdx = new int[n+1];        int[] childNum = new int[n+1];        Map<Integer,List<Integer>> map = new HashMap<>();        for(int i = 1; i <= n; i++) {            if(isPrime(values.get(i-1))) primCount[i] = 1;        }        for(int i = 0; i < first.size(); i++) {            int u = first.get(i);            int v = second.get(i);            if(!map.containsKey(u)) map.put(u,new ArrayList<Integer>());            map.get(u).add(v);            if(!map.containsKey(v)) map.put(v,new ArrayList<Integer>());            map.get(v).add(u);        }        Queue<Integer> leaves = new LinkedList<>();        parentIdx[1] = 1;        leaves.offer(1);        while (!leaves.isEmpty()) {            int u = leaves.poll();            for(int v : map.get(u)) {                if(parentIdx[v] != 0) continue;                parentIdx[v] = u;                childNum[u]++;                leaves.offer(v);            }        }        leaves.clear();        for(int i = 1; i <= n; i++) {            if(childNum[i] == 0) leaves.offer(i);        }        while (!leaves.isEmpty()) {            int v = leaves.poll();            int u = parentIdx[v];            if(u == v) continue;            primCount[u] += primCount[v];            childNum[u]--;            if(childNum[u] == 0) leaves.offer(u);        }        List<Integer> res = new ArrayList<>();        for(int query : queries) res.add(primCount[query]);        return  res;    }    private static boolean isPrime(int n) {        if(n == 1) return false;        if (n <= 3) return true;        if (n % 2 == 0) return false;        for (int i = 2; i * i <= n; i++) {            if (n % i == 0) return false;        }        return true;    }
```

### ASCII decoding
```
public String decode(String encoded) {
    String reEncoded = reverse(encoded);
    int left = 0;
    int right = 1;
    StringBuilder sb = new SrtringBuilder();
    while(right < reEncoded.length()) {
        while(!isValidChar(Integer.valueOf(reEncoded.substring(left,right))) && right < reEncoded.length()) {
            right++;
        }
        sb.append((char) Integer.valueOf(reEncoded.substring(left,right)));
        left = right;
        right++;
    }
    return sb.toString();
    
}

public String reverse(String s) {
    char[] arr = s.toCharArray(s);
    int left = 0;
    int right = arr.length - 1;
    while(left < right) {
        char temp = arr[left]
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }
    return new String(arr);
}
public boolean isValidChar(int num) {
    if(num == 32) return true;
    if(num >= 65 && num <= 90) return true;
    if(num >= 97 && num <= 122) return true;
    return false;
}
```


# Akuna Capital OA

两个Section，S1 & S2，S1小题（选择题）10道左右，20min。S2一道Python编程题。
S1：比较重基础知识，B树、排序、二进制补码等都有涉及，总体不算难，碰到了几道地里的原题，这里要感谢这个面经贴：https://www.1point3acres.com/bbs/thread-450890-1-1.html
注意：S1只有20min，所以还是要抓紧时间赶紧做，而做完一道题一定要点题下面绿色的submit按钮，否则答案是不保存的。我有一道题忘了点，结果到时间了等于白做了一题。

S2：Order Marking，地里的老题了，可参考 https://www.1point3acres.com/bbs/thread-295824-1-1.html，本身不难，就是题干略长，读题要花点功夫。

https://www.jianshu.com/p/e29d07b92415

core skill是9道选择题+1道填空题。内容包括unit testing，mutex，tree traversal, function call。20分钟。

20min 多选题 + 填空
多选:  B tree ，unit test， testing features， SOLID， 读程序题（就是普通loop，或者找最大最小），基本排序算法复杂度
填空: 了解一下找最大公约数，然后就是for loop计算








 
