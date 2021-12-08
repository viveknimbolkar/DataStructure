package array.matrix;

public class AdditionOfMatrixElement {

    int getAddition(int[][] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        AdditionOfMatrixElement addingTwoSquareMatrix = new AdditionOfMatrixElement();
        int[][] a ={
                {1,0,1},
                {-8,9,-2}
        };

        System.out.println(addingTwoSquareMatrix.getAddition(a));
    }
}
