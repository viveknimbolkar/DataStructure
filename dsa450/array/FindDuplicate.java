package dsa450.array;

import java.util.Arrays;
//https://leetcode.com/problems/find-the-duplicate-number
public class FindDuplicate {
    public int findDuplicateUsingSorting(int[] arr){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i+1] == arr[i]) return arr[i];
        }
        return -1;
    }

    int findDuplicateUsingFrequency(int[] arr){
        int[] freq = new int[arr.length+1];
        for (int i = 0; i <arr.length ; i++) {
            freq[arr[i]]++;
            if (freq[arr[i]] > 1) return arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        FindDuplicate findDup = new FindDuplicate();
        int[] arr = {1,3,4,2,2};
        System.out.println(findDup.findDuplicateUsingFrequency(arr));
    }
}
