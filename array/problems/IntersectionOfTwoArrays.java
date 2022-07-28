package array.problems;

import java.util.*;

// https://leetcode.com/problems/intersection-of-two-arrays-ii/
public class IntersectionOfTwoArrays {

    int[] intersect(int[] nums1, int[] nums2) {
        // create a max array
        int[] bucket = new int[1001];
        // put the frequency of digits in that location or index
        for (int num : nums1) {
            bucket[num]++;
        }
        List<Integer> resList = new ArrayList<>();
        // if the element is already present that location, then decreased them to get frequency of digit
        for (int num : nums2) {
            if (bucket[num]-- > 0) resList.add(num);
        }
        // convert list into int array
        int[] res = resList.stream().mapToInt(i -> i).toArray();
        return res;
    }

    // mehod-2: using collection framework

    public static void main(String[] args) {
        IntersectionOfTwoArrays intersection = new IntersectionOfTwoArrays();
        int[] nums1 = {4,9,5}, nums2 = {9,4,9,8,4};
        int[] ans = intersection.intersect(nums1,nums2);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
