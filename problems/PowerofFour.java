package problems;


//https://leetcode.com/problems/power-of-four/
public class PowerofFour {

    boolean isPowerOfFour(int n) {
        if(n==1 || n==4) return true;
        if (n < 5) return false;
        int i=1;
        double ans = 0;

        while (ans < n){
            ans = Math.pow(4,i);
            System.out.println(ans);
            i++;
        }
        System.out.println(ans);
        if (ans == n) return true;
        return false;
    }

    public static void main(String[] args) {
        PowerofFour pow = new PowerofFour();
        int n = 16;
        System.out.println("Is power of four: "+pow.isPowerOfFour(n));

    }
}
