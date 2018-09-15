# Twitter OA
OA questions and solutions about Twitter SDE OA 2018

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



感谢楼主分享~刚做完OA，section 2是prime tree，题目描述好像不太一样了，lz的代码要改一下哈。给的输入里first和second数组组成的pair不一定是first[i]为parent，second[i]为child，只有1是root是确定的。给的一个例子：. From 1point 3acres bbs
node数为10
first:[6, 8, 3, 6, 4, 1, 8, 5, 1]
second:[9, 9, 5, 7, 8, 8, 10, 8, 2]
values:[17, 29, 3, 20, 11, 8, 3, 23, 5, 15]. 一亩-三分-地，独家发布
queries: [1, 8, 9, 6, 4, 3]
输出为： 7, 5, 2, 1, 0, 1

请问first 6 second 5 的例子里就选小的parent吗？
小的不一定是parent，只有1是root是固定的。因为给的是无向图里的链接，所以要用BFS先把树建起来。BFS queue initial只放一个1进去

Query那道题好坑啊。。。重复的word居然不计数。。。
遇到了哈夫曼的变种是ASCII码的解码。
感谢楼主，已加米！

刚刚做完twitter 的oa,题目基本和地里的一样，记得之前有个帖子总结了10道今年的常见oa,忘了链接了，然后今天我做的多了一个没见过的, ascii码的，也不太难第一题是No pair allowed
第二个是ascii 码
第三个就是那个prime subtree

还是说下第三题的话,输入: n ,list of start node,list of end node,value of each node,list of query
n表示从1-n n个node
每个边表示为一头在start,一头在end list
然后value of each node 就是每个结点代表的值，可能是质数也可能不是这个需要自己判断，
query 就是每个node 的下标 1-n中任意
要找的是以那个query node 为root的subtree的质数结点个数
.本文原创自1point3acres论坛
这里的一个对我来说的误解在于，我认为start node 和end node 构成了一个directed edge,而实际上是undirected
所以给定一开始的数据我构造的图是一个无向图，同时也是树。
但是你需要自己把undirected tree转成一个以 1 为super root 的树，所以这时候，实际上你做的就是把一个undirected graph转成directed graph,因为你要支持那个树结构的操作，或者函数是作为递归树结构进行的
相应物理结构也要进行调整，这就是getNewTree的作用，而上边那个函数输入的tree实际上是转好的，这样就能实现。同时加上memo.保证了第一次就计算出了所有的结果，以后直接看memo就成.. from: 1point3acres 

然后ascii 码那个本来以为是word break.实际上没有那么复杂，输入的ascii 值是有限的，并且告诉了你从后往前看应该，所以就从后往前先试试两个digit,看看行不行行的话就加如stringbuilder继续，不行再试试三个看看可否。
这个题目保证有解故而这种做法直接可以出结果，实际上简化了很多

第一二題很簡單
我的第一題是把一串數字 input 用 ascii 轉成字符串
第二題地理有 就是投票那題 来源一亩.三分地论坛. 

目前卡在第三題 我的第三題是 huffman decoder, 只過了前兩個 test case
題目會給你一個 list 裡面有 code
code 長這種形式 "a 100100", "b, 100101" 
然後再給你一串 string e.g. 100100100101, 然後你要能夠把它 decode 變回 ab 輸出

我的作法很直接就是去 parse list 然後用 map 存起來，接著如果找到在 map 裡面有的 code，就用 stringbuilder 存起來之後輸出. 1point 3acres 论坛
但後面五個 test case 過不了

huffman编码就是说前缀不可能一样。如果a 为01，b不可能为011，所以就每次decode的时候后面的点+1，直到在map里有这个编码为止

greedy 暴力解就可以过

天啊，newline不一定全是111111，现在全部过了

注意用split("\\t")建match就好了，剩下的就贪心发扫一遍，处理一下newline全过
关于split
https://stackoverflow.com/questions/1635764/string-parsing-in-java-with-delimiter-tab-t-using-split

三个题 test cases都过了1. rover control.  没什么好说的，加个边界判断“UP” “up”大小写都考虑一下

