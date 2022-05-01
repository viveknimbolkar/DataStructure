package backtracking;

import predefined.Print2DArray;

public class NQueen {

    // check if the current position for queen is safe or not
    boolean isSafe(int[][] arr, int x, int y, int n){
        // check if a col already having any queen
        for (int row = 0; row < x; row++) {
            // if any queen already placed at arr[i]
            if (arr[row][y] == 1){
                return false;
            }
        }

        // check for diagonal presence of queen

        // check for recent left upper diagonal place
        int row = x;
        int col = y;
        while (row >= 0 && col >= 0){

            if (arr[row][col] == 1){
                return false;
            }
            row--;
            col--;
        }

        // check for next right upper diagonal place
        row = x;
        col = y;
        while (row >= 0 && col < n){

            if (arr[row][col] == 1){
                return false;
            }
            row--;
            col++;
        }
        return true;
    }

    boolean nQueen(int[][] arr, int x, int n){
        // if we placed n queen on their safe position
        if (x >= n){
            return true;
        }

        // current position of every col and row is safe or not
        for (int col = 0; col < n; col++) {
            if (isSafe(arr,x,col,n)){
                arr[x][col] = 1;
                // check for next queen arrangement of queens
                if (nQueen(arr,x+1,n)){
                    return true;
                }
                arr[x][col] = 0; // backtracking
            }
        }
        return false;
    }


    public static void main(String[] args) {
        NQueen nQueen = new NQueen();
        int n = 4;
        int[][] arr = new int[n][n];

        // initialize all values of array as zero
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = 0;
            }
        }
        // print array if all the queens are placed to the safe position
        if (nQueen.nQueen(arr,0,n))
            Print2DArray.printArray(arr);

    }
}
