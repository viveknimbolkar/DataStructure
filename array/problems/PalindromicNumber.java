package array.problems;
//https://leetcode.com/problems/palindrome-number/
public class PalindromicNumber {

    boolean isPalindrome(int x) {
        String num = Integer.toString(x);
        char[] numArr = num.toCharArray();

        int i = 0, j = numArr.length-1;

        while (i < j){
            if (numArr[i] != numArr[j]) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromicNumber palinNumber = new PalindromicNumber();
        int num = 121;
        System.out.println("is palindromic number: "+palinNumber.isPalindrome(num));
    }
}
