package array.problems;

import java.util.ArrayList;
import java.util.Collections;

//https://leetcode.com/contest/weekly-contest-318/problems/maximum-sum-of-distinct-subarrays-with-length-k/
public class MaximumSumOfDistinctSubarraysWithLengthK {

    // TODO: partially working
    long maximumSubarraySum(int[] nums, int k) {
        ArrayList<ArrayList<Integer>> metaList = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n-k-1; i++) {
            ArrayList<Integer> subArray = new ArrayList<>();
            for (int j = 0; j < k; j++) {
                subArray.add(nums[i+j]);
            }
            metaList.add(subArray);
        }
        System.out.println(metaList);
        if (metaList.size() < 1) return 0;
        ArrayList<Integer> sum = new ArrayList<>();

        for (ArrayList<Integer> list: metaList) {
            int totalSumOfSubarray = 0;
            for (int i = 0; i < list.size(); i++) {
                totalSumOfSubarray += list.get(i);
            }
            sum.add(totalSumOfSubarray);
        }
        Collections.sort(sum);
        return  sum.get(sum.size()-1);
    }

    public static void main(String[] args) {
        MaximumSumOfDistinctSubarraysWithLengthK maxsub = new MaximumSumOfDistinctSubarraysWithLengthK();
        int[] nums = {1,5,4,2,9,9,9};
        int k = 3;
        System.out.println("max subarray sum: "+maxsub.maximumSubarraySum(nums,k));
    }
}
