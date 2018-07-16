//Solution 1 use binary search to find the target
class Solution {
    
    public int search(ArrayReader reader, int target) {
        
        int end = findPossibleRange(reader, target);
        return binarySearch(0, end, reader, target);
        
    }
    
    private int findPossibleRange(ArrayReader reader, int target) {
        
        int i = 1;
        while(reader.get(i) < target || reader.get(i) < 10000) {
            i *= 2;
        }
        
        return i + 1;
    }
    
    private int binarySearch(int start, int end, ArrayReader reader, int target) {
        
        int st = start;
        int en = end;
        while(st < en) {
            int mid = st + (en - st) / 2;
            if(reader.get(mid) == target) {
                return mid;
            } else if(reader.get(mid) < target) {
                st = mid + 1;//key point
            } else {
                en = mid;//key point
            }
        }
        
        return -1;

    }
}