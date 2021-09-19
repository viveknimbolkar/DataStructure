package algorithms.sorting;

public class BubbleSort {

    public void bubbleSort(int[] array){

        int array_length = array.length;

        //iterate upto length -1 element
        for (int i = 0; i < array_length-1; i++) {

            //compare and swap adjucant numbers
            for (int j = 0; j < array_length -i -1; j++) {

                if (array[j] > array[j+1]){
                    //swap the array
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public void printSortedArray(int[] array){

        for (int i: array) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        int[] my_array = {45,2,468,7,94,2,46,78,0,62,1,1,5,79,4,14,23};

        BubbleSort bs = new BubbleSort();

        bs.bubbleSort(my_array);

        bs.printSortedArray(my_array);
    }
}
