package greedy;

import java.util.Arrays;

//https://practice.geeksforgeeks.org/problems/maximize-toys0331/1
public class MaximizeToys {

    int toyCount(int N, int K, int arr[]) {
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < N; i++) {
            K = K - arr[i];
            if (K <= 0) break;
            else  count++;
        }
        return count;
    }

    public static void main(String[] args) {
        MaximizeToys maxi = new MaximizeToys();
        int N = 7;
        int K = 50;
        int arr[] = {1, 12, 5, 111, 200, 1000, 10};
        int[] arr1 = {20, 30, 50};
        System.out.println("Maximized toys: "+maxi.toyCount(N,K,arr));
    }
}
