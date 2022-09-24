package greedy;

import java.util.ArrayList;
import java.util.Collections;

//https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/
public class MinimumSumOfFourDigit {

    int minimumSum(int num) {
        ArrayList<Integer> digits = getDigits(num);
        Collections.sort(digits); // sort the list

        int num1 = 0, num2 = 0;

        for (int i = 0; i < digits.size(); i++) {
            // combine even together and odd togeter
            if (i%2 == 0) num1 = num1*10+digits.get(i);
            else num2 = num2*10+digits.get(i);
        }
        return num1+num2; // final min sum of two digits
    }

    ArrayList<Integer> getDigits(int n){
        ArrayList<Integer> digits = new ArrayList<>();
        while (n > 0){
            int rem = n % 10;
            if (rem != 0)
                    digits.add(rem);
            n /= 10;
        }
        return digits;
    }

    public static void main(String[] args) {
        MinimumSumOfFourDigit minsum = new MinimumSumOfFourDigit();
        int num = 2932;
        System.out.println("Min sum Is: "+minsum.minimumSum(num));
    }
}
