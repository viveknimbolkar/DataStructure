package recursion;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/combination-sum/
public class CombinationSum {

    // findout the combination sum of target
    List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer>  ds = new ArrayList<>();
        findCombinationSum(0,candidates,target,ans,ds);
        return ans;
    }

    void findCombinationSum(int idx,int[] arr, int target,  List<List<Integer>> ans, ArrayList<Integer>  ds){
        // when we reach at the end of an array(arr)
        if (idx == arr.length){
            if (target == 0)
                ans.add(new ArrayList<>(ds));
            return;
        }

        if (arr[idx] <= target){
            ds.add(arr[idx]);
            // recursively find pick and not pick element
            findCombinationSum(idx,arr,target-arr[idx],ans,ds);
            ds.remove(ds.size()-1);
        }

        // case for not to take combinations
        findCombinationSum(idx+1,arr,target,ans,ds);
    }

    public static void main(String[] args) {
        CombinationSum comb = new CombinationSum();
        int[] candidates = {2,3,6,7};
        int target = 7;

        System.out.println(comb.combinationSum(candidates,target));
    }
}
