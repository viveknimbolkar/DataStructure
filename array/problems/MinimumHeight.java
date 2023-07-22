package array.problems;
//https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1
public class MinimumHeight {

    int getMinDiff(int[] arr, int n, int k) {
        int min = 0, max = 0, diff = arr[n-1]-arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i]-k < 0) continue;
            else {
                max = Math.max(arr[i - 1] + k, arr[n - 1] - k); // find all the possible max towers from 0 to n
                min = Math.min(arr[0] + k, arr[i] - k); // find all the min towers from i+1 to n
                diff = Math.min(diff, max - min); // update diff if minimum diff is found
            }
        }
        return diff;
    }

    public static void main(String[] args) {
        MinimumHeight minHeight = new MinimumHeight();
        int[] a = {1, 5, 8, 10};
        int k = 2;
        System.out.println( minHeight.getMinDiff(a,a.length,k));
    }
}
