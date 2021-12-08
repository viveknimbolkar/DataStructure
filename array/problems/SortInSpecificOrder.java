package array.problems;

import predefined.PredefinedMethods;

// https://practice.geeksforgeeks.org/problems/sort-in-specific-order2422/1/
public class SortInSpecificOrder {
    PredefinedMethods methods = new PredefinedMethods();
    void sortInSpecificOrder(int[] arr){
        int[] oddNum = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 == 1){
                oddNum[k] = arr[i];
                k++;
                //shift all element to left by one
                for (int j = i; j < arr.length-1; j++) {
                    arr[i] = arr[i+1];
                }
            }
        }
        methods.printArray(arr);
        methods.printArray(oddNum);
    }

    public static void main(String[] args) {
        SortInSpecificOrder sort = new SortInSpecificOrder();
        int[] arr = {1, 2, 3, 5, 4, 7, 10};
        sort.sortInSpecificOrder(arr);
    }
}
