package striver.array;

import java.util.*;

//https://leetcode.com/problems/3sum/
public class ThreeSum {

    // Optimal approach
    // complexity: Time = O(NlogN)+O(N^2) Space = O(1)
    List<List<Integer>> threeSum2(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int left = i+1, right = nums.length-1;

            // skip duplicates
            if(i != 0 && nums[i] == nums[i-1]) continue;

            // moving 2 pointers left ---> <--- right
            while (left < right){
                int sum = nums[i]+nums[left]+nums[right];
                if (sum < 0){
                    left++;
                }else if (sum > 0){
                    right--;
                }else {
                    List<Integer> tmpList = new ArrayList<>();
                    tmpList.add(nums[i]);
                    tmpList.add(nums[left]);
                    tmpList.add(nums[right]);
                    set.add(tmpList);
                    // reduce search space
                    left++;
                    right--;

                    // skip duplicates
                    while(left < right && nums[left] == nums[left-1]) left++;
                    while(left < right && nums[right] == nums[right-1]) right--;
                }
            }
        }
        return new ArrayList<>(set);
    }

    // Using hashset : removing a[k] loop
    // Complexity: T = O() S = O()
    List<List<Integer>> findSum(int[] nums){
        int n = nums.length;
        Set<List<Integer>> triplets = new HashSet<>(); // store unique triplets only

        for (int i = 0; i < n-1; i++) {
            Set<Integer> set = new HashSet<>(); // store the elements in between i ---- j
            for (int j = i+1; j < n-1; j++) {
                int third = -(nums[i]+nums[j]); // calculate third element a[k]

                // if found set means we can create triplet
                if(set.contains(third)){
                    List<Integer> tempTriplets = Arrays.asList(nums[i],nums[j],third);
                    tempTriplets.sort(null);
                    triplets.add(tempTriplets);
                }
                set.add(nums[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(triplets);
        return ans;
    }

    // Brute Force
    // Complexity: T=O(n^3) S=(2 * no. of unique triplets)
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
