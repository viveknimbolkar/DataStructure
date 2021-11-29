package array;
// https://practice.geeksforgeeks.org/problems/minimum-difference-pair5444/1/?
import predefined.PredefinedMethods;
import java.util.Arrays;

public class MinimumDiffPair {
    PredefinedMethods pre = new PredefinedMethods();
    int minimumDifference(int[] arr){
        int[] a = new int[arr.length-1];
        int j = 0;
        for(int i = 0; i<arr.length-1; i++){
            a[j] = arr[i+1] - arr[i];
            j++;
        }
        Arrays.sort(a);
        pre.printArray(a);
        return a[0];
    }

    public static void main(String[] args) {
        MinimumDiffPair min = new MinimumDiffPair();

        int[] arr = {2, 4, 5, 9, 7};
        int[] arr2 = {3, 10, 8, 6};
        System.out.println(min.minimumDifference(arr2));
    }
}
