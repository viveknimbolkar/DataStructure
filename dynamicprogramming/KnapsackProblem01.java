package dynamicprogramming;

import java.util.Arrays;

//https://practice.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1
public class KnapsackProblem01 {

    // memoize solution
    int knapSackMemoize(int W, int wt[], int val[], int n){
        int[][] dp = new int[n+1][W+1];
        // initialized arrays with -1
        for (int[] row: dp)
            Arrays.fill(row,-1);
        return knapSackMemoizeUtil(W,wt,val,n,dp);
    }

    int knapSackMemoizeUtil(int W, int wt[], int val[], int n, int[][] dp){

        if (W == 0 || n == 0) return 0;

        // if the value is already calculated then break process of calculation
        if (dp[n][W] != -1) return dp[n][W];

        // now recursively estimate or choose wt with profit
        if (wt[n-1] > W) return dp[n][W] = knapSackMemoizeUtil(W,wt,val,n-1, dp);
        else return dp[n][W] = Math.max(val[n-1]+knapSackMemoizeUtil(W-wt[n-1],wt,val,n-1, dp),knapSackMemoizeUtil(W,wt,val,n-1, dp));

    }

    // recursive solution
    int knapSackRecursive(int W, int wt[], int val[], int n) {
        if (W == 0 || n == 0) return 0;

        // if current weight is less than the wt of bag
        if (wt[n-1] <= W)
                            // choosing to add into bad                     // not choosed to add
            return Math.max(val[n-1]+knapSackRecursive(W-wt[n-1],wt,val,n-1), knapSackRecursive(W,wt,val,n-1));
         else if (wt[n-1] > W)
            return knapSackRecursive(W,wt,val,n-1);

        return 0;
    }
    
    public static void main(String[] args) {
        KnapsackProblem01 knap = new KnapsackProblem01();
        int n = 3 ,W = 4;
        int[] values = {1,2,3};
        int[] weight = {4,5,1};

        System.out.println("Max total value: "+knap.knapSackMemoize(W,weight,values,n));
    }
}
