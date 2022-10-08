package problems;

import java.util.ArrayList;
import java.util.Collections;

//https://leetcode.com/problems/largest-substring-between-two-equal-characters/
public class LargestSubstringBetweenTwoEqualCharacters {
    int maxLengthBetweenEqualCharacters(String s) {
        int count = 0, ans = -1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            for (int j = i+1; j < s.length(); j++) {
                if (ch == s.charAt(j)){
                    count = j-i-1;
                    if (ans < count)
                        ans = count;
                }

            }
        }
        return  ans;
    }

    public static void main(String[] args) {
        LargestSubstringBetweenTwoEqualCharacters lar = new LargestSubstringBetweenTwoEqualCharacters();
        String s = "aa";
        String t = "abca";
        String u = "scayofdzca";
        String v = "mgntdygtxrvxjnwksqhxuxtrv";
        System.out.println(lar.maxLengthBetweenEqualCharacters(v));
    }
}
