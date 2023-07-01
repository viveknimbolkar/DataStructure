package algorithms.searching;

import java.util.Arrays;

public class ExponentialSearch {

    private int exponentialSearch(int[] arr,int item){
        if (arr[0] == item) return 0;

        // find out the search space with the exponential of 2
        int i = 1;
        while (i < arr.length && arr[i] <= item)
            i *= 2;

        return Arrays.binarySearch(arr,i/2,i,item);
    }

    public static void main(String[] args) {
        ExponentialSearch expo = new ExponentialSearch();
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int item = 7;
        System.out.println(expo.exponentialSearch(arr,item));
    }
}
