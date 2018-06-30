//Solution 1 clear solution 3 scenarios
class Solution {
    // Categorize the self-crossing scenarios, there are 3 of them: 
    // 1. Fourth line crosses first line and works for fifth line crosses second line and so on...
    // 2. Fifth line meets first line and works for the lines after
    // 3. Sixth line crosses first line and works for the lines after
    public boolean isSelfCrossing(int[] x) {
        int l = x.length;
        if(l <= 3) return false;

        for(int i = 3; i < l; i++){
            if(x[i] >= x[i-2] && x[i-1] <= x[i-3]) return true;  //Fourth line crosses first line and onward
            if(i >=4)
            {
                if(x[i-1] == x[i-3] && x[i] + x[i-4] >= x[i-2]) return true; // Fifth line meets first line and onward
            }
            if(i >=5)
            {
                if(x[i-2] - x[i-4] >= 0 && x[i] >= x[i-2] - x[i-4] && x[i-1] >= x[i-3] - x[i-5] && x[i-1] <= x[i-3]) return true;  // Sixth line crosses first line and onward
            }
        }
        return false;
    }
    /*               i-2
        case 1 : i-1┌─┐
                    └─┼─>i
                     i-3

                        i-2
        case 2 : i-1 ┌────┐
                     └─══>┘i-3
                     i  i-4      (i overlapped i-4)

        case 3 :    i-4
                   ┌──┐ 
                   │i<┼─┐
                i-3│ i-5│i-1
                   └────┘
                    i-2

    */
};