import java.util.Arrays;
import java.util.Scanner;

class MyClass{

    // bubble sort
    static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // selection sort
    static  void selectionSort(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            int minEle = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minEle])
                    minEle = j;
            }

            int temp = arr[minEle];
            arr[minEle] = arr[i];
            arr[i] = temp;

        }
    }

    // merge sort

    static void merge(int[] arr, int l, int m, int r){
        int n1 = m-l+1;
        int n2 = r-m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[i+l];

        for (int j = 0; j < n2; j++)
            R[j] = arr[m+1+j];

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2){
            if (L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    static void mergeSort(int[] arr, int l, int r){
        if (l < r){
            int m = l + (r-l)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }

    static void print(int[] arr){
        for (int a: arr)
            System.out.print(a+" ");
    }
    public static void main(String[] args) {
       int[] arr = {5,7,3,5,2,3,4,8,1,5};
        mergeSort(arr,0,arr.length-1);
        print(arr);
    }
}