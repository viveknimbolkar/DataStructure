package array.problems;

// https://practice.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1
import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {

    // method 1: TODO NOT WORKING
    ArrayList<Integer> findLeader(int[] arr){
        ArrayList<Integer> tempArr = new ArrayList<>();
        int j;
        for (int i = 0; i <= arr.length; i++) {
            for (j = i+1; j < arr.length; j++) {
                if (arr[i] <= arr[j]){
                    break;
                }
            }
            if (j == arr.length)
                tempArr.add(arr[i]);
        }

        return tempArr;
    }

    // METHOD 2: WORKING
    ArrayList<Integer> findLeader2(int[] arr){
        ArrayList<Integer> tempArr = new ArrayList<>();

        // get the last element as the maximum right element
        int max_right = arr[arr.length-1];
        // add last element in arraylist
        tempArr.add(max_right);

        // traverse from right second element
        for (int i = arr.length-2; i >= 0 ; i--) {
            // if current element is greater than max right element then set max as current elemtn
            if (max_right <= arr[i]) {
                max_right = arr[i];
                tempArr.add(max_right); // if mx element found then add it into the arraylist
            }
        }
        // reverse the arraylist
        Collections.reverse(tempArr);
        return tempArr;
    }



    public static void main(String[] args) {
        LeadersInArray leader = new LeadersInArray();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] arr = {16,17,4,3,5,2};
        System.out.println(leader.findLeader2(arr));
    }
}
