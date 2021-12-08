package array.problems;

import java.util.Scanner;

// https://www.codechef.com/problems/FLOW009
public class TotalExpenses {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        for (int i = 0; i < testcase; i++) {
            int quantity = sc.nextInt();
            int price = sc.nextInt();
            int totalExpenses = quantity * price;
            float tenPercentage;

            if (quantity >= 1000){
                tenPercentage = (float) totalExpenses / 10;
                System.out.println(totalExpenses - tenPercentage);
            }else {
                System.out.println(totalExpenses);
            }

        }
    }
}
