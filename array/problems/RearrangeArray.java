package array.problems;
// https://leetcode.com/problems/shuffle-the-array/
public class RearrangeArray {

    int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int k = 0;
        for (int i = 0; i < nums.length; i+=2) {
            ans[i] = nums[k];
            ans[i+1] = nums[k+n];
            k++;
        }
        return ans;
    }

    public static void main(String[] args) {
        RearrangeArray rearrangeArray = new RearrangeArray();
        int[] nums = {2,5,1,3,4,7};
        int n = 3; // index where y1 starts
        int[] res = rearrangeArray.shuffle(nums,n);
        for (int x:res) {
            System.out.print(x+" ");
        }
    }
}
