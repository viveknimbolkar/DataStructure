package array.problems;
// https://leetcode.com/problems/squares-of-a-sorted-array
import java.util.Arrays;

public class SquaresofSortedArray {

    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        for(int i=0; i <nums.length; i++) {
            result[i] = nums[i] * nums[i];
        }

        Arrays.sort(result);
        return result;
    }

    public static void main(String[] args) {
        SquaresofSortedArray square = new SquaresofSortedArray();
        int[] arr = {-4,-1,0,3,10};
        int[] squares = square.sortedSquares(arr);
        for (int x: squares) {
            System.out.print(x+" ");
        }
    }
}
