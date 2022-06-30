package problems;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/single-number/
public class SingleNumber {

    int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                int val = map.get(nums[i]);
                map.put(nums[i],++val);
            }else{
                map.put(nums[i],0);
            }
        }

        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if (entry.getValue() == 0) return entry.getKey();
        }
        return -1;
    }

    public static void main(String[] args) {
        SingleNumber single = new SingleNumber();
        int[] data = {2,2,1};
        System.out.println(single.singleNumber(data));
    }
}
