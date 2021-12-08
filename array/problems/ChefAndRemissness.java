package array.problems;


import java.util.Scanner;

// https://www.codechef.com/problems/REMISS
public class ChefAndRemissness {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println((A>B?A:B)+" "+(A+B));
        }
    }
}
