package array.problems;

// https://www.codechef.com/problems/PPSUM
import java.util.Scanner;

public class PuppyAndSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();
        if (testcase <= 16) {

            for (int i = 0; i < testcase; i++) {
                int D = sc.nextInt();
                int N = sc.nextInt();

                for (int j = 0; j < D; j++) {
                    N = singleSum(N);
                }
                System.out.println(N);

            }
        }
    }


    static int singleSum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum +i;
        }
        return sum;
    }
}
