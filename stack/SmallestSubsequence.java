package stack;
//https://leetcode.com/problems/smallest-subsequence-of-distinct-characters/

import java.util.HashSet;
import java.util.Iterator;

public class SmallestSubsequence {
    String smallestSubsequence(String s) {
        String ans = "";
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        Iterator<Character> itr = set.iterator();
        while (itr.hasNext()){
            ans += itr.next();
        }

        return ans;
    }

    public static void main(String[] args) {
        SmallestSubsequence small = new SmallestSubsequence();
        String s = "bcabc";
        System.out.println(small.smallestSubsequence(s));
    }
}
