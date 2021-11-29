package algorithms.sorting;

import predefined.PredefinedMethods;

public class SelectionSort {
    // O(n^2)
    // divide an array into two parts [Sorted | Unsorted]
    // In each iteration pick up smallest element from unsorted array and add
    // at the end of sorted array
    void selectionSort(int[] array){
        int array_length = array.length;
        //iterate through the array
        for (int i = 0; i < array_length; i++) {
            int small_element = i;//index number of smallest element in an array
            //pick up the smallest element from the sorted array
            for (int j = i+1; j < array_length; j++) {
                // pick up that smallest element
                if (array[j] < array[small_element])
                    small_element = j;

                //swap that small element with the element just after the sorted array
                int temp = array[small_element];
                array[small_element] = array[i];// use arr[j] to sort in descending order
                array[i] = temp;// here also use arr[j] to swap in descending order
            }
        }
    }

    public static void main(String[] args) {
        PredefinedMethods methods = new PredefinedMethods();
        SelectionSort ss = new SelectionSort();

        int[] arr = {7,8,6,1,5,2,3,4};

        methods.printArray(arr);
        ss.selectionSort(arr);
        methods.printArray(arr);

    }
}
