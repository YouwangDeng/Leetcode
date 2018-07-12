//Solution 1 use regular expression
class Solution {
	public boolean checkRecord(String s) {
	    return !s.matches(".*LLL.*|.*A.*A.*");
	}
}
//Solution 2 do not use regular expression
class Solution {
    public boolean checkRecord(String s) {
        int countA=0;
        int continuosL = 0;
        int charA = 'A';
        int charL ='L';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == charA){
                countA++;
                continuosL = 0;//continue trick
            }
            else if(s.charAt(i) == charL){
                continuosL++;
            }
            else{
                continuosL = 0;
            }
            if(countA >1 || continuosL > 2 ){
                return false;
            }
        }
        return true;

    }
}