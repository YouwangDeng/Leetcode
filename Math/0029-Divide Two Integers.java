//Solution 1 use bit manipulations
class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor==0||dividend==Integer.MIN_VALUE&&divisor==-1) return Integer.MAX_VALUE;
        int res=0;
        int sign=(dividend<0)^(divisor<0)?-1:1;
        long dvd=Math.abs((long)dividend);
        long dvs=Math.abs((long)divisor);
        while(dvs<=dvd){
            long temp=dvs,mul=1;
            while(dvd>=temp<<1){//key point temp was not changed
                temp<<=1;mul<<=1;
            }
            dvd-=temp;res+=mul;
        }
        return sign==1?res:-res;
    }
}