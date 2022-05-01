package array.problems;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        String num = Integer.toString(x);
//        System.out.println(num);
        char[] temp = num.toCharArray();
        String result = "";

        for (int i = temp.length-1; i >= 0; i--) {
            result += temp[i];
        }
//        System.out.println(result+" "+num);
        if (result == num) return true;
        return false;
    }

    public static void main(String[] args) {
        PalindromeNumber palin = new PalindromeNumber();
        System.out.println( palin.isPalindrome(12154));
    }
}
