package array.problems;
//https://leetcode.com/problems/max-consecutive-ones/submissions/
//https://www.youtube.com/watch?v=Mo33MjjMlyA&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=43
public class MaxOnes {

    int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxi = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1) count++;
            else count = 0;
            maxi = Math.max(count,maxi);
        }
        return maxi;
    }

    public static void main(String[] args) {
        MaxOnes ones = new MaxOnes();
        int[] nums = {1,1,0,1,1,1};
        System.out.println("max ones: "+ones.findMaxConsecutiveOnes(nums));
    }
}
