package array.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//https://leetcode.com/problems/count-subarrays-with-fixed-bounds/description/
public class CountSubarraysWithFixedBounds {

    long countSubarrays(int[] nums, int minK, int maxK) {
        long res = 0, jbad = -1, jmin = -1, jmax = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minK || nums[i] > maxK) jbad = i;
            if (nums[i] == minK) jmin = i;
            if (nums[i] == maxK) jmax = i;
            res += Math.max(0,Math.min(jmin,jmax) -jbad);
        }
        return res;
    }
//    long countSubarrays(int[] nums, int minK, int maxK) {
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length-1; j++) {
//                if (isSubarrayFound(nums,i,j,minK,maxK))
//                    count++;
//            }
//        }
//        return count;
//    }
//
//    boolean isSubarrayFound(int[] nums, int i, int j, int minK, int maxK){
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int k = i; k <= j; k++) {
//            list.add(nums[k]);
//        }
//        Collections.sort(list);
//        System.out.println(list);
//        if(list.get(0) == list.get(list.size()-1) )
//            return true;
//
//        else if (list.get(0) == minK && list.get(list.size()-1) == maxK) return true;
//        return false;
//    }

    public static void main(String[] args) {
        CountSubarraysWithFixedBounds countfix = new CountSubarraysWithFixedBounds();
        int[] nums = {1,3,5,2,7,5};
        int minK = 1, maxK = 5;

        int[] a = {1,1,1,1};
        int b = 1, c = 1;
        System.out.println(countfix.countSubarrays(nums,minK,maxK));
    }
}
