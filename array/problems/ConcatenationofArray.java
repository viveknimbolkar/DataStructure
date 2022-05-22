package array.problems;
// https://leetcode.com/problems/concatenation-of-array/
public class ConcatenationofArray {

    int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];

        int k = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < nums.length; j++) {
                ans[k] = nums[j];
                k++;
                System.out.print(k);
            }
            System.out.println();
        }
        return ans;
    }

    public static void main(String[] args) {
        ConcatenationofArray concat = new ConcatenationofArray();
        int[] arr = {1,2,1};
        int[] result = concat.getConcatenation(arr);

        for (int x: result) {
            System.out.print(x+" ");
        }
    }
}
