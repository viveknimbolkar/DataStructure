package array.problems;
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class TwoSum {

    // two pointre approach
    int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int f = 0, e = numbers.length-1;
        // start iteration from front and end
        while (f < e){
            int n = numbers[f] + numbers[e];
            if (n == target){
                result[0] = f+1;
                result[1] = e+1;
                return result;
            }else if (n > target){
                e--;
            }else {
                f++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TwoSum two = new TwoSum();
        int[] arr = {2,7,11,15};
        int t = 9;
        int[] result = two.twoSum(arr,t);

        for (int x:result) {
            System.out.print(x+" ");
        }
    }
}
