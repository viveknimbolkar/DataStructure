package array.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/single-number-ii/
public class SingleNumber2 {

    int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else map.put(nums[i],0);
        }

        System.out.println(map);
        ArrayList<Integer> ans = new ArrayList<>();

        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if (entry.getValue() == 0) return entry.getKey();
        }

        return -1;
    }

    public static void main(String[] args) {
        SingleNumber2 sing = new SingleNumber2();
        int[] nums = {0,1,0,1,0,1,99};
        System.out.println(sing.singleNumber(nums));
    }
}
