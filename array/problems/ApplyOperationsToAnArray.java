package array.problems;
//https://leetcode.com/contest/weekly-contest-318/problems/apply-operations-to-an-array/
public class ApplyOperationsToAnArray {

    int[] applyOperations(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n-1; i++) {
            if (nums[i] == nums[i+1]){
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }
        }
        moveZeroToEnd(nums);
        return nums;
    }

    void moveZeroToEnd(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                arr[count++] = arr[i];
        }
        while (count < arr.length)
            arr[count++] = 0;
    }

    public static void main(String[] args) {
        ApplyOperationsToAnArray apply = new ApplyOperationsToAnArray();
        int[] nums = {1,2,2,1,1,0};
        int[] nums2 = {0,1};

        for (int i: apply.applyOperations(nums)) {
            System.out.print(i+" ");
        }
    }
}
