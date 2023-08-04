package  algorithms.sorting;

import predefined.PredefinedMethods;

class MergeSort
{
    void merge(int[] arr, int l,int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        //copy half array in L
        for(int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        //copy half right array into R
        for(int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];


        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        //put all the remaining element in L to arr
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        //put all the remaining element in R to arr
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void sort(int[] arr, int l, int r){
        if (l < r) {
            int m =l + (r-l)/2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }


    public static void main(String args[]) {
        MergeSort merge = new MergeSort();
        PredefinedMethods pre = new PredefinedMethods();
        int[] arr = {5,9,2,6,4,89,28,2,8,1,5};
        pre.printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);
        pre.printArray(arr);
    }
}
