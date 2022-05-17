package stack;
// https://leetcode.com/problems/reverse-words-in-a-string-iii
public class ReverseWordsInSentence {

    String reverseWords(String s) {
        String[] strArr = s.split(" ");
        StringBuilder result = new StringBuilder(s.length());

        // take each string one by one and reverse it
        for (int i = 0; i < strArr.length; i++) {
            // reverse a current string
            int j = 0;
            for (j = 0; j < strArr[i].length(); j++) {
                result.append(strArr[i].charAt(strArr[i].length()-j-1));
            }

            if (j < s.length()-2){
                result.append(" ");
                j++;
            }

        }
        return result.toString();
    }

    public static void main(String[] args) {
        ReverseWordsInSentence reverseWordsInSentence = new ReverseWordsInSentence();
        String str = "Let's take LeetCode contest";
        System.out.println(reverseWordsInSentence.reverseWords(str));

    }
}
