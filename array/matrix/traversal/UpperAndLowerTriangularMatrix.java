package array.matrix.traversal;

import java.util.ArrayList;

//https://practice.geeksforgeeks.org/problems/sum-of-upper-and-lower-triangles-1587115621/1
public class UpperAndLowerTriangularMatrix {

    ArrayList<Integer> sumTriangles(int matrix[][]){
        ArrayList<Integer> ans = new ArrayList<>();
        int upperTriangleSum = 0, lowerTriangleSum = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            //get upper triangular
            for (int j = i; j < matrix.length; j++)
                upperTriangleSum += matrix[i][j];


            //get lower triangular
            for (int j = 0; j <= i; j++)
                lowerTriangleSum += matrix[i][j];

        }

        ans.add(upperTriangleSum);
        ans.add(lowerTriangleSum);
        return ans;
    }
    
    public static void main(String[] args) {
        UpperAndLowerTriangularMatrix upp = new UpperAndLowerTriangularMatrix();
        int[][] mat = {
                {6,5,4},
                {1,2,5},
                {7,9,7}
        };

        System.out.println(upp.sumTriangles(mat));
    }
}
