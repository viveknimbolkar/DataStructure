package array.problems;

public class SmallestPositiveMissingNumber {

//    int findMissing(int[] arr){
//
//        //create a list of bool values
//        boolean[] tempArr = new boolean[arr.length];
//
//        //store all the positive number into the bool list
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0 && arr[i] <=arr.length){
//                tempArr[i] = true;
//            }
//        }
//
//        // iterate and our first 0 means false value is our answer
//        for (int i = 0; i < arr.length; i++) {
//            if (tempArr[i])
//                return i;
//        }
//
//        return arr.length;
//    }

    int segerate(int[] arr){
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            // put all negative values to the left side and all positive values to right side
            if (arr[i] <= 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return j;
    }

    int findMissingPositive(int[] arr, int size){
        for (int i = 0; i < size; i++) {
            int x = Math.abs(arr[i]); //convert negative no. to positive
            if (x-1 < size && arr[x-1] > 0)
                arr[x-1] = -arr[x-1];
        }

        //return the first positive value
        for (int i = 0; i < size; i++) {
            if (arr[i] > 0)
                return i+1;
        }
        return  size+1;
    }

    int findMissing(int[] arr){
        int arrSize = arr.length;
        int shift = segerate(arr);
        //create temp arry to hold all positive values of length shift
        int[] arr2 = new int[arrSize-shift];
        int j = 0;
        for (int i = shift; i < arrSize; i++) {
            arr2[j] = arr[i];
            j++;
        }
        return findMissingPositive(arr2,j);
    }


    public static void main(String[] args) {
        SmallestPositiveMissingNumber spmn = new SmallestPositiveMissingNumber();
        int[] arr = {0, 10, 2, -10, -20 };
        System.out.println(spmn.findMissing(arr));
    }
}

