package basicmath;

public class ReverseNumber {

    int reverseNumber(int n){
        int revNum = 0;
        while (n > 0){
            int lastDigit = n % 10;
            revNum = revNum * 10 + lastDigit;
            n /= 10;
        }
        return revNum;
    }

    public static void main(String[] args) {
        ReverseNumber rev = new ReverseNumber();
        int num =  34523;
        System.out.println(rev.reverseNumber(num));
    }
}
