package array.problems;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/degree-of-an-array/
public class DegreeOfAnArray {

    int findShortestSubArray(int[] nums) {
        // store the frequency map of nums
        HashMap<Integer,Integer> freq = new HashMap<>();
        // store the start index
        HashMap<Integer,Integer> startIndex = new HashMap<>();
        // store the end index
        HashMap<Integer,Integer> endIndex = new HashMap<>();

        int N = nums.length;

        // store all the frequencies, startindex and end index into map
        for (int i = 0; i < N; i++) {
            // store the end index of every element of nums[i]
            if (!startIndex.containsKey(nums[i]))
                startIndex.put(nums[i],i);
            // store the end index of every element of nums[i]
            endIndex.put(nums[i],i);
            // if present then store the nums[i] else store 1
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }

        // find the max freq element from map
        int degree = Collections.max(freq.values());
        int min = N; // min array
        // now find out the subarray
        for (Map.Entry<Integer,Integer> entry: freq.entrySet()) {
            int value = entry.getValue();
            if (degree == value){
                int num = entry.getKey();
                min = Math.min(min,endIndex.get(num)-startIndex.get(num)+1);
            }
        }

        return min;
    }

    public static void main(String[] args) {
        DegreeOfAnArray deg = new DegreeOfAnArray();
        int[] nums = {1,2,2,3,1,4,2};

        System.out.println(deg.findShortestSubArray(nums));
    }
}
