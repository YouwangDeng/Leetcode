//Solution 1 clear solution O(n)
class Solution {
    public int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE, min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max3 = max2;
                max2 = n;
            } else if (n > max3) {
                max3 = n;
            }

            if (n < min1) {
                min2 = min1;
                min1 = n;
            } else if (n < min2) {
                min2 = n;
            }
        }
        return Math.max(max1*max2*max3, max1*min1*min2);
    }
}
//Solution 2 use PriorityQueue slower
class Solution {
    public int maximumProduct(int[] nums) {
        PriorityQueue<Integer> poheap = new PriorityQueue<>();
        PriorityQueue<Integer> neheap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : nums) {
            poheap.offer(num);
            neheap.offer(num);
            if (poheap.size() > 3) {
                poheap.poll();
            }
            if (neheap.size() > 2) {
                neheap.poll();
            }
        }
        int c1 = 1;
        int max = 0;
        while (!poheap.isEmpty()) {
            max = poheap.poll();
            c1 *= max;
        }
        while (!neheap.isEmpty()) {
            max *= neheap.poll();
        }
        return Math.max(c1, max);
    }
}