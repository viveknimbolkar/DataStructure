package array.matrix;

import java.util.Arrays;

//https://leetcode.com/contest/weekly-contest-323/problems/delete-greatest-value-in-each-row/
public class DeleteGreatestValueInEachRow {

    public int deleteGreatestValue(int[][] grid) {
        int ans = 0;

       int n = grid.length;
       int m = grid[0].length;

        for (int i = 0; i < n; i++) {
            int[] tempArr = grid[i].clone();
            Arrays.sort(tempArr);
            // create sorted row
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = tempArr[j];
            }
        }



        for (int i = 0; i <m; i++) {
            int maxi = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                maxi = Math.max(maxi,grid[j][i]);
            }
            ans += maxi;
        }

        return  ans;
    }

    public static void main(String[] args) {
        DeleteGreatestValueInEachRow del = new DeleteGreatestValueInEachRow();
        int[][] grid = {
                {1,2,4},
                {3,3,1}
        };

        System.out.println("ans = "+del.deleteGreatestValue(grid));
    }
}
