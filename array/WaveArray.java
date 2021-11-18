package array;
// https://practice.geeksforgeeks.org/problems/wave-array-1587115621/1/

import array.rotation.OneByOne;

public class WaveArray {

    void convertToWave(int[] arr, int size){
        //swap all consecutive elements with the increment of 2 (i)
        for (int i = 0; i < size-1; i+=2) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }

    public static void main(String[] args) {
        WaveArray waveArray = new WaveArray();
        OneByOne oneByOne = new OneByOne();
        int[] arr ={2,4,7,8,9,10};
        int[] arr2 = {6907,7808,8551,8683,9205,9980};
        waveArray.convertToWave(arr2, arr2.length);
        oneByOne.printArray(arr2);
    }
}
