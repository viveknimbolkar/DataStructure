package revision.array.searching;

import java.util.Arrays;

public class ExponentialSearch {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(exponentialSearch(arr,6));
    }

    private static int exponentialSearch(int[] arr, int find) {
        int i = 1;
        int n = arr.length;

        if (arr[0] == find) return 0;

        while (i < n && arr[i] < find)
            i *= 2;

        return Arrays.binarySearch(arr,i/2,Math.min(i,n-1),find);
    }
}