2. missing words . Waral 博客有更多文章,
比如“I love coding” “i love” 第一个只走到love 后面coding加到结果里就好了
3.  images matching  说一下思路 
(注意：每行长度不一样 但是两个Image结构应该是一样的）
for x 
    for y
        if((x,y) 在两个图中都没被visit过 && 两个值都为1 && check(x,y) )
        count++

. 一亩-三分-地，独家发布
check过程就是：两个岛分开dfs 返回两个List 就是岛的形状 继续判断是否一样就好了
dfs(grid1, x, y, isVisited1)
dfs(grid2, x, y, isVisited2)
我这个想法应该不会重复计算

虽然知道twitter oa做了大概率还是就石沉大海，我还是做了下
分为2个部分

第一个部分2道coding题
1. brace 就是判断给定字符串由 '(' ')' '{' '}' '[' ']'6种字符构成，然后判断是否闭合，用stack做就可以了，当然input是一个list of string，判断n个string是否闭合，然后return list of string，'YES' or 'NO'
2. who's closest 给你一个字符串，给你一个list of int, 然后对于每个idx int对应的char，去寻找字符串中离idx最近的一样的char的idx，如果2个距离一样近，返回小的那个，如果没有，返回-1，所以最后会返回一个list of int。从idx往两边搜就可以做完，然后cache存一下就可以all pass，避免超时. 留学申请论坛-一亩三分地

第二部分1道coding题
prime in subtree
先给你n个nodes int， List<Integer> first index （n-1个），List<Integer> second index（n-1个），List<Integer> values（n个），List<Integer> queries（k个）。然后先要自己构建树，first和second两个list里pair的就画一个无向线，然后树的root从第一个node开始。构建完树后再去给定query index的node，求对应包括自身节点和所有子节点的value是否为prime的个数。我首先构建树是不分parent和child，直接把pair的2个idx互相加进各个的children里，然后从root（第一个node开始dfs搜索）去边。这样构建完树后再去用dfs算prime in subtree，然后用dp存一下，就可以全过了

section1：
1）Ascii to string Decoder. 
这个题目是下面10个面筋题目里面没有的, 稍微说一下. 题目意思是说给一串字母比如 s = "Johnson" , 我们encode 这个s 需要两个步骤, 首先转换成"74111104110115111110", 通过每个char的ascii码来得到, 第二步将其reverse, 得到"01111151101140111147". 这样就完成了编码, 也就是encode.. from: 1point3acres 
. more info on 1point3acres
那么你需要写一个函数来decode 上面的编码string, 也就是说:
input: "01111151101140111147"
output: "Johnson". from: 1point3acres 
2）Who's the closest..留学论坛-一亩-三分地
section2:
1) Primes in Subtree.. 

1.No pairs allowed
2.括号匹配. 1point3acres
. 一亩-三分-地，独家发布
3.PrimesInSubtree
第三题有变动，给的是无向边，有的边父节点在first里，子节点在second里，有的边父节点在second里，子节点在first里，这个要注意。


```
private  static List<Integer> primeQ(int n, List<Integer> first, List<Integer> second, List<Integer> values, List<Integer> queries) {        int[] primCount = new int[n+1];        int[] parentIdx = new int[n+1];        int[] childNum = new int[n+1];        Map<Integer,List<Integer>> map = new HashMap<>();        for(int i = 1; i <= n; i++) {            if(isPrime(values.get(i-1))) primCount[i] = 1;        }        for(int i = 0; i < first.size(); i++) {            int u = first.get(i);            int v = second.get(i);            if(!map.containsKey(u)) map.put(u,new ArrayList<Integer>());            map.get(u).add(v);            if(!map.containsKey(v)) map.put(v,new ArrayList<Integer>());            map.get(v).add(u);        }        Queue<Integer> leaves = new LinkedList<>();        parentIdx[1] = 1;        leaves.offer(1);        while (!leaves.isEmpty()) {            int u = leaves.poll();            for(int v : map.get(u)) {                if(parentIdx[v] != 0) continue;                parentIdx[v] = u;                childNum[u]++;                leaves.offer(v);            }        }        leaves.clear();        for(int i = 1; i <= n; i++) {            if(childNum[i] == 0) leaves.offer(i);        }        while (!leaves.isEmpty()) {            int v = leaves.poll();            int u = parentIdx[v];            if(u == v) continue;            primCount[u] += primCount[v];            childNum[u]--;            if(childNum[u] == 0) leaves.offer(u);        }        List<Integer> res = new ArrayList<>();        for(int query : queries) res.add(primCount[query]);        return  res;    }    private static boolean isPrime(int n) {        if(n == 1) return false;        if (n <= 3) return true;        if (n % 2 == 0) return false;        for (int i = 2; i * i <= n; i++) {            if (n % i == 0) return false;        }        return true;    }
```

