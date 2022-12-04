package array.string;
//https://leetcode.com/contest/weekly-contest-322/problems/circular-sentence/
public class CircularSentence {
    boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        int len = words.length;
        // case 1: The last character of a word is equal to the first character of the next word.
        for (int i = 0; i < len-1; i++) {
            if(words[i].charAt(words[i].length()-1) != words[i+1].charAt(0)){
               return  false;
            }
        }

        // case-2: The last character of the last word is equal to the first character of the first word.
        if (words[len-1].charAt(words[len-1].length()-1) != words[0].charAt(0)) return false;

        return true;

    }

    public static void main(String[] args) {
        CircularSentence circularSentence = new CircularSentence();
        String sentence = "leetcode exercises sound delightful";
        System.out.println(circularSentence.isCircularSentence(sentence));
    }
}
