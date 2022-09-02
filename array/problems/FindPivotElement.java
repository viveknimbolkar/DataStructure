package array.problems;
//https://leetcode.com/problems/find-pivot-index/
public class FindPivotElement {

    int pivotIndex(int[] nums) {
        int currentSum = 0, totalSum = 0;

        for (int ele: nums)
            totalSum += ele;

        for (int i = 0; i < nums.length; i++) {
            totalSum -= nums[i];
            if (currentSum == totalSum) return i;
            currentSum += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        FindPivotElement find = new FindPivotElement();
        int[] nums = {1,7,3,6,5,6};
        System.out.println(find.pivotIndex(nums));
    }
}
