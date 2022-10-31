package array.problems;

import java.util.ArrayList;

//https://leetcode.com/contest/weekly-contest-317/problems/average-value-of-even-numbers-that-are-divisible-by-three/
public class AverageValueOfEvenNumbersThatAreDivisibleByThree {

    int averageValue(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2 == 0 && nums[i]%3 == 0){
                list.add(nums[i]);
            }
        }

        System.out.println(list);

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum+=list.get(i);
        }
        if (list.size() == 0) return 0;
        return sum/list.size();
    }

    public static void main(String[] args) {
        AverageValueOfEvenNumbersThatAreDivisibleByThree avg = new AverageValueOfEvenNumbersThatAreDivisibleByThree();
        int[] nums = {1,3,6,10,12,15};
        int[] num = {1,2,4,7,10};
        System.out.println(avg.averageValue(num));
    }
}
