package array.problems;

import java.util.ArrayList;
import java.util.Collections;

// https://practice.geeksforgeeks.org/problems/nearly-sorted-1587115620/1/
public class NearlySorted {

    ArrayList<Integer> nearlySorted(int[] arr){
        ArrayList<Integer> tempArrList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            tempArrList.add(arr[i]);
        }

        Collections.sort(tempArrList);

        return tempArrList;
    }

    public static void main(String[] args) {
        NearlySorted nsort = new NearlySorted();
        int[] arr = {6,5,3,2,8,10,9};
        System.out.println(nsort.nearlySorted(arr));
    }
}
