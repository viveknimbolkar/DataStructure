package array;

import array.rotation.OneByOne;

// Replace every array element by multiplication of previous and next
public class PrevAndNextMultiplication {

    int[] multiplyPrevAndNext(int[] arr){
        int arrSize = arr.length;
        int[] tempArr = new int[arrSize];

        tempArr[0] = arr[0]*arr[1];
        for (int i = 1; i <arrSize-1 ; i++)
            tempArr[i] = arr[i-1] * arr[i+1];

        tempArr[arrSize-1] = arr[arrSize-1] * arr[arrSize-2];
        return tempArr;
    }

    public static void main(String[] args) {
        PrevAndNextMultiplication panp = new PrevAndNextMultiplication();
        OneByOne oneByOne = new OneByOne();

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] multipliedArray = panp.multiplyPrevAndNext(arr);
        oneByOne.printArray(multipliedArray);
    }
}
