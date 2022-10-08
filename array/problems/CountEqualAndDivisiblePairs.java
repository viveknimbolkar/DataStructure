package array.problems;
//https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/
public class CountEqualAndDivisiblePairs {

    int countPairs(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++)
            for (int j = i+1; j < nums.length; j++)
                if (nums[i] ==  nums[j] && (i*j)%k == 0)
                    count++;
        return count;
    }

    public static void main(String[] args) {
        CountEqualAndDivisiblePairs cout = new CountEqualAndDivisiblePairs();
        int[] nums = {3,1,2,2,2,1,3};
        int k = 2;

        System.out.println(cout.countPairs(nums,k));
    }
}
