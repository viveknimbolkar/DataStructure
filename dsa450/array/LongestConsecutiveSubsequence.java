package dsa450.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//https://practice.geeksforgeeks.org/problems/longest-consecutive-subsequence2449/1
public class LongestConsecutiveSubsequence {
    // brute force approach
    int findLongestConseqSubseq(int arr[], int N){
        Arrays.sort(arr);
        int counter = 1, result = 1;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] < arr[i+1]){
                if(arr[i]+1 == arr[i+1]){
                    counter++;
                    result = Math.max(result, counter);
                }else{
                    counter = 1;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        LongestConsecutiveSubsequence longest = new LongestConsecutiveSubsequence();
        int[] arr = {2,6,1,9,4,5,3};
        System.out.println(longest.findLongestConseqSubseq(arr, arr.length));
    }
}
