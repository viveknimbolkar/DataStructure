package array.string;

import java.util.ArrayList;

//https://leetcode.com/problems/number-of-pairs-of-strings-with-concatenation-equal-to-target/
public class StringsWithConcatenationEqualToTarget {
    int numOfPairs(String[] nums, String target) {
        ArrayList<String> pairs = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
                StringBuilder sb = new StringBuilder(nums[i]+nums[j]);
                if (sb.toString().equals(target))
                    pairs.add(nums[i]+nums[j]);
            }
        }
        return pairs.size();
    }

    public static void main(String[] args) {
        StringsWithConcatenationEqualToTarget strwith = new StringsWithConcatenationEqualToTarget();
        String[] nums = {"777","7","77","77"};
        String target = "7777";
        System.out.println("valid pairs: "+strwith.numOfPairs(nums,target));
    }
}
