package array;

import array.rotation.OneByOne;

public class ReverseArrayInGroup {

    void reverse(int[] arr, int groupof){
        for (int i = 0; i <arr.length ; i+=groupof) {
            int temp, left = i;

            int right = Math.min(i+groupof-1,arr.length-1);

            while (left<right){
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = arr[left];
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        ReverseArrayInGroup reverseArrayInGroup = new ReverseArrayInGroup();
        OneByOne oneByOne = new OneByOne();
        int[] arr = {1,2,3,4,5};
        int groupof = 3;
        reverseArrayInGroup.reverse(arr,groupof);
        oneByOne.printArray(arr);
    }
}
