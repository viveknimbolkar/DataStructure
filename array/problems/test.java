package array.problems;

import array.rotation.OneByOne;

public class test {

    void waveArr(int[] arr){
        for (int i = 0; i <arr.length -1; i+=2) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }

    public static void main(String[] args) {
        test t = new test();
        int[] arr = {1,2,3,4,5};
        OneByOne oneByOne = new OneByOne();
        t.waveArr(arr);
        oneByOne.printArray(arr);
    }
}
