package array.problems;
// https://practice.geeksforgeeks.org/contest/interview-series-flipkart-2/problems/
// ask in flipkart interview
import java.util.ArrayList;

public class MaxOfSubArrayOfSizeK {

    ArrayList<Integer> maxOfSubArray(int[] arr, int k){
        ArrayList<Integer> maxList = new ArrayList<>();
        int j = k;
        //iterate every subarray upto n-2
        for (int i = 0; i <= arr.length-k; i++) {
            maxList.add(getMaxFromSubarray(arr,i,j));
            j++;
        }
        return maxList;
    }

    //calculate the max in array from start to end position
    int getMaxFromSubarray(int[] arr,int startPosition, int endPosition){
        int max = 0;
        for (int i = startPosition; i < endPosition; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }

    public static void main(String[] args) {
        MaxOfSubArrayOfSizeK max = new MaxOfSubArrayOfSizeK();
        int[] arr = {1,2,3,1,4,5,2,3,6};
        int[] arr1 = {8,5,10,7,9,4,15,12,90,13};
        int groupOf = 4;
        ArrayList<Integer> ans = max.maxOfSubArray(arr,groupOf);
        System.out.println(ans);
    }
}
