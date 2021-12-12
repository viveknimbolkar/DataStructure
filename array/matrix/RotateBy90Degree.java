package array.matrix;

import predefined.PredefinedMethods;

// https://practice.geeksforgeeks.org/problems/rotate-by-90-degree-1587115621/1#
public class RotateBy90Degree {

    PredefinedMethods methods = new PredefinedMethods();

    void roateBy90Degree(int[][] arr, int n){
        int[][] tempArr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tempArr[i][j] = arr[i][j];
            }
        }

        int a=n-1;
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < arr[0].length; l++) {
                arr[k][l] = tempArr[l][a];
            }
            a--;
        }

    }

    public static void main(String[] args) {
        RotateBy90Degree rotateMatrix = new RotateBy90Degree();
        int matrix[][] = {{1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};

        rotateMatrix.roateBy90Degree(matrix,matrix.length);
    }
}
