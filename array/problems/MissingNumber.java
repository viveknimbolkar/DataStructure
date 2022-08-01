package array.problems;

import java.util.Arrays;

//https://leetcode.com/problems/missing-number/
public class MissingNumber {
    int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++)
            if(nums[i] != i) return i;

        return nums[nums.length-1]+1;
    }

    public static void main(String[] args) {
        MissingNumber mis = new MissingNumber();
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(mis.missingNumber(nums));
    }
}
