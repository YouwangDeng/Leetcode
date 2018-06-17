//Solution 1 concise solution insert to intervals
class Solution {
    //example ACCCEEE 2
    //CEACE CE
    public int leastInterval(char[] tasks, int n) {
        int[] c = new int[26];
        for(char t : tasks){
            c[t - 'A']++;
        }
        Arrays.sort(c);
        int i = 25;
        while(i >= 0 && c[i] == c[25]) i--;
        return Math.max(tasks.length, (c[25] - 1) * (n + 1) + 25 - i);
    }
}
//Solution 2 no sort
class Solution {
    public int leastInterval(char[] tasks, int n) {
        int len = tasks.length;
        int[] count = new int[26];
        int max = 0, maxNum = 0;
        for (char c : tasks) {
            count[c - 'A']++;
            if (count[c - 'A'] > max) {
                max = count[c - 'A'];
                maxNum = 1;
            } else if (count[c - 'A'] == max) {
                maxNum++;
            }
        }
        return Math.max(len, (max - 1) * (n + 1) + maxNum);
    }
}