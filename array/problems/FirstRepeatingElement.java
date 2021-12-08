package array.problems;

import java.util.HashSet;

// https://practice.geeksforgeeks.org/problems/first-repeating-element4018/1
public class FirstRepeatingElement {

    // Method 1: Using hashset and adding min value to the hashset
    int firstRepeated(int[] arr){
        HashSet<Integer> hash = new HashSet<>();
        int minRepeated = -1;
        //traverse array from end to start and find min value
        for (int i = arr.length-1; i >= 0 ; i--) {
            if (hash.contains(arr[i]))
                minRepeated = i;
            else
                hash.add(arr[i]);
        }
        // if repeated element found then return index+1
        if(minRepeated >= 0) return minRepeated+1;
        return -1;
    }


    // Method 2: Working but optimization required
    int find(int[] arr){
        int[] repeat = new int[arr.length];

        //get the repetation count of specific element
        for (int i = 0; i < arr.length; i++) {
            repeat[i] = getCount(arr,arr[i]);
            if (repeat[i] > 0) break;
            System.out.print(repeat[i]+" ");
        }

        for (int i=0;i < arr.length; i++) {
           if (repeat[i] > 0) {
               return i + 1;
           }
        }
        return -1;
    }

    int getCount(int[] arr, int element){
        int count = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        FirstRepeatingElement firstRepeatingElement = new FirstRepeatingElement();
        int[] arr = {1, 5, 3, 4, 3, 5, 6};
        System.out.println("output "+firstRepeatingElement.firstRepeated(arr));
    }
}
