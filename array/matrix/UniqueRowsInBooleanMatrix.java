package array.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//https://practice.geeksforgeeks.org/problems/unique-rows-in-boolean-matrix/1
public class UniqueRowsInBooleanMatrix {

     ArrayList<ArrayList<Integer>> uniqueRow(int a[][], int r, int c) {
         HashMap<List<Integer>,Integer> map = new HashMap<>();

         System.out.println(Arrays.asList(a[1]));
        return new ArrayList<ArrayList<Integer>>();
    }



    public static void main(String[] args) {
        UniqueRowsInBooleanMatrix unique = new UniqueRowsInBooleanMatrix();
        int row = 3, col = 4;
        int M[][] = {
                {1, 1 ,0, 1},
                {1, 0 ,0, 1},
                {1 ,1, 0, 1}
        };
        System.out.println(unique.uniqueRow(M,row,col));

    }
}
