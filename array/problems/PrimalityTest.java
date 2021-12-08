package array.problems;

import java.util.Scanner;

public class PrimalityTest {


    public static void main(String[] args) {
        PrimalityTest cc = new PrimalityTest();
        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();

        if (testcase <= 20){
            int x = sc.nextInt();
            if (x <= 100000) {

                for (int k = 0; k < testcase; k++) {
                    int n = sc.nextInt();

                    int temp = 0;

                    for (int i = 2; i < n - 1; i++) {
                        if (n % i == 0)
                            temp++;
                    }

                    if (temp > 0)
                        System.out.println("no");
                    else
                        System.out.println("yes");
                }
            }
        }

    }
}
