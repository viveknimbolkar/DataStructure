package com.solve;

import java.util.Scanner;

// https://www.codechef.com/problems/TRISQ
public class FitSquareInTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        for (int i = 0; i < testcase; i++) {
            int base = sc.nextInt(); // base of triangle

            base = base - 2; // prevent square from overflow
            base = base / 2; // find total number of square that can be fit inside a given base space
            base = (base * (base + 1)) / 2; // Formula for Arithmetic Progression

            System.out.println(base);
        }
    }
}
