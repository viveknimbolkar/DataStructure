package array.problems;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// https://leetcode.com/problems/count-the-number-of-consistent-strings/
public class ConsistentString {

    //Using brute force approach
    int countConsistentStrings(boolean brute, String allowed, String[] words) {
        int match = words.length;
        HashSet<Character> set = new HashSet<>();
        // add all the char of allowed into set
        for (int i = 0; i < allowed.length(); i++)
            set.add(allowed.charAt(i));

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (!set.contains(words[i].charAt(j))){
                    match--;
                    break;
                }
            }
        }

        return match;
    }

    //Using regex
    int countConsistentStrings(String allowed, String[] words) {
        int match = 0;
        for (int i = 0; i < words.length; i++) {
            Pattern pat = Pattern.compile(allowed);
            Matcher matcher = pat.matcher(words[i]);
            boolean isFound = matcher.find();
            if (isFound) match++;
        }
        return match;
    }

    public static void main(String[] args) {
        ConsistentString consistent = new ConsistentString();
        String[] str = {"ad","bd","aaab","baa","badab"};
        String pat = "ab";

        System.out.println("Match count: "+consistent.countConsistentStrings(true,pat,str));
    }
}
