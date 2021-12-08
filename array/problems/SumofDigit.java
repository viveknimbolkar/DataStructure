package array.problems;

import java.util.Scanner;

// https://www.codechef.com/problems/FLOW006
public class SumofDigit {
    void calculate(int n){

        int sum = 0;

        while(n != 0){

            sum = sum + (n%10);

            n = n/10;
        }

        System.out.println(sum);
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        SumofDigit cc = new SumofDigit();
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int number;
        for (int i = 0; i < count ; i++){

            number = sc.nextInt();
            cc.calculate(number);
        }
    }
}
