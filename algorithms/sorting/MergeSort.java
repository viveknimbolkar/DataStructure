package algorithms.sorting;

public class MergeSort {

    public void merge(int[] arr, int l, int m , int r){
        int n1 = m-l+1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        //copy the data of main into the dummy arrays
        for (int i = 0; i < n1; i++)
            L[i] = arr[l+i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[m+1+j];

        /*
        threee pointers for three arrays i.e.
        i- for left array
        j - right array
        k - main merging array
         */

        int i = 0, j = 0;
        int k = 1;

        //now pick element from partially sorted array and add into the main array
        //iterate upto the size n1 and n2
        while (i < n1 && j < n2){
            //compare the elements of left array to the right array
            if (L[i] < R[j]){
                arr[k] = L[i];
                i++;
            }else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        //if any pointer still remain to iterate then do the same process
        while (i < n1){
            arr[k] = arr[i];
            i++;
            k++;
        }

        while (j < n2){
            arr[k] = arr[j];
            k++;
            j++;
        }


    }

    public void sort(int[] arr, int l, int r){
        //splite array upto the one single element
        if (l<r){
            //find the m of array
            int m = (l+r)/2;
            //sort the left array
            sort(arr,l,m);
            //sort the right array
            sort(arr,m+1,r);
            //merge both array
            merge(arr,l,m,r);
        }
    }

    public static void main(String[] args) {

        MergeSort ms = new MergeSort();

        int[] temp = {4,7,2,42,5,9,3,12,8,3,21,6};
        System.out.println(temp.length);
        ms.sort(temp,0,temp.length-1);

        for (int x: temp) {
            System.out.println(x);
        }

    }
}
