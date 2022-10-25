package backtracking;

import java.util.ArrayList;
import java.util.List;
//https://www.youtube.com/watch?v=YK78FU5Ffjw&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&index=12
//https://leetcode.com/problems/permutations/
public class Permutations {

    // find the combinations using paramaterized recursion
    List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        recurPermute(nums,ans,ds,freq);
        return ans;

    }

    void recurPermute(int[] nums, List<List<Integer>> ans, List<Integer> ds, boolean[] freq){
        if (ds.size() == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }

        // find the combinations and mark all the posible combinations
        for (int i = 0; i < nums.length; i++) {
            if (!freq[i]) {
                freq[i] = true;
                ds.add(nums[i]);
                recurPermute(nums, ans, ds, freq);
                ds.remove(ds.size() - 1); // remove the combination digit
                freq[i] = false; // make the combination as not take
            }
        }
    }

    public static void main(String[] args) {
        Permutations permutations = new Permutations();
        int[] nums = {1,2,3};

        System.out.println(permutations.permute(nums));
    }
}
