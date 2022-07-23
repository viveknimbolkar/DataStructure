package array.problems;
// https://leetcode.com/problems/reverse-prefix-of-word/
public class ReversePrefixofWord {

    String reversePrefix(String word, char ch) {
        String res = "";
        int index = 0;

        // first find the last char to reverse string
        for (int i = 0; i < word.length(); i++) {
            if (ch == word.charAt(i)){
                index = i;
                break;
            }
        }

        // reverse the string upto idx
        for (int i = index; i >= 0; i--) {
            res += word.charAt(i);
        }
        
        // join the string which is remain 
        for (int i = index+1; i < word.length(); i++) {
            res += word.charAt(i);
        }

        return res;
    }

    public static void main(String[] args) {
        ReversePrefixofWord rev = new ReversePrefixofWord();
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(rev.reversePrefix(word,ch));
    }
}
