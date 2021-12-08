package array.problems;
// https://practice.geeksforgeeks.org/problems/maximum-product-of-two-numbers2730/1/
import java.util.Arrays;

public class FindMaxProduct {

    //Method 1: compare the product of each element and set max
    int findMaxProduct(int[] arr,int n){
        int max = 0;
        for(int i = 0 ;i<n-1;i++){
            for(int j = 1; j < n;j++){
                if(i == j) continue;
                if((arr[i]*arr[j]) > max){
                    max = arr[i]*arr[j];
                }
            }
        }
        return max;
    }

    //Method 2: return the product of last two element
    int findMaxProduct(int[] arr){
        int l = arr.length;
        Arrays.sort(arr);
        return arr[l-1]*arr[l-2];
    }

    public static void main(String[] args) {
        FindMaxProduct max = new FindMaxProduct();
        int[] arr = {1, 4, 3, 6, 7, 0};
        int[] arr2 = {1, 100, 42, 4, 23};
        System.out.println(max.findMaxProduct(arr2));
    }
}
