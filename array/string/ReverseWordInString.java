package array.string;
//https://leetcode.com/problems/reverse-words-in-a-string/
public class ReverseWordInString {

    String reverseWords(String s) {
        String ans = "";
        // remove multipla white spaces
        String[] cleanString = s.trim().replaceAll(" +"," ").split(" ");
        for (int i = cleanString.length-1; i >= 0; i--) {
            if (i == 0) return ans+=cleanString[i]; // in the last word don't add up space at the end of sentence
            ans += cleanString[i] + " ";

        }
        return ans;
    }

    public static void main(String[] args) {
        ReverseWordInString rev = new ReverseWordInString();
        String s = "the sky is blue";
        String s1 = "  hello world  ";
        String s2 = "a good   example";
        System.out.println(rev.reverseWords(s2));
    }
}
