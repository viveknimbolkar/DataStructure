package dynamicprog;

//https://leetcode.com/problems/unique-paths/

public class UniquePaths {

    // dynamic approach
    int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for (int i = m-1; i >= 0 ; i--) {
            for (int j = n-1; j >= 0 ; j--) {
                if (i == m-1){
                    // if we are at the last cell of row and col
                    dp[i][j] = 1;
                }else if (j == n-1){
                    // if we are at the last cell of row and col
                    dp[i][j] = 1;
                }else{
                    // store the sum of previous ways
                    dp[i][j] = dp[i+1][j] + dp[i][j+1];
                }
            }
        }

        return dp[0][0];
    }

    public static void main(String[] args) {
        UniquePaths path = new UniquePaths();
        int m = 3, n = 2;
        System.out.println("Unique paths to reach from A to B are: "+path.uniquePaths(m,n));
    }
}
