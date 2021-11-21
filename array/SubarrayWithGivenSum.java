package array;

import java.util.ArrayList;

public class SubarrayWithGivenSum {

    ArrayList<Integer> subArraySum(int[] arr, int s, int n){
        ArrayList<Integer> tempArr = new ArrayList<>();

        int current_sum=arr[0];
        int start=0;

        for(int j=1; j<=n; j++){
            while(current_sum > s && start < j-1){
                current_sum = current_sum-arr[start];
                start++;
            }
            if(current_sum == s){
                tempArr.add(start+1);
                tempArr.add(j);
                return tempArr;
            }
            if(j<n){
                current_sum=current_sum + arr[j];
            }
        }
        tempArr.add(-1);
        return tempArr;
    }

    public static void main(String[] args) {
        SubarrayWithGivenSum subarrayWithGivenSum = new SubarrayWithGivenSum();
        int[] arr = {1,2,3,7,5};
        int[] ar = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int S = 23;
        ArrayList<Integer> a = subarrayWithGivenSum.subArraySum(ar,arr.length,S);
        System.out.println(a);
    }
}
