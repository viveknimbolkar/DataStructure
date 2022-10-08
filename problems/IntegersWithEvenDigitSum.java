package problems;

import java.util.ArrayList;

//https://leetcode.com/problems/count-integers-with-even-digit-sum/
public class IntegersWithEvenDigitSum {

    int countEven(int num) {
        int count = 0;
        for (int i = 2; i <= num; i++) {
            int sum = getDigitSum(i);
            if (sum%2==0) count++;
        }
        return count;
    }

    int getDigitSum(int n){
        ArrayList<Integer> digits = getDigits(n);
        int ans = 0;
        for (int i: digits)
            ans+=i;
        return ans;
    }

    ArrayList<Integer> getDigits(int n){
        ArrayList<Integer> digits = new ArrayList<>();
        while (n>0){
            int rem = n%2;
            digits.add(rem);
            n /= 10;

        }
        return digits;
    }

    public static void main(String[] args) {
        IntegersWithEvenDigitSum intger = new IntegersWithEvenDigitSum();
        int num = 30;
        System.out.println(intger.countEven(num));
    }
}
