package array.problems;

import java.util.Arrays;

// https://leetcode.com/problems/remove-element/
public class RemoveElement {

    int removeElement(int[] nums, int val){
        //Sort array
        Arrays.sort(nums);
        int freq = getFreqency(nums,val);
//        System.out.println(freq);

        for (int i = 0; i < nums.length; i++) {
            // starting point of val (catch repetition)
            if (nums[i] == val){
                // swap element upto freq time
                for (int j = 0; j < freq; j++) {
                    swap(nums,j,nums.length-1);
                }
                return nums.length-freq;
            }
        }
        return -1;
    }

    void swap(int[] arr, int i, int j){
        if (i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            swap(arr,i+1,j-1);
        }
    }

    // get the frequency of the val in array
    int getFreqency(int[] arr, int val){
        int counter = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == val) counter++;
        return counter;
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int[] arr = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println("K: "+removeElement.removeElement(arr,val));
        // TODO: elements are not swapping upto the end
        for (int x: arr) {
            System.out.print(x+" ");
        }
    }
}
