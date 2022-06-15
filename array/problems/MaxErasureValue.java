package array.problems;

import java.util.HashSet;
import java.util.Iterator;

// https://leetcode.com/problems/maximum-erasure-value/
public class MaxErasureValue {
    int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        System.out.println(set);
        int sum = 0;
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()){
            sum += itr.next();
        }

        return sum;
    }

    public static void main(String[] args) {
        MaxErasureValue max = new MaxErasureValue();
        int[] nums = {4,2,4,5,6};
        int[] number = {187,470,25,436,538,809,441,167,477,110,275,133,666,345,411,459,490,266,987,965,429,166,809,340,
                467,318,125,
                165,809,610,31,585,970,306,42,189,169,743,78,810,70,382,367,490,787,670,476,278,775,673,299,19,893,
                817,971,458,409,886,434};
        System.out.println(max.maximumUniqueSubarray(number));
    }
}
