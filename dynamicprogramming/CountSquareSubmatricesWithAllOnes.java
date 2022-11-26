package dynamicprogramming;
//https://leetcode.com/problems/count-square-submatrices-with-all-ones/
public class CountSquareSubmatricesWithAllOnes {

    // dp solution
    int countSquares(int[][] matrix) {
        int col = matrix[0].length;
        int row = matrix.length;
        int sum = 0;
        int[][] dp = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // initialization
                if (i == 0 || j == 0) dp[i][j] = matrix[i][j];
                else if (matrix[i][j] == 1) {
                    // if we found 1
                    if (dp[i-1][j] >= 1 && dp[i][j-1] >= 1 && dp[i-1][j-1] >= 1) {
                        // if all the left, top and diagonal element are >= 1
                        // previous squares and itself 1, hence add 1 at the end of formula
                        dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i-1][j],dp[i][j-1]))+1;
                    }else {
                        dp[i][j] = 1;
                    }
                }
                // keep track of recent squares found
                sum += dp[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        CountSquareSubmatricesWithAllOnes count = new CountSquareSubmatricesWithAllOnes();
        int[][]  matrix = {
                        {0,1,1,1},
                        {1,1,1,1},
                        {0,1,1,1}};

        System.out.println("TOtal squares of 1: "+count.countSquares(matrix));
    }
}
