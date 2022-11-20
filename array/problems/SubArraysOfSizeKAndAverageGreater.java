package array.problems;
//https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/
public class SubArraysOfSizeKAndAverageGreater {

    int numOfSubarrays(int[] arr, int k, int threshold) {
        int start = 0, end = 0, sum = 0, res = 0, n = arr.length;

        while (end < n){
            sum += arr[end];
            // if we iterate upto k times
            if (end-start+1 == k){
                if (sum/k >= threshold) res++; // match the condition and increment res vector
                sum -= arr[start++]; // get the sum of previous 2 element
            }

            end++; // increment until we reached to k
        }
        return res;
    }

    public static void main(String[] args) {
        SubArraysOfSizeKAndAverageGreater sub = new SubArraysOfSizeKAndAverageGreater();
        int[] arr = {2,2,2,2,5,5,5,8};
        int k = 3, threshold = 4;

        int[] arr1 = {11,13,17,23,29,31,7,5,2,3};
        int k1 = 3, threshold1 = 5;

        int[] arr2 = {1,1,1,1,1};
        int k2 = 1, threshold2 = 0;


        int[] arr3 = {7,7,7,7,7,7,7};
        int k3 = 7, threshold3 = 7;
        System.out.println("total arrays: "+sub.numOfSubarrays(arr3,k3,threshold3));
    }
}
