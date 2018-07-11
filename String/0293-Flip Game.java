//Solution 1 use indexOf and substring methods short solution
class Solution {
    public List<String> generatePossibleNextMoves(String s) {
        List list = new ArrayList();
        for (int i=-1; (i = s.indexOf("++", i+1)) >= 0; )
            list.add(s.substring(0, i) + "--" + s.substring(i+2));
        return list;
    }
}