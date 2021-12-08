package array.problems;


import java.util.Scanner;

// https://www.codechef.com/problems/POTATOES
public class FarmerFeb {

    static boolean isPrime(int n){
        if (n <=1) return false;
        for (int i = 2; i < n; i++) {
            if (n%i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        for (int i = 0; i < testcase; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int total = x+y;
            int count=1;

            while (!isPrime(total+count)){
                count++;
            }
            System.out.println(count);
        }
    }
}
