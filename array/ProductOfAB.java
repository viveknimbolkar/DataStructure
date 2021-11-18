package array;

import java.util.Arrays;

// https://practice.geeksforgeeks.org/problems/product-of-maximum-in-first-array-and-minimum-in-second3943/1/
public class ProductOfAB {

    long findMultiplication(int[] arr1, int[] arr2, int sizeOf1, int sizeOf2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return (long) arr1[sizeOf1-1] * arr2[0];
    }

    public static void main(String[] args) {
        ProductOfAB productOfAB = new ProductOfAB();
        int[] arr1 = {5, 7, 9, 3, 6, 2};
        int[] arr2 = {1, 2, 6, -1, 0, 9};
        System.out.println(productOfAB.findMultiplication(arr1,arr2,arr1.length,arr2.length));
    }
}
