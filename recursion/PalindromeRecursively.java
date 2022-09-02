package recursion;

public class PalindromeRecursively {

    // functional recursion
    boolean isPalindrome(int i,String str){
        if (i > str.length()/2) return true;
        if (str.charAt(i) != str.charAt(str.length()-i-1))
            return false;
        return isPalindrome(i+1,str);
    }
    // paramaterized recursion
    boolean isPalindrome(String str, int i){
        if (i > str.length()-1) return true;
        // checking both sides of string each step by step
        if (str.charAt(i) != str.charAt(str.length()-i-1))
            return false;

        return isPalindrome(str,i+1);
    }

    public static void main(String[] args) {
        PalindromeRecursively palin = new PalindromeRecursively();
        System.out.println(palin.isPalindrome(0,"MADAM"));
    }
}
