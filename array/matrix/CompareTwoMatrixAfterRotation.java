package array.matrix;

import java.util.Arrays;

//https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
public class CompareTwoMatrixAfterRotation {

    // Method: 1
    boolean findRotation(int[][] mat, int[][] target, boolean flag) {
        for (int i = 0; i < 4; i++) {
            int[][] rotatedImage = getRotateImage(mat);
            if(Arrays.deepEquals(target,rotatedImage)) return true;
        }
        return false;
    }


    // Method: 2 TODO:(Not working partially)
    boolean findRotation(int[][] mat, int[][] target) {
        // if the length of both matrix is not same then matrix cannot be form
        if (mat.length != target.length) return false;

        // initially check for the default similarity
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] != target[i][j]) return false;
            }
        }

        // if matrix are not similar then go for rotation until we find the similar image (for 3 times)
//        for (int i = 0; i < 3; i++) {
        boolean isSimilar = false;

        while(!isSimilar){
            int[][] rotatedImage = getRotateImage(mat);

            // check for similarity after rotating 90 degree
            for (int j = 0; j < mat.length; j++) {
                for (int k = 0; k < mat[0].length; k++) {
                    if (mat[j][k] != rotatedImage[j][k]){
                        isSimilar = false;
                        break;
                    }

                }
            }
            isSimilar = true;
        }

        return isSimilar;
    }

    // rotate the image by 90 degree for single time
    int[][] getRotateImage(int[][] target){
        // get the transpose of matrix
        for (int i = 0; i < target.length; i++) {
            for (int j = i; j < target[0].length; j++) {
                int temp = target[i][j];
                target[i][j] = target[j][j];
                target[j][j] = temp;
            }
        }

        // rotate the image
        for (int i = 0; i < target.length; i++) {
            for (int j = 0; j < target.length/2; j++) {
                int temp = target[i][j];
                target[i][j] = target[i][target.length-j-1];
                target[i][target.length-j-1] = temp;
            }
        }
        return target;
    }

    public static void main(String[] args) {
        CompareTwoMatrixAfterRotation comp = new CompareTwoMatrixAfterRotation();

        int[][] mat = {
                {0,0,0},
                {0,1,0},
                {1,1,1}
        };

        int[][] target = {
                {1,1,1},
                {0,1,0},
                {0,0,0}
        };

        System.out.println("Can form matrix: "+comp.findRotation(mat,target,true));
    }
}
