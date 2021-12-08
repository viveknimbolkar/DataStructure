package algorithms.sorting;

public class QuickSort {

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partationArray(int[] arr, int low, int high){
        int pivotElement = arr[high]; // last element of an array is the pivot element
        int i = (low-1);
        //now iterate and swap all small element in left side and all large element at right side
        for (int j = low; j <= high-1; j++) {
            // swap element is jth element is less than pivot element
            if (arr[j] < pivotElement){
                i++; // increase pointer of smaller element
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }

    public void quickSort(int[] arr, int low, int high){
        if (low < high){
            // take a pivot element at place it to its right position
            // i.e small element at left side and large element at right side
            int partation = partationArray(arr,low,high);
            // now recursively sort left side array
            // and pivot element is the last element of an array
            quickSort(arr,low,partation-1);
            // recursively sort right side array
            // pivot element is first element in an array
            quickSort(arr,partation+1,high);
        }
    }

    void printArray(int[] arr){
        for (int x: arr) {
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] data = {45,78,2,34,89,2,345,59};

        quickSort.quickSort(data,0, data.length-1);
        quickSort.printArray(data);


    }
}
