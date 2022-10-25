package backtracking;
//https://practice.geeksforgeeks.org/problems/fibonacci-series-up-to-nth-term/1
public class FibonacciSeriesUpToNthTerm {

    long[] series(int n) {
        long[] ans = new long[n+1];
        long a = 0;
        long b = 1;
        long c = 0;
        ans[0] = a;
        ans[1] = b;
        for (int i = 2; i <= n; i++) {
            c = a+b;
            ans[i] = c;
            a = b;
            b = c;
        }
      return ans;

    }


    public static void main(String[] args) {
        FibonacciSeriesUpToNthTerm fibn = new FibonacciSeriesUpToNthTerm();
        int n = 5;
        for (long data: fibn.series(n))
            System.out.print(data+" ");
    }

}
