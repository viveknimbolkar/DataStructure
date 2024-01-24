package basicmath;

public class CountDigit {

    int countDigit(int n){
        int count = 0;

        while(n != 0){
            int remainder = n % 10;
            count++;
            n /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        CountDigit countDigit = new CountDigit();
        int digit = 336;
        System.out.println(countDigit.countDigit(digit));
    }
}
