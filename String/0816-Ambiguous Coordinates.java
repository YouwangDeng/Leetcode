//Solution 1 count the scenarios and iterate
class Solution {
    public List<String> ambiguousCoordinates(String S) {
        int n = S.length();
        List<String> res = new ArrayList();
        for (int i = 1; i < n - 2; i++) {
            List<String> A = f(S.substring(1, i + 1)), B = f(S.substring(i + 1, n - 1));
            for (String a : A) for (String b : B) res.add("(" + a + ", " + b + ")");
        }
        return res;
    }
    public List<String> f(String S) {
        int n = S.length();
        List<String> res = new ArrayList();
        if (n == 0 || (n > 1 && S.charAt(0) == '0' && S.charAt(n - 1) == '0')) return res;
        if (n > 1 && S.charAt(0) == '0') {
            res.add("0." + S.substring(1));
            return res;
        }
        res.add(S);
        if (n == 1 || S.charAt(n - 1) == '0') return res;
        for (int i = 1; i < n; i++) res.add(S.substring(0, i) + '.' + S.substring(i));
        return res;
    }
}