package array.problems;
//https://leetcode.com/problems/count-hills-and-valleys-in-an-array/
public class HillsAndValleys {
    int countHillValley(int[] nums) {
        int left = nums[0], right = 0;
        for (int i = 1; i < nums.length-1; i++) {
            // if neighbours are larger than current element || if neighbours are smaller than current element
            if ((left < nums[i] && nums[i] > nums[i+1]) ||
                    (left > nums[i] && nums[i] < nums[i+1])){
                left = nums[i];
                right++;
            }
        }

        return right;
    }

    public static void main(String[] args) {
        HillsAndValleys hill = new HillsAndValleys();
        int[] nums = {2,4,1,1,6,5};
        System.out.println(hill.countHillValley(nums));
    }
}
