package problems;
// https://leetcode.com/problems/power-of-two/
public class PowerofTwo {

    boolean isPowerOfTwo(int n) {
        for (int i = 0; i < n; i++) {
            if (Math.pow(2,i) == n) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        PowerofTwo pow = new PowerofTwo();
        int n = 16;
        System.out.println("Power of "+n+" : "+pow.isPowerOfTwo(n));
    }
}
