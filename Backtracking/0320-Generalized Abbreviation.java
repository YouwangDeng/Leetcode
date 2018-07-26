//Solution 1 backtracking and StringBuilder solution
public class Solution {
    public List<String> generateAbbreviations(String word) {
        List<String> res = new ArrayList<>();
        StringBuilder tmpRes = new StringBuilder();
        char[] wordArray = word.toCharArray();
        dfs(res, tmpRes, wordArray, 0, 0);
        return res;
    }
    
    private void dfs(List<String> res, StringBuilder tmpRes, char[] wordArray, int pos, int numCount) {
        if(pos == wordArray.length) {
            if(numCount > 0) tmpRes.append(numCount);
            res.add(tmpRes.toString());
            return;
        }
        
        // use number
        int len = tmpRes.length();
        dfs(res, tmpRes, wordArray, pos + 1, numCount + 1);
        tmpRes.setLength(len);              // backtracking
        
        // use character
        len = tmpRes.length();
        if(numCount > 0) {
            tmpRes.append(numCount).append(wordArray[pos]);
            dfs(res, tmpRes, wordArray, pos + 1, 0);    
        } else {
            tmpRes.append(wordArray[pos]);
            dfs(res, tmpRes, wordArray, pos + 1, 0);
        }
        tmpRes.setLength(len);              // backtracking
    }
}