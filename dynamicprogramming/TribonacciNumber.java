package dynamicprogramming;
//https://leetcode.com/problems/n-th-tribonacci-number/
public class TribonacciNumber {

    // Method-1: (single) Dynamic programming
    int tribonacci(int n) {
        // base case
        if(n <= 1) return n;
        int[] dp = new int[n+1];
        // initialize dp values
        dp[0] = 0; dp[1] = 1; dp[2] = 1;

        // start assigining values
        for (int i = 3; i <= n; i++)
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3];


        // final answer at last index
        return dp[n];
    }

    public static void main(String[] args) {
        TribonacciNumber tri = new TribonacciNumber();
        int n = 25;
        System.out.println(tri.tribonacci(n));
    }
}
