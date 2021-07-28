package algorithms;

public class SelectionSort {

    void selectionSort(int[] array){

        int array_length = array.length;

        //iterate through the array
        for (int i = 0; i < array_length - 1 ; i++) {

            int small_element = i;//index number of smallest element in an array

            //iterate through the subarray
            for (int j = i+1; j < array_length; j++) {

                if (array[j] < array[small_element])
                    small_element = j;

                //if array[j] is smaller than array[small-element] then swap the element
                int temp = array[small_element];
                array[small_element] = array[i];
                array[i] = temp;

            }
        }
    }

    void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        SelectionSort ss = new SelectionSort();

        int[] arr = {2,6,4,8,0,41,3,5,1,9};

        ss.selectionSort(arr);
        ss.printArray(arr);

    }
}
