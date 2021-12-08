package array.problems;


import java.util.Scanner;

// https://www.codechef.com/problems/DECINC
public class DecrementORIncrement {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        DecrementORIncrement cc = new DecrementORIncrement();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n % 4 == 0)
            System.out.println(n+1);
        else
            System.out.println(n-1);

    }

}
