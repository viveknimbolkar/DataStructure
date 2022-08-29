package array.string;

import java.util.ArrayList;

// https://leetcode.com/problems/reverse-only-letters/
public class ReverseOnlyLetters {

    // Method-1: Two pointer approach
    String reverseOnlyLetters(String str){
        int i = 0 , j = str.length()-1;
        char[] chArr = str.toCharArray();

        // traverse and find the hypens
        while (i <= j){
            // if the forward character is not a character i.e. It is hypen
            if (!Character.isLetter(chArr[i])){
                i++;
                continue;
            }

            // if the backward character is not a character i.e. It is hypen
            if (!Character.isLetter(chArr[j])){
                j--;
                continue;
            }

            // swap element in every iteration
            char currentChar = chArr[i];
            chArr[i] = chArr[j];
            chArr[j] = currentChar;
            i++;
            j--;
        }
        String ans = new String(chArr);
        return ans;
    }

    // Method -2: reverse the string
    String reverseOnlyLetters(String str, boolean test){
        String[] words = str.split("-",0);
        StringBuilder combineWords = new StringBuilder();

        // combine string
        for (int i = 0; i < words.length; i++)
            combineWords.append(words[i]);

        // reverse the combined string
        String reversedWord = combineWords.reverse().toString();

        // get the positions of hypens
        ArrayList<Integer> hypens = getHyperPositions(str);

        // add hypens between letters on define define pisitions
        for (int i = 0; i < reversedWord.length(); i++) {
            if (hypens.get(i).equals(i)){
                reversedWord += "-";
            }
        }

        return reversedWord;
    }

    // get the positions of hypens
    ArrayList<Integer> getHyperPositions(String s){
        ArrayList<Integer> hypens = new ArrayList<>();
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == '-') hypens.add(i);
        return hypens;
    }

    // get the number of letters in between two hypens
    int[] getNumberofLetters(String s){
        String[] chArr = s.split("-",0);
        int[] freqArr = new int[chArr.length];
        int i = 0;

        // store the length of word in answer array
        for (String word: chArr)
            freqArr[i++] = word.length();

        return freqArr;
    }

    public static void main(String[] args) {
        ReverseOnlyLetters rev = new ReverseOnlyLetters();
        String  s = "a-bC-dEf-ghIj";
        System.out.println(rev.reverseOnlyLetters(s));
    }
}
