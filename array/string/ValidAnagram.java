package array.string;

import java.util.Arrays;
// TC - O(N*N)
// SC - O(N*N)
// https://leetcode.com/problems/valid-anagram/
public class ValidAnagram {

    boolean isAnagram(String s, String t) {
        // if length of two string is not same then they are not anagrams
        if (s.length() != t.length()) return false;

        int[] sTemp = new int[s.length()];
        int[] tTemp = new int[t.length()];

        for (int i = 0; i < s.length(); i++) {
            sTemp[i] = s.charAt(i);
            tTemp[i] = s.charAt(i);
        }

        Arrays.sort(sTemp);
        Arrays.sort(tTemp);

        for (int i = 0; i < sTemp.length; i++) {
            if (sTemp[i] != tTemp[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidAnagram ana = new ValidAnagram();
        String s = "anagram", t = "nagaram";
        System.out.println("Anagram: "+ana.isAnagram(s,t));
    }
}
