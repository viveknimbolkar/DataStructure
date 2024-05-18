package striver.array;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MaxLengthOfSubarrayWithSumZero {

    // brute force : using two pointers
    // complexity : Time = O(n^2) space = O(1)
    public  int findMaxLen(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        // find subarray with sum 0
        for(int i = 0; i < n; i++){
            int sum = 0;
            for (int j = i; j < n-1; j++) {
                sum += arr[j];
                if(sum == 0){
                    max = Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }

    // optimised approach : Using prefix sum
    // complexity : Time = O(N) Space = O(N)
    public int findLengthUsingHashMap(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxi = 0, prefixSum = 0;

        for (int i = 0; i < arr.length; i++) {
             prefixSum += arr[i];

             // subarray until current index has sum = 0
             if(prefixSum == 0) maxi = i + 1;
             else {
                 if (map.get(prefixSum) != null){
                     // update maxi if another subarray is found
                    maxi = Math.max(maxi, i - map.get(prefixSum));
                 }else{
                    map.put(prefixSum,i);
                 }
             }
        }
        return maxi;
    }
    public static void main(String[] args) {
        MaxLengthOfSubarrayWithSumZero maxlen = new MaxLengthOfSubarrayWithSumZero();

//        int[] arr = {1 ,0 ,-1, 1};
        int[] arr = {1,9, 0, 3,2, 4,9, 2,1, 2,5, 2,3, 3,1, 2,0, 5, 5,0, 4,9, 9, 4,4, 1,0, 1,3, 3, 3,1, 4,8, 2,2, -1};
        System.out.println("max subarray with sum 0: "+ maxlen.findMaxLen(arr));
    }
}
