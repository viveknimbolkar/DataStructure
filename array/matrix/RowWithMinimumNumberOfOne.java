package array.matrix;

import java.lang.reflect.Array;
import java.util.ArrayList;

//https://practice.geeksforgeeks.org/problems/row-with-minimum-number-of-1s5430/1
public class RowWithMinimumNumberOfOne {

    int minRow(int N, int M, int A[][]) {
        ArrayList<Integer> list = new ArrayList<>();
        // get the frequency of one's in row
        int countOfOne = 0;
        for (int i = 0; i < N; i++) {
            countOfOne = 0;
            for (int j = 0; j < M; j++) {
                if (A[i][j] == 1) countOfOne++;
            }
            list.add(countOfOne);
        }

        // find the min row from the list
        int idx = -1, min = M;
        for (int i = 0; i < list.size(); i++) {
            if (min > list.get(i)){
                min = list.get(i);
                idx = i+1;
            }
        }

        return idx;
    }

    public static void main(String[] args) {
        RowWithMinimumNumberOfOne rowmin = new RowWithMinimumNumberOfOne();
        int N=4,M=4;
        int[][] A={
                {1,1,1,1},
                {1,1,0,0},
                {0,0,1,1},
                {1,1,1,1}
        };
        System.out.println("min no. of one row: "+rowmin.minRow(N,M,A));
    }
}
