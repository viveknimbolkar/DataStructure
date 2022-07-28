package array.problems;

import java.util.ArrayList;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FindPositionOfElementInSortedArray {

    // partially working code
    int[] searchRange(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        // find element and add the index into list
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                list.add(i);
            }
        }
        // if element not present
        if (list.size() == 0) return new int[]{-1,-1} ;

        // if the size of nums is 1 then create a resultant array of size 2
        int ansSize;
        if (nums.length == 1) ansSize = 2;
        else ansSize = list.size();

        // shift all the elements from list to array
        int[] ans = new int[ansSize];

        for (int i = 0; i < ansSize; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        FindPositionOfElementInSortedArray find = new FindPositionOfElementInSortedArray();
        int[]  nums = {5,7,7,8,8,10};
        int target = 8;

        for (int x: find.searchRange(nums,target)) {
            System.out.print(x+" ");
        }
    }
}
