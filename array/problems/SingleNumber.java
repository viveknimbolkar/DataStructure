package array.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/single-number-iii/
public class SingleNumber {

    int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else map.put(nums[i],0);
        }

        System.out.println(map);
        ArrayList<Integer> ans = new ArrayList<>();

        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if (entry.getValue() == 0) ans.add(entry.getKey());
        }

        int[] finalAns = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            finalAns[i] = ans.get(i);
        }
        return finalAns;
    }


    public static void main(String[] args) {
        SingleNumber sin = new SingleNumber();
        int[] nums = {1,2,1,3,2,5};

        for (int i: sin.singleNumber(nums)) {
            System.out.print(i+" ");
        }
    }
}
