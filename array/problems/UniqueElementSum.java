package array.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

// https://leetcode.com/problems/sum-of-unique-elements/
public class UniqueElementSum {

    int sumOfUnique(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] != nums[i+1])
                nums[j++] = nums[i];
        }
        nums[j++] = nums[nums.length-1];

        for (int x: nums) {
            System.out.print(x+" ");
        }
        return -1;
    }

    public static void main(String[] args) {
        UniqueElementSum uniq = new UniqueElementSum();
        int[] nums = {1,2,3,2};
        System.out.println("sum of unique element "+uniq.sumOfUnique(nums));
    }
}
