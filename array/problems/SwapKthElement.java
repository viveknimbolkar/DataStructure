package array.problems;

import array.rotation.OneByOne;

public class SwapKthElement {

    void swapKth(int[] arr, int n, int k) {
        for(int i = n-1;i>0;i--){
            if(i == k){
                int temp = arr[k-1];
                arr[k-1] = arr[i];
                arr[i] = temp;
                break;
            }
        }
    }

    public static void main(String[] args) {
        SwapKthElement swap = new SwapKthElement();
        OneByOne one = new OneByOne();
        int[] arr = {1,2,3,4,5,6,7,8};
        int k = 3;
        swap.swapKth(arr,arr.length,k);
        one.printArray(arr);
    }
}
