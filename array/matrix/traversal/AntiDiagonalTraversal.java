package array.matrix.traversal;

import java.util.ArrayList;

public class AntiDiagonalTraversal {

    ArrayList<Integer> downwardDiagonal(int N, int A[][]) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        // for the cols starting from zeroth row
        for (int col = 0; col < N; col++) {
            int startcol = col, startrow = 0;
            while (startcol >= 0 && startrow < N){
                ans.add(A[startrow][startcol]);
                startcol--;
                startrow++;
            }
        }

        // for the rows starting from n-1 column
        for (int row = 1; row < N; row++) {
            int startrow = row, startcol = N-1;
            while (startrow < N && startcol >= 0){
                ans.add(A[startrow][startcol]);
                startcol--;
                startrow++;
            }
        }
        
        return ans;
    } 
    
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        int N = mat.length;
        System.out.println(N);
        AntiDiagonalTraversal antidig = new AntiDiagonalTraversal();
        System.out.println(antidig.downwardDiagonal(N,mat));
    }
}
