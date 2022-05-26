package array.problems;
// https://leetcode.com/problems/create-target-array-in-the-given-order/
public class CreateTargetArray {

    int[] createTargetArray(int[] nums, int[] index) {
        int[] output = new int[index.length];
        // assign negative value to each index to make comparisions in future
        for (int i = 0; i < output.length; i++)
            output[i] = -1;

        for (int i = 0; i < index.length; i++)
            if (output[index[i]] == -1)
                output[index[i]] = nums[i];
            else {
                //else move elements from i to one step forward
                for (int j = output.length-2; j >= index[i] ; j--)
                    output[j+1] = output[j];
                // add value in proper position after shifted required element to right
                output[index[i]] = nums[i];
            }

        return output;
    }

    public static void main(String[] args) {
        CreateTargetArray create = new CreateTargetArray();
        int[] nums = {0,1,2,3,4}, index = {0,1,2,2,1};
        for (int x: create.createTargetArray(nums,index))
            System.out.print(x+" ");
    }
}
