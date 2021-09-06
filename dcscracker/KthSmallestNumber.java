package dcscracker;

import java.util.Arrays;

public class KthSmallestNumber {

    //simple solution by sorting an array
    //TC = O(NlogN)
    public int getSmallestNumber(int[] arr, int Kth){
        Arrays.sort(arr);
        return arr[Kth-1];
    }

    public static void main(String[] args) {
        KthSmallestNumber smallestNumber = new KthSmallestNumber();
        int[] data = {45,7,89,2,5,9,123,6,87,42};
        int k = 3;
        System.out.println(k+"th smallest element = "+smallestNumber.getSmallestNumber(data, k));
    }
}
