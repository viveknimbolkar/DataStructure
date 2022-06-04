package array.problems;
// https://leetcode.com/problems/running-sum-of-1d-array/
public class RunningSum {

    int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int recent_sum = 0;

        for(int i = 0; i < nums.length; i++){
            recent_sum = recent_sum + nums[i];
            result[i] += recent_sum;
        }
        for(int j = 0; j < result.length; j++)
            System.out.println(result[j]);
        return result;
    }

    public static void main(String[] args) {
        RunningSum run = new RunningSum();
        int[] nums = {1,2,3,4};
        for (int x:run.runningSum(nums)) {
            System.out.print(x+" ");
        }
    }
}
