package problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/contest/weekly-contest-324/problems/count-pairs-of-similar-strings/
public class CountPairsOfSimilarStrings {
    // TODO: Not working
    int similarPairs(String[] words) {
        int len = words.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            Set<Character> set1 = new HashSet<>();
            // add current element into hashset
            for (int j = 0; j < words[i].length()-1; j++) {
                set1.add(words[i].charAt(j));
            }

            // compare next n element
            for (int j = i+1; j < len; j++) {
                if (i == j) continue;
                Set<Character> set2 = new HashSet<>();
                // add next n elemetnt into set
                for (int k = 0; k < words[j].length(); k++) {
                    set2.add(words[j].charAt(k));
                }
                if (set1.equals(set2)) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountPairsOfSimilarStrings count = new CountPairsOfSimilarStrings();
//        String[] words = {"aba","aabb","abcd","bac","aabc"};
        String[] words = {"aabb","ab","ba"};
        System.out.println(count.similarPairs(words));
    }
}
















