package array.problems;
//https://leetcode.com/problems/count-elements-with-strictly-smaller-and-greater-elements/
public class StrictlySmallerAndGreaterElements {
    int countElements(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            // find the smallest element
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < curr){
                    // find the greater element
                    for (int k = 0; k < nums.length; k++) {
                        if (nums[k] > curr){
                            count++;
                            break;
                        }
                    }
                    break;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        StrictlySmallerAndGreaterElements strict = new StrictlySmallerAndGreaterElements();
        int[] a = {11,7,2,15};
        System.out.println(strict.countElements(a));
    }
}
