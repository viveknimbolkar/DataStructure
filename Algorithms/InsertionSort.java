package Algorithms;

public class InsertionSort {

    public void insertionSort(int[] array){

        int array_length = array.length;

        for (int i = 0; i < array_length ; ++i) {

            int key = array[i]; //current element
            int j = i-1; //index of previous element

            //if previous element is greather than current element then swap the element or shift the left element to
            // the right
            while (j >= 0 && array[j] > key){
                array[j+1] = array[j]; //shift the previous element to the right side
                j--; //decrement j to its original position
            }

            //if previous element is not greather than current element then leave as it
            array[j+1] = key;
        }
    }

    public void printSortedArray(int[] array){

        for (int i: array) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        InsertionSort is = new InsertionSort();

        int[] myarray = {45,67,3,6,238,4,2,7,23,12,8,4,2,1};

        is.insertionSort(myarray);
        is.printSortedArray(myarray);
    }
}
