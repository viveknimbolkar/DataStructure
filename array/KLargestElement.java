package array;
// https://practice.geeksforgeeks.org/problems/k-largest-elements4206/1/
import array.rotation.OneByOne;
import java.util.Arrays;

public class KLargestElement {

    int[] getKElements(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int[] tempArr = new int[k];
        int j =0;
        for(int i=n-1;i>0;i--){
            if(j == k)
                break;
            tempArr[j] = arr[i];
            j++;
        }
        return tempArr;
    }

    public static void main(String[] args) {
        KLargestElement kLargestElement = new KLargestElement();
        int[] arr = {12, 5, 787, 1, 23};
        int k = 3;
        int[] kArr = kLargestElement.getKElements(arr,arr.length,k);
        OneByOne oneByOne = new OneByOne();
        oneByOne.printArray(kArr);
    }
}
