package array.matrix;
// https://leetcode.com/problems/transpose-matrix/submissions/
public class TransposeMatrix {

    int[][] transpose(int[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        int[][] res = new int[row][col];
        // get col elements
        for (int j = 0; j < col; j++)
            // get row elements
            for (int i = 0; i < row; i++)
                res[j][i] = matrix[i][j];
        return res;
    }
    public static void main(String[] args) {
        TransposeMatrix trans = new TransposeMatrix();
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] transpose = trans.transpose(matrix);

        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

    }
}
