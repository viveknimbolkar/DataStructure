package array.problems;
// https://leetcode.com/problems/decompress-run-length-encoded-list/
public class DecompressEncodedList {

    int[] decompressRLElist(int[] nums) {
        // calculate the length of output
        int opLength = 0;
        for (int i = 0; i < nums.length; i+=2)
            opLength += nums[i];
        int[] output = new int[opLength];

        // create an output array
        int k = 0;
        for (int i = 0; i < nums.length; i+=2) {
            for (int j = 0; j < nums[i]; j++) {
                output[k] = nums[i+1];
                k++;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        DecompressEncodedList decompress = new DecompressEncodedList();
        int[] nums = {1,2,3,4};
        for (int x: decompress.decompressRLElist(nums)) {
            System.out.print(x+" ");
        }
    }
}
