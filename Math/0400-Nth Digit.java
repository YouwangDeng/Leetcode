//Solution 1 
class Solution {
    /*
    2886 - 9 - 9 * 10 * 2 = 2697 < 9*10*10*3 = 2700
    那么target 就落在了区域3中( 100- 999 )

    我们知道区域3 是由3bit的数组成的
    所以target数是以 100 为起始数，(2697 - 1)/3 = 898 为100以后的数
    target 数 = 100 + 898 = 998
    (2697-1) % 3 = 2 就是 998 的target bit 
    target bit = 998.charAt( 2 ) = 8;

    解题思路
    2886 = 9*1 + 90 * 2 + 2697
    */
    public int findNthDigit(int n) {
        int start = 1;
        int len = 1;
        long base = 9;
        while( n > len * base ){    //判断n落在的区间
            n = n - len * (int)base;     
            len++;              //len 用来记录target 数的长度
            start *= 10;        //循环的时候不用，后面用来重组target 数
            base *= 10;
        }
        int target = start + (n - 1)/len;   //减1是因为start 自己算一个数，要把start 从计算中抠掉
        int reminder = (n - 1)%len;         //在target 中的位置
        return Character.getNumericValue( Integer.toString(target).charAt(reminder) );
    }
}