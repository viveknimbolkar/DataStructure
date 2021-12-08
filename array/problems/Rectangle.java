package array.problems;

import java.util.Scanner;

// https://www.codechef.com/problems/RECTANGL
public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        for (int i = 0; i < testcase; i++) {
            int a = sc.nextInt(),
                b = sc.nextInt(),
                c = sc.nextInt(),
                d = sc.nextInt();

            //compare all the sides from each other
            if ((a == b && c == d) || (a==c && b == d) || (a==d && b==c))
                System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
