package array.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//https://leetcode.com/problems/3sum/
public class ThreeSum {

    List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int left = i+1, right = nums.length-1;

            while (left < right){
                if (nums[i]+nums[left]+nums[right] < 0){
                    left++;
                }else if (nums[i]+nums[left]+nums[right] > 0){
                    right--;
                }else {
                    List<Integer> tmpList = new ArrayList<>();
                    tmpList.add(nums[i]);
                    tmpList.add(nums[left]);
                    tmpList.add(nums[right]);
                    set.add(tmpList);
                    left++;
                    right--;
                }
            }
        }

        return new ArrayList<>(set);
    }

    // Brute Force
    List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        // try the combination sum of every element
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    List<Integer> subsetSum = new ArrayList<>();
                    if (nums[i]+nums[j]+nums[k] == 0 && i != j && i != k && j != k){
                        subsetSum.add(nums[i]);
                        subsetSum.add(nums[j]);
                        subsetSum.add(nums[k]);
                        ans.add(subsetSum);
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ThreeSum three = new ThreeSum();
        int[]  nums = {-1,0,1,2,-1,-4};
        System.out.println("Subsets are: "+three.threeSum2(nums));
    }
}
