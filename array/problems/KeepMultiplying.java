package array.problems;
//https://leetcode.com/problems/keep-multiplying-found-values-by-two/
public class KeepMultiplying {

    int findFinalValue(int[] nums, int original) {
        boolean flag = true;
        while (flag){
            for (int i = 0; i < nums.length; i++) {
                // every time check for the original number and if found then update original and flag
                if (original == nums[i]) {
                    original = 2 * nums[i];
                    flag = true;
                    break;
                }else flag = false; // return as not found original in nums to break the loop
            }
        }
        return original;
    }

    public static void main(String[] args) {
        KeepMultiplying keep = new KeepMultiplying();
        int[] nums = {5,3,6,1,12};
        int original = 3;
        System.out.println(keep.findFinalValue(nums,original));
    }
}
