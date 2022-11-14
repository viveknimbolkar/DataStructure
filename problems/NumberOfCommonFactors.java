package problems;
//https://leetcode.com/problems/number-of-common-factors/
public class NumberOfCommonFactors {

    int commonFactors(int a, int b) {
        int n = getGCD(a,b);
        int count = 0;
        System.out.println(n);
        for (int i = 1; i <= n; i++) {
            if (n%i == 0)
                count++;
        }
        return count;
    }

    int getGCD(int a, int b){
        if (a == 0) return b;
        return getGCD(b%a,a);
    }
    public static void main(String[] args) {
        NumberOfCommonFactors numco = new NumberOfCommonFactors();
        System.out.println("Common factors: "+numco.commonFactors(12,6));
    }
}
