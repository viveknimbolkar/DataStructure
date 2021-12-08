package array.problems;

// https://www.codechef.com/submit/FLOW016
import java.util.Scanner;

public class GCDAndLCM {

    public static void main(String[] args) {
        GCDAndLCM gcdAndLCM = new GCDAndLCM();
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        for (int i = 0; i < testcase; i++) {
            long a = sc.nextInt();
            long b = sc.nextInt();

            long gcd = gcdAndLCM.getGCD(a,b);
            long lcm = gcdAndLCM.getLCM(a,b);
            System.out.println(gcd+" "+lcm);
        }
    }

    private long getLCM(long a, long b) {
        return a*b/getGCD(a,b);
    }

    private long getGCD(long a, long b) {
      if (b == 0) return a;
      return getGCD(b, a%b);
    }
}
