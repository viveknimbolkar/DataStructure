package recursion;

public class PalindromeRecursively {

    boolean isPalindrome(String str, int i){
        if (i > str.length()-1) return true;
        // checking both sides of string each step by step
        if (str.charAt(i) != str.charAt(str.length()-i-1))
            return false;

        return isPalindrome(str,i+1);
    }

    public static void main(String[] args) {
        PalindromeRecursively palin = new PalindromeRecursively();
        System.out.println(palin.isPalindrome("MADAM",0));
    }
}
