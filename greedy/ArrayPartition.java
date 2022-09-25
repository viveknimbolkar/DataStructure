package greedy;

import java.util.Arrays;

//https://leetcode.com/problems/array-partition/
public class ArrayPartition {

    int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for(int i = 0; i < nums.length; i+=2)
            ans += nums[i];
        return ans;
    }

    public static void main(String[] args) {
        ArrayPartition arr = new ArrayPartition();
        int[] nums = {1,4,3,2};
        System.out.println("Max sum: "+arr.arrayPairSum(nums));
    }
}
