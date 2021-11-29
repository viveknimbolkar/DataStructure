package algorithms.sorting;

import predefined.PredefinedMethods;
/*
Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.
Best Case Time Complexity: O(n). Best case occurs when array is already sorted.
Auxiliary Space: O(1)
Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are already sorted.
 */
public class BubbleSort {

    // compare adjacent element upto size-i-1
    // swap all adjancent element in which first element is greater than second element
    public void bubbleSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            // swap all element having first element is greater than second element
            for (int j = 0; j < array.length-i-1; j++) {
                //sorting in ascending order
                if (array[j] > array[j+1]){ // use < to sort in descending order
                    //swapping adjancent element
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        PredefinedMethods methods = new PredefinedMethods();
        BubbleSort bs = new BubbleSort();
        int[] my_array = {45,2,468,7,94,2,46,78,0,62,1,1,5,79,4,14,23};
        methods.printArray(my_array);
        bs.bubbleSort(my_array);
        methods.printArray(my_array);
    }
}
