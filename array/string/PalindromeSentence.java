package array.string;
//https://leetcode.com/problems/valid-palindrome/
public class PalindromeSentence {

    boolean isPalindrome(String s) {
        char[] sentence = s.toCharArray();
        String temp = new String(sentence);
        System.out.println(temp);
        return false;
    }

    public static void main(String[] args) {
        PalindromeSentence palin = new PalindromeSentence();
        String s = "A man, a plan, a canal: Panama";
        System.out.println(palin.isPalindrome(s));
    }
}
