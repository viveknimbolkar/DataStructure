package array.problems;

import java.util.Arrays;
// https://practice.geeksforgeeks.org/problems/three-way-partitioning/1/
public class ThreeWayPartitioning {

    void threeWayPartition(int[] arr, int a, int b){
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        ThreeWayPartitioning twp = new ThreeWayPartitioning();
        int[] arr = {1, 2, 3, 3, 4};
        twp.threeWayPartition(arr,1,2);
    }
}