Solution in Java:
- Make an Array List of HashMaps (The order in the list will be same as the order of the sentences). Each HashMap in the list has key as the word in a sentence, value as the count of the word.. Waral 博客有更多文章,
- For each query, check each HashMap in the list above if it includes all the words in the query. To figure out how many times, find the min count of the words in the query.

Example: Sentence "bob alice bob alice bob", Query "bob alice"
Sentence will have the hashmap tokens = {bob: 3, alice: 2}
But you can only find 2 "bob alice"

You do this by finding min(tokens["bob"], tokens["alice"]), which is 2. So the sentence should be printed TWICE.

sentences的map的构建过程和query的查询过程是两个独立的过程。map建立好以后，每个query进行都去用之前建立好的map去做处理，得出结果。所以不管每个query是否相同，都去做一遍处理就可以了
知道原因了，首先要验证sentence和queries的合法性，不合法就不处理。。。我tm就日了狗了
出现一样的情况.....求问什么情况，直接return还是print -1？直接return

1. ASCII Encoded String 2. HackerlandElection 3. HuffmanDecoder

2. Rover Control
3. HandLand Election
4. Primes in Subtree

先建tree，然后递归计算出所有node的prime count，query的时候查就可以了

1. No Pairs Allowed
2. HackLand Election. Waral 博客有更多文章,
3. Primes in SubTree

前两题都很简单没什么，primes我觉得还是有些难度的，分享一下思路。我建了一个node类，包含val和children (List<int>)来记录值和子节点。每对node pair我都在双方的子节点中添加对方，之后从root node做一遍dfs来删除掉多余的边，比如有三个节点1,2,3, pair有1,2和1,3，那我开始就是1的children有23，2's children: 1, 3's children:1. 以1为root做一遍DFS之后，2,3的children list都清空了。这样就把tree构造出来了。. 一亩-三分-地，独家发布
找prime 数目的时候，用DFS，加一个Hashmap存，避免重复工作，注意prime判断的特殊判断1，2.我开始忘加了，只跑过了前三个可见的case,后面hidden全错，连哪里错了都看不见，差点儿爆炸。算是挺暴力的方法，复杂度较高，跑的时候最后一个case险险跑过，差点儿超时。

hhh,刚做完,primes in subtree的题我也是质数判断写错了，没加对于1的特殊判断，跑一下只过了三个可见case,不可见的全跪，瞬间懵逼。看了十分钟终于看出来是质数判断的问题

第一题是一个No pair allowed， 感觉没什么难度。
第二题是Who's the closest，我用的双指针，O（n）的复杂度，不知道为什么有的testcase 过不了。有兴趣的同学，我们可以讨论一下第二 个。
第三题是个prime in tree。里有了，我就不发了.

用了两个map，
第一个map key是字母，value是list，list为该字母出现的index。
第二个map key是index，value也是index，key就是0 到 n - 1， value是 input[key] 的字母在第一个map里面，这个字母对应的list里面index的index。
有点绕。
比如ababa
第一个map里面就是 a, (0, 2, 4)  b (1, 3).
第二map里面是 0, 0 | 1, 0 | 2, 1 | 3, 1 | 4, 2
0位置字母是a，0位置的a在对应list第0位置。所以第一个是0，0
再比如最后一个，4位置还是a， 4位置的a在对应list里面的2位置，所以是4，2
预处理完以后，可以直接连续访问到目标字母，map1.get(input[query])[map2.get(query))].本文原创自1point3acres论坛
再查那个list前后就可以得到答案了。
每个query处理是o(1)的。





 
