package array;
// calculate the maximum sum of k’th consecutive elements in the array.
public class SlidingWindowTechnique {

    // Method 1: Brute Force Approach
    int getMaxSum(int[] arr, int size, int k){
        int maxSum = Integer.MIN_VALUE; // get garbage negative value
        // iterate windows for size-k+1 times
        for (int i = 0; i < size-k+1; i++) {
            int currentSum = 0; // store the current sum of first window
            for (int j = 0; j < k; j++)
                currentSum += arr[i+j];

            // Get the max sum from both values
            maxSum = Math.max(maxSum,currentSum);
        }
        return maxSum;
    }


    //Method 2: Sliding Window Technique
    int getMaxSumSWT(int[] arr, int size, int k){
        //size of an array should be greater than k
        if (size < k)
            //return any -ve garbage value
            return Integer.MIN_VALUE;

        int maxSum = 0;
        for (int i = 0; i < k; i++)
            maxSum += arr[i];
        //storing the recent window's sum
        int currentWindowSum = maxSum;
        for (int i = k; i < size; i++) {
            currentWindowSum = currentWindowSum + arr[i] - arr[i-k];
            currentWindowSum = Math.max(maxSum,currentWindowSum);
        }
        return currentWindowSum;
    }

    public static void main(String[] args) {
        SlidingWindowTechnique mskc = new SlidingWindowTechnique();
        int[] arr = {2,7,-3,5,-8,3,2};
        System.out.println(mskc.getMaxSumSWT(arr,arr.length,3));

    }
}
