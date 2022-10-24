package backtracking;

public class FibonacciSeries {

    void fib(int a, int b,int n){
        if (n == 0) return;
        int c = a+b;
        System.out.print(c+" ");
        fib(b,c,n-1);
    }

    int fib(int n){
        if (n<=1) return n;
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        FibonacciSeries series = new FibonacciSeries();
        int n = 5;
        series.fib(0,1,n);
    }
}
