//Solution 1 middle seat
class Solution {
    public int maxDistToClosest(int[] seats) {
        int j = -1, maxDist = 0;
        for (int i = 0; i < seats.length; ++i) {
            if (seats[i] == 1) {
                if (j != -1) {
                    maxDist = Math.max(maxDist, (i - j) / 2); //Get middle point between two taken seats
                }
                else {
                    maxDist = i; 
                }
                j = i;
            }
            else if (i == seats.length - 1) {
                maxDist = Math.max(maxDist, i - j); //Get distance between last taken seat to index n - 1
            }
        }
        return maxDist;
    }
}