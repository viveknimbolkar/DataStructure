package problems;

import java.util.ArrayList;

//https://leetcode.com/problems/sum-of-digits-of-string-after-convert/
public class SumOfDigitsOfStringAfterConvert {

    int getLucky(String s, int k) {
        int sum = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= s.length()-1; i++) {
            sb.append(s.codePointAt(i)-96); // ascii value subtraction
        }

        while (k > 0){
            sum = 0;
            for (int i = 0; i <= s.length()-1; i++) {
                sum += sb.charAt(i)-'0';
            }
            sb = new StringBuilder(String.valueOf(sum));
            k--;
        }

        return sum;
    }

    public static void main(String[] args) {
        SumOfDigitsOfStringAfterConvert sumof = new SumOfDigitsOfStringAfterConvert();
        String s = "leetcode";
        int k = 2;
        System.out.println(sumof.getLucky(s,k));
    }
}
