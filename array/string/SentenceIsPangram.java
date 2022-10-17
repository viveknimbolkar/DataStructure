package array.string;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/check-if-the-sentence-is-pangram/
public class SentenceIsPangram {

    boolean checkIfPangram(String sentence) {
        boolean[] letters = new boolean[26];
        for (char ch: sentence.toCharArray())
            letters[ch-'a'] = true; // put true for present chars

        // find the non existing character
        for (boolean find: letters)
            if (!find) return false; // if we found the no character


        return true;
    }

    public static void main(String[] args) {
        SentenceIsPangram sentenceIsPangram = new SentenceIsPangram();
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println("Is pangram: "+sentenceIsPangram.checkIfPangram(sentence));
    }
}