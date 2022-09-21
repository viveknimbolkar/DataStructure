package array.problems;
//https://leetcode.com/problems/sum-of-even-numbers-after-queries/
public class EvenNumbersAfterQueries {

    // Method-1: Brute force
    int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < queries.length; i++) {
            nums[queries[i][1]] += queries[i][0];
//            int a = queries[i][0], b = queries[i][1];
//            nums[b] = nums[b] + a;
            ans[i] = getEvenSum(nums);
        }

        return ans;
    }

    // Method-2: Optimized
    int[] sumEvenAfterQueries2(int[] nums, int[][] queries) {
        int sum = getSum(nums);
        int[] ans = new int[nums.length];
        int i = 0;
        for (int[] query: queries) {
            // remove the total after change into nums array
            if (nums[query[1]]%2 == 0)
                sum -= nums[query[1]];

            // add the element into nums[query[i][0]]
            nums[query[1]] += query[0];

            // add the total after change into nums array
            if (nums[query[1]]%2 == 0)
                sum += nums[query[1]];

            ans[i++] = sum;
        }
        return ans;
    }

    // get the sum of even element in array
    int getSum(int[] arr){
        int sum = 0;
        for (int i: arr)
            if (i%2 == 0)
                sum+=i;
        return sum;
    }

    // get the sum of even no. in an array
    int getEvenSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i]%2 == 0) sum+=arr[i];
        return sum;
    }

    public static void main(String[] args) {
        EvenNumbersAfterQueries even = new EvenNumbersAfterQueries();
        int[] nums = {1,2,3,4};
        int queries[][] = {
                {1,0},
                {-3,1},
                {-4,0},
                {2,3}
        };

        for (int i: even.sumEvenAfterQueries2(nums,queries)) {
            System.out.print(i+" ");
        }

    }
}
