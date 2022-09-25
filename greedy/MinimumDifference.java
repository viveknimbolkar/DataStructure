package greedy;

import java.util.Arrays;

//https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/
public class MinimumDifference {

    int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);

        int mindiff = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            // get the min of min and the k-1 element in each iteration
            if (i >= k-1) mindiff = Math.min(mindiff,nums[i]-nums[i-(k-1)]);
        }
        return mindiff;
    }


    public static void main(String[] args) {
        MinimumDifference mindiff = new MinimumDifference();
        int[] nums = {9,4,1,7};
        int k = 1;
        System.out.println("Diff :"+mindiff.minimumDifference(nums,k));
    }
}
