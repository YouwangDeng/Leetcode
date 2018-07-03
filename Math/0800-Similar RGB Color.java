//Solution 1 char manipulation
class Solution {
    public String similarRGB(String color) {
        StringBuilder sb = new StringBuilder(color.length());
        sb.append("#");
        for (int i = 1; i < color.length(); i += 2){
            sb.append(getHexDigits(color.charAt(i), color.charAt(i + 1)));
        }
        return sb.toString();
    }

    private String getHexDigits(char c1, char c2){
        int d1 = Character.isDigit(c1)? c1 - '0': 10 + c1 - 'a';
        int d2 = Character.isDigit(c2)? c2 - '0': 10 + c2 - 'a';

        int sum       = d1 * 16 + d2;
        int index     = sum / 17; // [ 0x00(0) , 0x11(17), 0x22(34),  0x33(51), ........., 0xff(255) ]
        int remainder = sum % 17;
        if (remainder > 17 / 2){
            index++;
        }

        char c = 0 <= index && index <= 9? (char)('0' + index): (char)('a' + index - 10);
        return String.valueOf(c) + String.valueOf(c);
    }
}