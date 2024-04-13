package striver.array;

import java.util.*;

//https://leetcode.com/problems/4sum/description/
public class FourSum {

    // Brute force is to calculate by using 4 loops
    // COMPLEXITY: Time = O(N^4) Space = O(2 * no. of unique triplets)
    List<List<Integer>> usingFourLoops(int[] nums, int target){
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    for (int l = k+1; l < n; l++) {
                        int sum = nums[i] + nums[j] + nums[k] + nums[l];
                        if(sum == target){
                            List<Integer> subarray = Arrays.asList(
                                    nums[i] , nums[j], nums[k] , nums[l]
                            );
                            ans.add(subarray);
                        }
                    }
                }
            }
        }

        return ans;
    }


    // Better approach : using set and three nested loops
    // Complexity : Time = O(n^3)+logM -- m is the size of elements
    // Space = O(2 * no. of quadruplet) + O(m) -- m is space qr
    List<List<Integer>> usingSetAndHashing(int[] nums, int target){
        int n = nums.length;
        Set<List<Integer>> ans = new HashSet<>();

        for(int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++) {

                HashSet<Integer> set = new HashSet<>();

                for (int k = j+1; k < n; k++) {
                   int sum = nums[i] + nums[j] + nums[k];
                   int fourth = target - sum;

                   // find if fourth element is present in set
                   if(set.contains(fourth)){
                       List<Integer> temp = Arrays.asList(
                               nums[i],
                               nums[j],
                               nums[k],
                               fourth
                       );
                       Collections.sort(temp);
                       ans.add(temp);
                   }

                   // if not present then add in set
                   set.add(fourth);
                }

            }
        }

        List<List<Integer>> finalAns = new ArrayList<>(ans);
        return finalAns;
    }

    // Optimal Solution: use three pointer approach
    List<List<Integer>> findSum(int[] nums, int target) {
        HashSet<List<Integer>> set = new HashSet<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int left = i+1, right= n-2;
            while(left < right){
            }
        }

        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        FourSum fourSum = new FourSum();
        int[] arr = {1,0,-1,0,-2,2};
        int target = 0;
//        int[] arr = {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
        System.out.println(fourSum.usingSetAndHashing(arr,target));
    }
}
