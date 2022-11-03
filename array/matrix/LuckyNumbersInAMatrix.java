package array.matrix;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/lucky-numbers-in-a-matrix/
public class LuckyNumbersInAMatrix {

    List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> luckyNums = new ArrayList<>();
        int small, big;

        for (int i = 0; i < matrix.length; i++) {
            // get the smallest element in row
            int k = 0;
            small = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[0].length; j++) {
                if (small > matrix[i][j]){
                    small = matrix[i][j];
                    k = j;
                }
            }
            // now consider big as the smallest element
            big = small;

            // find the max in cols
            for (int j = 0; j < matrix.length; j++) {
                big = Math.max(big,matrix[j][k]);
            }

            if (small == big) luckyNums.add(small);
        }
        return luckyNums;
    }

    public static void main(String[] args) {
        LuckyNumbersInAMatrix lucky = new LuckyNumbersInAMatrix();
        int[][] mat = {
                {3,7,8},
                {9,11,13},
                {15,16,17}
        };
        System.out.println(lucky.luckyNumbers(mat));
    }
}
