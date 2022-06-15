package array.string;
// https://leetcode.com/problems/find-first-palindromic-string-in-the-array/
public class FirstPalindrome {

    String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++)
            if (isPalindrome(words[i])) return words[i];
        return "";
    }

    boolean isPalindrome(String str){
        int high = str.length()-1, low = 0;
        while (high > low)
            if (str.charAt(low++) != str.charAt(high--)) return false;
        return true;
    }

    public static void main(String[] args) {
        FirstPalindrome first = new FirstPalindrome();
        String[] data = {"abc","car","ada","racecar","cool"};
        System.out.println(first.firstPalindrome(data));
    }
}
