package array;

import array.rotation.OneByOne;
// https://practice.geeksforgeeks.org/problems/need-some-change/1/

public class NeedSomeChanges {
    static void swapElement(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length-2) {
                int temp = arr[i];
                arr[i] = arr[i + 2];
                arr[i + 2] = temp;
            }
        }
    }

    public static void main(String[] args) {
        OneByOne one = new OneByOne();
        int[] arr= {1,2,3,4,5};
        swapElement(arr);
        one.printArray(arr);
    }
}
