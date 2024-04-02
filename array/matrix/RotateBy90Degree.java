package array.matrix;

import predefined.PredefinedMethods;
//https://www.youtube.com/watch?v=Y72QeX0Efxw&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=16
//https://leetcode.com/problems/rotate-image/
// https://practice.geeksforgeeks.org/problems/rotate-by-90-degree-1587115621/1#
public class RotateBy90Degree {

    PredefinedMethods methods = new PredefinedMethods();

    //Method-1: Brute Force
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

//    Method-2:
    void rotate(int[][] matrix) {
        // transpose of matrix
        for(int i = 0; i < matrix.length; i++){
            for(int j = i; j < matrix[0].length; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // rotating image
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length/2; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }

    }

    // method 3 using dummy matrix
    // T=O(n^2) Space=O(n^2)
    int[][] usingDummyMatrix(int[][] mat){
        int n = mat.length;
        int[][] rotated = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n-i-1] = mat[i][j];
            }
        }
        return rotated;
    }

    public static void main(String[] args) {
        RotateBy90Degree rotateMatrix = new RotateBy90Degree();
        int matrix[][] = {{1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};

        int ans[][] = rotateMatrix.usingDummyMatrix(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
