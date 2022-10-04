package greedy;
//https://practice.geeksforgeeks.org/problems/maximize-arrii-of-an-array0026/1
import java.util.Arrays;

public class MaximizeSum {


    int maximize(int arr[], int n) {
        Arrays.sort(arr);
        long ans = 0;

        for (int i = 0; i < n; i++) {
            ans += (long)arr[i]*i;
        }

        return (int)(ans%(1000000007));  // answer is big so converting it into big integer
    }

    public static void main(String[] args) {
        MaximizeSum maxsum = new MaximizeSum();
        int[] arr = {5, 3, 2, 4, 1};
        System.out.println("Max produce: "+maxsum.maximize(arr,arr.length));
    }
}
