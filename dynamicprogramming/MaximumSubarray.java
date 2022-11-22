package dynamicprogramming;
//https://leetcode.com/problems/maximum-subarray/
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];

        dp[0]=nums[0];

        int max = dp[0];
        for(int i =1; i <n ;i++){
            dp[i]= nums[i]+(dp[i-1] > 0?dp[i-1]:0);
            max = Math.max(max,dp[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        MaximumSubarray max = new MaximumSubarray();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("max subarrays: "+max.maxSubArray(nums));
    }
}
