//Solution 1 logic matters 
class Solution {
    public int[] constructArray(int n, int k) {
        int[] res = new int[n];
        for (int i = 0, l = 1, r = n; l <= r; i++) {
            res[i] = k > 1 ? (k-- % 2 != 0 ? l++ : r--) : l++;
        }
        return res;
    }
}
//Solution 2 more clear implemention
class Solution {
    public int[] constructArray(int n, int k) {
        if(k >= n) return null;
        int[] arr = new int[n];
        int i = 0, small = 1, large = n;        
        while(i<k) { 
            arr[i++] = small++;
            if(i<k) arr[i++] = large--;
        }        
        if(k % 2 == 0) { // k==2 ==> 1, 6, 5,4,3,2
            while(i<arr.length) arr[i++] = large--;
        } else { // k==3 ==> 1,6,2,3,4,5
            while(i<arr.length) arr[i++] = small++;
        }
        return arr;
    }
}