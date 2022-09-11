package problems;

import java.util.ArrayList;

//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
public class ProductAndSumofDigits {

    int subtractProductAndSum(int n) {
        ArrayList<Integer> digits = extractDigits(n);
        int sum = 0, prod = 1;
        for (int digit: digits) {
            sum += digit;
            prod *= digit;
        }
        return prod - sum;

    }

    ArrayList<Integer> extractDigits(int n){
        ArrayList<Integer> digits = new ArrayList<>();
        while (n > 0){
            int remainder = n % 10;
            digits.add(remainder);
            n = n/10;
        }
        return digits;
    }

    public static void main(String[] args) {
        ProductAndSumofDigits prod = new ProductAndSumofDigits();
        int n = 4421;
        System.out.println("get product and sum: "+prod.subtractProductAndSum(n));
    }
}
