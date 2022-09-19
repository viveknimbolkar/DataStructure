package greedy;

import java.util.Arrays;

//https://leetcode.com/problems/maximum-product-of-three-numbers/
public class MaximumProductofThreeNumbers {

    int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int max1 = 1, max2 = 1;
        int n = nums.length;
        // for mixed negative and positive values
        max1 = nums[0]*nums[1]*nums[n-1];
        max2 = nums[n-1]*nums[n-2]*nums[n-3];
        return Math.max(max1,max2);
    }

    public static void main(String[] args) {
        MaximumProductofThreeNumbers max = new MaximumProductofThreeNumbers();
        int[] nums = {1,2,3};
        System.out.println("max product is: "+max.maximumProduct(nums));
    }
}
