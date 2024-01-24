package basicmath;

public class PalindromeNumber {

    boolean isPalindrome(int num){
        int revNum = 0;
        int temp = num;
        while ( temp != 0){
            revNum = (revNum*10) + (temp % 10);
            temp /= 10;
        }
        return revNum == num;
    }
    public static void main(String[] args) {
        PalindromeNumber palin = new PalindromeNumber();
        System.out.println("ispalindrome "+palin.isPalindrome(121));
    }
}
