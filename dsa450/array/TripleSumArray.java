package dsa450.array;

import java.util.Arrays;
import java.util.HashSet;

//https://practice.geeksforgeeks.org/problems/triplet-sum-in-array-1587115621/1
public class TripleSumArray {

    // brute force 3pointer approach
    public boolean findTriplet(int[] arr, int n, int x){
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    if (arr[i]+arr[j]+arr[k] == x)
                        return true;
                }
            }
        }
        return false;
    }

    // using two pointer and sorting
    public boolean findTriplet2(int[] arr, int n, int x){
        Arrays.sort(arr);
        for (int i = 0; i < n-2; i++) {
            int j = i+1, k = n-1;
            int remainingSum = x-arr[i];  // 13-1 = 12
            while (j < k){
                if (arr[j]+arr[k] == remainingSum) return true;
                else if (arr[j]+arr[k] < x) j++;
                else k--;
            }
        }
        return false;
    }

    // using set
    public boolean findTriplet3(int[] arr, int n, int x){
        for (int i = 0; i < n-2; i++) {
            HashSet<Integer> set = new HashSet<>();
            int currentSum = x-arr[i];
            for (int j = i+1; j < n; j++) {
                if (set.contains(currentSum - arr[j])) return true;
                set.add(arr[j]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        TripleSumArray triplet = new TripleSumArray();
        int[] arr = {1, 4, 45, 6, 10, 8};
        int n = 6, X = 13;
        System.out.println(triplet.findTriplet3(arr,n,X));
    }
}
