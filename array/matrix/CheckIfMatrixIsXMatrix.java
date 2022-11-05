package array.matrix;
//https://leetcode.com/problems/check-if-matrix-is-x-matrix/
public class CheckIfMatrixIsXMatrix {

    boolean checkXMatrix(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                // get middle side elements
                if (i == j || i+j == grid.length-1){
                    if (grid[i][j] == 0) return false;
                } else if (grid[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CheckIfMatrixIsXMatrix mat = new CheckIfMatrixIsXMatrix();
        int[][] grid = {
                {2,0,0,1},
                {0,3,1,0},
                {0,5,2,0},
                {4,0,0,2}
        };
        System.out.println(mat.checkXMatrix(grid));
    }
}
