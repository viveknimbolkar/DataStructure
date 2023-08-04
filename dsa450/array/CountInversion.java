package dsa450.array;

import java.util.Arrays;

public class CountInversion {

    //brute force solution
    public int countInversion(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                if (arr[i] > arr[j]) count++;
            }
        }
        return count;
    }

    // USING MERGE SORT

    public int merge(int[] arr, int left, int right, int mid){
        int[] L = Arrays.copyOfRange(arr,left,mid+1);
        int[] R = Arrays.copyOfRange(arr,mid+1,right+1);

        int i = 0, j= 0, k = left, count = 0;
        while (i < L.length && j < R.length){
            if (L[i] <= R[j]){
                arr[k] = L[i++];
            }else{
                count += (mid+1)-(left+i);
                arr[k] = R[j++];
            }
            k++;
        }
        while (i < L.length){
            arr[k++] = L[i++];
        }
        while (j < R.length){
            arr[k++] = R[j++];
        }

        return count;
    }
    public int mergeSortCount(int[] arr,int left,int right){
        int count = 0;

        if (left < right){
            int mid = (left+right)/2;
            count += mergeSortCount(arr,left,mid);
            count += mergeSortCount(arr,mid+1,right);
            count += merge(arr,left,right,mid);
        }
        return count;
    }


    public static void main(String[] args) {
        CountInversion ci = new CountInversion();
//        int[] arr = {2,4,1,3,5};
        int[] arr = { 1, 20, 6, 4, 5 };
//        System.out.println(ci.countInversion(arr));
        System.out.println(ci.mergeSortCount(arr,0, arr.length-1));
    }
}
