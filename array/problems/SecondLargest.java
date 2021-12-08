package array.problems;

import java.util.Scanner;

// https://www.codechef.com/problems/FLOW017
public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SecondLargest main = new SecondLargest();
        int testcase = sc.nextInt();
        int[] array = new int[3];

        if (testcase <= 1000){
            for (int i = 0; i < testcase; i++) {
                for (int j = 0; j < 3; j++) {
                    array[j] = sc.nextInt();
                }
                main.sort(array);
                System.out.println(array[1]);
            }
        }
    }

    public void sort(int[] arr){
        for (int i = 0; i < arr.length -1; i++) {
            int small = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[small])
                    small = j;
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
    }
}
