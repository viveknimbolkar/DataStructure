package dynamicprogramming;
//https://leetcode.com/problems/partition-equal-subset-sum/
public class EqualSumPartation {
    //  TODO: optimization required with dp
    boolean mem[][]; // memoization
    boolean canPartition(int[] nums) {
        // get the total sum of all the array num
        int sum = 0, n = nums.length;
        for (int i = 0; i < nums.length; i++) sum += nums[i];

        if (sum%2 != 0) return false;

        sum = sum / 2; // get the partitaion

        mem = new boolean[n+1][sum+1];
        return subsetSum(nums,0,sum); // 0 is position

    }

     boolean subsetSum(int[] nums, int pos, int sum) {
        if (sum == 0) return true;
        else if (pos >= nums.length || sum < 0) return false;

        if (mem[pos][sum]) return true;

        return mem[pos][sum] = subsetSum(nums,pos+1,sum-nums[pos]) || // take
                               subsetSum(nums,pos+1,sum); // not take
     }


    public static void main(String[] args) {
        EqualSumPartation equal = new EqualSumPartation();
        int[] nums = {1,5,11,5};
        System.out.println("Equal sum: "+equal.canPartition(nums));
    }
}
