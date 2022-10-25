package array.string;
//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
public class TwoStringArraysEquivalent {
    boolean arrayStringsAreEqual(String[] word1, String[] word2){
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        for (String word: word1)
            str1.append(word);

        for (String word: word2)
            str2.append(word);

        if (str1.toString().equals(str2.toString()))
            return true;
        return false;
    }

    public static void main(String[] args) {
        TwoStringArraysEquivalent twostring = new TwoStringArraysEquivalent();
        String[] word1 = {"ab", "c"}, word2 = {"a", "bc"};
        System.out.println("is two string are same: "+twostring.arrayStringsAreEqual(word1,word2));
    }
}
