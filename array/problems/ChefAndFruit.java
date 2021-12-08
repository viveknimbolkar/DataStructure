package array.problems;

// This code isn't working on codechef compiler (Try to find bugs)
import java.util.Scanner;

// https://www.codechef.com/problems/FRUITS
public class ChefAndFruit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        for (int i = 0; i < testcase; i++) {
            int apple = sc.nextInt();
            int orange = sc.nextInt();
            int coin = sc.nextInt();

            int purchases = 0;
            if (apple == orange){
                System.out.println(0);
            }else if (apple < orange){
                if (coin > 0) {
                    //now purchase upto coin times. Also keep track of purchase
                    for (int j = 0; j < coin; j++) {
                        if (apple == orange) break;
                        // purchase apple and increment purchases
                        apple++;
                        purchases++;
                    }
                    System.out.println(purchases);
                }
                System.out.println(0);
            }else if (orange < apple){
                if (coin > 0) {
                    //now purchase upto coin times. Also keep track of purchase
                    for (int j = 0; j < coin; j++) {
                        if (apple == orange) break;
                        // purchase orange and increment purchases
                        orange++;
                        purchases++;
                    }
                    System.out.println(purchases);
                }
                System.out.println(0);
            }
        }
    }
}
