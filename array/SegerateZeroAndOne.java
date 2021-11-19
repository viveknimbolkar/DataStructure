package array;
// TODO: method 1 not working
import array.rotation.OneByOne;

import java.util.Arrays;
// https://practice.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1/

public class SegerateZeroAndOne {

    //Method 1
    void segregate0and1(int[] arr){
        //check if 0 or 1 are not present, then just return
        boolean isZeroPresent = findMe(arr, 0);
        boolean isOnePresent = findMe(arr, 1);
        if (!isZeroPresent || !isOnePresent) return;

        int freqOfZero = getFrequency(arr,0);
        int freqOfOne = getFrequency(arr,1);

        System.out.println(freqOfZero+" "+freqOfOne);
        //set zero upto freqOfZero
        for (int i = 0; i < freqOfZero; i++) {
            arr[i] = 0;
            System.out.print("add 0"+" ");
        }
        System.out.println();

        //set one upto freqOfZero
        for (int j = freqOfZero+1; j < freqOfOne; j++) {
            arr[j] = 1;
            System.out.print("add 1"+" ");
        }

    }

    int getFrequency(int[] arr,int myFreq){
        int frequency = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == myFreq)
                frequency++;
        }
        return frequency;
    }

    //find element in an array
    boolean findMe(int[] arr, int me){
        for (int data: arr)
            if (data == me)
                return true;
        return false;
    }



    public static void main(String[] args) {
        SegerateZeroAndOne segerateZeroAndOne = new SegerateZeroAndOne();
        int[] arr = {0, 0, 1, 1, 0,1,0};
        OneByOne oneByOne = new OneByOne();
        Arrays.sort(arr);
        oneByOne.printArray(arr);
    }
}
