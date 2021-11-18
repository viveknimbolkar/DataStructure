package array;
// https://practice.geeksforgeeks.org/problems/balanced-array07200720/1/
public class BalancedArray {

    long minValueToBeBalance(long[] arr){
        int halfArray = arr.length/2;
//      System.out.println("halfarr "+halfArray);

        int sumOfFirstHalf = 0, sumOfSecondHalf = 0;

        // sum of first half array
        for (int i = 0; i < halfArray; i++) {
            sumOfFirstHalf += arr[i];
        }

        // sum of second half array
        for (int i = halfArray; i < arr.length; i++) {
            sumOfSecondHalf += arr[i];
        }

//      System.out.println(sumOfFirstHalf+" "+sumOfSecondHalf);
        int min = Math.min(sumOfFirstHalf,sumOfSecondHalf); //getting min element
        int max = Math.max(sumOfFirstHalf,sumOfSecondHalf); // getting max element

        return max-min;
    }

    public static void main(String[] args) {
        BalancedArray balancedArray = new BalancedArray();
        long[] arr = {1, 5, 3, 2};
        System.out.println(balancedArray.minValueToBeBalance(arr));
    }
}
