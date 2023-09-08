package dsa450.array;

import java.util.ArrayList;
import java.util.Collections;

//https://practice.geeksforgeeks.org/problems/maximum-product-subarray3604/1/
public class MaxProductSubarray {

    // brute force
    long maxProduct(int[] arr, int n) {
        ArrayList<Long> products = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long product = arr[i];
            products.add((long)arr[i]);
            for (int j = i+1; j < n; j++) {
               product *= arr[j];
               products.add(product);
            }
        }
        System.out.println(products);
        return Collections.max(products);
    }

    // optimal O(n)
    long maxProduct2(int[] arr, int n){
        long prefix = 1, suffix = 1;
        long maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (prefix == 0) prefix = 1;
            if (suffix == 0) suffix = 1;

            prefix = prefix * arr[i];
            suffix = suffix * arr[n-i-1];

            maxProduct = Math.max(maxProduct,Math.max(suffix,prefix));
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        MaxProductSubarray maxprodcut = new MaxProductSubarray();
        int[] arr =  {6, -3, -10, 0, 2};
        System.out.println(maxprodcut.maxProduct2(arr, arr.length));
    }
}
