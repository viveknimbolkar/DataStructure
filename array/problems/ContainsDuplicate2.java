package array.problems;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/contains-duplicate-ii/
public class ContainsDuplicate2 {

    boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer ord = map.put(nums[i], i);
            if (ord != null && i-ord <= k)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate2 cont = new ContainsDuplicate2();
        int[]  nums = {1,2,3,1};
        int k = 3;
        System.out.println("Contains duplicate; "+cont.containsNearbyDuplicate(nums,k));
    }
}
