package array;

import java.util.Arrays;

// https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1/
public class KSmallestElement {

    int kthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k-1];
    }

    public static void main(String[] args) {
        KSmallestElement ksmall = new KSmallestElement();
        int[] arr = {7,10,4,3,20,15};
        System.out.println(ksmall.kthSmallest(arr, 3));
    }
}
