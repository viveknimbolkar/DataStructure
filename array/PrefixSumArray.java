package array;

import array.rotation.OneByOne;

public class PrefixSumArray {

    int[] prefixSum(int[] arr){
        int arrSize = arr.length;
        int[] tempArr = new int[arrSize];

        tempArr[0] = arr[0];
        // get the sum of previous and current element and assign to tempArr
        for (int i = 1; i < arrSize; i++)
            tempArr[i] = tempArr[i-1] + arr[i];

        return tempArr;
    }

    public static void main(String[] args) {
        PrefixSumArray prefixSumArray = new PrefixSumArray();
        OneByOne oneByOne = new OneByOne();

        int[] arr = {34,5,7,8,9,7,3,5,3,2,68,4};
        int[] tempArr = prefixSumArray.prefixSum(arr);;
        oneByOne.printArray(tempArr);
    }
}
