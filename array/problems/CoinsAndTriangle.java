package array.problems;


// https://www.codechef.com/problems/TRICOIN
import java.util.Scanner;
public class CoinsAndTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        for (int i = 0; i < testcase; i++) {
            int height = 0, j = 1;
            int coins = sc.nextInt();

            while (coins >= j){
                coins = coins - j; // use Sn = n - j
                height++;
                j++;
            }
            System.out.println(height);
        }
    }
}

