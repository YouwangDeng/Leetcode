//Solution 1 use Array clear logic solution
class Solution {
    public int hIndex(int[] citations) {
        int length = citations.length;
        if (length == 0) {
        	return 0;
        }
        
        int[] array2 = new int[length + 1];
        for (int i = 0; i < length; i++) {
        	if (citations[i] > length) {
        		array2[length] += 1;
        	} else {
        		array2[citations[i]] += 1;
        	}
        }
        int t = 0;
        int result = 0;

        for (int i = length; i >= 0; i--) {
        	t = t + array2[i];
        	if (t >= i) {
        		return i;
        	}
        }
        return 0;
    }
}