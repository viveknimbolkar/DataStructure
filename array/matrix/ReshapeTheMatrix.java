package array.matrix;

public class ReshapeTheMatrix {

    int[][] matrixReshape(int[][] mat, int r, int c) {
        // if row and cols of the mat not match then resutn null because we can not create mat of wrong r*c
        if(mat.length*mat[0].length != r*c) return null;
        int[][] ans = new int[r][c];

        // start arranging the items from mat to ans matric
        int col = 0, row = 0; // this ptr used in every iteration with respect of ans matrix
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                ans[row][col] = mat[i][j];
                col++;
                // if we reach at the end of col in i'th row then set col=0 and increment row++
                if (col == c){
                    col = 0;
                    row++;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        ReshapeTheMatrix reshape = new ReshapeTheMatrix();
        int[][] mat = {{1,2},{3,4}};
        int r = 1, c = 4;
        int[][] ans = reshape.matrixReshape(mat,r,c);

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
