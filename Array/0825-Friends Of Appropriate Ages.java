//Solution 1 math O(n)
class Solution {
    public int numFriendRequests(int[] ages) {
        int count = 0, count_ages[] = new int[121], count_no_more_than_ages[] = new int[121];         
        for(int age: ages) count_ages[age]++; 
        for(int ageA = 15; ageA<=120; ageA++){ //only older can sent request to younger or peer         
            count_no_more_than_ages[ageA]=count_ages[ageA]+count_no_more_than_ages[ageA-1];
            if(count_ages[ageA]==0) continue;
            //count_no_more_than_ages[ageA]-count_no_more_than_ages[ageA/2+7] is the number of younger or peer <= ageA
            //-1 means people can't sent request to himself
            count+=count_ages[ageA]*(count_no_more_than_ages[ageA]-count_no_more_than_ages[ageA/2+7]-1);
        }
        return count;
    }
}