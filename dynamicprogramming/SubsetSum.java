package dynamicprogramming;

//https://practice.geeksforgeeks.org/problems/subset-sum-problem-1611555638/1
public class SubsetSum {

    Boolean isSubsetSum(int N, int arr[], int sum){
        // if we found subsets
        if(findSubset(N,arr,sum) > 0) return true;
        return false;
    }

    int findSubset(int n, int[] arr, int sum) {
        int[][] dp = new int[n+1][sum+1];

        // initialize col[i][0] = 1
        for (int i = 0; i <= n; i++) dp[i][0] = 1;

        // initialize row[0][i] = 1
        for (int i = 1; i <= sum; i++) dp[0][i] = 0;

        // perform dp
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= sum ; j++) {
                if (j < arr[i-1])
                    dp[i][j] = dp[i-1][j];
                else
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-arr[i-1]];
            }
        }
        return dp[n][sum];
    }

    public static void main(String[] args) {
        SubsetSum subsum = new SubsetSum();
        int N = 6;
        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        System.out.println(subsum.isSubsetSum(N,arr,sum));
    }
}
