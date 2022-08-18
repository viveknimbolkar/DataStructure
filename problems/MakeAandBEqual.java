package problems;

import java.util.Scanner;

//https://www.codechef.com/submit/EQUALISE
public class MakeAandBEqual {

    void makeEqual(int testcase, int a, int b){
        if (a == b) System.out.println("YES");
    }

    public static void main(String[] args) {
        MakeAandBEqual make = new MakeAandBEqual();
        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

         make.makeEqual(testcase,a,b);
    }
}
