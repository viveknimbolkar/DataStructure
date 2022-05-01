package array.string;
// https://practice.geeksforgeeks.org/problems/palindrome-string0817/1/#
public class PalindromeString {

    boolean isPalindrome(String str){
        int low = 0, high = str.length()-1;
        while (high > low){
            if (str.charAt(low++) != str.charAt(high--))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeString palin = new PalindromeString();
        String str = "MADAM";

        System.out.println("Is "+str+" palindrome: "+palin.isPalindrome(str));
    }
}
