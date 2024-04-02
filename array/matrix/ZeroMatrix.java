package array.matrix;

import java.util.ArrayList;
import java.util.Arrays;

//https://www.codingninjas.com/studio/problems/zero-matrix_1171153?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems
public class ZeroMatrix {

    // brute force
    // T = O(n*m)+(n+m) S = O(1)
    ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix) {

        // collect all the zero position in matrix data structure
        for(int i = 0; i < matrix.size(); i++){
            ArrayList<Integer> row = matrix.get(i);
            System.out.println("rows "+matrix.size());
            System.out.println("cols "+row.size());
            for(int j = 0; j < row.size(); j++){
                if(row.get(j) == 0){
                   // update row to -1
                    for (int r = 0; r < row.size(); r++){
                        if(matrix.get(i).get(r) != 0)
                            matrix.get(i).set(r,-100);
                    }
                    // update col to -1
                    for (int c = 0; c < matrix.size(); c++) {
                        if(matrix.get(c).get(j) != 0)
                            matrix.get(c).set(j,-100);
                    }
                }
            }
        }

        // replace all -1 with 0
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                int cell = matrix.get(i).get(j);
                if(cell == -100){
                    matrix.get(i).set(j,0);
                }
            }
        }

        return matrix;

    }

    // better solution
    // T = O() S = O()
    public ArrayList<ArrayList<Integer>> zeroMatrix2(ArrayList<ArrayList<Integer>> matrix) {

        int[] row = new int[matrix.size()];
        int[] col = new int[matrix.get(0).size()];

        for (int i = 0; i < matrix.size(); i++) {
            ArrayList<Integer> rows = matrix.get(i);
            for (int j = 0; j < rows.size(); j++) {
                if(rows.get(j) == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        // fill all 1 with zero with respect to matrix
        for (int i = 0; i <matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                if(row[i] == 1 || col[j] == 1){
                    matrix.get(i).set(j,0);
                }
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        ZeroMatrix zeroMatrix = new ZeroMatrix();
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        matrix.add(new ArrayList(Arrays.asList(2,4,3)));
        matrix.add(new ArrayList(Arrays.asList(1,0,0)));

        ArrayList<ArrayList<Integer>> ans = zeroMatrix.zeroMatrix2(matrix);

        System.out.println(ans);
    }
}
