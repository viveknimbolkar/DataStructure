package array.string;

import java.util.ArrayList;

//https://leetcode.com/problems/number-of-different-integers-in-a-string/
public class DifferentIntegersInString {
    int numDifferentIntegers(String word) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (Character.isDigit(word.charAt(i))){
                StringBuilder sb = new StringBuilder();
                int j = i;
                while (Character.isDigit(word.charAt(j))){
                    sb.append(word.charAt(j));
                    j++;
                }
                System.out.println(sb.toString());
            }
        }

        return count;
    }

    public static void main(String[] args) {
        DifferentIntegersInString diff = new DifferentIntegersInString();
        String word = "a123bc34d8ef34";
        System.out.println("total words= "+diff.numDifferentIntegers(word));
    }
}
