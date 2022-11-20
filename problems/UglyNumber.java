package problems;
//https://leetcode.com/problems/ugly-number/
public class UglyNumber {

    boolean isUgly(int n) {
        if (n == 1) return true;
        if (n == 0) return false;

        // find 2nd position
        if (n%2 == 0)
            return isUgly(n/2);

        // find 3nd position
        if (n%3 == 0)
            return isUgly(n/3);

        // find 5nd position
        if (n%5 == 0)
            return isUgly(n/5);

        return false; // return if not matched the condition
    }

    public static void main(String[] args) {
        UglyNumber ugly = new UglyNumber();
        int n = 14;
        System.out.println(ugly.isUgly(n));
    }
}
