//Solution 1 use HashSet and StringBuilder
class Solution {
    public static final Character[] vowelsList = new Character[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
    public static final HashSet<Character> vowels = new HashSet<Character>(Arrays.asList(vowelsList));
    
    public String toGoatLatin(String S) {
        if(S == null || S.length() == 0) {
            return "";
        }
        StringBuilder answer = new StringBuilder();
        int wordIndex = 1;
        
        for (String word : S.split(" ")) {
            if (wordIndex != 1) {
                answer.append(" ");
            }
            char firstCharacter = word.charAt(0);
            if (vowels.contains(firstCharacter)) {
                answer.append(word);
            } else {
                answer.append(word.substring(1));
                answer.append(firstCharacter);
            }
            answer.append("ma");
            for (int i = 0; i < wordIndex; i++) {
                answer.append("a");
            }
            wordIndex++;
        }
        
        return answer.toString();
    }
}