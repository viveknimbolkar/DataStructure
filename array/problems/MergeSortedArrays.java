package array.problems;

import java.util.Arrays;

// https://leetcode.com/problems/merge-sorted-array/
public class MergeSortedArrays {

    void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n-1; i++) {
            nums1[i+n] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        MergeSortedArrays merge = new MergeSortedArrays();
//        int[] nums1 = {1,2,3,0,0,0},  nums2 = {2,5,6};
//        int m = 3,n = 3;
        int[] nums1 = {0},  nums2 = {1};
        int m = 0, n = 1;
        merge.merge(nums1, nums1.length, nums2, nums2.length);
        for (int x: nums1) {
            System.out.print(x+" ");
        }
    }
}
