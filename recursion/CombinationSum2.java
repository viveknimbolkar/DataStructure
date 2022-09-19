package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/combination-sum-ii/
public class CombinationSum2 {

    List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        Arrays.sort(candidates);
        findCombination(0,candidates,target,ans,ds);
        return ans;
    }

    void findCombination(int idx, int[] candidates, int target,  List<List<Integer>> ans, ArrayList<Integer> ds){
        if (target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = idx; i < candidates.length; i++) {
            if (i > idx && candidates[i] == candidates[i-1]) continue;
            if (candidates[i] > target) break;

            ds.add(candidates[i]);
            findCombination(i+1,candidates,target-candidates[i],ans,ds);
            ds.remove(ds.size()-1);
        }
    }

    public static void main(String[] args) {
        CombinationSum2 comb = new CombinationSum2();
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        System.out.println(comb.combinationSum2(candidates,target));
    }
}
