package dsa450.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SumarraySumZero {

    // brute force
    public boolean findSubarray(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            int currSum = arr[i];
            if (currSum == 0) return true;
            for (int j = i+1; j < arr.length; j++) {
                currSum += arr[j];
                if (currSum == 0) return true;
            }
        }
        return false;
    }

    //using hashing
    public boolean findSubarrayByHashing(int[] arr){
        if (arr.length == 0) return false;
        Set<Integer> allSum = new HashSet<>();
        int prefixSum = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            prefixSum += arr[i];
            if (prefixSum == 0 || arr[i] == 0 || allSum.contains(prefixSum)) return true;
            allSum.add(prefixSum);
        }
        return false;
    }

    public static void main(String[] args) {
        SumarraySumZero sumarr = new SumarraySumZero();
        int[] arr = {4,2,-3,1,6};
        System.out.println(sumarr.findSubarrayByHashing(arr));

    }
}
