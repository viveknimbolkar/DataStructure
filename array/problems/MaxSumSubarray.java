package array.problems;
// https://leetcode.com/problems/maximum-subarray/
// https://www.youtube.com/watch?v=w_KEocd__20&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=9
public class MaxSumSubarray {

    // TC - O(N)- using kadane's algorithm
    int maxSubArray(int[] nums) {
        int max = nums[0], sum = 0;
        for (int i = 0; i < nums.length-1; i++) {
            sum+=nums[i];
            if (sum > max) max = sum;
            if (sum < 0) sum = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        MaxSumSubarray max = new MaxSumSubarray();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Max sum: "+max.maxSubArray(nums));
    }
}
