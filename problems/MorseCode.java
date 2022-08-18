package problems;

import java.util.HashSet;
//https://www.youtube.com/watch?v=ZF7KWiYsI6I
//https://leetcode.com/problems/unique-morse-code-words/
public class MorseCode {
    String[] MORSE_CODES = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.",
            "---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    int uniqueMorseRepresentations(String[] words) {

        // store the unique morse codes
        HashSet<String> uniqueMoseCodes = new HashSet<>();

        // loop through hte words and find the respective code of the char
        for (String word: words) {
            StringBuilder morseCodedString = new StringBuilder();
            // loop through the chars of the word
            for (char ch: word.toCharArray()) {
                // get the index of char code from morse code and add into set
                morseCodedString.append(MORSE_CODES[ch-'a']);
            }
            uniqueMoseCodes.add(morseCodedString.toString());
        }

        return uniqueMoseCodes.size();
    }

    public static void main(String[] args) {
        MorseCode morse = new MorseCode();
        String[] words = {"gin","zen","gig","msg"};

        System.out.println("Unique codes: "+morse.uniqueMorseRepresentations(words));
    }
}
