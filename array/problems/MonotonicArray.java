package array.problems;
//https://leetcode.com/problems/monotonic-array/
public class MonotonicArray {

    boolean isMonotonic(int[] nums) {
       boolean increasing = true, decreasing = true;

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] < nums[i+1]) decreasing = false;
            if (nums[i] > nums[i+1]) increasing = false;
        }
        return increasing || decreasing;
    }

    public static void main(String[] args) {
        MonotonicArray mono = new MonotonicArray();
        int[] nums = {1,2,2,3};
        int[] nums1 = {6,5,4,4};
        int[] nums2 = {1,3,2};

        System.out.println(mono.isMonotonic(nums));
    }
}
