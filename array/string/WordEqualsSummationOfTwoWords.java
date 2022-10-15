package array.string;
//https://leetcode.com/problems/check-if-word-equals-summation-of-two-words/
public class WordEqualsSummationOfTwoWords {
    boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int sumFirst = 0, sumSecond = 0, sumTarget = 0;

        for (char ch: firstWord.toCharArray()) {
            sumFirst += ch-'a'; // get the respective integer
            sumFirst *= 10; // convert to decimal digits
        }

        for (char ch: secondWord.toCharArray()) {
            sumSecond += ch-'a';
            sumSecond *= 10;
        }

        for (char ch: targetWord.toCharArray()) {
            sumTarget += ch-'a';
            sumTarget *= 10;
        }

        return (sumFirst+sumSecond) == sumTarget;
    }

    public static void main(String[] args) {
        WordEqualsSummationOfTwoWords word = new WordEqualsSummationOfTwoWords();
        String firstWord = "acb", secondWord = "cba", targetWord = "cdb";
        System.out.println(word.isSumEqual(firstWord,secondWord,targetWord));
    }
}
