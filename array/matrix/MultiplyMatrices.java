package array.matrix;

import predefined.PredefinedMethods;

public class MultiplyMatrices {

    PredefinedMethods methods = new PredefinedMethods();

    void multiply(int[][] A, int[][] B, int[][] C, int N){
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.println(A[i][j]);
            }
        }



//        methods.print2DArray(C);

    }

    public static void main(String[] args) {
        MultiplyMatrices multiplyMatrices = new MultiplyMatrices();
        int[][] a = {
                {7, 8},
                {2 , 9}};
        int[][] b = {
                {14, 5},
                {5, 18}};

        int[][] c = new int[2][2];

        multiplyMatrices.multiply(a,b,c,2);
    }
}
