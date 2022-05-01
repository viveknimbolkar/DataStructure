package algorithms.searching;
// https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1/
import java.util.Arrays;

public class MajorityElement {

    int majorityElement(int[] arr, int n){
        if (arr.length == 1) return arr[0];
        Arrays.sort(arr);
        int half = n/2;
        int counter = 0;

        for (int i = 0; i < n; i++)
            if (arr[i] == arr[i+1]){
                counter++;
                if (counter >= half) return arr[i];
            }else counter = 0;

        return -1;
    }

    public static void main(String[] args) {
        MajorityElement majority = new MajorityElement();
        int[] arr = {3,1,3,3,2};
        System.out.println(majority.majorityElement(arr,arr.length));
    }
}
