package dynamicprogramming;
// https://leetcode.com/problems/longest-consecutive-sequence/
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    int longestConsecutive(int[] nums) {
        int result = 0;
        Set<Integer> set = new HashSet<>();
        // add all elements in a set, we dont require duplicates because -
        //suppose we have 1 1 2 2 3 3 in the array the max len will be 3 - (1 2 3) doesnt matter how many times a number is present
        for (Integer i: nums)
            set.add(i);

        for (Integer i: nums) {
            // the idea is to assume the present value "i" the center of the sequence in which it is present
            // then we will go left and right of it to find the length of its sequence
            // suppose we have 5 1 2 3 4 6 7 8, now the first element we have is 5
            int max = 1, prev = i-1, next = i+1;
            // max is the current length as we have one elemet in the sequence that is 5
            // now for 5 prevVal = 4
            while (set.contains(prev)){
                max++;
                set.remove(prev--);
            }


            // removing the elements because an element can only be part of only one consecutive sequence
            while (set.remove(next)){
                max++;
                set.remove(next++);
            }
            result = Math.max(result,max);
        }
        return result;
    }

    public static void main(String[] args) {
        LongestConsecutiveSequence lcs = new LongestConsecutiveSequence();
        int[] nums = {100,4,200,1,3,2};
        System.out.println(lcs.longestConsecutive(nums));
    }
}
