package array.problems;

import java.util.ArrayList;
import java.util.Collections;

// https://practice.geeksforgeeks.org/problems/merge-k-sorted-arrays/1/
public class MergeKSortedArrays {

    ArrayList<Integer> mergeKArrays(int[][] arr, int k){
        ArrayList<Integer> tempArr = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                tempArr.add(arr[i][j]);
            }
        }
        Collections.sort(tempArr);
        return tempArr;
    }

    public static void main(String[] args) {
        MergeKSortedArrays merge = new MergeKSortedArrays();
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        ArrayList<Integer> mergedArray = merge.mergeKArrays(arr,3);
        System.out.println(mergedArray);
    }
}
