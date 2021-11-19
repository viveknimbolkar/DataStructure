package dcscracker;
// https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
public class KadaneAlgo {

    int findMaxSumArray(int[] arr){
        int size = arr.length;
        int max = 0;
        int totalMax = Integer.MIN_VALUE; // all negative values (less than 0)

        //traverse and keep track of previous element
        for (int i = 0; i < size; i++) {
            max = max + arr[i];
            if (max > totalMax)
                totalMax= max;
            if(max < 0)
                max = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        KadaneAlgo kalgo = new KadaneAlgo();
        int[] data = {-4,-6,4,-3,6,-5,3,2};
        int[] arr = {1,2,3,-2,5};
        int sum = kalgo.findMaxSumArray(arr);
        System.out.println(sum);
    }
}
