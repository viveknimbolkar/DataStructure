package array.problems;

import java.util.Arrays;

// https://practice.geeksforgeeks.org/problems/sum-of-middle-elements-of-two-sorted-arrays2305/1
public class SumOfMiddleTerms {

    int findMidSum(int[] arr1,int[] arr2){
        //create temparr of size arr1+arr2 and store sorted elements
        int[] tempArr = new int[arr1.length+arr2.length];
        System.arraycopy(arr1,0,tempArr,0,arr1.length);
        System.arraycopy(arr2,0,tempArr,arr1.length,arr2.length);
        Arrays.sort(tempArr);
        for (int t:tempArr) {
            System.out.print(t+" ");
        }
        return 1;
     }

    public static void main(String[] args) {
        SumOfMiddleTerms sumOfMiddleTerms = new SumOfMiddleTerms();
        int[] a1 = {1, 2, 4, 6, 10};
        int[] a2 = {4, 5, 6, 9, 12};
        sumOfMiddleTerms.findMidSum(a1,a2);
    }
}
