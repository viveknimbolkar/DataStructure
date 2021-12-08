package array.matrix;

public class DeterminantOfMatrix {

    int findDeterminant(int[][] arr){
        return 1;
    }

    public static void main(String[] args) {
        DeterminantOfMatrix determinant = new DeterminantOfMatrix();
        int[][] a = {
                {1,0,2,-1},
                {3,0,0,5},
                {2,1,4,-3},
                {1,0,5,0}
        };

        System.out.println(determinant.findDeterminant(a));
    }
}
