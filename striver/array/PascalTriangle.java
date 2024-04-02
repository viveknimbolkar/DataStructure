package striver.array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    // method -1 : using extra list to reference sum
    static List<List<Integer>> bruteForce(int n){
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> row = null, prev = null;
        for (int i = 0; i < n; i++) {
            row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                // add 1 at first and last index of row
                if(j == 0 || i == j) row.add(1);
                else{
                    // get the sum of perv two elmeent form prev row
                    int sum = prev.get(j-1)+ prev.get(j);
                    row.add(sum);
                }
            }
            prev = row;
            triangle.add(row);
        }
        return triangle;
    }

    // Variation - 1 : find the value at a[r][c] in pascal triangle
    // Complexity : T = O(r) S = O(1)
    static long findNCR(int n, int r){
        // n = row size, r = col size
        long res = 1;
        for (int i = 0; i < r; i++) {
            // add the prev sum into res and continue
            res = res * (n-i);
            res = res / (i+1);
        }
        return res;
    }

    // variation 2 : print the n'th row of pascal triangle
    // Complexity : Time = O(col size) Space = O(1)
    static void printNthRowOfPascalTriangle(int ithRow){
        for (int i = 1; i <= ithRow; i++) {
            // print the P[i][j] values
            System.out.print(findNCR(ithRow-1,i-1)+" ");
        }
    }

    // variation - 3 : print complete pascal triangle
    static List<List<Long>> printPascalTriangle(int n){
        List<List<Long>> triangle = new ArrayList<>();

        for (int row =1; row <= n; row++) {
            List<Long> iRow = new ArrayList<>();

            for (int col = 1; col <= row; col++) {
                // get the P[row][col] element and add into temp row
                iRow.add(findNCR(row-1,col-1));
            }
            triangle.add(iRow);
        }
        return triangle;
    }

    public static void main(String[] args) {
        int rows = 5, cols = 3;

        System.out.println(printPascalTriangle(5));
    }
}
