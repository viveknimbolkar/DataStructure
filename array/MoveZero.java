package array;

import array.rotation.OneByOne;

import java.util.Arrays;
import java.util.Collections;

public class MoveZero {

    // Method 1: keep count of zero element
    void moveZero(int[] arr){
        int arrSize = arr.length;
        int count = 0;
        //iterate every array and count the number of zero
        for (int i = 0; i < arrSize-1; i++) {
            if (arr[i] != 0)
                arr[count++] = arr[i];
        }
        //replacing all end elements with zero
        while (count < arrSize)
            arr[count++] = 0;
    }

    //Method 2: sort an array in descending order
    void moveZeroBySorting(int[] arr){
        Arrays.sort(arr); //TODO: Sort array in descending order
    }

    public static void main(String[] args) {
        MoveZero moveZero = new MoveZero();
        OneByOne oneByOne = new OneByOne();
        int[] arr = {1,0,8,6,0,5,0,0,3,0,3,1,6,7,0};
        moveZero.moveZeroBySorting(arr);
        oneByOne.printArray(arr);
    }
}
