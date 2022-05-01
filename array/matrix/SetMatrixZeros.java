package array.matrix;
// https://www.codingninjas.com/codestudio/problems/set-matrix-zeros_3846774?topList=striver-sde-sheet-problems&leftPanelTab=0
public class SetMatrixZeros {

    void setZeros(int matrix[][]) {
        boolean row = false, col = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0){
                    if (i == 0) row = true;
                    if (j == 0) col = true;
                    //set the first cell of row and col of m[i][j] to  zero
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // set next cell of that chosen row and col to zero
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
        }

        // set all the row and col to zero
        if (col)
            for (int i = 0; i < matrix.length; i++)
                matrix[i][0] = 0;

        if (row)
            for (int j = 0; j < matrix[0].length; j++)
                matrix[0][j] = 0;

    }

    public static void main(String[] args) {
        SetMatrixZeros setMat = new SetMatrixZeros();
        int[][] matrix = {
            {7, 19, 3},
            {4, 21, 0},
            {45, 6, 8}
        };
        setMat.setZeros(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
