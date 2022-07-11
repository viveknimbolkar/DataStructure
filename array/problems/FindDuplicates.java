package array.problems;

import java.lang.reflect.Array;
import java.util.Arrays;

// https://leetcode.com/problems/find-the-duplicate-number/
public class FindDuplicates {

//    Method-1: By sorting
//    TC - O(NlogN) merge sort
//    SP - O(1)
    int findDuplicateUsingSort(int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i+1]) return nums[i];
        }
        return -1;
    }

//    Method-2: By using two pointer
    int findDuplicateUsingTwoPointers(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
                if (nums[i] == nums[j]) return nums[i];
            }
        }
        return -1;
    }

    int findDuplicate(int[] nums) {
        int duplicateNum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]) return nums[i];
        }
        return duplicateNum;
    }

    public static void main(String[] args) {
        FindDuplicates find = new FindDuplicates();
        int[] nums = {1,3,4,2,2};
        System.out.println("Duplicate: "+find.findDuplicateUsingSort(nums));
    }
}
