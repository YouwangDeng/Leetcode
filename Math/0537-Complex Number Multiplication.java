//Solution 1 pure math and use Stream and mapToInt and split
class Solution {
    public String complexNumberMultiply(String a, String b) {
        int[] coefs1 = Stream.of(a.split("\\+|i")).mapToInt(Integer::parseInt).toArray(), 
              coefs2 = Stream.of(b.split("\\+|i")).mapToInt(Integer::parseInt).toArray();
        return (coefs1[0]*coefs2[0] - coefs1[1]*coefs2[1]) + "+" + (coefs1[0]*coefs2[1] + coefs1[1]*coefs2[0]) + "i";
    }
}
//Solution 2 use less method
class Solution {
    public String complexNumberMultiply(String a, String b) {
        int[] valA = getValue(a);
        int[] valB = getValue(b);
        
        int real = valA[0] * valB[0] - valA[1] * valB[1];
        int img = valA[0] * valB[1] + valA[1] * valB[0];
        
        return real + "+" + img + "i";
    }
    
    private int[] getValue(String s) {
        String[] str = s.split("\\+");
        int[] val = new int[2];
        val[0] = Integer.valueOf(str[0]);
        int indexOfI = str[1].indexOf("i");
        val[1] = Integer.valueOf(str[1].substring(0, indexOfI));
        
        return val;
    }
}