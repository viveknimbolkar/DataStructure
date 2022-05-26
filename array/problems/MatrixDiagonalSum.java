package array.problems;
// https://leetcode.com/problems/matrix-diagonal-sum/
public class MatrixDiagonalSum {
    // select the working of the number for the code in matrix of the name
    // fully working
    int diagonalSum(int[][] mat, boolean brute){
        int sum = 0;
        // only for odd matrix
        if(mat.length % 2 == 1){
            sum+=mat[mat.length/2][mat.length/2];
        }
        // get number from even matrix
        int lastEle = (mat.length-1);
        for (int i = 0; i < (mat.length/2); i++) {
            sum = sum + mat[i][i] + // get first element [0][0]
                  mat[i][lastEle-i] + // get next element [0][1]
                  mat[lastEle-i][i] + // get next element [0][2]
                  mat[lastEle - i][lastEle - i];
        }
        return sum;
    }

    // partially working
    int diagonalSum(int[][] mat) {
        int sum = 0;
        // get top-left to bottom-right diagonal element
        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat[i].length; j++)
                if (i == j) sum+=mat[i][j];

        // get top-right to bottom-left diagonal element
        for (int i = mat.length-1; i >= 0; i--) {
            for (int j = mat[i].length-1; j >= 0; j--) {
                if (i == j) {
                    sum += mat[j][i];
                }
            }
        }

        // subtract middle element if length is odd
        if (mat.length % 2 != 0)
            return sum-mat[mat.length/2][mat.length/2];
        return sum;
    }

    public static void main(String[] args) {
        MatrixDiagonalSum mat = new MatrixDiagonalSum();
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};

        int[][] a = {
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}};

        int[][] b = {
                {7,3,1,9},
                {3,4,6,9},
                {6,9,6,6},
                {9,5,8,5}};

        System.out.println("Diagonal sum is: "+mat.diagonalSum(b,true));
    }
}
