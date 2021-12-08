package array.problems;


import java.util.Scanner;

// https://www.codechef.com/problems/CHOPRT
public class ChefAndOperators {
    public static void main(String[] args) {
        try {


            Scanner sc = new Scanner(System.in);
            int testcase = sc.nextInt();

            for (int i = 0; i < testcase; i++) {
                int a,b;

                a = sc.nextInt();
                b = sc.nextInt();

                if ((a >= 1 && b >=1) && (a<=1000000001 && b<=1000000001)) {

                    if (a < b)
                        System.out.println("<" );
                    else if (a > b)
                        System.out.println(">");
                    else
                        System.out.println("=");
                }

            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
