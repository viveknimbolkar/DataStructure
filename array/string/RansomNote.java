package array.string;

import java.util.Arrays;

// https://leetcode.com/problems/ransom-note/
public class RansomNote {

    boolean canConstruct(String ransomNote, String magazine) {
        int[] hashArr = new int[26];
        char[] ransomArr = ransomNote.toCharArray();
        char[] magazineArr = magazine.toCharArray();

        // save the frequency of every character in hashed array
        for (char ch: magazineArr) {
            hashArr[ch-'a']++;
        }

        // if the element again found then decrement it
        for (char ch: ransomArr) {
            hashArr[ch-'a']--;
            if (hashArr[ch-'a'] < 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        RansomNote ransom = new RansomNote();
        String ransomNote = "aa", magazine = "aab";
        String r = "bg", m = "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj";
        System.out.println("Can be constructed? : "+ransom.canConstruct(r,m));
    }
}
