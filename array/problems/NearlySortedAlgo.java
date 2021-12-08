package array.problems;
import java.util.Arrays;
import java.util.Scanner;
// https://practice.geeksforgeeks.org/problems/nearly-sorted-algorithm/0/

class NearlySortedAlgo {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0;i<t;i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n]; //array
            //get array elements
            for(int j =0;j<n;j++){
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            for(int d:arr){
                System.out.print(d+" ");
            }
            System.out.println();
        }
    }
}