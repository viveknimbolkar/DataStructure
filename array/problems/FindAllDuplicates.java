package array.problems;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class FindAllDuplicates {

    List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
                else if (nums[i] == nums[j] && !duplicates.contains(nums[i]))
                    duplicates.add(nums[i]);
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        FindAllDuplicates find = new FindAllDuplicates();
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(find.findDuplicates(nums));
    }
}
