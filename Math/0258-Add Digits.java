//Solution 1 pure math formula
class Solution {
    public int addDigits(int num) {
        return 1 + (num - 1) % 9;
    }
}
//Solution 2 iteration must understand
class Solution {
    public int addDigits(int num) {
        while(num >= 10){
            int temp = 0;
            while(num > 0) {
                temp += num % 10;
                num /= 10;
            }     
            num = temp;
        }    
        return num;
    }
}