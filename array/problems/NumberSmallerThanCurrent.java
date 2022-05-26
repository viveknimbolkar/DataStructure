package array.problems;
// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class NumberSmallerThanCurrent {
    int[] smallerNumbersThanCurrent(int[] nums) {
        int[] output = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++)
                if (nums[j] < nums[i]) count++;
            output[i] = count;
        }
        return output;
    }

    public static void main(String[] args) {
        NumberSmallerThanCurrent num = new NumberSmallerThanCurrent();
        int[] nums = {8,1,2,2,3};
        for (int i:num.smallerNumbersThanCurrent(nums)) {
            System.out.print(i+" ");
        }
    }
}
