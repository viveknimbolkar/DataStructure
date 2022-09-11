package array.problems;

import java.util.Scanner;

//https://www.codechef.com/submit/ATM2
public class ATM2 {

    public static void main(String[] args) {
        ATM2 atm = new ATM2();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t != 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] customer = new int[n];

            for (int i = 0; i < n; i++) {
                customer[i] = sc.nextInt();
            }

            int temp = k;
            for (int i = 0; i < n; i++) {
                if (temp >= customer[i]){
                    temp -= customer[i];
                    System.out.print(1);
                }else System.out.print(0);
            }

            t--;
        }
    }
}
