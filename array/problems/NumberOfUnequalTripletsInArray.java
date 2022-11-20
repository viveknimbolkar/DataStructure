package array.problems;

import java.util.ArrayList;
import java.util.Arrays;

//https://leetcode.com/contest/weekly-contest-320/problems/number-of-unequal-triplets-in-array/
public class NumberOfUnequalTripletsInArray {

    int unequalTriplets(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if ((nums[i] != nums[j] && nums[i] != nums[j] && nums[j]!= nums[k]) && (i < j && j < k && k < n))
                        count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        NumberOfUnequalTripletsInArray num = new NumberOfUnequalTripletsInArray();
        int[] nums = {4,4,2,4,3};
        int[] nums1 = {1,1,1,1,1};
        System.out.println(num.unequalTriplets(nums));
    }
}
