package array.problems;

import java.util.*;

// https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
public class NRepeatedElements {

    int repeatedNTimes(int[] nums) {
        // store a[i], frequency
        HashMap<Integer,Integer> hmap = new HashMap<>();

        // add key elements along with their frequency
        for (int i = 0; i < nums.length; i++)
            if (hmap.containsKey(nums[i]))
                hmap.put(nums[i],hmap.get(nums[i])+1);
            else
                hmap.put(nums[i],1);

        // got the max value
        int maxVal = Collections.max(hmap.values());

        // iterate and get the associated key to maxVal
        for (Map.Entry entry: hmap.entrySet())
            if (entry.getValue().equals(maxVal))
                return (Integer)entry.getKey();

        return -1;
    }

    public static void main(String[] args) {
        NRepeatedElements repeat = new NRepeatedElements();
        int[] nums = {2,1,2,5,3,2};
        System.out.println("Most Repeated element is: "+repeat.repeatedNTimes(nums));
    }
}
