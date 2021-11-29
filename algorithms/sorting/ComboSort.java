package algorithms.sorting;
// Best case: O(nlogn)
public class ComboSort {

    int getNextGap(int currentGap){
        currentGap = (currentGap * 10) /13; // gap difference is 1.3 on every iteration
        if (currentGap < 1) return 1; // is no more gap is remain
        return currentGap;
    }

    void comboSort(int[] arr){
        int arrLength = arr.length;
        int gap = arrLength; // initial gap is the size of an array
        boolean swapped = false;

        while (gap != 1 || swapped == true){
            // get the next gap
            gap = getNextGap(gap);
            swapped = false;
            for (int i = 0; i < arrLength - gap; i++) {
                //if left element is small then swap it
                // if we compare with < than value, then we can get arr in descending order
                if (arr[i] > arr[i + gap]){
                    int temp = arr[i];
                    arr[i] = arr[i+gap];
                    arr[i+gap] = temp;

                    swapped = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        ComboSort comboSort = new ComboSort();
        int[] data = {-3,5,-1,-8,23,4,8,2,4,24,-9,34};
        comboSort.comboSort(data);
        for (int x: data) {
            System.out.print(x+" ");
        }
    }
}
