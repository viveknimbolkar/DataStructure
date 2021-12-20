package array.problems;

public class LargestSumWith0 {

    int maxLen(int[] arr){
        int largestSum = 0;
        for (int i = arr.length; i > 0 ; i--) {
            int currentSum = getSum(arr,0,i);
            if (currentSum == 0){
                return i;
            }
        }
        return 0;
    }

    int getSum(int[] arr,int from, int to){
        int sum = 0;
        for (int i = from; i < to; i++) {
            sum+=arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        LargestSumWith0 largest = new LargestSumWith0();
        int[] arr = {15,-2,2,-8,1,7,10,23};
        System.out.println(largest.maxLen(arr));
    }
}
