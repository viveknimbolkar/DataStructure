package array.problems;

import java.util.Arrays;
import java.util.ArrayList;

// https://practice.geeksforgeeks.org/problems/java-1-d-and-2-d-array2952/1/
public class Java1d2d {

    ArrayList<Integer> getDigonalElementAndMax(int[][] arr1, int[] arr2){
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0,j=0;

        for (int i = 0; i < arr1.length; i++) {
                sum += arr1[i][j];
                j++;
        }
        list.add(sum);
        Arrays.sort(arr2);
        list.add(arr2[arr2.length-1]);
        return list;
    }

    public static void main(String[] args) {
        Java1d2d javaarr = new Java1d2d();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[][] arr1 =  {
                {1,2,3},
                {4,5,6},
                {7, 8,9}
        };
        int[] arr2 = {1,6,9};
        System.out.println(javaarr.getDigonalElementAndMax(arr1,arr2));
    }
}
