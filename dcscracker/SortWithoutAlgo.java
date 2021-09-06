package dcscracker;
// TC = O(n)  only one traversal is needed
public class SortWithoutAlgo {

    // Approach 1 (Replace according to the digit)
    public void sort012(int[] arr){
        int low = 0; //store 0's
        int mid = 0; //store 1's
        int high = arr.length-1 ; //store 2's
        int temp = 0; //user for swapping

        //iterate upto mid less than high
        while (mid <= high){
            //now switch according to the mid
            switch (arr[mid]){
                case 0:
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
            }
        }
    }


    //Approach 2 (Keep track of all digit and then add into an array)
    public void sortArray(int[] arr){
        int counter0 = 0;
        int counter1 = 0;
        int counter2 = 0;
        int i = 0;

        //now iterate for each and every element
        for (int j = 0; j < arr.length ; j++) {
            //now increment pointer according to the digit
            switch (arr[j]) {
                case 0 -> counter0++;
                case 1 -> counter1++;
                case 2 -> counter2++;
            }
        }

        //add 0 from beginning upto counter0 value
        while (counter0 > 0){
            arr[i] = 0;
            counter0--;
            i++;
        }

        //add 1 from the last position of 0 upto counter1 value
        while (counter1 > 0){
            arr[i] = 1;
            counter1--;
            i++;
        }

        //add 1 from the last position of 1 upto counter2 value
        while (counter2 > 0){
            arr[i] = 2;
            counter2--;
            i++;
        }
    }

    public void printArray(int[] arr){
        for (int x: arr) {
            System.out.print(x+" ");
        }
    }

    public static void main(String[] args) {
        SortWithoutAlgo sort = new SortWithoutAlgo();
        int[] data = {2,0,1,1,0,2,1,1,2,0,1,2,1,0,1,2,0,2,1,0,2,1,1,2};
        sort.sortArray(data);
        sort.printArray(data);
    }
}
