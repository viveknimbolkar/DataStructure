package array.matrix;
//https://leetcode.com/problems/largest-local-values-in-a-matrix/
public class LargestLocalValuesInAMatrix {

    int[][] largestLocal(int[][] grid) {
        int[][] ans = new int[grid.length-2][grid.length-2];
        int ansLen = ans.length;

        // traverse upto n-2 times
        // traverse rows
        for (int i = 0; i < ansLen; i++) {
            // traverse cols
            for (int j = 0; j < ansLen; j++) {
                int largestYet = Integer.MIN_VALUE;
                // get the current 3x3 block row
                for (int k = i; k < i+3; k++) {
                    //get the current 3x3 block cols
                    for (int l = j; l < j+3; l++) {
                        largestYet = Math.max(largestYet,grid[k][l]);
                    }
                }
                ans[i][j] = largestYet;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        LargestLocalValuesInAMatrix lar = new LargestLocalValuesInAMatrix();
        int[][] grid = {
                {9, 9, 8, 1},
                {5, 6, 2, 6},
                {8, 2, 6, 4},
                {6, 2, 2, 2}};
        int[][] max = lar.largestLocal(grid);

        for (int i = 0; i < max.length; i++) {
            for (int j = 0; j < max[i].length; j++) {
                System.out.print(max[i][j] + " ");
            }
            System.out.println();
        }

    }
}
