//Solution 1 use Array to mark visited values
class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] numbers = new int[10];
        for (int i = 0; i<secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) bulls++;
            else {
                if (numbers[secret.charAt(i)-'0']++ < 0) cows++;//key point
                if (numbers[guess.charAt(i)-'0']-- > 0) cows++;//key point
            }
        }
        return bulls + "A" + cows + "B";
    }
}