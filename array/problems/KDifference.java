package array.problems;
// https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/
public class KDifference {

    int countKDifference(int[] nums, int k) {
        int count = 0;
        for(int i = 0; i < nums.length; i++)
            for(int j = 0; j < nums.length; j++)
                if(nums[i]-nums[j] == k) count++;
        return count;
    }

    public static void main(String[] args) {
        KDifference kd = new KDifference();
        int[] arr = {1,2,2,1};
        int k = 1;

        System.out.println("Difference count: "+kd.countKDifference(arr,k));
    }
}
