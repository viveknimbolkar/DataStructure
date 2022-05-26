package array.problems;
// https://leetcode.com/problems/number-of-good-pairs/submissions/
public class GoodPair {

    int numIdenticalPairs(int[] nums){
        int count = 0;
        for(int i=0; i<nums.length;i++)
            for(int j=0; j<nums.length;j++)
                if(i < j && nums[i] == nums[j])
                    count++;
        return count;
    }

    public static void main(String[] args) {
        GoodPair good = new GoodPair();
        int[] nums = {1,2,3,1,1,3};
        System.out.println("Good pairs: "+good.numIdenticalPairs(nums));
    }
}
