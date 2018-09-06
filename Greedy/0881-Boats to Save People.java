//Solution 1 sort and two pointers
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        for (int i = 0, int j = people.length - 1; i <= j; j--)
            if (people[i] + people[j] <= limit) i++;
        return people.length - 1 - j;
    }
}