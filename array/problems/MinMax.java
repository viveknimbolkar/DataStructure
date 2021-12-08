package com.solve;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// https://www.codechef.com/submit/MNMX
public class MinMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        for (int i = 0; i < testcase; i++) {
            int arrSize = sc.nextInt();
            int[] arr = new int[arrSize];
            // get values from user and put into an arry
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }
            //sort array
            Arrays.sort(arr);
            for (int x: arr) {
                System.out.print(x+" ");
            }
            System.out.println(arr[0]*(arrSize-1));
        }
    }
}
