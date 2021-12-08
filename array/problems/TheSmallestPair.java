package array.problems;

//https://www.codechef.com/problems/SMPAIR

import java.util.Arrays;
import java.util.Scanner;

class TheSmallestPair{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        for (int i = 0; i < testcase; i++) {
            int N = sc.nextInt();
            int[] values = new int[N];

            for (int j = 0; j < N; j++) {
                values[j] = sc.nextInt();
            }

            Arrays.sort(values);
            System.out.println(values[0] + values[1]);

        }

    }

}