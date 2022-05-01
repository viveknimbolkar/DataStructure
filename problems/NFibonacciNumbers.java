package problems;

public class NFibonacciNumbers {

    long[] fib(int n){
        int a = 0, b = 1, c;
        long[] result = new long[n];
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
            result[i] = c;
        }

       return result;
    }

    public static void main(String[] args) {
        NFibonacciNumbers num = new NFibonacciNumbers();
        int n = 7;
        long[] result = num.fib(n);
        for (long x:result) {
            System.out.print(x+" ");
        }
    }
}
