package array.problems;

import java.util.Arrays;

//https://leetcode.com/problems/largest-number-at-least-twice-of-others/
public class LeastTwiceOfOthers {

    int dominantIndex(int[] nums) {
       int max = -1, second = -1, index = -1;

        for (int i = 0; i < nums.length; i++) {
            // if the currenet element is greater than max
            if (nums[i] > max){
                second = max;
                max = nums[i];
                index = i;
            }else if (nums[i] > second){
                // if current element is greater than second then make current as second
                second = nums[i];
            }

        }
        return second*2 <= max?index:-1;
    }

    public static void main(String[] args) {
        LeastTwiceOfOthers least = new LeastTwiceOfOthers();
        int[] nums = {3,6,1,0};
        int[] nums1 = {1,2,3,4};
        System.out.println(least.dominantIndex(nums));
    }
}
