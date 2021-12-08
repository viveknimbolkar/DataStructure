package array.matrix;

import predefined.PredefinedMethods;

public class AddingTwoSquareMatrix {

    int[][] findAddition(int[][] a, int[][] b){
        int[][] tempArr = new int[a.length][b.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                tempArr[i][j] = a[i][j]+b[i][j];
            }
        }
        return tempArr;
    }

    public static void main(String[] args) {
        AddingTwoSquareMatrix addTwoMatrix = new AddingTwoSquareMatrix();
        PredefinedMethods pre = new PredefinedMethods();
        int[][] a = {
                {1, 2},
                {3, 4}
        };
        int[][] b = {
                {4, 3},
                {2, 1}
        };

        pre.print2DArray(addTwoMatrix.findAddition(a,b));



    }
}
