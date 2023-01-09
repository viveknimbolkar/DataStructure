package array.matrix;

import java.util.Arrays;

//https://practice.geeksforgeeks.org/problems/maximum-no-of-1s-row3027/1
public class MaximumNoOfOneRow {

     int maxOnes (int Mat[][], int N, int M) {
        int max = Integer.MIN_VALUE, maxRow = -1;
        int[] track = new int[N];
         for (int i = 0; i < N; i++) {
             track[i] = getOnce(Mat[i]);
             if (getOnce(Mat[i]) > max){
                 maxRow = i;
                 max = getOnce(Mat[i]);
             }
         }

         return maxRow;
    }

    int getOnce(int[] arr){
         int totalOnes = 0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == 1) totalOnes++;
        }
        return totalOnes;
    }

    public static void main(String[] args) {
        MaximumNoOfOneRow maxrow = new MaximumNoOfOneRow();
        int[][] mat = {{0, 1, 1, 1},
            {0 ,0 ,1, 1},
            {0, 0 ,1, 1}};
        int N = mat.length, M = mat[0].length;
        System.out.println(maxrow.maxOnes(mat,N,M));
    }
}
