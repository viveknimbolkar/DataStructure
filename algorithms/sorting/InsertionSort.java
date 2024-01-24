package algorithms.sorting;

import predefined.PredefinedMethods;
// O(n^2)
public class InsertionSort {

    public void insertionSort(int[] array){
        for (int i = 0; i < array.length ; i++) {
            int key = array[i]; //current element
            int j = i-1; //index of previous element
            //if previous element is greater than current element then swap the element or shift the left element to
            // the right
            while (j >= 0 && array[j] > key){
                array[j+1] = array[j]; //shift the previous element to the right side
                j--; //decrement j to its original position
            }
            //if previous element is not greater than current element then leave as it
            array[j+1] = key;
        }
    }

    public void recursiveInsertionSort(int[] arr, int n,int i){
        if(n == i) return;
        int j = i;
        while (j > 0 && arr[j-1] > arr[j]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }
        recursiveInsertionSort(arr,n,i+1);
    }
    public static void main(String[] args) {
        PredefinedMethods methods = new PredefinedMethods();
        InsertionSort is = new InsertionSort();

        int[] myarray = {45,67,3,6,238,4,2,7,23,12,8,4,2,1};

        methods.printArray(myarray);
        is.recursiveInsertionSort(myarray,myarray.length,0);
        methods.printArray(myarray);
    }
}
