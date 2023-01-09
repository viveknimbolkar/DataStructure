package array.matrix.traversal;

import java.util.ArrayList;
//https://practice.geeksforgeeks.org/problems/boundary-traversal-of-matrix-1587115620/1
public class BoundaryTraversalOfMatrix {
    ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m) {
        ArrayList<Integer>li=new ArrayList<>();
        if(n==1){
            for(int i=0;i<m;i++){
                li.add(matrix[0][i]);}
        }
        else if(m==1){
            for(int i=0;i<n;i++){
                li.add(matrix[i][0]);}
        }

        else{
            for(int i=0;i<m;i++){
                li.add(matrix[0][i]);
            }

            for(int i=1;i<n;i++){
                li.add(matrix[i][m-1]);
            }

            for(int i=m-2;i>=0;i--){
                li.add(matrix[n-1][i]);
            }

            for(int i=n-2;i>=1;i--){
                li.add(matrix[i][0]);
            }
        }
        return li;
    }

    public static void main(String[] args) {
        BoundaryTraversalOfMatrix boundry = new BoundaryTraversalOfMatrix();
        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15,16}
        };
        System.out.println(boundry.boundaryTraversal(mat,mat[0].length,mat.length));
    }
}
