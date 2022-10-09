package problems;

import java.util.*;

//https://leetcode.com/problems/second-largest-digit-in-a-string/
public class SecondLargestDigitString {

    int secondHighest(String s) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9')
                set.add(ch-'0');

        }

        int firstLargest = -1, secondLargest = -1;
        for (int digit: set) {
            // to get firstlargest
            if (digit > firstLargest){
                secondLargest = firstLargest;
                firstLargest = digit;
            }else if (digit > secondLargest){
                // get the secondlargest
                secondLargest = digit;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        SecondLargestDigitString sec = new SecondLargestDigitString();
        String s = "dfa12321afd";
        String s2 = "abc1111";
        System.out.println(sec.secondHighest(s));
    }
}
