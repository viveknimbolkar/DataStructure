package array.problems;
// https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
public class MaxWordInSentence {

    int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            int words = 0;
            for (int j = 0; j < sentences[i].length(); j++) {
                if (sentences[i].charAt(j) == ' ')
                    words++;
            }
            words++;
            if (max < words)
                max = words;
        }
        return max;
    }

    public static void main(String[] args) {
        MaxWordInSentence max = new MaxWordInSentence();
        String[] sentence = {
                "alice and bob love leetcode",
                "i think so too", "this is great thanks very much"
        };
        System.out.println(max.mostWordsFound(sentence));
    }
}
