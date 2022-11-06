package array.matrix;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/check-if-every-row-and-column-contains-all-numbers/
public class EveryRowAndColumnContainsAllNumbers {

    boolean checkValid(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            Set<Integer> rows = new HashSet<>();
            Set<Integer> cols = new HashSet<>();

            for (int j = 0; j < matrix.length; j++)
                if (!rows.add(matrix[i][j]) || !cols.add(matrix[j][i]))
                    return false;
        }
        return true;
    }

    public static void main(String[] args) {
        EveryRowAndColumnContainsAllNumbers every = new EveryRowAndColumnContainsAllNumbers();
        int[][] matrix = {
                {1,2,3},
                {3,1,2},
                {2,3,1}
        };
        System.out.println(every.checkValid(matrix));
    }
}
