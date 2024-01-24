package basicmath;

public class PrimeNumber {

    boolean isPrimeBruteForce(int n){
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0) count++;
        }

        if(count == 2) return true;
        else return false;
    }

    // optimarl
    // TC=O(squrt(n)) SC=O(1)
    boolean isPrimeOptimal(int n){
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n %i == 0) return false;
        }
        System.out.println(4%8);
        return true;
    }
    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        int num = 23;
        System.out.println(primeNumber.isPrimeOptimal(num));
    }
}
