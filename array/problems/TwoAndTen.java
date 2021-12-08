package com.solve;

import java.util.Scanner;

// https://www.codechef.com/problems/TWOVSTEN
public class TwoAndTen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        for (int i = 0; i < testcase; i++) {
            int X = sc.nextInt();

            if (X%10 == 0){
                //if no. is divisible by 10
                System.out.println(0);
            }else if(X%10 == 5){
                // getting the last digit of number (no. should be 5)
                System.out.println(1);
            }else {
                //for other digit from 0 to 4 and 6 to 9
                System.out.println(-1);
            }

        }
    }
}
