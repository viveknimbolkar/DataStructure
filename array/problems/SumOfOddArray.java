package array.problems;

import java.util.ArrayList;

// https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
public class SumOfOddArray {
    int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        // get sum of all number of arr elements
        for (int i = 0; i < arr.length; i++)
            sum+=arr[i];
        int i = 2; // end position of window

        while (i <= arr.length){
            // for all odd numbers
            if (i%2 != 0){
                int j = 0; // represent starting position of window
                while (j+i <= arr.length){
                    for (int k = j; k < j+i; k++) {
                        sum+=arr[k];
                    }
                    j++;
                }
            }
            i++;
        }

        return sum;
    }

    public static void main(String[] args) {
        SumOfOddArray sum = new SumOfOddArray();
        int[] arr = {1,4,2,5,3};
        System.out.println(sum.sumOddLengthSubarrays(arr));
    }
}
